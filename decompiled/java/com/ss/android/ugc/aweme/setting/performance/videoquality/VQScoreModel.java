package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes21.dex */
public final class VQScoreModel {

    @C09CT("accessKey")
    public final String accessKey;

    @C09CT("downloadSource")
    public final String downloadSource;

    @C09CT("host")
    public final String host;

    @C09CT("platformSdkVersion")
    public final String platformSdkVersion;

    public final Map<String, String> toMap() {
        String str;
        String str2;
        String str3;
        String str4 = this.accessKey;
        if (str4 == null || str4.length() == 0 || (str = this.platformSdkVersion) == null || str.length() == 0 || (str2 = this.host) == null || str2.length() == 0 || (str3 = this.downloadSource) == null || str3.length() == 0) {
            return null;
        }
        return C2097608Jq.LJIIIIZZ(new Pair("accessKey", this.accessKey), new Pair("platformSdkVersion", this.platformSdkVersion), new Pair("host", this.host), new Pair("downloadSource", this.downloadSource));
    }

    public VQScoreModel(String str, String str2, String str3, String str4) {
        this.accessKey = str;
        this.platformSdkVersion = str2;
        this.host = str3;
        this.downloadSource = str4;
    }
}
