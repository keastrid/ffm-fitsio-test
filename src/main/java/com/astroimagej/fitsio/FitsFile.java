package com.astroimagej.fitsio;

import gov.nasa.gsfc.heasarc.cfitsio.FITSfile;
import gov.nasa.gsfc.heasarc.cfitsio.fitsfile$0;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;

public class FitsFile {
    private final MemorySession session;
    private final MemorySegment fptr;
    private final MemorySegment FITSFile;

    public FitsFile(MemorySession session) {
        this.session = session;
        fptr = fitsfile$0.allocate(session);
        FITSFile = FITSfile.allocate(session);
        //FITSfile.filename$set(FITSFile, session.allocateUtf8String("test").address());
        fitsfile$0.Fptr$set(fptr, FITSFile.address());
        fitsfile$0.HDUposition$set(fptr, 0);
    }

    public MemorySegment getFptr() {
        return fptr;
    }

    public MemorySegment getFITSFile() {
        return FITSFile;
    }
}
