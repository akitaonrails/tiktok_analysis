package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class JatoPlayConfig {

    @C09CT("play")
    public final JatoBoostConfig playConfig;

    @C09CT("pre_render")
    public final JatoBoostConfig preRenderConfig;

    public JatoPlayConfig() {
        this(null, null);
    }

    public JatoPlayConfig(JatoBoostConfig jatoBoostConfig, JatoBoostConfig jatoBoostConfig2) {
        this.playConfig = jatoBoostConfig;
        this.preRenderConfig = jatoBoostConfig2;
    }
}
