package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BalanceResponseData {

    @C09CT("balances")
    public final List<Balance> balances;

    public BalanceResponseData(List<Balance> list) {
        this.balances = list;
    }
}
