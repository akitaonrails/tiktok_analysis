package com.ss.android.ugc.aweme.sidebar.components.list;

import X.C1580780rEq;
import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol;
import com.ss.android.ugc.aweme.sidebar.model.SideBarSectionComponentConfig;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS285S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SideBarListRowActionProtocol implements ISideBarComponentActionProtocol {
    public final String LL = "side_bar_orders_2";

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol
    public final String LJJJ() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol
    public final Function2 P0(Object obj) {
        if (obj instanceof SideBarSectionComponentConfig) {
            return AFwS285S0000000_2.get$arr$(45);
        }
        if (obj instanceof C1580780rEq) {
            return AFwS285S0000000_2.get$arr$(46);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol
    public final Function2 we(Object obj) {
        if (obj instanceof SideBarSectionComponentConfig) {
            return AFwS285S0000000_2.get$arr$(47);
        }
        if (obj instanceof C1580780rEq) {
            return AFwS285S0000000_2.get$arr$(48);
        }
        return null;
    }
}
