// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$225 {

    static final FunctionDescriptor fits_get_hcomp_scale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_get_hcomp_scale$MH = RuntimeHelper.downcallHandle(
        "fits_get_hcomp_scale",
        constants$225.fits_get_hcomp_scale$FUNC
    );
    static final FunctionDescriptor fits_get_hcomp_smooth$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_get_hcomp_smooth$MH = RuntimeHelper.downcallHandle(
        "fits_get_hcomp_smooth",
        constants$225.fits_get_hcomp_smooth$FUNC
    );
    static final FunctionDescriptor fits_get_dither_seed$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_get_dither_seed$MH = RuntimeHelper.downcallHandle(
        "fits_get_dither_seed",
        constants$225.fits_get_dither_seed$FUNC
    );
    static final FunctionDescriptor fits_img_compress$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_img_compress$MH = RuntimeHelper.downcallHandle(
        "fits_img_compress",
        constants$225.fits_img_compress$FUNC
    );
    static final FunctionDescriptor fits_comp_img$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_comp_img$MH = RuntimeHelper.downcallHandle(
        "fits_comp_img",
        constants$225.fits_comp_img$FUNC
    );
    static final FunctionDescriptor fits_is_compressed_image$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fits_is_compressed_image$MH = RuntimeHelper.downcallHandle(
        "fits_is_compressed_image",
        constants$225.fits_is_compressed_image$FUNC
    );
}


