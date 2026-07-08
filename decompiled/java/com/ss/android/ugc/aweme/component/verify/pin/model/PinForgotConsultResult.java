package com.ss.android.ugc.aweme.component.verify.pin.model;

import X.C09CT;
import com.ss.android.ugc.aweme.biz.wallet.network.model.ABTestInfo;
import com.ss.android.ugc.aweme.biz.wallet.network.model.Step;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PinForgotConsultResult {

    @C09CT("ab_test_info")
    public final Map<String, ABTestInfo> abTestInfo;

    @C09CT("all_step")
    public final ArrayList<Step> allSteps;

    @C09CT("hint_page_msg")
    public final HintPageMsg hintPageMsg;

    @C09CT("offline_process_info")
    public final OfflineProcessInfo offlineProcessInfo;

    @C09CT("pin_rule_list")
    public final ArrayList<PinRule> pinRuleList;

    @C09CT("pin_status_detail")
    public final PinStatusDetail pinStatusDetail;

    @C09CT("verify_info")
    public final String verifyInfo;

    public PinForgotConsultResult(String str, ArrayList<PinRule> arrayList, PinStatusDetail pinStatusDetail, OfflineProcessInfo offlineProcessInfo, HintPageMsg hintPageMsg, Map<String, ABTestInfo> map, ArrayList<Step> arrayList2) {
        this.verifyInfo = str;
        this.pinRuleList = arrayList;
        this.pinStatusDetail = pinStatusDetail;
        this.offlineProcessInfo = offlineProcessInfo;
        this.hintPageMsg = hintPageMsg;
        this.abTestInfo = map;
        this.allSteps = arrayList2;
    }
}
