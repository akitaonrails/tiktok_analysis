package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniDramaCardInfo implements Serializable {

    @C09CT("bg_img")
    public UrlModel bgImg;

    @C09CT("bgm_video")
    public Video bgmVideo;

    @C09CT("card_type")
    public String cardType;

    @C09CT("dramas")
    public List<MiniDramaOverview> dramas;

    @C09CT("left_button_text")
    public String leftButtonText;

    @C09CT("right_button_text")
    public String rightButtonText;

    @C09CT("style")
    public Integer style;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("title")
    public String title;

    public MiniDramaCardInfo() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final void setCardType(String str) {
        this.cardType = str;
    }

    public final void setStyle(Integer num) {
        this.style = num;
    }

    public MiniDramaCardInfo(Integer num, List<MiniDramaOverview> list, String str, String str2, UrlModel urlModel, String str3, String str4, String str5, Video video) {
        this.style = num;
        this.dramas = list;
        this.title = str;
        this.subtitle = str2;
        this.bgImg = urlModel;
        this.cardType = str3;
        this.rightButtonText = str4;
        this.leftButtonText = str5;
        this.bgmVideo = video;
    }
}
