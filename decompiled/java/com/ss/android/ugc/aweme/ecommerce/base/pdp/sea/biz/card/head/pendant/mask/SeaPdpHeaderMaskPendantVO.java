package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.mask;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpHeaderMaskPendantVO {

    @C09CT("gradient_bottom_color")
    public final CustomColor gradientBottomColor;

    @C09CT("gradient_top_color")
    public final CustomColor gradientTopColor;

    @C09CT("height")
    public final Integer height;

    public SeaPdpHeaderMaskPendantVO() {
        this(null, null, null);
    }

    public SeaPdpHeaderMaskPendantVO(Integer num, CustomColor customColor, CustomColor customColor2) {
        this.height = num;
        this.gradientTopColor = customColor;
        this.gradientBottomColor = customColor2;
    }
}
