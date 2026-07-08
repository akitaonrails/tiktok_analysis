package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.component.verify.pin.model.OfflineProcessInfo;
import com.ss.android.ugc.aweme.component.verify.pin.model.PinRule;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class WalletFlowDecision implements Serializable {

    @C09CT("ab_test_info")
    public final Map<String, ABTestInfo> abTestInfo;

    @C09CT("account_opened")
    public final Boolean accountOpened;

    @C09CT("agreement_content")
    public final String agreementContent;

    @C09CT("all_step")
    public final ArrayList<Step> allSteps;

    @C09CT("biometric_status")
    public final String biometricStatus;

    @C09CT("challenge_id")
    public final String challengeId;

    @C09CT("cur_step")
    public final Step curStep;

    @C09CT("question_mark_cs_link")
    public final String customerServiceUrl;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("extra_map")
    public final Map<String, String> extraMap;

    @C09CT("extra_operation")
    public final String extraOperation;

    @C09CT("kyc_ticket_schema_url")
    public final String kycSchema;

    @C09CT("kyc_ticket_url")
    public final String kycUrl;

    @C09CT("masked_mobile_no")
    public String maskedMobileNo;

    @C09CT("offline_process_info")
    public final OfflineProcessInfo offlineProcessInfo;

    @C09CT("pa_register_link")
    public final String paRegisterLink;

    @C09CT("pin_rule_list")
    public final ArrayList<PinRule> pinRuleList;

    @C09CT("popout_info")
    public final PopOutInfo popOut;

    @C09CT("region_mobile_code_list")
    public final ArrayList<RegionMobileCodeItem> regionMobileCodeList;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("risk_decision")
    public final String riskDecision;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("fp_session_id")
    public final String sessionId;

    @C09CT("source")
    public final String source;

    @C09CT("verify_info")
    public String verifyInfo;

    @C09CT("wallet_user_id_str")
    public final String walletUserId;

    public WalletFlowDecision() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final WalletFlowDecision copy(String str, String str2, String str3, String str4, Boolean bool, Step step, ArrayList<Step> arrayList, String str5, String str6, String str7, ArrayList<PinRule> arrayList2, ArrayList<RegionMobileCodeItem> arrayList3, String str8, String str9, String str10, String str11, String str12, Map<String, ABTestInfo> map, OfflineProcessInfo offlineProcessInfo, PopOutInfo popOutInfo, String str13, String str14, String str15, Map<String, String> map2, String str16, Map<String, String> map3) {
        return new WalletFlowDecision(str, str2, str3, str4, bool, step, arrayList, str5, str6, str7, arrayList2, arrayList3, str8, str9, str10, str11, str12, map, offlineProcessInfo, popOutInfo, str13, str14, str15, map2, str16, map3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletFlowDecision)) {
            return false;
        }
        WalletFlowDecision walletFlowDecision = (WalletFlowDecision) obj;
        return Intrinsics.LJFF(this.requestId, walletFlowDecision.requestId) && Intrinsics.LJFF(this.biometricStatus, walletFlowDecision.biometricStatus) && Intrinsics.LJFF(this.riskDecision, walletFlowDecision.riskDecision) && Intrinsics.LJFF(this.challengeId, walletFlowDecision.challengeId) && Intrinsics.LJFF(this.accountOpened, walletFlowDecision.accountOpened) && Intrinsics.LJFF(this.curStep, walletFlowDecision.curStep) && Intrinsics.LJFF(this.allSteps, walletFlowDecision.allSteps) && Intrinsics.LJFF(this.sessionId, walletFlowDecision.sessionId) && Intrinsics.LJFF(this.verifyInfo, walletFlowDecision.verifyInfo) && Intrinsics.LJFF(this.maskedMobileNo, walletFlowDecision.maskedMobileNo) && Intrinsics.LJFF(this.pinRuleList, walletFlowDecision.pinRuleList) && Intrinsics.LJFF(this.regionMobileCodeList, walletFlowDecision.regionMobileCodeList) && Intrinsics.LJFF(this.kycUrl, walletFlowDecision.kycUrl) && Intrinsics.LJFF(this.kycSchema, walletFlowDecision.kycSchema) && Intrinsics.LJFF(this.agreementContent, walletFlowDecision.agreementContent) && Intrinsics.LJFF(this.scene, walletFlowDecision.scene) && Intrinsics.LJFF(this.source, walletFlowDecision.source) && Intrinsics.LJFF(this.abTestInfo, walletFlowDecision.abTestInfo) && Intrinsics.LJFF(this.offlineProcessInfo, walletFlowDecision.offlineProcessInfo) && Intrinsics.LJFF(this.popOut, walletFlowDecision.popOut) && Intrinsics.LJFF(this.customerServiceUrl, walletFlowDecision.customerServiceUrl) && Intrinsics.LJFF(this.extraOperation, walletFlowDecision.extraOperation) && Intrinsics.LJFF(this.paRegisterLink, walletFlowDecision.paRegisterLink) && Intrinsics.LJFF(this.extra, walletFlowDecision.extra) && Intrinsics.LJFF(this.walletUserId, walletFlowDecision.walletUserId) && Intrinsics.LJFF(this.extraMap, walletFlowDecision.extraMap);
    }

    public final void setMaskedMobileNo(String str) {
        this.maskedMobileNo = str;
    }

    public final void setVerifyInfo(String str) {
        this.verifyInfo = str;
    }

    public WalletFlowDecision(String str, String str2, String str3, String str4, Boolean bool, Step step, ArrayList<Step> arrayList, String str5, String str6, String str7, ArrayList<PinRule> arrayList2, ArrayList<RegionMobileCodeItem> arrayList3, String str8, String str9, String str10, String str11, String str12, Map<String, ABTestInfo> map, OfflineProcessInfo offlineProcessInfo, PopOutInfo popOutInfo, String str13, String str14, String str15, Map<String, String> map2, String str16, Map<String, String> map3) {
        this.requestId = str;
        this.biometricStatus = str2;
        this.riskDecision = str3;
        this.challengeId = str4;
        this.accountOpened = bool;
        this.curStep = step;
        this.allSteps = arrayList;
        this.sessionId = str5;
        this.verifyInfo = str6;
        this.maskedMobileNo = str7;
        this.pinRuleList = arrayList2;
        this.regionMobileCodeList = arrayList3;
        this.kycUrl = str8;
        this.kycSchema = str9;
        this.agreementContent = str10;
        this.scene = str11;
        this.source = str12;
        this.abTestInfo = map;
        this.offlineProcessInfo = offlineProcessInfo;
        this.popOut = popOutInfo;
        this.customerServiceUrl = str13;
        this.extraOperation = str14;
        this.paRegisterLink = str15;
        this.extra = map2;
        this.walletUserId = str16;
        this.extraMap = map3;
    }
}
