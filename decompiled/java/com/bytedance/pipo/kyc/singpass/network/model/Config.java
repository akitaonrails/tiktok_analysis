package com.bytedance.pipo.kyc.singpass.network.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class Config {

    @C09CT("authorization_endpoint")
    public final String authorizationEndpoint;

    @C09CT("client_id")
    public final String clientId;

    @C09CT("issuer")
    public final String issuer;

    @C09CT("purpose_id")
    public final String purposeId;

    @C09CT("scope")
    public final String scope;

    @C09CT("token_endpoint")
    public final String tokenEndpoint;

    public Config(String str, String str2, String str3, String str4, String str5, String str6) {
        this.authorizationEndpoint = str;
        this.tokenEndpoint = str2;
        this.issuer = str3;
        this.clientId = str4;
        this.purposeId = str5;
        this.scope = str6;
    }
}
