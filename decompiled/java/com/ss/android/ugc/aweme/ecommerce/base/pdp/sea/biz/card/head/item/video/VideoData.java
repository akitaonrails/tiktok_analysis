package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.video;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: loaded from: classes27.dex */
public final class VideoData {

    @C09CT("aweme")
    public final String aweme;

    @C09CT("cover_image")
    public final Image coverImage;

    @C09CT("play_image")
    public final Image playBgImage;

    public VideoData(String str, Image image, Image image2) {
        this.aweme = str;
        this.coverImage = image;
        this.playBgImage = image2;
    }
}
