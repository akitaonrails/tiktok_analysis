package com.ss.android.ugc.aweme.creatortools.videogift;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VideoGiftSettingResponse extends BaseResponse {

    @C09CT("video_gift_status")
    public final Integer videoGiftStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGiftSettingResponse) && Intrinsics.LJFF(this.videoGiftStatus, ((VideoGiftSettingResponse) obj).videoGiftStatus);
    }

    public final int hashCode() {
        Integer num = this.videoGiftStatus;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoGiftSettingResponse(videoGiftStatus=");
        sbLIZ.append(this.videoGiftStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoGiftSettingResponse(Integer num) {
        this.videoGiftStatus = num;
    }
}
