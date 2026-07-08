package com.ss.android.ugc.aweme.poi.detail.lynx;

import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLynxCell extends AssemPowerCell<PoiLynxReusedAssem, PoiDetailApi.PoiDetailLynxResponse> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiLynxReusedAssem();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiLynxCell 创建 this:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiLynxCell onBindItemView this:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiLynxCell onCreateItemView this:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        return super.onCreateItemView(viewGroup);
    }
}
