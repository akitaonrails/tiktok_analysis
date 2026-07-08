package com.ss.android.ugc.aweme.relation.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BigCardMusicUrlResponse extends BaseResponse implements Serializable {

    @C09CT("media_play_info")
    public final MediaPlayInfo mediaPlayInfo;

    public final BigCardMusicUrlResponse copy(MediaPlayInfo mediaPlayInfo) {
        return new BigCardMusicUrlResponse(mediaPlayInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BigCardMusicUrlResponse) && Intrinsics.LJFF(this.mediaPlayInfo, ((BigCardMusicUrlResponse) obj).mediaPlayInfo);
    }

    public int hashCode() {
        return this.mediaPlayInfo.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BigCardMusicUrlResponse(mediaPlayInfo=");
        sbLIZ.append(this.mediaPlayInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BigCardMusicUrlResponse() {
        this(new MediaPlayInfo("", "", 0L));
    }

    public final MediaPlayInfo getMediaPlayInfo() {
        return this.mediaPlayInfo;
    }

    public BigCardMusicUrlResponse(MediaPlayInfo mediaPlayInfo) {
        this.mediaPlayInfo = mediaPlayInfo;
    }
}
