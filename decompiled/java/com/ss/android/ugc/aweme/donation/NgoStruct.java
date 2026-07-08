package com.ss.android.ugc.aweme.donation;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NgoStruct {

    @C09CT("ngo_about_page")
    public final String aboutPage;

    @C09CT("ngo_description")
    public final String description;

    @C09CT("ngo_donation_link")
    public final String donationLink;

    @C09CT("ngo_name")
    public final String ngoName;

    @C09CT("ngo_organization_id")
    public final String orgId;

    @C09CT("ngo_organization_type")
    public final String orgType;

    @C09CT("ngo_icon_url")
    public final String url;

    public NgoStruct(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.ngoName = str;
        this.donationLink = str2;
        this.url = str3;
        this.description = str4;
        this.aboutPage = str5;
        this.orgId = str6;
        this.orgType = str7;
    }
}
