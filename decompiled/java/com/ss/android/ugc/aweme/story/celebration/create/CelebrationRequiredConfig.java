package com.ss.android.ugc.aweme.story.celebration.create;

import X.C09CT;
import com.ss.android.ugc.aweme.story.celebration.CelebrationExitStrategy;
import com.ss.android.ugc.aweme.story.celebration.CelebrationTemplateConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationRequiredConfig implements Serializable {
    public static final int $stable = CelebrationExitStrategy.$stable | CelebrationTemplateConfig.$stable;

    @C09CT("exit_strategy")
    public final CelebrationExitStrategy exitStrategy;

    @C09CT("template_config")
    public final CelebrationTemplateConfig templateConfig;

    public CelebrationRequiredConfig() {
        this(null, null);
    }

    public CelebrationRequiredConfig(CelebrationTemplateConfig celebrationTemplateConfig, CelebrationExitStrategy celebrationExitStrategy) {
        this.templateConfig = celebrationTemplateConfig;
        this.exitStrategy = celebrationExitStrategy;
    }
}
