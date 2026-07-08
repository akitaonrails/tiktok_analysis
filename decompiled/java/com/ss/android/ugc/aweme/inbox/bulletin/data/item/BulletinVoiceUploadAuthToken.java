package com.ss.android.ugc.aweme.inbox.bulletin.data.item;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class BulletinVoiceUploadAuthToken {
    public static final int $stable = 0;

    @C09CT("access_key_id")
    public final String accessKeyId;

    @C09CT("expiry_time")
    public final long expiryTime;

    @C09CT("host")
    public final String host;

    @C09CT("resource_space")
    public final String resourceSpace;

    @C09CT("secret_access_key")
    public final String secretAccessKey;

    @C09CT("session_token")
    public final String sessionToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinVoiceUploadAuthToken)) {
            return false;
        }
        BulletinVoiceUploadAuthToken bulletinVoiceUploadAuthToken = (BulletinVoiceUploadAuthToken) obj;
        return Intrinsics.LJFF(this.resourceSpace, bulletinVoiceUploadAuthToken.resourceSpace) && Intrinsics.LJFF(this.host, bulletinVoiceUploadAuthToken.host) && this.expiryTime == bulletinVoiceUploadAuthToken.expiryTime && Intrinsics.LJFF(this.accessKeyId, bulletinVoiceUploadAuthToken.accessKeyId) && Intrinsics.LJFF(this.sessionToken, bulletinVoiceUploadAuthToken.sessionToken) && Intrinsics.LJFF(this.secretAccessKey, bulletinVoiceUploadAuthToken.secretAccessKey);
    }

    public int hashCode() {
        return (((((((((this.resourceSpace.hashCode() * 31) + this.host.hashCode()) * 31) + C786410Ut5.Y2(this.expiryTime)) * 31) + this.accessKeyId.hashCode()) * 31) + this.sessionToken.hashCode()) * 31) + this.secretAccessKey.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinVoiceUploadAuthToken(resourceSpace=");
        sbLIZ.append(this.resourceSpace);
        sbLIZ.append(", host=");
        sbLIZ.append(this.host);
        sbLIZ.append(", expiryTime=");
        sbLIZ.append(this.expiryTime);
        sbLIZ.append(", accessKeyId=");
        sbLIZ.append(this.accessKeyId);
        sbLIZ.append(", sessionToken=");
        sbLIZ.append(this.sessionToken);
        sbLIZ.append(", secretAccessKey=");
        sbLIZ.append(this.secretAccessKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinVoiceUploadAuthToken() {
        this("", "", 0L, "", "", "");
    }

    public BulletinVoiceUploadAuthToken(String str, String str2, long j, String str3, String str4, String str5) {
        this.resourceSpace = str;
        this.host = str2;
        this.expiryTime = j;
        this.accessKeyId = str3;
        this.sessionToken = str4;
        this.secretAccessKey = str5;
    }
}
