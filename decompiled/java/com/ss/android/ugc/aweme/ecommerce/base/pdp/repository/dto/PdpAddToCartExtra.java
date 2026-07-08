package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpAddToCartExtra {

    @C09CT("preload_cart_info")
    public final String preLoadCartInfo;

    @C09CT("toast_content")
    public final ToastContent toastContent;

    public PdpAddToCartExtra() {
        this(null, null);
    }

    public PdpAddToCartExtra(String str, ToastContent toastContent) {
        this.preLoadCartInfo = str;
        this.toastContent = toastContent;
    }
}
