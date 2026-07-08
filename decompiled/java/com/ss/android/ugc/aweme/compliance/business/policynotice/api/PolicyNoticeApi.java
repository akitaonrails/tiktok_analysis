package com.ss.android.ugc.aweme.compliance.business.policynotice.api;

import X.C0CQ5;
import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.ConsentAcceptanceResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface PolicyNoticeApi {
    public static final C0CQ5 LIZ = C0CQ5.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/consentbox/should_show/")
    C11NZ<ConsentAcceptanceResponse> consentAcceptance(@InterfaceC1501070pAH("ssaid") String str, @InterfaceC1501070pAH("last_consent_acceptance_date") Long l, @InterfaceC1501070pAH("country") String str2, @InterfaceC1501070pAH("app_version") long j, @InterfaceC1501070pAH("business") String str3, @InterfaceC1501070pAH("store_region") String str4);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/policy/notice/approve/")
    C11NZ<BaseResponse> policyNoticeApprove(@InterfaceC1501050pAF("business") String str, @InterfaceC1501050pAF("policy_version") String str2, @InterfaceC1501050pAF("style") String str3, @InterfaceC1501050pAF("extra") String str4, @InterfaceC1501050pAF("operation") Integer num, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) Integer num2, @InterfaceC1501050pAF("store_region") String str5, @InterfaceC1501050pAF("app_version") Long l);
}
