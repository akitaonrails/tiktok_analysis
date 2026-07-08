package com.ss.android.ugc.aweme.component.bio.biometric;

import X.C040I;
import X.C09CT;
import X.C0X52;
import X.C1717610unX;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface BiometricBEApi {
    public static final C1717610unX LIZ = C1717610unX.LIZ;

    public static final class CloseBiometricResponse {

        @C09CT("delete_result")
        public final Boolean result;

        public CloseBiometricResponse() {
            this(Boolean.FALSE);
        }

        public CloseBiometricResponse(Boolean bool) {
            this.result = bool;
        }
    }

    @InterfaceC1501240pAY("/wallet/v1/user/init_biometric_registration")
    Object LIZ(@C040I InitBiometricRegistrationRequest initBiometricRegistrationRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<WalletFlowDecision>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/wallet/v1/user/submit_biometric_registration")
    Object LIZIZ(@C040I SubmitBiometricRegistrationRequest submitBiometricRegistrationRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<SubmitBiometricRegistrationResponse>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/wallet/v1/user/close_biometric")
    Object LIZJ(@C040I CloseBiometricRequest closeBiometricRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<CloseBiometricResponse>>> interfaceC1364105Vn);

    public static final class CloseBiometricRequest {

        @C09CT("device_id")
        public final String deviceId;

        @C09CT("risk_info")
        public final String riskInfo;

        public CloseBiometricRequest() {
            this(null, null);
        }

        public CloseBiometricRequest(String str, String str2) {
            this.deviceId = str;
            this.riskInfo = str2;
        }
    }

    public static final class SubmitBiometricRegistrationResponse {

        @C09CT("original_requestId")
        public final String originalRequestId;

        @C09CT("register_result")
        public final boolean registerResult;

        public SubmitBiometricRegistrationResponse() {
            this(null, false);
        }

        public SubmitBiometricRegistrationResponse(String str, boolean z) {
            this.originalRequestId = str;
            this.registerResult = z;
        }
    }

    public static final class InitBiometricRegistrationRequest {

        @C09CT("biometry_data_tag")
        public final String biometricDataTag;

        @C09CT("device_id")
        public final String deviceId;

        @C09CT("entrance")
        public final String entrance;

        @C09CT("request_id")
        public final String requestId;

        @C09CT("risk_info")
        public final String riskInfo;

        public InitBiometricRegistrationRequest() {
            this(null, null, null, null, null);
        }

        public InitBiometricRegistrationRequest(String str, String str2, String str3, String str4, String str5) {
            this.requestId = str;
            this.deviceId = str2;
            this.riskInfo = str3;
            this.biometricDataTag = str4;
            this.entrance = str5;
        }
    }

    public static final class SubmitBiometricRegistrationRequest {

        @C09CT("algorithm_name")
        public final String algorithmName;

        @C09CT("biometry_data_tag")
        public final String biometricDataTag;

        @C09CT("device_id")
        public final String deviceId;

        @C09CT("original_request_id")
        public final String originalRequestId;

        @C09CT("pub_key")
        public final String pubKey;

        @C09CT("signature")
        public final String signature;

        public SubmitBiometricRegistrationRequest() {
            this(null, null, null, null, null, null);
        }

        public SubmitBiometricRegistrationRequest(String str, String str2, String str3, String str4, String str5, String str6) {
            this.originalRequestId = str;
            this.deviceId = str2;
            this.biometricDataTag = str3;
            this.algorithmName = str4;
            this.pubKey = str5;
            this.signature = str6;
        }
    }
}
