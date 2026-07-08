package com.ss.android.ugc.aweme.ml.ab;

import X.C0C64;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartPrerenderExperiment {
    public static final SmartPrerenderConfig DEFAULT_MODEL = null;
    public static final SmartPrerenderExperiment INSTANCE = new SmartPrerenderExperiment();
    public static final String SCENE = "smart_video_prerender";
    public static SmartPrerenderConfig configHolder;
    public static boolean hasInit;

    public final SmartPrerenderConfig getConfig() {
        if (!hasInit) {
            configHolder = (SmartPrerenderConfig) C0C64.LJIILLIIL().LJJII(SmartPrerenderConfig.class, DEFAULT_MODEL, SCENE, true);
            hasInit = true;
        }
        return configHolder;
    }

    public final SmartPrerenderConfig getConfigHolder() {
        return configHolder;
    }

    public final SmartPrerenderConfig getDEFAULT_MODEL() {
        return DEFAULT_MODEL;
    }

    public final boolean getHasInit() {
        return hasInit;
    }

    public final void setConfigHolder(SmartPrerenderConfig smartPrerenderConfig) {
        configHolder = smartPrerenderConfig;
    }

    public final void setHasInit(boolean z) {
        hasInit = z;
    }
}
