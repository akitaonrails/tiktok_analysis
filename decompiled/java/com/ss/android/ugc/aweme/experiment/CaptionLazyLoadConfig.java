package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class CaptionLazyLoadConfig {

    @C09CT("precondition")
    public final CaptionLazyLoadPreconditionConfig precondition;

    @C09CT("strategy")
    public final CaptionLazyLoadStrategyConfig strategy;

    public CaptionLazyLoadConfig() {
        this(null, null);
    }

    public CaptionLazyLoadConfig(CaptionLazyLoadPreconditionConfig captionLazyLoadPreconditionConfig, CaptionLazyLoadStrategyConfig captionLazyLoadStrategyConfig) {
        this.precondition = captionLazyLoadPreconditionConfig;
        this.strategy = captionLazyLoadStrategyConfig;
    }
}
