package com.ss.android.ugc.aweme.poi.detail.charts;

import X.C1163420gNg;
import X.C1163440gNi;
import X.C1180340goy;
import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiChartsReusedAssem extends BaseSlashGlueReusedAssem<PoiDetailApi.ChartsBasicData> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e78;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C1163440gNi tp() {
        return (SlashComponentUIPreloadExp.LIZ("poi_charts_card") || SlashComponentUIPreloadExp.LIZ("poi_tab_charts")) ? C1163420gNg.LIZ(new C1180340goy()) : C1163440gNi.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C19719912Dl sp(BaseComponentData baseComponentData) {
        return C13LE.LIZ(PoiDetailChartsAssem.class);
    }
}
