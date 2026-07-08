package com.ss.android.ugc.aweme.socialavatar.network.socialavatar;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarXAuthConfig {
    public static final int $stable = 0;

    @C09CT("access_key_id")
    public final String accessKeyId;

    @C09CT("secret_access_key")
    public final String secretAccessKey;

    @C09CT("service_id")
    public final String serviceId;

    @C09CT("session_token")
    public final String sessionToken;

    @C09CT("upload_host")
    public final String uploadHost;

    public SocialAvatarXAuthConfig(String str, String str2, String str3, String str4, String str5) {
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.serviceId = str3;
        this.sessionToken = str4;
        this.uploadHost = str5;
    }
}
