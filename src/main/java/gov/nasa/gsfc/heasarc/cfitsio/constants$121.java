// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$121 {

    static final FunctionDescriptor ffimport_file$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ffimport_file$MH = RuntimeHelper.downcallHandle(
        "ffimport_file",
        constants$121.ffimport_file$FUNC
    );
    static final FunctionDescriptor ffrwrg$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ffrwrg$MH = RuntimeHelper.downcallHandle(
        "ffrwrg",
        constants$121.ffrwrg$FUNC
    );
    static final FunctionDescriptor ffrwrgll$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ffrwrgll$MH = RuntimeHelper.downcallHandle(
        "ffrwrgll",
        constants$121.ffrwrgll$FUNC
    );
    static final FunctionDescriptor fits_init_cfitsio$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle fits_init_cfitsio$MH = RuntimeHelper.downcallHandle(
        "fits_init_cfitsio",
        constants$121.fits_init_cfitsio$FUNC
    );
    static final FunctionDescriptor ffomem$mem_realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ffomem$mem_realloc$MH = RuntimeHelper.downcallHandle(
        constants$121.ffomem$mem_realloc$FUNC
    );
}

