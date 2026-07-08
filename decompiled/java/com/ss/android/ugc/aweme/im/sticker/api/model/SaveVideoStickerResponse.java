package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SaveVideoStickerResponse extends BaseResponse {

    @C09CT("video_sticker")
    public final VideoSticker videoSticker;

    public SaveVideoStickerResponse() {
        this(null);
    }

    public final SaveVideoStickerResponse copy(VideoSticker videoSticker) {
        return new SaveVideoStickerResponse(videoSticker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SaveVideoStickerResponse) && Intrinsics.LJFF(this.videoSticker, ((SaveVideoStickerResponse) obj).videoSticker);
    }

    public int hashCode() {
        VideoSticker videoSticker = this.videoSticker;
        if (videoSticker == null) {
            return 0;
        }
        return videoSticker.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveVideoStickerResponse(videoSticker=");
        sbLIZ.append(this.videoSticker);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final VideoSticker getVideoSticker() {
        return this.videoSticker;
    }

    public SaveVideoStickerResponse(VideoSticker videoSticker) {
        this.videoSticker = videoSticker;
    }
}
