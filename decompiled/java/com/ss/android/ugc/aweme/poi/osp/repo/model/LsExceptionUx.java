package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class LsExceptionUx implements Serializable {

    @C09CT("code")
    public final String code;

    @C09CT("dialog_content")
    public final DialogContent dialogContent;

    @C09CT("sku_buy_limit")
    public final List<SkuBuyLimit> skuBuyLimit;

    @C09CT("toast_content")
    public final ToastContent toastContent;

    @C09CT("exception_ux_type")
    public final Integer type;

    public LsExceptionUx() {
        this(null, null, null, null, null);
    }

    public LsExceptionUx(Integer num, ToastContent toastContent, DialogContent dialogContent, String str, List<SkuBuyLimit> list) {
        this.type = num;
        this.toastContent = toastContent;
        this.dialogContent = dialogContent;
        this.code = str;
        this.skuBuyLimit = list;
    }
}
