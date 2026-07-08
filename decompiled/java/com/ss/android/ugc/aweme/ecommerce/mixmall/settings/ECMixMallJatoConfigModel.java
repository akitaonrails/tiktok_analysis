package com.ss.android.ugc.aweme.ecommerce.mixmall.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class ECMixMallJatoConfigModel {

    @C09CT("bind_big_core")
    public final boolean bindBigCore;

    @C09CT("block_gc")
    public final boolean blockGc;

    @C09CT("block_gc_duration")
    public final long blockGcDuration;

    @C09CT("block_jit")
    public final boolean blockJit;

    @C09CT("block_jit_duration")
    public final long blockJitDuration;

    @C09CT("block_log")
    public final boolean blockLog;

    @C09CT("block_log_duration")
    public final long blockLogDuration;

    @C09CT("start_do_frame")
    public final boolean startDoFrame;

    @C09CT("start_do_frame_duration")
    public final long startDoFrameDuration;

    @C09CT("thread_priority")
    public final boolean threadPriority;

    public ECMixMallJatoConfigModel() {
        this(false, 1000L, false, 1500L, false, 3000L, false, false, 1000L, false);
    }

    public ECMixMallJatoConfigModel(boolean z, long j, boolean z2, long j2, boolean z3, long j3, boolean z4, boolean z5, long j4, boolean z6) {
        this.blockLog = z;
        this.blockLogDuration = j;
        this.startDoFrame = z2;
        this.startDoFrameDuration = j2;
        this.blockGc = z3;
        this.blockGcDuration = j3;
        this.threadPriority = z4;
        this.blockJit = z5;
        this.blockJitDuration = j4;
        this.bindBigCore = z6;
    }
}
