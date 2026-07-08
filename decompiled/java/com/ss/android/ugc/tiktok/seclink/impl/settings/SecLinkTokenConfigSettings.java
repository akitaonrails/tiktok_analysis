package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class SecLinkTokenConfigSettings {
    public static final SecLinkTokenConfig LIZ = new SecLinkTokenConfig(false, new ArrayList(), new ArrayList());

    public static final class SecLinkTokenConfig {

        @C09CT("scenes")
        public final List<String> allowScenes;

        @C09CT("tokens")
        public final List<String> allowTokens;

        @C09CT("enabled")
        public final boolean enable;

        public SecLinkTokenConfig() {
            this(false, new ArrayList(), new ArrayList());
        }

        public SecLinkTokenConfig(boolean z, List<String> list, List<String> list2) {
            this.enable = z;
            this.allowScenes = list;
            this.allowTokens = list2;
        }
    }
}
