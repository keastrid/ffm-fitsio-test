// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class PixelFilter {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("path"),
        Constants$root.C_POINTER$LAYOUT.withName("tag"),
        Constants$root.C_POINTER$LAYOUT.withName("ifptr"),
        Constants$root.C_POINTER$LAYOUT.withName("expression"),
        Constants$root.C_LONG$LAYOUT.withName("bitpix"),
        Constants$root.C_LONG$LAYOUT.withName("blank"),
        Constants$root.C_POINTER$LAYOUT.withName("ofptr"),
        MemoryLayout.sequenceLayout(75, Constants$root.C_CHAR$LAYOUT).withName("keyword"),
        MemoryLayout.sequenceLayout(73, Constants$root.C_CHAR$LAYOUT).withName("comment"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return PixelFilter.$struct$LAYOUT;
    }
    static final VarHandle count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("count"));
    public static VarHandle count$VH() {
        return PixelFilter.count$VH;
    }
    public static int count$get(MemorySegment seg) {
        return (int)PixelFilter.count$VH.get(seg);
    }
    public static void count$set( MemorySegment seg, int x) {
        PixelFilter.count$VH.set(seg, x);
    }
    public static int count$get(MemorySegment seg, long index) {
        return (int)PixelFilter.count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void count$set(MemorySegment seg, long index, int x) {
        PixelFilter.count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle path$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("path"));
    public static VarHandle path$VH() {
        return PixelFilter.path$VH;
    }
    public static MemoryAddress path$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.path$VH.get(seg);
    }
    public static void path$set( MemorySegment seg, MemoryAddress x) {
        PixelFilter.path$VH.set(seg, x);
    }
    public static MemoryAddress path$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.path$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void path$set(MemorySegment seg, long index, MemoryAddress x) {
        PixelFilter.path$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag"));
    public static VarHandle tag$VH() {
        return PixelFilter.tag$VH;
    }
    public static MemoryAddress tag$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.tag$VH.get(seg);
    }
    public static void tag$set( MemorySegment seg, MemoryAddress x) {
        PixelFilter.tag$VH.set(seg, x);
    }
    public static MemoryAddress tag$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.tag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag$set(MemorySegment seg, long index, MemoryAddress x) {
        PixelFilter.tag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ifptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ifptr"));
    public static VarHandle ifptr$VH() {
        return PixelFilter.ifptr$VH;
    }
    public static MemoryAddress ifptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.ifptr$VH.get(seg);
    }
    public static void ifptr$set( MemorySegment seg, MemoryAddress x) {
        PixelFilter.ifptr$VH.set(seg, x);
    }
    public static MemoryAddress ifptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.ifptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ifptr$set(MemorySegment seg, long index, MemoryAddress x) {
        PixelFilter.ifptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle expression$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("expression"));
    public static VarHandle expression$VH() {
        return PixelFilter.expression$VH;
    }
    public static MemoryAddress expression$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.expression$VH.get(seg);
    }
    public static void expression$set( MemorySegment seg, MemoryAddress x) {
        PixelFilter.expression$VH.set(seg, x);
    }
    public static MemoryAddress expression$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.expression$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void expression$set(MemorySegment seg, long index, MemoryAddress x) {
        PixelFilter.expression$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bitpix$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bitpix"));
    public static VarHandle bitpix$VH() {
        return PixelFilter.bitpix$VH;
    }
    public static int bitpix$get(MemorySegment seg) {
        return (int)PixelFilter.bitpix$VH.get(seg);
    }
    public static void bitpix$set( MemorySegment seg, int x) {
        PixelFilter.bitpix$VH.set(seg, x);
    }
    public static int bitpix$get(MemorySegment seg, long index) {
        return (int)PixelFilter.bitpix$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bitpix$set(MemorySegment seg, long index, int x) {
        PixelFilter.bitpix$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle blank$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blank"));
    public static VarHandle blank$VH() {
        return PixelFilter.blank$VH;
    }
    public static int blank$get(MemorySegment seg) {
        return (int)PixelFilter.blank$VH.get(seg);
    }
    public static void blank$set( MemorySegment seg, int x) {
        PixelFilter.blank$VH.set(seg, x);
    }
    public static int blank$get(MemorySegment seg, long index) {
        return (int)PixelFilter.blank$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void blank$set(MemorySegment seg, long index, int x) {
        PixelFilter.blank$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ofptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ofptr"));
    public static VarHandle ofptr$VH() {
        return PixelFilter.ofptr$VH;
    }
    public static MemoryAddress ofptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.ofptr$VH.get(seg);
    }
    public static void ofptr$set( MemorySegment seg, MemoryAddress x) {
        PixelFilter.ofptr$VH.set(seg, x);
    }
    public static MemoryAddress ofptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)PixelFilter.ofptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ofptr$set(MemorySegment seg, long index, MemoryAddress x) {
        PixelFilter.ofptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment keyword$slice(MemorySegment seg) {
        return seg.asSlice(56, 75);
    }
    public static MemorySegment comment$slice(MemorySegment seg) {
        return seg.asSlice(131, 73);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


