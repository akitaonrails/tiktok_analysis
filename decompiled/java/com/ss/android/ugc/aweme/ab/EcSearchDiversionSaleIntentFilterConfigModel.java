package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSearchDiversionSaleIntentFilterConfigModel {

    @C09CT("disable_ttt_filter")
    public final int disableTttFilter;

    @C09CT("enable")
    public final int enable;

    @C09CT("enable_dev_sale_intent")
    public final int enableDevSaleIntent;

    @C09CT("enter_from_filter")
    public final List<String> enterFromFilter;

    @C09CT("sale_intent_filter")
    public final int saleIntentFilter;

    public EcSearchDiversionSaleIntentFilterConfigModel() {
        this(0, null, 0, 0, 0, 31, null);
    }

    public EcSearchDiversionSaleIntentFilterConfigModel(int i, List<String> list, int i2, int i3, int i4) {
        this.enable = i;
        this.enterFromFilter = list;
        this.disableTttFilter = i2;
        this.saleIntentFilter = i3;
        this.enableDevSaleIntent = i4;
    }

    public EcSearchDiversionSaleIntentFilterConfigModel(int i, List list, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? C13BV.INSTANCE : list, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }
}
