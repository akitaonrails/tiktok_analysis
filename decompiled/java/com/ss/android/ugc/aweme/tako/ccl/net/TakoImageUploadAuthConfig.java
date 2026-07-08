package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes27.dex */
public final class TakoImageUploadAuthConfig {

    @C09CT("access_key_id")
    public final String accessKeyId;

    @C09CT("current_time")
    public final String currentTime;

    @C09CT("domain")
    public final String domain;

    @C09CT("expired_time")
    public final String expiredTime;

    @C09CT("log_id")
    public final String logId;

    @C09CT("secret_access_key")
    public final String secretAccessKey;

    @C09CT("service_id")
    public final String serviceId;

    @C09CT("session_token")
    public final String sessionToken;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageUploadAuthConfig(accessKeyId=");
        sbLIZ.append(this.accessKeyId);
        sbLIZ.append(", secretAccessKey=");
        sbLIZ.append(this.secretAccessKey);
        sbLIZ.append(", sessionToken=");
        sbLIZ.append(this.sessionToken);
        sbLIZ.append(", expiredTime=");
        sbLIZ.append(this.expiredTime);
        sbLIZ.append(", currentTime=");
        sbLIZ.append(this.currentTime);
        sbLIZ.append(", domain=");
        sbLIZ.append(this.domain);
        sbLIZ.append(", serviceId=");
        sbLIZ.append(this.serviceId);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.logId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoImageUploadAuthConfig() {
        this("", "", "", "", "", "", "", "");
    }

    public TakoImageUploadAuthConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.accessKeyId = str;
        this.secretAccessKey = str2;
        this.sessionToken = str3;
        this.expiredTime = str4;
        this.currentTime = str5;
        this.domain = str6;
        this.serviceId = str7;
        this.logId = str8;
    }
}
