package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class PolicyNoticeActionUPSdk implements Serializable {

    @C09CT("action")
    public final String action;

    @C09CT("approve")
    public final boolean approve;

    @C09CT("customized_actions")
    public final List<String> customizedActions;

    @C09CT("dismiss")
    public final Boolean dismiss;

    @C09CT("dismiss_all")
    public final Boolean dismissAll;

    @C09CT("extra")
    public final String extra;

    @C09CT("is_bold")
    public final boolean isBold;

    @C09CT("link")
    public final String link;

    @C09CT("link_type")
    public final String linkType;

    @C09CT("next_pop_up")
    public final String nextPopUp;

    @C09CT("operation")
    public final Integer operation;

    @C09CT("re_get_settings")
    public final Boolean reGetSettings;

    @C09CT("text")
    public final String text;

    @C09CT("upgrade")
    public final Boolean upgrade;

    public PolicyNoticeActionUPSdk() {
        this(null, false, null, null, null, false, null, null, null, null, null, null, null, null, 16383, null);
    }

    public String toString() {
        return "PolicyNoticeActionUPSdk(text=" + this.text + ", isBold=" + this.isBold + ", linkType=" + this.linkType + ", link=" + this.link + ", extra=" + this.extra + ", approve=" + this.approve + ", operation=" + this.operation + ", nextPopUp=" + this.nextPopUp + ", dismiss=" + this.dismiss + ", dismissAll=" + this.dismissAll + ", upgrade=" + this.upgrade + ", reGetSettings=" + this.reGetSettings + ", action=" + this.action + ", customizedActions=" + this.customizedActions + ')';
    }

    public final boolean isBold() {
        return this.isBold;
    }

    public PolicyNoticeActionUPSdk(String str, boolean z, String str2, String str3, String str4, boolean z2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str6, List<String> list) {
        this.text = str;
        this.isBold = z;
        this.linkType = str2;
        this.link = str3;
        this.extra = str4;
        this.approve = z2;
        this.operation = num;
        this.nextPopUp = str5;
        this.dismiss = bool;
        this.dismissAll = bool2;
        this.upgrade = bool3;
        this.reGetSettings = bool4;
        this.action = str6;
        this.customizedActions = list;
    }

    public PolicyNoticeActionUPSdk(String str, boolean z, String str2, String str3, String str4, boolean z2, Integer num, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? Boolean.FALSE : bool2, (i & 1024) != 0 ? Boolean.FALSE : bool3, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? Boolean.FALSE : bool4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str6 : null, (i & 8192) != 0 ? C13BV.INSTANCE : list);
    }
}
