package com.ss.android.ugc.tiktok.security.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class WebViewHttpsGuardSettings {
    public static final HttpsGuardConfig LIZ = new HttpsGuardConfig(false);

    public static final class HttpsGuardConfig {

        @C09CT("enabled")
        public boolean enable;

        public HttpsGuardConfig() {
            this(false);
        }

        public HttpsGuardConfig(boolean z) {
            this.enable = z;
        }
    }
}
