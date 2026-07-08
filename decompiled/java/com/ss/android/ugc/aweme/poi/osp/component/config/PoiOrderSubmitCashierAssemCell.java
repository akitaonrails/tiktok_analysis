package com.ss.android.ugc.aweme.poi.osp.component.config;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitCashierAssem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PaymentInfoData;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitCashierAssemCell extends AssemPowerCell<PoiOrderSubmitCashierAssem, PaymentInfoData> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiOrderSubmitCashierAssem();
    }
}
