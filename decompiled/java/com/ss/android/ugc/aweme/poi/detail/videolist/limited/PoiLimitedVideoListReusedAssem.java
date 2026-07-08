package com.ss.android.ugc.aweme.poi.detail.videolist.limited;

import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLimitedVideoListReusedAssem extends BaseSlashGlueReusedAssem<PoiListApi.PoiMergedListResponse> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e78;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C19719912Dl sp(BaseComponentData baseComponentData) {
        return C13LE.LIZ(PoiLimitedVideoListAssem.class);
    }
}
