package com.bytedance.pipo.verify.base.network.api;

import X.C0X52;
import X.C1707000uWQ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import X.InterfaceC820680WHi;
import com.bytedance.pipo.verify.base.model.request.DoVerifyRequest;
import com.bytedance.pipo.verify.base.model.request.FallbackGetVerifyRequest;
import com.bytedance.pipo.verify.base.model.request.GetIdentityPubKeyRequest;
import com.bytedance.pipo.verify.base.model.request.GetPageRequest;
import com.bytedance.pipo.verify.base.model.request.SendVerifyCodeRequest;
import com.bytedance.pipo.verify.base.model.request.VerifyResultNotifyRequest;
import com.bytedance.pipo.verify.base.model.response.DoVerifyResponse;
import com.bytedance.pipo.verify.base.model.response.FallbackGetVerifyResponseData;
import com.bytedance.pipo.verify.base.model.response.GetIdentityPubKeyResponse;
import com.bytedance.pipo.verify.base.model.response.GetPageResponse;
import com.bytedance.pipo.verify.base.model.response.SendVerifyCodeResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public interface VerifyApiService {
    public static final C1707000uWQ LIZ = C1707000uWQ.LIZ;

    @InterfaceC1501170pAR("/payment/v1/risk/get_risk_schema")
    Object fallbackRequestVerifySchema(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg FallbackGetVerifyRequest fallbackGetVerifyRequest, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC820680WHi boolean z, InterfaceC1364105Vn<? super C0X52<BaseResponse<FallbackGetVerifyResponseData>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/payment/v1/get_identity_pubkey")
    Object getIdentifyPubkey(@InterfaceC1485405rg GetIdentityPubKeyRequest getIdentityPubKeyRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetIdentityPubKeyResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/payment/v1/risk/get_page")
    Object getPage(@InterfaceC1485405rg GetPageRequest getPageRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetPageResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/payment/v1/risk/send_verify_code")
    Object sendVerifyCode(@InterfaceC1485405rg SendVerifyCodeRequest sendVerifyCodeRequest, @InterfaceC1501070pAH("app_language") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<SendVerifyCodeResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/payment/v1/risk/do_verify")
    Object verify(@InterfaceC1485405rg DoVerifyRequest doVerifyRequest, @InterfaceC1501070pAH("app_language") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<DoVerifyResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/payment/v1/risk/verify_result_notify")
    Object verifyResultNotify(@InterfaceC1485405rg VerifyResultNotifyRequest verifyResultNotifyRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);
}
