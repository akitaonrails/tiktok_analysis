package com.ss.android.ugc.aweme.poi.recommendfeature.detail.api;

import X.C0X52;
import X.C1172770gcl;
import X.C11NZ;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501200pAU;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiCategoryFeatureDetailListApi {
    public static final C1172770gcl LIZ = C1172770gcl.LIZ;

    @InterfaceC1501200pAU("/tiktok/poi/recommend/feature/detail/v1")
    C11NZ<C0X52<SlashPage>> requestPage(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str, @InterfaceC1501120pAM("service_type") String str2, @InterfaceC1501120pAM("slash_param") String str3, @InterfaceC1501130pAN Map<String, String> map);
}
