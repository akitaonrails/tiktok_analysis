package com.ss.android.ugc.aweme.ml.ab;

import X.AnonymousClass1527;
import X.C0C64;

/* JADX INFO: loaded from: classes32.dex */
public final class SmartGameRestRecognitionExperiment {
    public static final AnonymousClass1527 DEFAULT_MODEL = null;
    public static final SmartGameRestRecognitionExperiment INSTANCE = new SmartGameRestRecognitionExperiment();
    public static final String SCENE = "game_live_gap_time";
    public static AnonymousClass1527 configHolder;
    public static boolean hasInit;

    public final AnonymousClass1527 getConfig() {
        if (!hasInit) {
            configHolder = (AnonymousClass1527) C0C64.LJIILLIIL().LJJII(AnonymousClass1527.class, DEFAULT_MODEL, SCENE, true);
            hasInit = true;
        }
        return configHolder;
    }

    public final AnonymousClass1527 getConfigHolder() {
        return configHolder;
    }

    public final AnonymousClass1527 getDEFAULT_MODEL() {
        return DEFAULT_MODEL;
    }

    public final boolean getHasInit() {
        return hasInit;
    }

    public final void setConfigHolder(AnonymousClass1527 anonymousClass1527) {
        configHolder = anonymousClass1527;
    }

    public final void setHasInit(boolean z) {
        hasInit = z;
    }
}
