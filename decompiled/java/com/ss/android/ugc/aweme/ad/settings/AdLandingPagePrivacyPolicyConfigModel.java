package com.ss.android.ugc.aweme.ad.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandingPagePrivacyPolicyConfigModel {

    @C09CT("eea_privacy_policy_url")
    public final String eeaPrivacyPolicyUrl;

    @C09CT("privacy_policy_enable")
    public final Boolean privacyPolicyEnable;

    @C09CT("row_privacy_policy_url")
    public final String rowPrivacyPolicyUrl;

    @C09CT("us_privacy_policy_url")
    public final String usPrivacyPolicyUrl;

    public AdLandingPagePrivacyPolicyConfigModel() {
        this(Boolean.TRUE, "https://www.tiktok.com/legal/page/eea/privacy-policy/en", "https://www.tiktok.com/legal/privacy-policy", "https://www.tiktok.com/legal/page/us/privacy-policy/en");
    }

    public AdLandingPagePrivacyPolicyConfigModel(Boolean bool, String str, String str2, String str3) {
        this.privacyPolicyEnable = bool;
        this.eeaPrivacyPolicyUrl = str;
        this.rowPrivacyPolicyUrl = str2;
        this.usPrivacyPolicyUrl = str3;
    }
}
