package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
public final class PopUpCopyWriting implements Serializable {
    public static final int $stable = 8;

    @C09CT("learn_more_link")
    public final String LearnMoreLink;

    @C09CT("privacy_policy_link")
    public final String PrivacyPolicyLink;

    @C09CT("check")
    public final String check;

    @C09CT("check_desc")
    public final String checkDesc;

    @C09CT("check_policy_link_list")
    public final List<String> checkPolicyLinkList;

    @C09CT("check_policy_list")
    public final List<String> checkPolicyList;

    @C09CT("check_select_text")
    public final String checkSelectText;

    @C09CT("confirm")
    public final String confirm;

    @C09CT("confirm_desc")
    public final String confirmDesc;

    @C09CT("confirm_policy_link_list")
    public final List<String> confirmPolicyLinkList;

    @C09CT("confirm_policy_list")
    public final List<String> confirmPolicyList;

    @C09CT("confirm_select_text")
    public final String confirmSelectText;

    @C09CT("subtext")
    public final String description;

    @C09CT("policy_link_list")
    public final List<String> policyLinkList;

    @C09CT("policy_list")
    public final List<String> policyList;

    @C09CT("submit_button_text")
    public final String submitButtonText;

    @C09CT("title")
    public final String title;

    public PopUpCopyWriting() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public final String getCheck() {
        return this.check;
    }

    public final String getCheckDesc() {
        return this.checkDesc;
    }

    public final List<String> getCheckPolicyLinkList() {
        return this.checkPolicyLinkList;
    }

    public final List<String> getCheckPolicyList() {
        return this.checkPolicyList;
    }

    public final String getCheckSelectText() {
        return this.checkSelectText;
    }

    public final String getConfirm() {
        return this.confirm;
    }

    public final String getConfirmDesc() {
        return this.confirmDesc;
    }

    public final List<String> getConfirmPolicyLinkList() {
        return this.confirmPolicyLinkList;
    }

    public final List<String> getConfirmPolicyList() {
        return this.confirmPolicyList;
    }

    public final String getConfirmSelectText() {
        return this.confirmSelectText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLearnMoreLink() {
        return this.LearnMoreLink;
    }

    public final List<String> getPolicyLinkList() {
        return this.policyLinkList;
    }

    public final List<String> getPolicyList() {
        return this.policyList;
    }

    public final String getPrivacyPolicyLink() {
        return this.PrivacyPolicyLink;
    }

    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    public final String getTitle() {
        return this.title;
    }

    public PopUpCopyWriting(String str, String str2, List<String> list, List<String> list2, String str3, String str4, String str5, List<String> list3, List<String> list4, String str6, String str7, String str8, List<String> list5, List<String> list6, String str9, String str10, String str11) {
        this.title = str;
        this.description = str2;
        this.policyList = list;
        this.policyLinkList = list2;
        this.confirm = str3;
        this.confirmSelectText = str4;
        this.confirmDesc = str5;
        this.confirmPolicyList = list3;
        this.confirmPolicyLinkList = list4;
        this.check = str6;
        this.checkSelectText = str7;
        this.checkDesc = str8;
        this.checkPolicyList = list5;
        this.checkPolicyLinkList = list6;
        this.submitButtonText = str9;
        this.PrivacyPolicyLink = str10;
        this.LearnMoreLink = str11;
    }

    public PopUpCopyWriting(String str, String str2, List list, List list2, String str3, String str4, String str5, List list3, List list4, String str6, String str7, String str8, List list5, List list6, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? C13BV.INSTANCE : list3, (i & 256) != 0 ? C13BV.INSTANCE : list4, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str8, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list5, (i & 8192) != 0 ? C13BV.INSTANCE : list6, (i & 16384) != 0 ? "" : str9, (32768 & i) != 0 ? "" : str10, (i & 65536) == 0 ? str11 : "");
    }
}
