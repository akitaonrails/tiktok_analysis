package com.ss.android.ugc.aweme.authorize.network;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class OAuthPageDetailApiRequest {

    @C09CT("app_id")
    public final int appId;

    @C09CT("app_identity")
    public final String appIdentity;

    @C09CT("auth_version")
    public final String authVersion;

    @C09CT("bc_params")
    public final String bcParams;

    @C09CT("certificate")
    public final String certificate;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("code_challenge")
    public final String codeChallenge;

    @C09CT("device_platform")
    public final String devicePlatform;

    @C09CT("disable_auto_auth")
    public final int disableAutoAuth;

    @C09CT("initiate_url")
    public final String initiateUrl;

    @C09CT("language")
    public final String language;

    @C09CT("package_name")
    public final String packageName;

    @C09CT("redirect_uri")
    public final String redirectUri;

    @C09CT("response_type")
    public final String responseType;

    @C09CT("scope")
    public final String scopeList;

    @C09CT("sdk_name")
    public final String sdkName;

    @C09CT("signature")
    public final String signature;

    @C09CT("source")
    public final String source;

    @C09CT("state")
    public final String state;

    public OAuthPageDetailApiRequest() {
        this(null, null, null, null, null, null, null, "", "", "", "", "", "", 0, 0, "", "", null, "");
    }

    public OAuthPageDetailApiRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2, String str14, String str15, String str16, String str17) {
        this.clientKey = str;
        this.scopeList = str2;
        this.redirectUri = str3;
        this.bcParams = str4;
        this.appIdentity = str5;
        this.signature = str6;
        this.certificate = str7;
        this.sdkName = str8;
        this.authVersion = str9;
        this.devicePlatform = str10;
        this.source = str11;
        this.responseType = str12;
        this.packageName = str13;
        this.disableAutoAuth = i;
        this.appId = i2;
        this.language = str14;
        this.codeChallenge = str15;
        this.initiateUrl = str16;
        this.state = str17;
    }
}
