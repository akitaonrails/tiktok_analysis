package com.ss.android.ugc.aweme.ml.ab;

import X.AnonymousClass1526;
import X.C0C64;

/* JADX INFO: loaded from: classes32.dex */
public final class SmartGameMLBBHeroRecognitionExperiment {
    public static final AnonymousClass1526 DEFAULT_MODEL = null;
    public static final SmartGameMLBBHeroRecognitionExperiment INSTANCE = new SmartGameMLBBHeroRecognitionExperiment();
    public static final String SCENE = "game_mlbb_hero_recognition";
    public static AnonymousClass1526 configHolder;
    public static boolean hasInit;

    public final AnonymousClass1526 getConfig() {
        if (!hasInit) {
            configHolder = (AnonymousClass1526) C0C64.LJIILLIIL().LJJII(AnonymousClass1526.class, DEFAULT_MODEL, SCENE, true);
            hasInit = true;
        }
        return configHolder;
    }

    public final AnonymousClass1526 getConfigHolder() {
        return configHolder;
    }

    public final AnonymousClass1526 getDEFAULT_MODEL() {
        return DEFAULT_MODEL;
    }

    public final boolean getHasInit() {
        return hasInit;
    }

    public final void setConfigHolder(AnonymousClass1526 anonymousClass1526) {
        configHolder = anonymousClass1526;
    }

    public final void setHasInit(boolean z) {
        hasInit = z;
    }
}
