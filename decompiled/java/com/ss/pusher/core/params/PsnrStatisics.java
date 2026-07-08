package com.ss.pusher.core.params;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class PsnrStatisics {

    @C09CT("enable")
    public final boolean enablePsnr;

    @C09CT("psnr_lower_limit")
    public final double psnrLowerLimit;

    @C09CT("psnr_period_gops")
    public final int psnrPeriodGops;

    @C09CT("psnr_use_bytevc0")
    public final boolean psnrUseByteVC0;

    @C09CT("psnr_use_bytevc1")
    public final boolean psnrUseByteVC1;

    @C09CT("report_list")
    public final boolean reportList;

    @C09CT("psnr_period_seconds")
    public final int psnrPeriodSeconds = 30;

    @C09CT("psnr_calc_frames")
    public final int psnrCalcFrames = 20;
}
