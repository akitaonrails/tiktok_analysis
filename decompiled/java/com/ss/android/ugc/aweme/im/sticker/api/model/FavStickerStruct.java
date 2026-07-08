package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationStickerInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class FavStickerStruct implements Serializable {

    @C09CT("fav_time")
    public final long favTime;

    @C09CT("giphy_sticker")
    public final IMGiphyInfo giphySticker;

    @C09CT("sticker")
    public final SetSticker setSticker;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("third_party_sticker_info")
    public final IMTypingRecommendationStickerInfo thirdPartyStickerInfo;

    @C09CT("video_sticker")
    public final VideoSticker videoSticker;

    public FavStickerStruct() {
        this(null, null, null, 0L, null, null);
    }

    public FavStickerStruct(Integer num, SetSticker setSticker, VideoSticker videoSticker, long j, IMTypingRecommendationStickerInfo iMTypingRecommendationStickerInfo, IMGiphyInfo iMGiphyInfo) {
        this.stickerType = num;
        this.setSticker = setSticker;
        this.videoSticker = videoSticker;
        this.favTime = j;
        this.thirdPartyStickerInfo = iMTypingRecommendationStickerInfo;
        this.giphySticker = iMGiphyInfo;
    }
}
