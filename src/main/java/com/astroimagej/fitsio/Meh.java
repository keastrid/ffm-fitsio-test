package com.astroimagej.fitsio;

import gov.nasa.gsfc.heasarc.cfitsio.FITSfile;
import gov.nasa.gsfc.heasarc.cfitsio.fitsfile$0;

import java.io.IOException;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.ValueLayout;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static gov.nasa.gsfc.heasarc.cfitsio.fpack_h.*;

public class Meh {
    static {
        System.loadLibrary("cfitsio");
    }

    public static void main(String[] args) throws IOException {
        test6();
    }

    private static void test3() {
        try (var session = MemorySession.openConfined()) {
            var fptr = fitsfile$0.allocate(session);
            var status = session.allocate(C_INT, 0);
            var hdus = session.allocate(C_LONG, 0);
            var s = session.allocate(31);
            var FITSFile = FITSfile.allocate(session);
            //FITSfile.filename$set(FITSFile, session.allocateUtf8String("test").address());
            fitsfile$0.Fptr$set(fptr, FITSFile.address());

            //fitsfile$0.HDUposition$set(fptr, 0);
            var m = session.allocate(ValueLayout.ADDRESS, fptr.address()); // pointer to pointer of fits file
            if (ffopen(m, session.allocateUtf8String("annotationTest.fit"), READONLY(), status.address()) == 0) {
                ffgerr(status.get(C_INT, 0), s);
                System.out.println("Open Status: " + s.getUtf8String(0));

                /*var name = session.allocate(1000);
                ffflnm(fptr.address(), name.address(), status.address());
                System.out.println(name.getUtf8String(0));*/

                ffghdn(fptr, hdus.address());
                System.out.println("HDU count: " + hdus.get(C_LONG, 0));

                ffclos(fptr, status.address());//todo why is this erroring?
            }


            ffgerr(status.get(C_INT, 0), s);
            System.out.println("Final Status: " + s.getUtf8String(0));
        }
    }

    private static void test6() throws IOException {

        var fileMemory = Files.readAllBytes(Path.of("tess-s0012-2-3_245.267484_-59.510528_51x51_astrocut.fits"));

        try (var session = MemorySession.openConfined()) {
            var fptr = session.allocate(fitsfile$0.$LAYOUT());
            var adr = session.allocate(ValueLayout.ADDRESS, fptr);

            var status = session.allocate(C_INT, 0);
            var hdus = session.allocate(C_LONG, 0);
            var nKeys = session.allocate(C_LONG, 0);
            var l = session.allocate(C_INT, 0);
            var s = session.allocate(31);

            //MemorySegment.ofArray();
            var buf = session.allocateArray(ValueLayout.JAVA_BYTE, fileMemory);
            var bufSize = session.allocate(C_LONG, fileMemory.length);
            var bufPtr = session.allocate(ValueLayout.ADDRESS, buf);

            //todo this worked *ONCE* how to fix it - it's the file name, "meh" works - or not
            if (ffomem(adr, session.allocateUtf8String("meh"),
                    READONLY(), bufPtr, bufSize, 0, NULL(), status.address()) == 0) {
                ffgerr(status.get(C_INT, 0), s);
                System.out.println("Open Status: " + s.getUtf8String(0));

                fptr = fitsfile$0.ofAddress(adr.get(ValueLayout.ADDRESS, 0L), session);

                ffghdn(fptr, hdus.address());
                System.out.println("Current HDU: " + hdus.get(C_LONG, 0));

                ffthdu(fptr, hdus.address(), status.address());
                System.out.println("HDU count: " + hdus.get(C_LONG, 0));
                /*ffgerr(status.get(C_INT, 0), s);
                System.out.println("HDU Get Status: " + s.getUtf8String(0));

                ffghsp(fptr, nKeys.address(), l.address(), status.address());
                System.out.println("Key count: " + nKeys.get(C_LONG, 0));
                ffgerr(status.get(C_INT, 0), s);
                System.out.println("Header Read Status: " + s.getUtf8String(0));*/

                ffclos(fptr, status.address());
            }

            ffgerr(status.get(C_INT, 0), s);
            System.out.println("Final Status: " + s.getUtf8String(0));
        }
    }

    private static void test5() {//todo working!
        try (var session = MemorySession.openConfined()) {
            var fptr = session.allocate(fitsfile$0.$LAYOUT());
            var adr = session.allocate(ValueLayout.ADDRESS, fptr);

            var status = session.allocate(C_INT, 0);
            var hdus = session.allocate(C_LONG, 0);
            var nKeys = session.allocate(C_LONG, 0);
            var l = session.allocate(C_INT, 0);
            var s = session.allocate(31);

            if (ffopen(adr, session.allocateUtf8String("tess-s0012-2-3_245.267484_-59.510528_51x51_astrocut.fits"), READONLY(), status.address()) == 0) {
                ffgerr(status.get(C_INT, 0), s);
                System.out.println("Open Status: " + s.getUtf8String(0));

                fptr = fitsfile$0.ofAddress(adr.get(ValueLayout.ADDRESS, 0L), session);

                ffghdn(fptr, hdus.address());
                System.out.println("Current HDU: " + hdus.get(C_LONG, 0));

                ffthdu(fptr, hdus.address(), status.address());
                System.out.println("HDU count: " + hdus.get(C_LONG, 0));
                ffgerr(status.get(C_INT, 0), s);
                System.out.println("HDU Get Status: " + s.getUtf8String(0));

                ffghsp(fptr, nKeys.address(), l.address(), status.address());
                System.out.println("Key count: " + nKeys.get(C_LONG, 0));
                ffgerr(status.get(C_INT, 0), s);
                System.out.println("Header Read Status: " + s.getUtf8String(0));

                ffclos(fptr, status.address());
            }

            ffgerr(status.get(C_INT, 0), s);
            System.out.println("Final Status: " + s.getUtf8String(0));
        }
    }

    private static void test4() {
        try (var session = MemorySession.openConfined()) {
            var fptr = fitsfile$0.allocate(session);
            var status = session.allocate(C_INT, 0);
            var hdus = session.allocate(C_LONG, 0);
            var nKeys = session.allocate(C_LONG, 0);
            var l = session.allocate(C_INT, 0);
            var s = session.allocate(31);
            var m = session.allocate(ValueLayout.ADDRESS, fptr); // pointer to pointer of fits file
            if (ffopen(m, session.allocateUtf8String("annotationTest.fit"), READONLY(), status.address()) == 0) {
                ffgerr(status.get(C_INT, 0), s);
                System.out.println("Open Status: " + s.getUtf8String(0));
                ffghdn(fptr, hdus.address());
                System.out.println("Current HDU: " + hdus.get(C_LONG, 0));

                ffthdu(fptr, hdus.address(), status.address());
                System.out.println("HDU count: " + hdus.get(C_LONG, 0));
                ffgerr(status.get(C_INT, 0), s);
                System.out.println("HDU Get Status: " + s.getUtf8String(0));

                ffghsp(fptr.address(), nKeys.address(), l.address(), status.address());
                System.out.println("Key count: " + nKeys.get(C_LONG, 0));
                ffgerr(status.get(C_INT, 0), s);
                System.out.println("Header Read Status: " + s.getUtf8String(0));

                //ffclos(fptr.address(), status.address());//todo why is this erroring?
            }


            ffgerr(status.get(C_INT, 0), s);
            System.out.println("Final Status: " + s.getUtf8String(0));
        }
    }

    private static void test(MemorySegment fp) {
        var Fptr = fitsfile$0.Fptr$get(fp);
        var f = FITSfile.ofAddress(Fptr, fp.session());
        System.out.println(FITSfile.filesize$get(f));
    }

    private static void test2() {
        Path currentRelativePath = Paths.get("");
        System.out.println(currentRelativePath.toAbsolutePath());

        try (var session = MemorySession.openConfined()) {
            var fptr = fitsfile$0.allocate(session);
            var FITSFile = FITSfile.allocate(session);
            //FITSfile.filename$set(FITSFile, session.allocateUtf8String("test").address());
            fitsfile$0.Fptr$set(fptr, FITSFile.address());
            fitsfile$0.HDUposition$set(fptr, 0);
            var status = session.allocate(C_INT, 0);
            var hdus = session.allocate(C_LONG, 0);
            var nKeys = session.allocate(C_INT, 0);
            var meh = session.allocate(C_INT, 0);
            System.out.println(nKeys.get(C_INT, 0));
            if (/*ffdopn*/ffopen(fptr.address(), session.allocateUtf8String("annotationTest.fit"), READONLY(), status.address()) == 0) {
                /*var name = session.allocate(20);
                ffflnm(fptr, name.address(), status.address());
                System.out.println(name.getUtf8String(0));*/
                ffghdn(fptr, hdus.address());
                System.out.println("HDU count: " + hdus.get(C_LONG, 0));
                /*ffghsp(fptr, nKeys.address(), *//*MemoryAddress.NULL*//* meh*//*.address()*//*, status.address());

                System.out.println("Key count: " + nKeys.get(C_INT, 0));*/

                //ffclos(fptr, status.address());
            }

            System.out.println(status.get(C_INT, 0));
        }
    }
}
