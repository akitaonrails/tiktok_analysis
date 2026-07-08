package com.ss.android.ugc.aweme.poi.detail.reviews;

import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.poi.detail.reviews.v2.PoiDetailWriteReviewAssemV2;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiWriteReviewsReusedAssem extends BaseSlashGlueReusedAssem<PoiReviewsApi.PoiWriteReviewResponse> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e78;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C19719912Dl sp(BaseComponentData baseComponentData) {
        Class cls;
        String str;
        int iHashCode;
        if ((baseComponentData instanceof BaseComponentData) && baseComponentData != null && (str = baseComponentData.instanceId) != null && ((iHashCode = str.hashCode()) == -974787853 ? str.equals("poi_write_review_entrance_v2") : iHashCode == 1450848081 ? str.equals("poi_write_review_entrance_v2_above") : iHashCode == 1451857893 && str.equals("poi_write_review_entrance_v2_below"))) {
            cls = PoiDetailWriteReviewAssemV2.class;
        } else {
            cls = PoiDetailWriteReviewAssem.class;
        }
        return C13LE.LIZ(cls);
    }
}
