package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationStickerInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class PopularStickerStruct implements Serializable {

    @C09CT("sticker")
    public final SetSticker setSticker;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("third_party_sticker")
    public final IMTypingRecommendationStickerInfo thirdPartySticker;

    @C09CT("video_sticker")
    public final VideoSticker videoSticker;

    public PopularStickerStruct() {
        this(null, null, null, null);
    }

    public final String getStringId() {
        Long stickerId;
        Long videoStickerId;
        String string;
        VideoSticker videoSticker = this.videoSticker;
        if (videoSticker != null && (videoStickerId = videoSticker.getVideoStickerId()) != null && (string = videoStickerId.toString()) != null) {
            return string;
        }
        SetSticker setSticker = this.setSticker;
        if (setSticker != null && (stickerId = setSticker.getStickerId()) != null) {
            return stickerId.toString();
        }
        IMTypingRecommendationStickerInfo iMTypingRecommendationStickerInfo = this.thirdPartySticker;
        if (iMTypingRecommendationStickerInfo != null) {
            return iMTypingRecommendationStickerInfo.stickerId;
        }
        return null;
    }

    public PopularStickerStruct(Integer num, SetSticker setSticker, VideoSticker videoSticker, IMTypingRecommendationStickerInfo iMTypingRecommendationStickerInfo) {
        this.stickerType = num;
        this.setSticker = setSticker;
        this.videoSticker = videoSticker;
        this.thirdPartySticker = iMTypingRecommendationStickerInfo;
    }
}
