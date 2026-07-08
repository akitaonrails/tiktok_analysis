package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomCheckoutPromotionTextConfigModel {

    @C09CT("copywriting")
    public final Map<String, String> copywriting;

    @C09CT("pmid_prefix")
    public final List<String> prefixes;

    public EcomCheckoutPromotionTextConfigModel() {
        this(null, null, 3, null);
    }

    public EcomCheckoutPromotionTextConfigModel(Map<String, String> map, List<String> list) {
        this.copywriting = map;
        this.prefixes = list;
    }

    public EcomCheckoutPromotionTextConfigModel(Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
