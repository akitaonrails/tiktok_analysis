package com.bytedance.pipo.kyc.singpass.network.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CodeChallengeParams {

    @C09CT("code_challenge")
    public final String codeChallenge;

    @C09CT("code_challenge_method")
    public final String codeChallengeMethod;

    @C09CT("config")
    public final Config config;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("session_id")
    public final String sessionId;

    public CodeChallengeParams(String str, String str2, Config config, String str3, String str4) {
        this.codeChallenge = str;
        this.codeChallengeMethod = str2;
        this.config = config;
        this.redirectUrl = str3;
        this.sessionId = str4;
    }
}
