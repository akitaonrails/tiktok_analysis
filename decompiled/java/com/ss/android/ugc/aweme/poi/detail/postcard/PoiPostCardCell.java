package com.ss.android.ugc.aweme.poi.detail.postcard;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostCardCell extends AssemPowerCell<PoiLimitedPostAssem, PoiListApi.PoiMergedListResponse> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiLimitedPostAssem();
    }
}
