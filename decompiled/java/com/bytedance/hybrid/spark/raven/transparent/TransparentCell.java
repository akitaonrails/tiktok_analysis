package com.bytedance.hybrid.spark.raven.transparent;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;

/* JADX INFO: loaded from: classes19.dex */
public final class TransparentCell extends AssemPowerCell<TransparentAssem, TransparentModule> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new TransparentAssem();
    }
}
