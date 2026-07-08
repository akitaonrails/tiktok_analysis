package com.ss.android.ugc.aweme.ecommerce.saas.core;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class ECBuildInfo {

    @C09CT("ecom_aar_version")
    public final String aarVersion;

    @C09CT("ecom_appid")
    public final String appId;

    @C09CT("ecomAppVersion")
    public final String appVersion;

    @C09CT("ecom_build_number")
    public final String buildNumber;

    @C09CT("ecom_version")
    public final String ecomVersion;

    @C09CT("ecom_commit_id")
    public final String gitSha;

    @C09CT("ecom_version_code")
    public final String versionCode;

    @C09CT("ecom_version_name")
    public final String versionName;

    public ECBuildInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.ecomVersion = str;
        this.appVersion = str2;
        this.versionCode = str3;
        this.versionName = str4;
        this.appId = str5;
        this.buildNumber = str6;
        this.gitSha = str7;
        this.aarVersion = str8;
    }
}
