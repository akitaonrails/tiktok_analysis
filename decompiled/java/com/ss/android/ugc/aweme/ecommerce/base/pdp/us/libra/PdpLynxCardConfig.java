package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class PdpLynxCardConfig {

    @C09CT("cards")
    public final List<PdpLynxCardModel> cards;

    public PdpLynxCardConfig() {
        this(null, 1, null);
    }

    public PdpLynxCardConfig(List<PdpLynxCardModel> list) {
        this.cards = list;
    }

    public PdpLynxCardConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
