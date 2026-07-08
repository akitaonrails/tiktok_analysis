package com.ss.android.ugc.aweme.search.entry.visualsearch.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class VisualSearchTakoConfig implements Serializable {

    @C09CT("tako_tag_enabled")
    public final boolean enable;

    @C09CT("horizontal_config")
    public final VisualSearchConfigScene horizontalConfig;

    @C09CT("vertical_config")
    public final VisualSearchConfigScene verticalConfig;

    public VisualSearchTakoConfig() {
        this(false, new VisualSearchConfigScene(new VisualSearchFallbackConfig(false, 0), new VisualSearchServerSceneConfig(0, false)), new VisualSearchConfigScene(new VisualSearchFallbackConfig(false, 0), new VisualSearchServerSceneConfig(0, false)));
    }

    public VisualSearchTakoConfig(boolean z, VisualSearchConfigScene visualSearchConfigScene, VisualSearchConfigScene visualSearchConfigScene2) {
        this.enable = z;
        this.horizontalConfig = visualSearchConfigScene;
        this.verticalConfig = visualSearchConfigScene2;
    }
}
