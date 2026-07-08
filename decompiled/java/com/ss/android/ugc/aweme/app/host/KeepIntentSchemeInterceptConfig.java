package com.ss.android.ugc.aweme.app.host;

import com.ss.android.ugc.aweme.ad.settings.IntentSchemeInterceptConfig;
import com.ss.android.ugc.aweme.ad.settings.IntentSchemeInterceptConfigSettings;

/* JADX INFO: loaded from: classes17.dex */
public class KeepIntentSchemeInterceptConfig {
    public static void use(IntentSchemeInterceptConfig[] intentSchemeInterceptConfigArr) {
    }

    public static void emptyMethod() {
        IntentSchemeInterceptConfigSettings intentSchemeInterceptConfigSettings = IntentSchemeInterceptConfigSettings.INSTANCE;
        use(intentSchemeInterceptConfigSettings.get());
        use(intentSchemeInterceptConfigSettings.get());
    }
}
