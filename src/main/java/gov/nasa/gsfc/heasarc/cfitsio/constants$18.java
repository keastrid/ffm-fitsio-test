// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$18 {

    static final FunctionDescriptor strerror$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle strerror$MH = RuntimeHelper.downcallHandle(
        "strerror",
        constants$18.strerror$FUNC
    );
    static final FunctionDescriptor _stricmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricmp$MH = RuntimeHelper.downcallHandle(
        "_stricmp",
        constants$18._stricmp$FUNC
    );
    static final FunctionDescriptor _stricoll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricoll$MH = RuntimeHelper.downcallHandle(
        "_stricoll",
        constants$18._stricoll$FUNC
    );
    static final FunctionDescriptor _stricoll_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricoll_l$MH = RuntimeHelper.downcallHandle(
        "_stricoll_l",
        constants$18._stricoll_l$FUNC
    );
    static final FunctionDescriptor _stricmp_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _stricmp_l$MH = RuntimeHelper.downcallHandle(
        "_stricmp_l",
        constants$18._stricmp_l$FUNC
    );
    static final FunctionDescriptor strlen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strlen$MH = RuntimeHelper.downcallHandle(
        "strlen",
        constants$18.strlen$FUNC
    );
}


