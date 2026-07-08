package com.ss.android.ugc.aweme.poi.detail.nearbyv2;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Model;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiNearbyCellV2 extends AssemPowerCell<PoiDetailNearbyV2Assem, PoiNearbyV2Model> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiDetailNearbyV2Assem();
    }
}
