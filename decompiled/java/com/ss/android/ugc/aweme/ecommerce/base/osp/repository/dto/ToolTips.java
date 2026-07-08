package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;

/* JADX INFO: loaded from: classes2.dex */
public final class ToolTips {

    @C09CT("appear_time")
    public Long appearTime;

    @C09CT("auto_disappearance_time")
    public Long autoDisappearanceTime;

    @C09CT("content")
    public String content;

    @C09CT("icon")
    public Icon icon;

    @C09CT("image")
    public Image image;

    @C09CT("promotion_usable_end_time")
    public Long promotionUsableEndTime;

    public ToolTips() {
    }

    public ToolTips(String str, Icon icon, Image image, Long l, Long l2, Long l3) {
        this.content = str;
        this.icon = icon;
        this.image = image;
        this.appearTime = l;
        this.autoDisappearanceTime = l2;
        this.promotionUsableEndTime = l3;
    }
}
