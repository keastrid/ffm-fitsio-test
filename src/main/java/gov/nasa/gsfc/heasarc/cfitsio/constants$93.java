// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$93 {

    static final FunctionDescriptor abort$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle abort$MH = RuntimeHelper.downcallHandle(
        "abort",
        constants$93.abort$FUNC
    );
    static final FunctionDescriptor _set_abort_behavior$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _set_abort_behavior$MH = RuntimeHelper.downcallHandle(
        "_set_abort_behavior",
        constants$93._set_abort_behavior$FUNC
    );
    static final FunctionDescriptor _onexit_t$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle _onexit_t$MH = RuntimeHelper.downcallHandle(
        constants$93._onexit_t$FUNC
    );
    static final FunctionDescriptor atexit$x0$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit$x0$MH = RuntimeHelper.downcallHandle(
        constants$93.atexit$x0$FUNC
    );
}


