package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class TermsConsentInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("business")
    public final String business;

    @C09CT("button")
    public final String button;

    @C09CT("checkbox_tr_notification_subtitle")
    public final String cbNotificationSubTitle;

    @C09CT("checkbox_tr_notification_title")
    public final String cbNotificationTitle;

    @C09CT("checkbox_agree_all_terms")
    public final String checkboxAll;

    @C09CT("checkbox_privacy_policy")
    public final String checkboxPP;

    @C09CT("checkbox_terms_of_use")
    public final String checkboxTerms;

    @C09CT("desc")
    public final String description;

    @C09CT("checkbox_tr_notification_url")
    public final String krMarketUrl;

    @C09CT("tiktok_privacy_policy_url")
    public final String privacyPolicyUrl;

    @C09CT("tiktok_terms_of_use_url")
    public final String termsOfUseUrl;

    @C09CT("title")
    public final String title;

    public TermsConsentInfo() {
        this("", "", "", "", "", "", "", "", "", "", "", "");
    }

    public TermsConsentInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.termsOfUseUrl = str;
        this.privacyPolicyUrl = str2;
        this.krMarketUrl = str3;
        this.title = str4;
        this.description = str5;
        this.checkboxAll = str6;
        this.checkboxTerms = str7;
        this.checkboxPP = str8;
        this.button = str9;
        this.business = str10;
        this.cbNotificationTitle = str11;
        this.cbNotificationSubTitle = str12;
    }
}
