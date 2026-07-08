package com.ss.android.ugc.aweme.poi.detail.discovery;

import X.C1163420gNg;
import X.C1163440gNi;
import X.C1180340goy;
import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.localservice.experiment.SlashComponentUIPreloadExp;
import com.ss.android.ugc.aweme.poi.detail.discovery.mapmode.PoiDetailDiscoveryAssemV3;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDiscoveryReusedAssem extends BaseSlashGlueReusedAssem<PoiDiscoveryApi$PoiDiscoveryCardListResponse> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e78;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C1163440gNi tp() {
        return SlashComponentUIPreloadExp.LIZ("region_discovery") ? C1163420gNg.LIZ(new C1180340goy()) : C1163440gNi.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C19719912Dl sp(BaseComponentData baseComponentData) {
        return C13LE.LIZ(PoiDetailDiscoveryAssemV3.class);
    }
}
