// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$117 {

    static final FunctionDescriptor ltoa$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ltoa$MH = RuntimeHelper.downcallHandle(
        "ltoa",
        constants$117.ltoa$FUNC
    );
    static final FunctionDescriptor swab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle swab$MH = RuntimeHelper.downcallHandle(
        "swab",
        constants$117.swab$FUNC
    );
    static final FunctionDescriptor ultoa$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ultoa$MH = RuntimeHelper.downcallHandle(
        "ultoa",
        constants$117.ultoa$FUNC
    );
    static final FunctionDescriptor putenv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putenv$MH = RuntimeHelper.downcallHandle(
        "putenv",
        constants$117.putenv$FUNC
    );
    static final FunctionDescriptor onexit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle onexit$MH = RuntimeHelper.downcallHandle(
        "onexit",
        constants$117.onexit$FUNC
    );
    static final FunctionDescriptor fits_read_wcstab$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_read_wcstab$MH = RuntimeHelper.downcallHandle(
        "fits_read_wcstab",
        constants$117.fits_read_wcstab$FUNC
    );
}


