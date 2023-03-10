// Generated by jextract

package gov.nasa.gsfc.heasarc.cfitsio;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$230 {

    static final FunctionDescriptor fp_info$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fp_info$MH = RuntimeHelper.downcallHandle(
        "fp_info",
        constants$230.fp_info$FUNC
    );
    static final FunctionDescriptor fp_info_hdu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fp_info_hdu$MH = RuntimeHelper.downcallHandle(
        "fp_info_hdu",
        constants$230.fp_info_hdu$FUNC
    );
    static final FunctionDescriptor fp_preflight$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fp_preflight$MH = RuntimeHelper.downcallHandle(
        "fp_preflight",
        constants$230.fp_preflight$FUNC
    );
    static final FunctionDescriptor fp_loop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("comptype"),
            Constants$root.C_FLOAT$LAYOUT.withName("quantize_level"),
            Constants$root.C_LONG$LAYOUT.withName("no_dither"),
            Constants$root.C_LONG$LAYOUT.withName("dither_offset"),
            Constants$root.C_LONG$LAYOUT.withName("dither_method"),
            Constants$root.C_FLOAT$LAYOUT.withName("scale"),
            Constants$root.C_FLOAT$LAYOUT.withName("rescale_noise"),
            Constants$root.C_LONG$LAYOUT.withName("smooth"),
            Constants$root.C_LONG$LAYOUT.withName("int_to_float"),
            Constants$root.C_FLOAT$LAYOUT.withName("n3ratio"),
            Constants$root.C_FLOAT$LAYOUT.withName("n3min"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("ntile"),
            Constants$root.C_LONG$LAYOUT.withName("to_stdout"),
            Constants$root.C_LONG$LAYOUT.withName("listonly"),
            Constants$root.C_LONG$LAYOUT.withName("clobber"),
            Constants$root.C_LONG$LAYOUT.withName("delete_input"),
            Constants$root.C_LONG$LAYOUT.withName("do_not_prompt"),
            Constants$root.C_LONG$LAYOUT.withName("do_checksums"),
            Constants$root.C_LONG$LAYOUT.withName("do_gzip_file"),
            Constants$root.C_LONG$LAYOUT.withName("do_images"),
            Constants$root.C_LONG$LAYOUT.withName("do_tables"),
            Constants$root.C_LONG$LAYOUT.withName("test_all"),
            Constants$root.C_LONG$LAYOUT.withName("verbose"),
            MemoryLayout.sequenceLayout(513, Constants$root.C_CHAR$LAYOUT).withName("prefix"),
            MemoryLayout.sequenceLayout(513, Constants$root.C_CHAR$LAYOUT).withName("extname"),
            MemoryLayout.paddingLayout(16),
            Constants$root.C_LONG$LAYOUT.withName("delete_suffix"),
            MemoryLayout.sequenceLayout(513, Constants$root.C_CHAR$LAYOUT).withName("outfile"),
            MemoryLayout.paddingLayout(24),
            Constants$root.C_LONG$LAYOUT.withName("firstfile"),
            Constants$root.C_LONG$LAYOUT.withName("initialized"),
            Constants$root.C_LONG$LAYOUT.withName("preflight_checked")
        )
    );
    static final MethodHandle fp_loop$MH = RuntimeHelper.downcallHandle(
        "fp_loop",
        constants$230.fp_loop$FUNC
    );
    static final FunctionDescriptor fp_pack$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("comptype"),
            Constants$root.C_FLOAT$LAYOUT.withName("quantize_level"),
            Constants$root.C_LONG$LAYOUT.withName("no_dither"),
            Constants$root.C_LONG$LAYOUT.withName("dither_offset"),
            Constants$root.C_LONG$LAYOUT.withName("dither_method"),
            Constants$root.C_FLOAT$LAYOUT.withName("scale"),
            Constants$root.C_FLOAT$LAYOUT.withName("rescale_noise"),
            Constants$root.C_LONG$LAYOUT.withName("smooth"),
            Constants$root.C_LONG$LAYOUT.withName("int_to_float"),
            Constants$root.C_FLOAT$LAYOUT.withName("n3ratio"),
            Constants$root.C_FLOAT$LAYOUT.withName("n3min"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("ntile"),
            Constants$root.C_LONG$LAYOUT.withName("to_stdout"),
            Constants$root.C_LONG$LAYOUT.withName("listonly"),
            Constants$root.C_LONG$LAYOUT.withName("clobber"),
            Constants$root.C_LONG$LAYOUT.withName("delete_input"),
            Constants$root.C_LONG$LAYOUT.withName("do_not_prompt"),
            Constants$root.C_LONG$LAYOUT.withName("do_checksums"),
            Constants$root.C_LONG$LAYOUT.withName("do_gzip_file"),
            Constants$root.C_LONG$LAYOUT.withName("do_images"),
            Constants$root.C_LONG$LAYOUT.withName("do_tables"),
            Constants$root.C_LONG$LAYOUT.withName("test_all"),
            Constants$root.C_LONG$LAYOUT.withName("verbose"),
            MemoryLayout.sequenceLayout(513, Constants$root.C_CHAR$LAYOUT).withName("prefix"),
            MemoryLayout.sequenceLayout(513, Constants$root.C_CHAR$LAYOUT).withName("extname"),
            MemoryLayout.paddingLayout(16),
            Constants$root.C_LONG$LAYOUT.withName("delete_suffix"),
            MemoryLayout.sequenceLayout(513, Constants$root.C_CHAR$LAYOUT).withName("outfile"),
            MemoryLayout.paddingLayout(24),
            Constants$root.C_LONG$LAYOUT.withName("firstfile"),
            Constants$root.C_LONG$LAYOUT.withName("initialized"),
            Constants$root.C_LONG$LAYOUT.withName("preflight_checked")
        ),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fp_pack$MH = RuntimeHelper.downcallHandle(
        "fp_pack",
        constants$230.fp_pack$FUNC
    );
    static final FunctionDescriptor fp_unpack$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("comptype"),
            Constants$root.C_FLOAT$LAYOUT.withName("quantize_level"),
            Constants$root.C_LONG$LAYOUT.withName("no_dither"),
            Constants$root.C_LONG$LAYOUT.withName("dither_offset"),
            Constants$root.C_LONG$LAYOUT.withName("dither_method"),
            Constants$root.C_FLOAT$LAYOUT.withName("scale"),
            Constants$root.C_FLOAT$LAYOUT.withName("rescale_noise"),
            Constants$root.C_LONG$LAYOUT.withName("smooth"),
            Constants$root.C_LONG$LAYOUT.withName("int_to_float"),
            Constants$root.C_FLOAT$LAYOUT.withName("n3ratio"),
            Constants$root.C_FLOAT$LAYOUT.withName("n3min"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("ntile"),
            Constants$root.C_LONG$LAYOUT.withName("to_stdout"),
            Constants$root.C_LONG$LAYOUT.withName("listonly"),
            Constants$root.C_LONG$LAYOUT.withName("clobber"),
            Constants$root.C_LONG$LAYOUT.withName("delete_input"),
            Constants$root.C_LONG$LAYOUT.withName("do_not_prompt"),
            Constants$root.C_LONG$LAYOUT.withName("do_checksums"),
            Constants$root.C_LONG$LAYOUT.withName("do_gzip_file"),
            Constants$root.C_LONG$LAYOUT.withName("do_images"),
            Constants$root.C_LONG$LAYOUT.withName("do_tables"),
            Constants$root.C_LONG$LAYOUT.withName("test_all"),
            Constants$root.C_LONG$LAYOUT.withName("verbose"),
            MemoryLayout.sequenceLayout(513, Constants$root.C_CHAR$LAYOUT).withName("prefix"),
            MemoryLayout.sequenceLayout(513, Constants$root.C_CHAR$LAYOUT).withName("extname"),
            MemoryLayout.paddingLayout(16),
            Constants$root.C_LONG$LAYOUT.withName("delete_suffix"),
            MemoryLayout.sequenceLayout(513, Constants$root.C_CHAR$LAYOUT).withName("outfile"),
            MemoryLayout.paddingLayout(24),
            Constants$root.C_LONG$LAYOUT.withName("firstfile"),
            Constants$root.C_LONG$LAYOUT.withName("initialized"),
            Constants$root.C_LONG$LAYOUT.withName("preflight_checked")
        )
    );
    static final MethodHandle fp_unpack$MH = RuntimeHelper.downcallHandle(
        "fp_unpack",
        constants$230.fp_unpack$FUNC
    );
}


