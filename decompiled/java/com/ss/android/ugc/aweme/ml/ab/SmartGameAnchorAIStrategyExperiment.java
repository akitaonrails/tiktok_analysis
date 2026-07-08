package com.ss.android.ugc.aweme.ml.ab;

import X.C0C64;
import X.C152B;

/* JADX INFO: loaded from: classes32.dex */
public final class SmartGameAnchorAIStrategyExperiment {
    public static final C152B DEFAULT_MODEL = null;
    public static final SmartGameAnchorAIStrategyExperiment INSTANCE = new SmartGameAnchorAIStrategyExperiment();
    public static final String SCENE = "smart_game_anchor_ai_strategy";
    public static C152B configHolder;
    public static boolean hasInit;

    public final C152B getConfig() {
        if (!hasInit) {
            configHolder = (C152B) C0C64.LJIILLIIL().LJJII(C152B.class, DEFAULT_MODEL, SCENE, true);
            hasInit = true;
        }
        return configHolder;
    }

    public final C152B getDEFAULT_MODEL() {
        return DEFAULT_MODEL;
    }
}
