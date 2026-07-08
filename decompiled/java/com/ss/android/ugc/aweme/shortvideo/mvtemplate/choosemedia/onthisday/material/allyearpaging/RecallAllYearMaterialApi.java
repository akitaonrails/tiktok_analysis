package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.allyearpaging;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes9.dex */
public interface RecallAllYearMaterialApi {
    @InterfaceC1501160pAQ("/tiktok/v1/story/user/celebration_materials_by_page")
    Object loadMaterial(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("celebration_type") int i3, InterfaceC1364105Vn<? super LoadCelebrationMaterialResponse> interfaceC1364105Vn);
}
