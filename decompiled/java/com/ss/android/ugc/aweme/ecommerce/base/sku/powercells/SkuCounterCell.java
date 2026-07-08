package com.ss.android.ugc.aweme.ecommerce.base.sku.powercells;

import X.C044N;
import X.C704402p0;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuCounterReusedAssem;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuCounterCell extends AssemPowerCell<SkuCounterReusedAssem, C704402p0> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new SkuCounterReusedAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) NG1();
        C044N c044n = C044N.LIZ;
        this.LL = C044N.LIZIZ(viewGroup.getContext(), reusedUISlotAssem.Oo(), viewGroup);
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }
}
