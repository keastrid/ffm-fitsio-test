// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$48 {

    static final FunctionDescriptor fread_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fread_s$MH = RuntimeHelper.downcallHandle(
        "fread_s",
        constants$48.fread_s$FUNC
    );
    static final FunctionDescriptor freopen_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle freopen_s$MH = RuntimeHelper.downcallHandle(
        "freopen_s",
        constants$48.freopen_s$FUNC
    );
    static final FunctionDescriptor gets_s$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gets_s$MH = RuntimeHelper.downcallHandle(
        "gets_s",
        constants$48.gets_s$FUNC
    );
    static final FunctionDescriptor tmpfile_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tmpfile_s$MH = RuntimeHelper.downcallHandle(
        "tmpfile_s",
        constants$48.tmpfile_s$FUNC
    );
    static final FunctionDescriptor tmpnam_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle tmpnam_s$MH = RuntimeHelper.downcallHandle(
        "tmpnam_s",
        constants$48.tmpnam_s$FUNC
    );
    static final FunctionDescriptor clearerr$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clearerr$MH = RuntimeHelper.downcallHandle(
        "clearerr",
        constants$48.clearerr$FUNC
    );
}


