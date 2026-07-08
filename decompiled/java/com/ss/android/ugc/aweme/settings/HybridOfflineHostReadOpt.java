package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridOfflineHostReadOpt {
    public static final HybridOfflineHostReadOptSetting LIZ = new HybridOfflineHostReadOptSetting(false);

    public static final class HybridOfflineHostReadOptSetting {

        @C09CT("enable")
        public final boolean enable;

        public HybridOfflineHostReadOptSetting() {
            this(false);
        }

        public HybridOfflineHostReadOptSetting(boolean z) {
            this.enable = z;
        }
    }
}
