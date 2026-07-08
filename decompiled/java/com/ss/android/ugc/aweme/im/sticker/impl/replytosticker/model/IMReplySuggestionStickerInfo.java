package com.ss.android.ugc.aweme.im.sticker.impl.replytosticker.model;

import X.C09CT;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationStickerInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.model.IMAIMojiSticker;

/* JADX INFO: loaded from: classes7.dex */
public final class IMReplySuggestionStickerInfo {

    @C09CT("aimoji_sticker")
    public final IMAIMojiSticker aiMojiSticker;

    @C09CT("gif_sticker")
    public final IMTypingRecommendationStickerInfo gifSticker;

    @C09CT("sticker")
    public final SetSticker setSticker;

    @C09CT("sticker_type")
    public final Integer stickerType;

    public IMReplySuggestionStickerInfo(Integer num, SetSticker setSticker, IMTypingRecommendationStickerInfo iMTypingRecommendationStickerInfo, IMAIMojiSticker iMAIMojiSticker) {
        this.stickerType = num;
        this.setSticker = setSticker;
        this.gifSticker = iMTypingRecommendationStickerInfo;
        this.aiMojiSticker = iMAIMojiSticker;
    }
}
