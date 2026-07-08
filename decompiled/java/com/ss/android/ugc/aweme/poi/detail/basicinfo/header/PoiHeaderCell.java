package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHeaderCell extends AssemPowerCell<PoiHeaderReusedAssem, PoiListApi.PoiDetailResponse> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiHeaderReusedAssem();
    }
}
