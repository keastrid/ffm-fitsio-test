// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$49 {

    static final FunctionDescriptor fclose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fclose$MH = RuntimeHelper.downcallHandle(
        "fclose",
        constants$49.fclose$FUNC
    );
    static final FunctionDescriptor _fcloseall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _fcloseall$MH = RuntimeHelper.downcallHandle(
        "_fcloseall",
        constants$49._fcloseall$FUNC
    );
    static final FunctionDescriptor _fdopen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _fdopen$MH = RuntimeHelper.downcallHandle(
        "_fdopen",
        constants$49._fdopen$FUNC
    );
    static final FunctionDescriptor feof$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle feof$MH = RuntimeHelper.downcallHandle(
        "feof",
        constants$49.feof$FUNC
    );
    static final FunctionDescriptor ferror$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ferror$MH = RuntimeHelper.downcallHandle(
        "ferror",
        constants$49.ferror$FUNC
    );
    static final FunctionDescriptor fflush$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fflush$MH = RuntimeHelper.downcallHandle(
        "fflush",
        constants$49.fflush$FUNC
    );
}


