package com.ss.android.ugc.aweme.ad.settings;

import X.C1AF0;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes17.dex */
public final class IntentSchemeInterceptConfigSettings {
    public static final IntentSchemeInterceptConfigSettings INSTANCE = new IntentSchemeInterceptConfigSettings();
    public static final IntentSchemeInterceptConfig[] VALUE = new IntentSchemeInterceptConfig[0];

    public final IntentSchemeInterceptConfig[] get() {
        try {
            SettingsManager.LIZLLL().getClass();
            IntentSchemeInterceptConfig[] intentSchemeInterceptConfigArr = (IntentSchemeInterceptConfig[]) SettingsManager.LJII("intent_scheme_intercept_config", IntentSchemeInterceptConfig[].class);
            return intentSchemeInterceptConfigArr == null ? VALUE : intentSchemeInterceptConfigArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return VALUE;
        }
    }

    public final IntentSchemeInterceptConfig[] getVALUE() {
        return VALUE;
    }
}
