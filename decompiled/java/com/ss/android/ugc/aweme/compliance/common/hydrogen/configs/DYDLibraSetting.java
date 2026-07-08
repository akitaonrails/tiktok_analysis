package com.ss.android.ugc.aweme.compliance.common.hydrogen.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class DYDLibraSetting {
    public static final DYDSettingModel LIZ = new DYDSettingModel(null, null, null, null, null);

    public static final class DYDSettingModel {

        @C09CT("dyd_guest_download")
        public final String dydGuestDownload;

        @C09CT("dyd_guest_uri")
        public final String dydGuestUri;

        @C09CT("dyd_main_uri")
        public final String dydMainUri;

        @C09CT("dyd_unregistered_user")
        public final String dydUnregistered;

        @C09CT("dyd_unregistered_user_download")
        public final String dydUnregisteredDownload;

        public DYDSettingModel() {
            this(null, null, null, null, null);
        }

        public DYDSettingModel(String str, String str2, String str3, String str4, String str5) {
            this.dydGuestDownload = str;
            this.dydGuestUri = str2;
            this.dydMainUri = str3;
            this.dydUnregistered = str4;
            this.dydUnregisteredDownload = str5;
        }
    }
}
