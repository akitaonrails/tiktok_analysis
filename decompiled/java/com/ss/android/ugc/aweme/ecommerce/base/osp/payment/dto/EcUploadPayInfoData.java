package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcUploadPayInfoData {

    @C09CT("new_pay_info")
    public final NewPayInfo newPayInfo;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    public EcUploadPayInfoData() {
        this(null, null);
    }

    public EcUploadPayInfoData(NewPayInfo newPayInfo, String str) {
        this.newPayInfo = newPayInfo;
        this.pipoErrorAction = str;
    }
}
