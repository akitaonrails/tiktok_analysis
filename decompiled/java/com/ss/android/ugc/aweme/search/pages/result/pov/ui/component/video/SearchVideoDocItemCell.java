package com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video;

import X.C0PRC;
import X.C0PXJ;
import X.C0Q3E;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C684840Qte;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.SearchUltimateInflateBaseCell;
import kotlin.jvm.internal.AwS124S1100000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVideoDocItemCell extends SearchUltimateInflateBaseCell<C684840Qte> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new SearchVideoDocItemAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C684840Qte c684840Qte = (C684840Qte) interfaceC1891350zJl;
        super.onBindItemView(c684840Qte);
        if (c684840Qte.LLILZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.itemView.hashCode());
            sbLIZ.append(((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL);
            C2211631BhB.LJ(this.itemView, new AwS124S1100000_10(this, C2188811AlT.LIZIZ(sbLIZ), 25));
            return;
        }
        C0PXJ c0pxj = C0PXJ.LIZ;
        View view = this.itemView;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 1317);
        c0pxj.getClass();
        C0PXJ.LIZLLL(view, this, awS554S0100000_10);
    }
}
