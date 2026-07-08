package com.ss.android.ugc.aweme.components.purchaseoption;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class PurchaseOptionParams {

    @C09CT("preselected_purchase_option_index")
    public final String preselectedPurchaseOptionIndex;

    @C09CT("purchase_options")
    public final List<PurchaseOptionWithPrice> purchaseOptions;

    @C09CT("should_show_purchase_options")
    public final Boolean shouldShowPurchaseOptions;

    public PurchaseOptionParams() {
        this(null, null, null, 7, null);
    }

    public PurchaseOptionParams(List<PurchaseOptionWithPrice> list, String str, Boolean bool) {
        this.purchaseOptions = list;
        this.preselectedPurchaseOptionIndex = str;
        this.shouldShowPurchaseOptions = bool;
    }

    public PurchaseOptionParams(List list, String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? CardStruct.IStatusCode.DEFAULT : str, (i & 4) != 0 ? Boolean.TRUE : bool);
    }
}
