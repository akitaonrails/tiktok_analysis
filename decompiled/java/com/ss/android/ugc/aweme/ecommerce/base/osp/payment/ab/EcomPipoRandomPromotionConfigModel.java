package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPipoRandomPromotionConfigModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_pm_list")
    public final List<String> enableList;

    public EcomPipoRandomPromotionConfigModel() {
        this(null, false, 3, null);
    }

    public EcomPipoRandomPromotionConfigModel(List<String> list, boolean z) {
        this.enableList = list;
        this.enable = z;
    }

    public EcomPipoRandomPromotionConfigModel(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? false : z);
    }
}
