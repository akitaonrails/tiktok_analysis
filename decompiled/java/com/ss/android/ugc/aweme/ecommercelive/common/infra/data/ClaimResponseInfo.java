package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ClaimResponseInfo {

    @C09CT("toast_msg")
    public final String toastMsg;

    @C09CT("voucher")
    public final List<VoucherInfo> voucher;

    public ClaimResponseInfo(List<VoucherInfo> list, String str) {
        this.voucher = list;
        this.toastMsg = str;
    }
}
