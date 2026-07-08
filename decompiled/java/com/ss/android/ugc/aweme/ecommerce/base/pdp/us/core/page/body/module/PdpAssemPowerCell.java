package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module;

import X.C01GW;
import X.C03H5;
import X.C954703oH;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;

/* JADX INFO: loaded from: classes11.dex */
public abstract class PdpAssemPowerCell<ASSEM extends ReusedUISlotAssem<? extends C03H5>, T extends InterfaceC1891350zJl> extends AssemPowerCell<ASSEM, T> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) NG1();
        C01GW c01gw = C954703oH.LIZ;
        this.LL = C954703oH.LIZ(viewGroup.getContext(), reusedUISlotAssem.Oo(), viewGroup, false);
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }
}
