// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class wtbarr {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("i"),
        Constants$root.C_LONG$LAYOUT.withName("m"),
        Constants$root.C_LONG$LAYOUT.withName("kind"),
        MemoryLayout.sequenceLayout(72, Constants$root.C_CHAR$LAYOUT).withName("extnam"),
        Constants$root.C_LONG$LAYOUT.withName("extver"),
        Constants$root.C_LONG$LAYOUT.withName("extlev"),
        MemoryLayout.sequenceLayout(72, Constants$root.C_CHAR$LAYOUT).withName("ttype"),
        Constants$root.C_LONG$LAYOUT.withName("row"),
        Constants$root.C_LONG$LAYOUT.withName("ndim"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("dimlen"),
        Constants$root.C_POINTER$LAYOUT.withName("arrayp")
    );
    public static MemoryLayout $LAYOUT() {
        return wtbarr.$struct$LAYOUT;
    }
    static final VarHandle i$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("i"));
    public static VarHandle i$VH() {
        return wtbarr.i$VH;
    }
    public static int i$get(MemorySegment seg) {
        return (int)wtbarr.i$VH.get(seg);
    }
    public static void i$set( MemorySegment seg, int x) {
        wtbarr.i$VH.set(seg, x);
    }
    public static int i$get(MemorySegment seg, long index) {
        return (int)wtbarr.i$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void i$set(MemorySegment seg, long index, int x) {
        wtbarr.i$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle m$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("m"));
    public static VarHandle m$VH() {
        return wtbarr.m$VH;
    }
    public static int m$get(MemorySegment seg) {
        return (int)wtbarr.m$VH.get(seg);
    }
    public static void m$set( MemorySegment seg, int x) {
        wtbarr.m$VH.set(seg, x);
    }
    public static int m$get(MemorySegment seg, long index) {
        return (int)wtbarr.m$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void m$set(MemorySegment seg, long index, int x) {
        wtbarr.m$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle kind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kind"));
    public static VarHandle kind$VH() {
        return wtbarr.kind$VH;
    }
    public static int kind$get(MemorySegment seg) {
        return (int)wtbarr.kind$VH.get(seg);
    }
    public static void kind$set( MemorySegment seg, int x) {
        wtbarr.kind$VH.set(seg, x);
    }
    public static int kind$get(MemorySegment seg, long index) {
        return (int)wtbarr.kind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void kind$set(MemorySegment seg, long index, int x) {
        wtbarr.kind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment extnam$slice(MemorySegment seg) {
        return seg.asSlice(12, 72);
    }
    static final VarHandle extver$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("extver"));
    public static VarHandle extver$VH() {
        return wtbarr.extver$VH;
    }
    public static int extver$get(MemorySegment seg) {
        return (int)wtbarr.extver$VH.get(seg);
    }
    public static void extver$set( MemorySegment seg, int x) {
        wtbarr.extver$VH.set(seg, x);
    }
    public static int extver$get(MemorySegment seg, long index) {
        return (int)wtbarr.extver$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void extver$set(MemorySegment seg, long index, int x) {
        wtbarr.extver$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle extlev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("extlev"));
    public static VarHandle extlev$VH() {
        return wtbarr.extlev$VH;
    }
    public static int extlev$get(MemorySegment seg) {
        return (int)wtbarr.extlev$VH.get(seg);
    }
    public static void extlev$set( MemorySegment seg, int x) {
        wtbarr.extlev$VH.set(seg, x);
    }
    public static int extlev$get(MemorySegment seg, long index) {
        return (int)wtbarr.extlev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void extlev$set(MemorySegment seg, long index, int x) {
        wtbarr.extlev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ttype$slice(MemorySegment seg) {
        return seg.asSlice(92, 72);
    }
    static final VarHandle row$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("row"));
    public static VarHandle row$VH() {
        return wtbarr.row$VH;
    }
    public static int row$get(MemorySegment seg) {
        return (int)wtbarr.row$VH.get(seg);
    }
    public static void row$set( MemorySegment seg, int x) {
        wtbarr.row$VH.set(seg, x);
    }
    public static int row$get(MemorySegment seg, long index) {
        return (int)wtbarr.row$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void row$set(MemorySegment seg, long index, int x) {
        wtbarr.row$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ndim$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ndim"));
    public static VarHandle ndim$VH() {
        return wtbarr.ndim$VH;
    }
    public static int ndim$get(MemorySegment seg) {
        return (int)wtbarr.ndim$VH.get(seg);
    }
    public static void ndim$set( MemorySegment seg, int x) {
        wtbarr.ndim$VH.set(seg, x);
    }
    public static int ndim$get(MemorySegment seg, long index) {
        return (int)wtbarr.ndim$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ndim$set(MemorySegment seg, long index, int x) {
        wtbarr.ndim$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dimlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dimlen"));
    public static VarHandle dimlen$VH() {
        return wtbarr.dimlen$VH;
    }
    public static MemoryAddress dimlen$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)wtbarr.dimlen$VH.get(seg);
    }
    public static void dimlen$set( MemorySegment seg, MemoryAddress x) {
        wtbarr.dimlen$VH.set(seg, x);
    }
    public static MemoryAddress dimlen$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)wtbarr.dimlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dimlen$set(MemorySegment seg, long index, MemoryAddress x) {
        wtbarr.dimlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle arrayp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("arrayp"));
    public static VarHandle arrayp$VH() {
        return wtbarr.arrayp$VH;
    }
    public static MemoryAddress arrayp$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)wtbarr.arrayp$VH.get(seg);
    }
    public static void arrayp$set( MemorySegment seg, MemoryAddress x) {
        wtbarr.arrayp$VH.set(seg, x);
    }
    public static MemoryAddress arrayp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)wtbarr.arrayp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void arrayp$set(MemorySegment seg, long index, MemoryAddress x) {
        wtbarr.arrayp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


