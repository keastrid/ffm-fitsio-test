// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$91 {

    static final FunctionDescriptor _wgetenv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wgetenv$MH = RuntimeHelper.downcallHandle(
        "_wgetenv",
        constants$91._wgetenv$FUNC
    );
    static final FunctionDescriptor _wgetenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wgetenv_s$MH = RuntimeHelper.downcallHandle(
        "_wgetenv_s",
        constants$91._wgetenv_s$FUNC
    );
    static final FunctionDescriptor _wputenv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wputenv$MH = RuntimeHelper.downcallHandle(
        "_wputenv",
        constants$91._wputenv$FUNC
    );
    static final FunctionDescriptor _wputenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wputenv_s$MH = RuntimeHelper.downcallHandle(
        "_wputenv_s",
        constants$91._wputenv_s$FUNC
    );
    static final FunctionDescriptor _wsearchenv_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle _wsearchenv_s$MH = RuntimeHelper.downcallHandle(
        "_wsearchenv_s",
        constants$91._wsearchenv_s$FUNC
    );
    static final FunctionDescriptor _wsearchenv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _wsearchenv$MH = RuntimeHelper.downcallHandle(
        "_wsearchenv",
        constants$91._wsearchenv$FUNC
    );
}

