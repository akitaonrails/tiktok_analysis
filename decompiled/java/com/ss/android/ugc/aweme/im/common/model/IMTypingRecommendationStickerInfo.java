package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class IMTypingRecommendationStickerInfo implements Serializable {

    @C09CT("normal_image")
    public final IMTypingRecommendationImageInfo normalImage;

    @C09CT("small_image")
    public final IMTypingRecommendationImageInfo smallImage;

    @C09CT("sa_ext_info")
    public final IMTypingRecommendationSAExtInfo socialAvartarExtInfo;

    @C09CT("sticker_id")
    public final String stickerId;

    @C09CT("int_sticker_id")
    public final Long stickerIdLong;

    @C09CT("sticker_type")
    public final Integer stickerType;

    @C09CT("title")
    public final String title;

    public IMTypingRecommendationStickerInfo() {
        this(null, null, null, null, null, null, null);
    }

    public IMTypingRecommendationStickerInfo(String str, IMTypingRecommendationImageInfo iMTypingRecommendationImageInfo, IMTypingRecommendationImageInfo iMTypingRecommendationImageInfo2, String str2, Integer num, Long l, IMTypingRecommendationSAExtInfo iMTypingRecommendationSAExtInfo) {
        this.stickerId = str;
        this.normalImage = iMTypingRecommendationImageInfo;
        this.smallImage = iMTypingRecommendationImageInfo2;
        this.title = str2;
        this.stickerType = num;
        this.stickerIdLong = l;
        this.socialAvartarExtInfo = iMTypingRecommendationSAExtInfo;
    }
}
