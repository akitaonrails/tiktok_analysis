package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationServiceManagementSettings {
    public static final LocationServiceManagementModel LIZ = new LocationServiceManagementModel("account-and-privacy/account-privacy-settings/location-services-on-tiktok", "https://support.tiktok.com", "account-and-privacy/account-privacy-settings/location-services-on-tiktok#3");

    public static final class LocationServiceManagementModel {

        @C09CT("center_location_path")
        public final String centerLocationPath;

        @C09CT("center_path")
        public final String centerPath;

        @C09CT("domain")
        public final String domain;

        public LocationServiceManagementModel(String str, String str2, String str3) {
            this.centerPath = str;
            this.domain = str2;
            this.centerLocationPath = str3;
        }
    }
}
