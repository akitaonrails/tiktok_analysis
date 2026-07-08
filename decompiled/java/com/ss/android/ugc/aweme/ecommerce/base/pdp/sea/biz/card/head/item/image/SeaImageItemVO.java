package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.item.image;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaImageItemVO {

    @C09CT("image")
    public final Image image;

    @C09CT("load_success_bg_color")
    public final CustomColor loadSuccessBgColor;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaImageItemVO)) {
            return false;
        }
        SeaImageItemVO seaImageItemVO = (SeaImageItemVO) obj;
        return Intrinsics.LJFF(this.image, seaImageItemVO.image) && Intrinsics.LJFF(this.type, seaImageItemVO.type) && Intrinsics.LJFF(this.loadSuccessBgColor, seaImageItemVO.loadSuccessBgColor);
    }

    public SeaImageItemVO(Image image, String str, CustomColor customColor) {
        this.image = image;
        this.type = str;
        this.loadSuccessBgColor = customColor;
    }
}
