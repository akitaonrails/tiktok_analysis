package com.ss.android.ugc.aweme.foundation.network;

import X.C0X52;
import X.C1717580unU;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.BaseResponse;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.ConfirmRegisterMobileResponse;
import com.ss.android.ugc.aweme.biz.wallet.network.CommonBizContentRequestWrapper;
import com.ss.android.ugc.aweme.biz.wallet.network.model.GetUserPlacementReq;
import com.ss.android.ugc.aweme.biz.wallet.network.model.GetUserPlacementResp;
import com.ss.android.ugc.aweme.biz.wallet.network.model.OpenStateResult;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.phone.PhoneApi;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinChangeConsultResult;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinForgotConsultResult;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinPublicKey;

/* JADX INFO: loaded from: classes27.dex */
public interface PipoAccountApi {
    public static final C1717580unU LIZ = C1717580unU.LIZ;

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/wallet/v1/user/confirm_register_mobile")
    Object confirmRegisterMobile(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501050pAF("risk_info") String str2, @InterfaceC1501050pAF("mobile_no") String str3, @InterfaceC1501050pAF("country_code_alpha2") String str4, @InterfaceC1501050pAF("use_tt_mobile") String str5, InterfaceC1364105Vn<? super C0X52<BaseResponse<ConfirmRegisterMobileResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/consult_change_pin")
    Object consultChangePin(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<PinChangeConsultResult>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/consult_forgot_pin")
    Object consultForgotPin(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<PinForgotConsultResult>>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/wallet/v1/user/consult_phone_number_change")
    Object consultPhoneChange(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, @InterfaceC1501050pAF("scenario") String str3, @InterfaceC1501050pAF("set_stage") String str4, InterfaceC1364105Vn<? super C0X52<BaseResponse<WalletFlowDecision>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/create_mobile")
    Object createMobile(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/wallet/v1/user/create_pin")
    Object createPin(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, @InterfaceC1501050pAF("encrypt_pin") String str3, @InterfaceC1501050pAF("encrypt_random_salt") String str4, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/create_user")
    Object createUser(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/create_user_agreement")
    Object createUserAgreement(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/query_phonenumber_change_page")
    Object getPhoneChangeSettings(@InterfaceC1501350pAj("pipo-fp-token") String str, @InterfaceC1501070pAH("risk_info") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<PhoneApi.PhoneChangeSettings>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/get_pin_pubkey")
    Object getPinPublicKey(@InterfaceC1501350pAj("pipo-fp-session-id") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<PinPublicKey>>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/wallet/v1/user/register_flow_decision")
    Object getRegisterFlowDecision(@InterfaceC1501350pAj("pipo-fp-token") String str, @InterfaceC1501350pAj("pipo-fp-session-id") String str2, @InterfaceC1501050pAF("merchant_id") String str3, @InterfaceC1501070pAH("biz_content") String str4, InterfaceC1364105Vn<? super C0X52<BaseResponse<WalletFlowDecision>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/register_flow_decision")
    Object getRegisterFlowDecisionV2(@InterfaceC1501350pAj("pipo-fp-token") String str, @InterfaceC1501350pAj("pipo-fp-session-id") String str2, @InterfaceC1485405rg CommonBizContentRequestWrapper commonBizContentRequestWrapper, InterfaceC1364105Vn<? super C0X52<BaseResponse<WalletFlowDecision>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/get_user_placement")
    Object getUserPlacement(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1485405rg GetUserPlacementReq getUserPlacementReq, InterfaceC1364105Vn<? super C0X52<BaseResponse<GetUserPlacementResp>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/open_account")
    Object openCaAccount(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/open_account")
    Object openCaAccountV2(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<OpenStateResult>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/query_account_open_result")
    Object queryAccountOpenResult(@InterfaceC1501350pAj("pipo-fp-session-id") String str, InterfaceC1364105Vn<? super C0X52<BaseResponse<OpenStateResult>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/user/reset_mobile")
    Object resetPhoneNumber(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<String>>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/wallet/v1/user/reset_pin")
    Object resetPin(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, @InterfaceC1501050pAF("scenario") String str3, @InterfaceC1501050pAF("encrypt_pin") String str4, @InterfaceC1501050pAF("encrypt_random_salt") String str5, InterfaceC1364105Vn<? super C0X52<BaseResponse<String>>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/wallet/v1/user/submit_pin_and_register")
    Object submitPinAndRegister(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501070pAH("risk_info") String str2, @InterfaceC1501050pAF("encrypt_pin") String str3, @InterfaceC1501050pAF("encrypt_random_salt") String str4, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn);
}
