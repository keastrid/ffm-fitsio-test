// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$54 {

    static final FunctionDescriptor _pclose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _pclose$MH = RuntimeHelper.downcallHandle(
        "_pclose",
        constants$54._pclose$FUNC
    );
    static final FunctionDescriptor _popen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _popen$MH = RuntimeHelper.downcallHandle(
        "_popen",
        constants$54._popen$FUNC
    );
    static final FunctionDescriptor putc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putc$MH = RuntimeHelper.downcallHandle(
        "putc",
        constants$54.putc$FUNC
    );
    static final FunctionDescriptor putchar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle putchar$MH = RuntimeHelper.downcallHandle(
        "putchar",
        constants$54.putchar$FUNC
    );
    static final FunctionDescriptor puts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle puts$MH = RuntimeHelper.downcallHandle(
        "puts",
        constants$54.puts$FUNC
    );
    static final FunctionDescriptor _putw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _putw$MH = RuntimeHelper.downcallHandle(
        "_putw",
        constants$54._putw$FUNC
    );
}


