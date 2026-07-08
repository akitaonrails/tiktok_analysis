package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.C1558520qew;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class CellBackgroundComponent extends BaseCellContentComponent<CellBackgroundComponent> implements CellBackgroundComponentAbility, InterfaceC1554640qYg {
    public int LLJJJJLIIL = 4;
    public View LLJJL;

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1598644368) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() throws IllegalAccessException {
        super.onAssemPostCreate();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellBackgroundComponentAbility
    public final void SK1(boolean z) {
        int i;
        View view = this.LLJJL;
        if (view != null) {
            if (z) {
                i = this.LLJJJJLIIL;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int visibility;
        View viewFindViewById = view.findViewById(R.id.dlw);
        this.LLJJL = viewFindViewById;
        if (viewFindViewById != null) {
            visibility = viewFindViewById.getVisibility();
        } else {
            visibility = 4;
        }
        this.LLJJJJLIIL = visibility;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
