package com.ss.android.ugc.aweme.poi.osp.component.config;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.osp.component.PoiOrderSubmitCouponAssem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.CouponModuleData;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiOrderSubmitCouponAssemCell extends AssemPowerCell<PoiOrderSubmitCouponAssem, CouponModuleData> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiOrderSubmitCouponAssem();
    }
}
