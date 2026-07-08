package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class SecureLinkConfigSettings {
    public static final SecureLinkConfigModel LIZ = new SecureLinkConfigModel(null);

    public static final class SecureLinkConfigModel {

        @C09CT("secure_link_base_url")
        public final String secure_link_base_url;

        public SecureLinkConfigModel() {
            this(null);
        }

        public SecureLinkConfigModel(String str) {
            this.secure_link_base_url = str;
        }
    }
}
