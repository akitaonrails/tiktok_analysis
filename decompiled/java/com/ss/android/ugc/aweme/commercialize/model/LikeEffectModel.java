package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class LikeEffectModel implements Serializable {

    @C09CT("effect_img")
    public final SimpleUriAndUrl effectImgUrl;

    @C09CT("effect_type")
    public final int effectType;

    @C09CT("fallback_bg_color")
    public final String fallbackBgColor;

    @C09CT("like_icon")
    public final SimpleUriAndUrl likeIconUrl;

    @C09CT("shake_icon_ms")
    public final Integer shakeIconMs;

    public LikeEffectModel() {
        this(0, null, null, null, null);
    }

    public final boolean checkStickerValid() {
        SimpleUriAndUrl simpleUriAndUrl;
        String url;
        SimpleUriAndUrl simpleUriAndUrl2;
        String url2;
        return (this.effectType != 1 || (simpleUriAndUrl = this.likeIconUrl) == null || (url = simpleUriAndUrl.getUrl()) == null || url.length() == 0 || (simpleUriAndUrl2 = this.effectImgUrl) == null || (url2 = simpleUriAndUrl2.getUrl()) == null || url2.length() == 0) ? false : true;
    }

    public LikeEffectModel(int i, SimpleUriAndUrl simpleUriAndUrl, String str, SimpleUriAndUrl simpleUriAndUrl2, Integer num) {
        this.effectType = i;
        this.likeIconUrl = simpleUriAndUrl;
        this.fallbackBgColor = str;
        this.effectImgUrl = simpleUriAndUrl2;
        this.shakeIconMs = num;
    }
}
