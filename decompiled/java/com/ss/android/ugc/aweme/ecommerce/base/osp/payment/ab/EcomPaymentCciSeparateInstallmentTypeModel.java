package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPaymentCciSeparateInstallmentTypeModel {

    @C09CT("enable_min_height")
    public final List<Integer> enableMinHeight;

    @C09CT("enable_separate")
    public final List<Integer> enableSeparate;

    public EcomPaymentCciSeparateInstallmentTypeModel() {
        this(null, null, 3, null);
    }

    public EcomPaymentCciSeparateInstallmentTypeModel(List<Integer> list, List<Integer> list2) {
        this.enableSeparate = list;
        this.enableMinHeight = list2;
    }

    public EcomPaymentCciSeparateInstallmentTypeModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
