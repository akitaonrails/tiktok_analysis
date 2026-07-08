package com.ss.android.ugc.aweme.ml.ab;

import X.AnonymousClass1528;
import X.C0C64;

/* JADX INFO: loaded from: classes32.dex */
public final class GameKeytimeRecognitionExperiment {
    public static final AnonymousClass1528 DEFAULT_MODEL = null;
    public static final GameKeytimeRecognitionExperiment INSTANCE = new GameKeytimeRecognitionExperiment();
    public static AnonymousClass1528 configHolder;
    public static boolean hasInit;

    public final AnonymousClass1528 getConfig() {
        if (!hasInit) {
            configHolder = (AnonymousClass1528) C0C64.LJIILLIIL().LJJII(AnonymousClass1528.class, DEFAULT_MODEL, "game_keytime_recognition", true);
            hasInit = true;
        }
        return configHolder;
    }

    public final AnonymousClass1528 getConfigHolder() {
        return configHolder;
    }

    public final AnonymousClass1528 getDEFAULT_MODEL() {
        return DEFAULT_MODEL;
    }

    public final boolean getHasInit() {
        return hasInit;
    }

    public final void setConfigHolder(AnonymousClass1528 anonymousClass1528) {
        configHolder = anonymousClass1528;
    }

    public final void setHasInit(boolean z) {
        hasInit = z;
    }
}
