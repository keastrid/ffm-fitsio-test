// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$27 {

    static final FunctionDescriptor fgetws$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fgetws$MH = RuntimeHelper.downcallHandle(
        "fgetws",
        constants$27.fgetws$FUNC
    );
    static final FunctionDescriptor fputws$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fputws$MH = RuntimeHelper.downcallHandle(
        "fputws",
        constants$27.fputws$FUNC
    );
    static final FunctionDescriptor _getws_s$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _getws_s$MH = RuntimeHelper.downcallHandle(
        "_getws_s",
        constants$27._getws_s$FUNC
    );
    static final FunctionDescriptor putwc$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putwc$MH = RuntimeHelper.downcallHandle(
        "putwc",
        constants$27.putwc$FUNC
    );
    static final FunctionDescriptor putwchar$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle putwchar$MH = RuntimeHelper.downcallHandle(
        "putwchar",
        constants$27.putwchar$FUNC
    );
    static final FunctionDescriptor _putws$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _putws$MH = RuntimeHelper.downcallHandle(
        "_putws",
        constants$27._putws$FUNC
    );
}


