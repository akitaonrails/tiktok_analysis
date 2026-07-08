package com.ss.android.ugc.aweme.feed.assem.commoditycard;

import X.C1558520qew;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;

/* JADX INFO: loaded from: classes12.dex */
public final class CustomCommodityCardAssem extends BaseCellContentComponent<CustomCommodityCardAssem> implements ICommodityCardAbility, InterfaceC1554640qYg {
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2048052340) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
