package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class EcomOspJatoOptConfig {

    @C09CT("bind_big_core")
    public final OspBindBigCoreJatoConfig bindBigCoreConfig;

    @C09CT("block_gc")
    public final OspBlockGcJatoConfig blockGcConfig;

    @C09CT("block_jit")
    public final OspBlockJitJatoConfig blockJitConfig;

    @C09CT("block_log")
    public final OspBlockLogJatoConfig blockLogConfig;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("start_do_frame")
    public final OspStartDoFrameJatoConfig startDoFrameConfig;

    @C09CT("thread_priority")
    public final OspThreadJatoConfig threadPriorityConfig;

    public EcomOspJatoOptConfig() {
        this(null, null, null, null, null, null, null);
    }

    public EcomOspJatoOptConfig(Boolean bool, OspBlockLogJatoConfig ospBlockLogJatoConfig, OspBlockGcJatoConfig ospBlockGcJatoConfig, OspBlockJitJatoConfig ospBlockJitJatoConfig, OspStartDoFrameJatoConfig ospStartDoFrameJatoConfig, OspBindBigCoreJatoConfig ospBindBigCoreJatoConfig, OspThreadJatoConfig ospThreadJatoConfig) {
        this.enable = bool;
        this.blockLogConfig = ospBlockLogJatoConfig;
        this.blockGcConfig = ospBlockGcJatoConfig;
        this.blockJitConfig = ospBlockJitJatoConfig;
        this.startDoFrameConfig = ospStartDoFrameJatoConfig;
        this.bindBigCoreConfig = ospBindBigCoreJatoConfig;
        this.threadPriorityConfig = ospThreadJatoConfig;
    }
}
