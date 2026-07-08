package com.ss.android.ugc.feed.platform.cell.component.cleanmode;

import X.C01GW;
import X.C0RE5;
import X.C1558520qew;
import X.C452501pT;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;

/* JADX INFO: loaded from: classes12.dex */
public final class CellCleanModeComponent extends BaseCellLogicComponent<CellCleanModeComponent> implements CellCleanModeAbility, InterfaceC1554640qYg {
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C0RE5(this));

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -83257801) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
