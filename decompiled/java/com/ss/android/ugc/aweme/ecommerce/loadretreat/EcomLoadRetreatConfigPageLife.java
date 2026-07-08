package com.ss.android.ugc.aweme.ecommerce.loadretreat;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class EcomLoadRetreatConfigPageLife {
    public static final EcomLoadRetreatConfigPageLife LIZ = new EcomLoadRetreatConfigPageLife(null, 1, null);

    @C09CT("preload")
    public final List<EcomLoadRetreatConfigPreload> preload;

    public EcomLoadRetreatConfigPageLife() {
        this(null, 1, null);
    }

    public EcomLoadRetreatConfigPageLife(List<EcomLoadRetreatConfigPreload> list) {
        this.preload = list;
    }

    public EcomLoadRetreatConfigPageLife(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
