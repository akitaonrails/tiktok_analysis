package com.ss.android.ugc.aweme.mob;

import X.C05K5;
import X.C0RJN;
import com.ss.android.ugc.feed.platform.panel.IPanelComponentRegistrar;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class ExploreCardPlayAttributionComponentRegistrar implements IPanelComponentRegistrar {
    @Override // com.ss.android.ugc.feed.platform.panel.IPanelComponentRegistrar
    public final int getOrder() {
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IPanelComponentRegistrar
    public final boolean Gj0(C0RJN c0rjn) {
        return Intrinsics.LJFF(c0rjn.LIZ, "DETAIL");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IPanelComponentRegistrar
    public final void Ic0(C05K5 c05k5) {
        c05k5.LIZ(AFwS264S0000000_24.get$arr$(229));
    }
}
