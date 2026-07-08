package com.ss.android.ugc.aweme.giftcard.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoGiftcardCheckoutConfigModel {

    @C09CT("enable_error_code_handler")
    public final boolean enableErrorCodeHandler;

    @C09CT("form")
    public final FormConfigModel formConfig;

    @C09CT("query_goods_status")
    public final PipoGiftcardQueryGoodsStatusConfigModel queryGoodsConfig;

    public PipoGiftcardCheckoutConfigModel() {
        this(new PipoGiftcardQueryGoodsStatusConfigModel(1, 10), new FormConfigModel(255), false);
    }

    public PipoGiftcardCheckoutConfigModel(PipoGiftcardQueryGoodsStatusConfigModel pipoGiftcardQueryGoodsStatusConfigModel, FormConfigModel formConfigModel, boolean z) {
        this.queryGoodsConfig = pipoGiftcardQueryGoodsStatusConfigModel;
        this.formConfig = formConfigModel;
        this.enableErrorCodeHandler = z;
    }
}
