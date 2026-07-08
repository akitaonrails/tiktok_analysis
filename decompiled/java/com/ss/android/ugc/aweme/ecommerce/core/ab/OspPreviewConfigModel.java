package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class OspPreviewConfigModel {

    @C09CT("place_order_style")
    public final ButtonStyle placeOrderStyle;

    public OspPreviewConfigModel() {
        this(null);
    }

    public OspPreviewConfigModel(ButtonStyle buttonStyle) {
        this.placeOrderStyle = buttonStyle;
    }
}
