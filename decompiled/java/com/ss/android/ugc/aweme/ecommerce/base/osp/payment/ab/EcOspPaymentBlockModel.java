package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcOspPaymentBlockModel {

    @C09CT("block_pi_list")
    public final List<String> blockPIList;

    @C09CT("osp_enable_check")
    public final Boolean ospEnableCheck;

    @C09CT("payment_enable_check")
    public final Boolean paymentEnableCheck;

    public EcOspPaymentBlockModel() {
        this(null, null, null, 7, null);
    }

    public EcOspPaymentBlockModel(List<String> list, Boolean bool, Boolean bool2) {
        this.blockPIList = list;
        this.ospEnableCheck = bool;
        this.paymentEnableCheck = bool2;
    }

    public EcOspPaymentBlockModel(List list, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Collections.singletonList("") : list, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? Boolean.FALSE : bool2);
    }
}
