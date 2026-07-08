package com.ss.android.ugc.aweme.ml.ab;

import X.C0C64;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartPlaytimePredictExperiment {
    public static final SmartPlaytimePredictConfig DEFAULT = null;
    public static final SmartPlaytimePredictExperiment INSTANCE = new SmartPlaytimePredictExperiment();
    public static boolean hasInit;
    public static SmartPlaytimePredictConfig serviceConfig;

    public final SmartPlaytimePredictConfig getPlaytimePredictServiceConfig() {
        if (!hasInit) {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            SmartPlaytimePredictConfig smartPlaytimePredictConfig = DEFAULT;
            SmartPlaytimePredictConfig smartPlaytimePredictConfig2 = (SmartPlaytimePredictConfig) c0c64LJIILLIIL.LJJII(SmartPlaytimePredictConfig.class, smartPlaytimePredictConfig, "smart_playtime_predict_config", true);
            if (smartPlaytimePredictConfig2 != null) {
                smartPlaytimePredictConfig = smartPlaytimePredictConfig2;
            }
            serviceConfig = smartPlaytimePredictConfig;
            hasInit = true;
        }
        return serviceConfig;
    }

    public final SmartPlaytimePredictConfig getDEFAULT() {
        return DEFAULT;
    }
}
