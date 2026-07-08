package com.ss.android.ugc.aweme.poi.detail.worldcup;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.detail.worldcup.assem.PoiWorldCupScheduleAssem;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.PoiWorldCupScheduleModule;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiWorldCupScheduleCell extends AssemPowerCell<PoiWorldCupScheduleAssem, PoiWorldCupScheduleModule> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiWorldCupScheduleAssem();
    }
}
