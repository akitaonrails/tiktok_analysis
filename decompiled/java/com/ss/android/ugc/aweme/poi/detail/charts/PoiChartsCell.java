package com.ss.android.ugc.aweme.poi.detail.charts;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiChartsCell extends AssemPowerCell<PoiChartsReusedAssem, PoiDetailApi.ChartsBasicData> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiChartsReusedAssem();
    }
}
