package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.section.model;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: loaded from: classes27.dex */
public final class PromotionActivityInfoModel {
    public static final int $stable = 8;
    public final Image bgImage;
    public final Integer countDownColor;
    public final String daInfo;
    public final String desc;
    public final LinkRichText richDesc;
    public final LinkRichText richTitle;
    public final Long startCountDownTime;
    public final Integer tailComponentType;
    public final String title;
    public final Integer type;

    public PromotionActivityInfoModel() {
        this(null, "", null, null, null, "{}", 0, 0L, 0, 0);
    }

    public PromotionActivityInfoModel(Image image, String str, LinkRichText linkRichText, LinkRichText linkRichText2, String str2, String str3, Integer num, Long l, Integer num2, Integer num3) {
        this.bgImage = image;
        this.title = str;
        this.richTitle = linkRichText;
        this.richDesc = linkRichText2;
        this.desc = str2;
        this.daInfo = str3;
        this.type = num;
        this.startCountDownTime = l;
        this.tailComponentType = num2;
        this.countDownColor = num3;
    }
}
