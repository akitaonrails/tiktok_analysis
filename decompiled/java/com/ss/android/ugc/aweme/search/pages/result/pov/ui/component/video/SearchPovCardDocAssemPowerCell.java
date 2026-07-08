package com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video;

import X.C0PXJ;
import X.C607880Nso;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.SearchUltimateInflateBaseCell;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPovCardDocAssemPowerCell extends SearchUltimateInflateBaseCell<C607880Nso> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new SearchPovCardDocAssem();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C0PXJ c0pxj = C0PXJ.LIZ;
        View view = this.itemView;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 648);
        c0pxj.getClass();
        C0PXJ.LIZLLL(view, this, awS554S0100000_10);
    }
}
