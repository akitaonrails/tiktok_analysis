package com.ss.android.ugc.tiktok.pns.privacy.setting.agechange;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.pns.privacy.setting.agechange.model.AgeGraduationPageResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface AgeGradApi {
    @InterfaceC1501160pAQ("/tiktok/age/graduation/page/v1")
    C11NZ<AgeGraduationPageResponse> getAgeGraduationPageUrl();

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/age/graduation/eligibility/update/v1")
    C11NZ<BaseResponse> updateAgeGraduationStatus(@InterfaceC1501050pAF(Scene.SCENE_SERVICE) String str);
}
