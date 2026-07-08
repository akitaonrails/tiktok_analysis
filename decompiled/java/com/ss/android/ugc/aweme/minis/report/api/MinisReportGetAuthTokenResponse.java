package com.ss.android.ugc.aweme.minis.report.api;

import X.C09CT;
import X.C1697810uHb;
import X.C1735750vGn;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisReportGetAuthTokenResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("access_key")
    public final String accessKey;

    @C09CT("secret_key")
    public final String secretKey;

    @C09CT("service_id")
    public final String serviceId;

    @C09CT("session_token")
    public final String sessionToken;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("upload_host")
    public final String uploadHost;

    public final C1735750vGn toAuthKey() {
        Iterator it2 = C1697810uHb.LJIIJJI(this.accessKey, this.secretKey, this.sessionToken, this.serviceId, this.uploadHost).iterator();
        while (it2.hasNext()) {
            if (it2.next() == null) {
                return null;
            }
        }
        String str = this.accessKey;
        if (str == null) {
            str = "";
        }
        String str2 = this.secretKey;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.sessionToken;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.serviceId;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.uploadHost;
        return new C1735750vGn(str, str2, str3, str4, str5 != null ? str5 : "");
    }

    public MinisReportGetAuthTokenResponse(String str, String str2, String str3, String str4, String str5, Integer num, String str6) {
        this.accessKey = str;
        this.secretKey = str2;
        this.sessionToken = str3;
        this.serviceId = str4;
        this.uploadHost = str5;
        this.statusCode = num;
        this.statusMsg = str6;
    }
}
