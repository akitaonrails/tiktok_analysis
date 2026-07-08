package com.ss.android.ugc.aweme.publish.model;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes35.dex */
public class UploadImageConfig extends AbstractC2126608Uu {

    @C09CT("appKey")
    public String appKey;

    @C09CT("authorization")
    public String authorization;

    @C09CT("authorization2")
    public STSAuthConfig authorizationV2;

    @C09CT("enableHttps")
    public int enableHttps = 1;

    @C09CT("fileHostName")
    public String fileHostName;

    @C09CT("fileRetryCount")
    public int fileRetryCount;

    @C09CT("imageHostName")
    public String imageHostName;

    @C09CT("maxFailTime")
    public int maxFailTime;

    @C09CT("maxFailTimeEnabled")
    public boolean maxFailTimeEnabled;

    @C09CT("rwTimeout")
    public int rwTimeout;

    @C09CT("sliceRetryCount")
    public int sliceRetryCount;

    @C09CT("sliceSize")
    public int sliceSize;

    @C09CT("sliceTimeout")
    public int sliceTimeout;

    @C09CT("socketNumber")
    public int socketNumber;

    @C09CT("userStoreRegion")
    public String userStoreRegion;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadImageConfig{appKey='");
        sbLIZ.append(this.appKey);
        sbLIZ.append('\'');
        sbLIZ.append(", fileHostName='");
        sbLIZ.append(this.fileHostName);
        sbLIZ.append('\'');
        sbLIZ.append(", imageHostName='");
        sbLIZ.append(this.imageHostName);
        sbLIZ.append('\'');
        sbLIZ.append(", fileRetryCount=");
        sbLIZ.append(this.fileRetryCount);
        sbLIZ.append(", rwTimeout=");
        sbLIZ.append(this.rwTimeout);
        sbLIZ.append(", sliceSize=");
        sbLIZ.append(this.sliceSize);
        sbLIZ.append(", sliceTimeout=");
        sbLIZ.append(this.sliceTimeout);
        sbLIZ.append(", sliceRetryCount=");
        sbLIZ.append(this.sliceRetryCount);
        sbLIZ.append(", authorization='");
        sbLIZ.append(this.authorization);
        sbLIZ.append('\'');
        sbLIZ.append(", enableHttps=");
        sbLIZ.append(this.enableHttps);
        sbLIZ.append(", userStoreRegion='");
        sbLIZ.append(this.userStoreRegion);
        sbLIZ.append('\'');
        sbLIZ.append(", authorizationV2=");
        sbLIZ.append(this.authorizationV2);
        sbLIZ.append(", socketNumber=");
        sbLIZ.append(this.socketNumber);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
