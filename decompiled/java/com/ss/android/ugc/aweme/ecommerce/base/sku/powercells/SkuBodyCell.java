package com.ss.android.ugc.aweme.ecommerce.base.sku.powercells;

import X.C044N;
import X.C706202pI;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuBodyReusedAssem;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuBodyCell extends AssemPowerCell<SkuBodyReusedAssem, C706202pI> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new SkuBodyReusedAssem();
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
