package com.ss.android.ugc.aweme.minis.feed.fsb;

import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSideBarMinisLynxActionProtocol implements ISideBarComponentActionProtocol {
    public final String LL = "tiktok_minis";

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol
    public final String LJJJ() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol
    public final Function2 P0(Object obj) {
        return AFwS285S0000000_2.get$arr$(43);
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarComponentActionProtocol
    public final Function2 we(Object obj) {
        return new AwS638S0100000_24(obj, 162);
    }
}
