package com.ss.android.ugc.aweme.ml.ab;

import X.AnonymousClass1525;
import X.C0C64;

/* JADX INFO: loaded from: classes32.dex */
public final class SmartSexualRecognitionExperiment {
    public static final AnonymousClass1525 DEFAULT_MODEL = null;
    public static final SmartSexualRecognitionExperiment INSTANCE = new SmartSexualRecognitionExperiment();
    public static final String SCENE = "smart_sexual_recognition";
    public static AnonymousClass1525 configHolder;
    public static boolean hasInit;

    public final AnonymousClass1525 getConfig() {
        if (!hasInit) {
            configHolder = (AnonymousClass1525) C0C64.LJIILLIIL().LJJII(AnonymousClass1525.class, DEFAULT_MODEL, SCENE, true);
            hasInit = true;
        }
        return configHolder;
    }

    public final AnonymousClass1525 getConfigHolder() {
        return configHolder;
    }

    public final AnonymousClass1525 getDEFAULT_MODEL() {
        return DEFAULT_MODEL;
    }

    public final boolean getHasInit() {
        return hasInit;
    }

    public final void setConfigHolder(AnonymousClass1525 anonymousClass1525) {
        configHolder = anonymousClass1525;
    }

    public final void setHasInit(boolean z) {
        hasInit = z;
    }
}
