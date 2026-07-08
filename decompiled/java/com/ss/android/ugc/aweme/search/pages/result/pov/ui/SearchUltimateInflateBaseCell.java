package com.ss.android.ugc.aweme.search.pages.result.pov.ui;

import X.C03H5;
import X.C284390BCr;
import X.C648980Pcu;
import X.C650520PfO;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchUltimateInflateBaseCell<T extends InterfaceC1891350zJl> extends AssemPowerCell<ReusedUISlotAssem<? extends C03H5>, T> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        ReusedUISlotAssem reusedUISlotAssem;
        if (!((Boolean) C284390BCr.LIZ.getValue()).booleanValue() && !C648980Pcu.LIZ()) {
            return super.onCreateItemView(viewGroup);
        }
        ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
        if ((reusedUIAssemNG1 instanceof ReusedUISlotAssem) && (reusedUISlotAssem = (ReusedUISlotAssem) reusedUIAssemNG1) != null) {
            C650520PfO c650520PfO = C650520PfO.LIZ;
            Context context = viewGroup.getContext();
            int iOo = reusedUISlotAssem.Oo();
            c650520PfO.getClass();
            this.LL = C650520PfO.LIZIZ(context, iOo, viewGroup, false);
            Sl0(LJJIJL(), this);
            return LJJIJL();
        }
        return super.onCreateItemView(viewGroup);
    }
}
