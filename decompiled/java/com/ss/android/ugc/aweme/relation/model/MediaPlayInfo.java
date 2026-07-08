package com.ss.android.ugc.aweme.relation.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaPlayInfo extends BaseResponse implements Serializable {

    @C09CT("media_expire_time")
    public final long mediaExpireTime;

    @C09CT("media_id")
    public final String mediaId;

    @C09CT("media_play_url")
    public final String mediaPlayUrl;

    public final MediaPlayInfo copy(String str, String str2, long j) {
        return new MediaPlayInfo(str, str2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlayInfo)) {
            return false;
        }
        MediaPlayInfo mediaPlayInfo = (MediaPlayInfo) obj;
        return Intrinsics.LJFF(this.mediaId, mediaPlayInfo.mediaId) && Intrinsics.LJFF(this.mediaPlayUrl, mediaPlayInfo.mediaPlayUrl) && this.mediaExpireTime == mediaPlayInfo.mediaExpireTime;
    }

    public int hashCode() {
        return (((this.mediaId.hashCode() * 31) + this.mediaPlayUrl.hashCode()) * 31) + C786410Ut5.Y2(this.mediaExpireTime);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaPlayInfo(mediaId=");
        sbLIZ.append(this.mediaId);
        sbLIZ.append(", mediaPlayUrl=");
        sbLIZ.append(this.mediaPlayUrl);
        sbLIZ.append(", mediaExpireTime=");
        sbLIZ.append(this.mediaExpireTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MediaPlayInfo() {
        this("", "", 0L);
    }

    public final long getMediaExpireTime() {
        return this.mediaExpireTime;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final String getMediaPlayUrl() {
        return this.mediaPlayUrl;
    }

    public MediaPlayInfo(String str, String str2, long j) {
        this.mediaId = str;
        this.mediaPlayUrl = str2;
        this.mediaExpireTime = j;
    }
}
