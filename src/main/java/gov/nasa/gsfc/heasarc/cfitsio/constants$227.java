// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$227 {

    static final FunctionDescriptor fits_hdecompress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_hdecompress$MH = RuntimeHelper.downcallHandle(
        "fits_hdecompress",
        constants$227.fits_hdecompress$FUNC
    );
    static final FunctionDescriptor fits_hdecompress64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_hdecompress64$MH = RuntimeHelper.downcallHandle(
        "fits_hdecompress64",
        constants$227.fits_hdecompress64$FUNC
    );
    static final FunctionDescriptor fits_compress_table$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_compress_table$MH = RuntimeHelper.downcallHandle(
        "fits_compress_table",
        constants$227.fits_compress_table$FUNC
    );
    static final FunctionDescriptor fits_uncompress_table$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_uncompress_table$MH = RuntimeHelper.downcallHandle(
        "fits_uncompress_table",
        constants$227.fits_uncompress_table$FUNC
    );
    static final FunctionDescriptor ffihtps$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle ffihtps$MH = RuntimeHelper.downcallHandle(
        "ffihtps",
        constants$227.ffihtps$FUNC
    );
    static final FunctionDescriptor ffchtps$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle ffchtps$MH = RuntimeHelper.downcallHandle(
        "ffchtps",
        constants$227.ffchtps$FUNC
    );
}

