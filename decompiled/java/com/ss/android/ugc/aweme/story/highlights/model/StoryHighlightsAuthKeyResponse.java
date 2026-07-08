package com.ss.android.ugc.aweme.story.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryHighlightsAuthKeyResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("access_key_id")
    public final String accessKeyId;

    @C09CT("current_time")
    public final Long currentTime;

    @C09CT("expired_time")
    public final Long expiredTime;

    @C09CT("secret_access_key")
    public final String secretAccessKey;

    @C09CT("service_id")
    public final String serviceId;

    @C09CT("session_token")
    public final String sessionToken;

    @C09CT("upload_host")
    public final String uploadHost;

    public StoryHighlightsAuthKeyResponse() {
        this(null, null, null, null, null, null, null);
    }

    public final StoryHighlightsAuthKeyResponse copy(String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        return new StoryHighlightsAuthKeyResponse(str, str2, str3, str4, str5, l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryHighlightsAuthKeyResponse)) {
            return false;
        }
        StoryHighlightsAuthKeyResponse storyHighlightsAuthKeyResponse = (StoryHighlightsAuthKeyResponse) obj;
        return Intrinsics.LJFF(this.serviceId, storyHighlightsAuthKeyResponse.serviceId) && Intrinsics.LJFF(this.accessKeyId, storyHighlightsAuthKeyResponse.accessKeyId) && Intrinsics.LJFF(this.secretAccessKey, storyHighlightsAuthKeyResponse.secretAccessKey) && Intrinsics.LJFF(this.sessionToken, storyHighlightsAuthKeyResponse.sessionToken) && Intrinsics.LJFF(this.uploadHost, storyHighlightsAuthKeyResponse.uploadHost) && Intrinsics.LJFF(this.expiredTime, storyHighlightsAuthKeyResponse.expiredTime) && Intrinsics.LJFF(this.currentTime, storyHighlightsAuthKeyResponse.currentTime);
    }

    public int hashCode() {
        String str = this.serviceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accessKeyId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secretAccessKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionToken;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.uploadHost;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.expiredTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.currentTime;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightsAuthKeyResponse(serviceId=");
        sbLIZ.append(this.serviceId);
        sbLIZ.append(", accessKeyId=");
        sbLIZ.append(this.accessKeyId);
        sbLIZ.append(", secretAccessKey=");
        sbLIZ.append(this.secretAccessKey);
        sbLIZ.append(", sessionToken=");
        sbLIZ.append(this.sessionToken);
        sbLIZ.append(", uploadHost=");
        sbLIZ.append(this.uploadHost);
        sbLIZ.append(", expiredTime=");
        sbLIZ.append(this.expiredTime);
        sbLIZ.append(", currentTime=");
        sbLIZ.append(this.currentTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    public final Long getCurrentTime() {
        return this.currentTime;
    }

    public final Long getExpiredTime() {
        return this.expiredTime;
    }

    public final String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final String getUploadHost() {
        return this.uploadHost;
    }

    public StoryHighlightsAuthKeyResponse(String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        this.serviceId = str;
        this.accessKeyId = str2;
        this.secretAccessKey = str3;
        this.sessionToken = str4;
        this.uploadHost = str5;
        this.expiredTime = l;
        this.currentTime = l2;
    }
}
