package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C338100DNg;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface VerifySchoolAPI {
    public static final C338100DNg LIZ = C338100DNg.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("tiktok/school/email/resend_code/v1")
    Object resendCode(@InterfaceC1501050pAF("affiliation_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("tiktok/school/email/verify/v1")
    Object verifyEmail(@InterfaceC1501050pAF("email") String str, InterfaceC1364105Vn<? super VerifyEmailResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("tiktok/school/email/verify/v1")
    Object verifyEmail(@InterfaceC1501050pAF("email") String str, @InterfaceC1501050pAF("school_id") String str2, InterfaceC1364105Vn<? super VerifyEmailResponse> interfaceC1364105Vn);
}
