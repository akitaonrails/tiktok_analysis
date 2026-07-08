package com.ss.android.ugc.aweme.lemon;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class Lemon8BaseInfoConfig {

    @C09CT("lemon8_app_id")
    public final String lemon8AppId;

    @C09CT("lemon8_app_name")
    public final String lemon8AppName;

    @C09CT("lemon8_default_schema")
    public final String lemon8DefaultSchema;

    @C09CT("lemon8_onelink")
    public final String lemon8OneLink;

    @C09CT("lemon8_pkg_name")
    public final String lemon8PkgName;

    @C09CT("lemon8_schema")
    public final String lemon8Schema;

    @C09CT("lemon8_schema_intro")
    public final String lemon8SchemaIntro;

    @C09CT("market_url")
    public final String marketUrl;

    public Lemon8BaseInfoConfig() {
        this("2657", "lemon8", "https://play.google.com/d?id=com.bd.nproject", "snssdk2657", "snssdk2657://main?", "com.bd.nproject", "lemon8/intro", "https://lemon8.onelink.me/FMQw?");
    }

    public Lemon8BaseInfoConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.lemon8AppId = str;
        this.lemon8AppName = str2;
        this.marketUrl = str3;
        this.lemon8Schema = str4;
        this.lemon8DefaultSchema = str5;
        this.lemon8PkgName = str6;
        this.lemon8SchemaIntro = str7;
        this.lemon8OneLink = str8;
    }
}
