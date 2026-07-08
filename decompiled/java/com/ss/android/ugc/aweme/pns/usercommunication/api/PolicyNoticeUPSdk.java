package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class PolicyNoticeUPSdk implements Serializable {

    @C09CT("actions")
    public final List<PolicyNoticeActionUPSdk> actions;

    @C09CT("align")
    public final String align;

    @C09CT("body")
    public final String body;

    @C09CT("business")
    public final String business;

    @C09CT("dismiss_click_outside")
    public final Boolean dismissClickOutside;

    @C09CT("first_button_highlight")
    public final Boolean firstButtonHighlight;

    @C09CT("force_show")
    public final boolean forceShow;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("icon_url_dark")
    public final String iconUrlDark;

    @C09CT("is_compliance")
    public final boolean isCompliance;

    @C09CT("sub_pop_up")
    public final Boolean isSubPopUp;

    @C09CT("body_link_list")
    public final List<PolicyBodyLinkListUPSdk> policyLinkList;

    @C09CT("policy_version")
    public final String policyVersion;

    @C09CT("style")
    public final String style;

    @C09CT("swipe_down_close")
    public final Boolean swipeDownClose;

    @C09CT("title")
    public final String title;

    @C09CT("upper_left_back")
    public final Boolean upperLeftBack;

    @C09CT("upper_right_close")
    public final int upperRightClose;

    @C09CT("webview_url")
    public final String webviewUrl;

    @C09CT("webview_ux_option")
    public final Integer webviewUxOption;

    public PolicyNoticeUPSdk() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, false, false, 1048575, null);
    }

    public String toString() {
        return "PolicyNoticeUPSdk(business=" + this.business + ", policyVersion=" + this.policyVersion + ", style=" + this.style + ", title=" + this.title + ", body=" + this.body + ", actions=" + this.actions + ", iconUrl=" + this.iconUrl + ", iconUrlDark=" + this.iconUrlDark + ", policyLinkList=" + this.policyLinkList + ", isSubPopUp=" + this.isSubPopUp + ", firstButtonHighlight=" + this.firstButtonHighlight + ", upperRightClose=" + this.upperRightClose + ", upperLeftBack=" + this.upperLeftBack + ", align=" + this.align + ", webviewUrl=" + this.webviewUrl + ", webviewUxOption=" + this.webviewUxOption + ", dismissClickOutside=" + this.dismissClickOutside + ", swipeDownClose=" + this.swipeDownClose + ", forceShow=" + this.forceShow + ", isCompliance=" + this.isCompliance + ')';
    }

    public final boolean isCompliance() {
        return this.isCompliance;
    }

    public final Boolean isSubPopUp() {
        return this.isSubPopUp;
    }

    public PolicyNoticeUPSdk(String str, String str2, String str3, String str4, String str5, List<PolicyNoticeActionUPSdk> list, String str6, String str7, List<PolicyBodyLinkListUPSdk> list2, Boolean bool, Boolean bool2, int i, Boolean bool3, String str8, String str9, Integer num, Boolean bool4, Boolean bool5, boolean z, boolean z2) {
        this.business = str;
        this.policyVersion = str2;
        this.style = str3;
        this.title = str4;
        this.body = str5;
        this.actions = list;
        this.iconUrl = str6;
        this.iconUrlDark = str7;
        this.policyLinkList = list2;
        this.isSubPopUp = bool;
        this.firstButtonHighlight = bool2;
        this.upperRightClose = i;
        this.upperLeftBack = bool3;
        this.align = str8;
        this.webviewUrl = str9;
        this.webviewUxOption = num;
        this.dismissClickOutside = bool4;
        this.swipeDownClose = bool5;
        this.forceShow = z;
        this.isCompliance = z2;
    }

    public PolicyNoticeUPSdk(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, List list2, Boolean bool, Boolean bool2, int i, Boolean bool3, String str8, String str9, Integer num, Boolean bool4, Boolean bool5, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? C13BV.INSTANCE : list, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? C13BV.INSTANCE : list2, (i2 & 512) != 0 ? Boolean.FALSE : bool, (i2 & 1024) != 0 ? Boolean.FALSE : bool2, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0 : i, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? Boolean.FALSE : bool3, (i2 & 8192) == 0 ? str8 : "", (i2 & 16384) != 0 ? null : str9, (32768 & i2) == 0 ? num : null, (65536 & i2) != 0 ? Boolean.FALSE : bool4, (131072 & i2) != 0 ? Boolean.FALSE : bool5, (262144 & i2) != 0 ? false : z, (i2 & 524288) != 0 ? false : z2);
    }
}
