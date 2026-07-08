package com.ss.android.ugc.aweme.compliance.business.edm;

import X.C11NZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.services.edm.EdmConsentAgreementResponse;

/* JADX INFO: loaded from: classes.dex */
public interface EdmConsentApi {
    @InterfaceC1501160pAQ("/edm/consent/notice")
    Object getEmailConsentAgreementInfo(@InterfaceC1501070pAH("userRegion") String str, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str2, InterfaceC1364105Vn<? super EdmConsentAgreementResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/edm/user/properties")
    C11NZ<EdmUserPropertiesResponse> shouldShowEmailConsentAgreement();

    @InterfaceC1501170pAR("/edm/consent/reject")
    C11NZ<BaseResponse> uploadEmailConsentRejectApi();
}
