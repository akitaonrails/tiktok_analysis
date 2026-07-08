package com.ss.android.ugc.aweme.video.experiment.mediabox.cover;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class MediaBoxFrameOptConfig {

    @C09CT("opt_add_cover")
    public final boolean optAddCover;

    @C09CT("opt_create_module")
    public final boolean optCreateModule;

    @C09CT("opt_mediabox_init_work_thread")
    public final boolean optMediaBoxInitWorkThread;

    @C09CT("opt_module_init_sync")
    public final boolean optModuleInitSync;

    @C09CT("preload_mediabox_config")
    public final boolean preloadMediaBoxConfig;

    @C09CT("opt_use_ultimate_inflater")
    public final boolean useUltimateInflater;

    public MediaBoxFrameOptConfig() {
        this(false, false, false, false, false, false);
    }

    public MediaBoxFrameOptConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.preloadMediaBoxConfig = z;
        this.optAddCover = z2;
        this.optMediaBoxInitWorkThread = z3;
        this.useUltimateInflater = z4;
        this.optCreateModule = z5;
        this.optModuleInitSync = z6;
    }
}
