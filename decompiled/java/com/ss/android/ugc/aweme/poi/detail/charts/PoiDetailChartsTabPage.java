package com.ss.android.ugc.aweme.poi.detail.charts;

import X.C20742916Ex;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailChartsTabPage extends AssemPowerCell<PoiDetailChartsTabPageAssem, PoiDetailApi.ChartContent> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiDetailChartsTabPageAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        this.LL = C20742916Ex.LIZ(viewGroup.getContext(), ((ReusedUISlotAssem) NG1()).Oo(), viewGroup, false, -1);
        Sl0(LJJIJL(), this);
        return LJJIJL();
    }
}
