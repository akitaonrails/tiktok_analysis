package com.ss.android.ugc.aweme.ml.ab;

import X.C0C64;
import X.C152A;

/* JADX INFO: loaded from: classes32.dex */
public final class SmartPreviewGameMomentAIStrategyExperiment {
    public static final C152A DEFAULT_MODEL = null;
    public static final SmartPreviewGameMomentAIStrategyExperiment INSTANCE = new SmartPreviewGameMomentAIStrategyExperiment();
    public static final String SCENE = "smart_preview_game_moment_ai_strategy";
    public static C152A configHolder;
    public static boolean hasInit;

    public final C152A getConfig() {
        if (!hasInit) {
            configHolder = (C152A) C0C64.LJIILLIIL().LJJII(C152A.class, DEFAULT_MODEL, SCENE, true);
            hasInit = true;
        }
        return configHolder;
    }

    public final C152A getDEFAULT_MODEL() {
        return DEFAULT_MODEL;
    }
}
