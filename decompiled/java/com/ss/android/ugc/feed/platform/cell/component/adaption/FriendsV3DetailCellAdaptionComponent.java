package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes32.dex */
public final class FriendsV3DetailCellAdaptionComponent extends CellAdaptionComponentV2 {
    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2
    public final String ip() {
        return "feed_friends_detail_cell";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1917770024) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Ep(wB2(), "5. holder select (for bad case)");
    }
}
