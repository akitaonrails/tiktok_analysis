package com.ss.android.ugc.aweme.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EcHintVoucherInfo {

    @C09CT("ecom_promotion_icon")
    public final EcPromotionIcon ecomPromotionIcon;

    @C09CT("face_value_text")
    public final String faceValueText;

    @C09CT("is_show_voucher_icon")
    public final Boolean isShowVoucherIcon;

    public EcHintVoucherInfo() {
        this(null, null, null);
    }

    public EcHintVoucherInfo(EcPromotionIcon ecPromotionIcon, Boolean bool, String str) {
        this.ecomPromotionIcon = ecPromotionIcon;
        this.isShowVoucherIcon = bool;
        this.faceValueText = str;
    }
}
