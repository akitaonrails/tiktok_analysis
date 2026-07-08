package com.ss.android.ugc.tiktok.addyours.hub.cell;

import X.C01GW;
import X.C0O2K;
import X.C20742916Ex;
import X.C452501pT;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursHubItemCell extends AssemPowerCell<AddYoursHubItemCellAssem, C0O2K> {
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1641));

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new AddYoursHubItemCellAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return (InterfaceC665370Q7z) this.LLIZ.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LL = C20742916Ex.LIZ(viewGroup.getContext(), ((ReusedUISlotAssem) NG1()).Oo(), viewGroup, false, -1);
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }
}
