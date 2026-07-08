package com.ss.android.ugc.aweme.search.entry.visualsearch.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class VisualSearchConfigScene implements Serializable {

    @C09CT("fallback_config")
    public final VisualSearchFallbackConfig fallbackConfig;

    @C09CT("online_config")
    public final VisualSearchServerSceneConfig onlineConfig;

    public VisualSearchConfigScene() {
        this(new VisualSearchFallbackConfig(false, 0), new VisualSearchServerSceneConfig(0, false));
    }

    public VisualSearchConfigScene(VisualSearchFallbackConfig visualSearchFallbackConfig, VisualSearchServerSceneConfig visualSearchServerSceneConfig) {
        this.fallbackConfig = visualSearchFallbackConfig;
        this.onlineConfig = visualSearchServerSceneConfig;
    }
}
