package com.ss.android.ugc.aweme.poi.detail.dishes;

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
public final class PoiRecommendDishesReusedAssem extends BaseSlashGlueReusedAssem<PoiDetailApi.PoiRecommendDishesGroupInfo> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e78;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C1163440gNi tp() {
        return SlashComponentUIPreloadExp.LIZ("poi_recommend_dish") ? C1163420gNg.LIZ(new C1180340goy()) : C1163440gNi.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueReusedAssem
    public final C19719912Dl sp(BaseComponentData baseComponentData) {
        Class cls;
        PoiDetailApi.PoiRecommendDishesGroupInfo poiRecommendDishesGroupInfo = (PoiDetailApi.PoiRecommendDishesGroupInfo) baseComponentData;
        if (poiRecommendDishesGroupInfo != null && poiRecommendDishesGroupInfo.isNoPictureTypeRecommendDishes$poi_release()) {
            cls = PoiRecommendDishesNoPicAssem.class;
        } else {
            cls = PoiDetailRecommendDishesAssem.class;
        }
        return C13LE.LIZ(cls);
    }
}
