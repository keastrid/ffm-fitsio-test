// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$56 {

    static final FunctionDescriptor setbuf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setbuf$MH = RuntimeHelper.downcallHandle(
        "setbuf",
        constants$56.setbuf$FUNC
    );
    static final FunctionDescriptor _setmaxstdio$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _setmaxstdio$MH = RuntimeHelper.downcallHandle(
        "_setmaxstdio",
        constants$56._setmaxstdio$FUNC
    );
    static final FunctionDescriptor setvbuf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle setvbuf$MH = RuntimeHelper.downcallHandle(
        "setvbuf",
        constants$56.setvbuf$FUNC
    );
    static final FunctionDescriptor _tempnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _tempnam$MH = RuntimeHelper.downcallHandle(
        "_tempnam",
        constants$56._tempnam$FUNC
    );
    static final FunctionDescriptor tmpfile$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle tmpfile$MH = RuntimeHelper.downcallHandle(
        "tmpfile",
        constants$56.tmpfile$FUNC
    );
    static final FunctionDescriptor tmpnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tmpnam$MH = RuntimeHelper.downcallHandle(
        "tmpnam",
        constants$56.tmpnam$FUNC
    );
}


