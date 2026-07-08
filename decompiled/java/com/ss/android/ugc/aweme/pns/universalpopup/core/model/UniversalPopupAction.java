package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupAction implements Serializable {

    @C09CT("action_id")
    public final String actionId;

    @C09CT("approve")
    public final boolean approve;

    @C09CT("customized_actions")
    public final List<String> customizedActions;

    @C09CT("default_on")
    public final boolean defaultOn;

    @C09CT("dismiss")
    public final Boolean dismiss;

    @C09CT("dismiss_all")
    public final Boolean dismissAll;

    @C09CT("dismiss_on_resume")
    public final Boolean dismissOnResume;

    @C09CT("extra")
    public final String extra;

    @C09CT("is_highlighted")
    public final boolean isHighlighted;

    @C09CT("link")
    public final String link;

    @C09CT("link_type")
    public final String linkType;

    @C09CT("next_pop_up")
    public final String nextPopUp;

    @C09CT("operation")
    public final int operation;

    public UniversalPopupAction() {
        this(null, null, null, null, 0, null, null, null, false, null, null, false, false, 8191, null);
    }

    public final UniversalPopupAction copy(String str, String str2, String str3, String str4, int i, Boolean bool, Boolean bool2, Boolean bool3, boolean z, List<String> list, String str5, boolean z2, boolean z3) {
        return new UniversalPopupAction(str, str2, str3, str4, i, bool, bool2, bool3, z, list, str5, z2, z3);
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public UniversalPopupAction(String str, String str2, String str3, String str4, int i, Boolean bool, Boolean bool2, Boolean bool3, boolean z, List<String> list, String str5, boolean z2, boolean z3) {
        this.actionId = str;
        this.link = str2;
        this.linkType = str3;
        this.extra = str4;
        this.operation = i;
        this.dismiss = bool;
        this.dismissOnResume = bool2;
        this.dismissAll = bool3;
        this.approve = z;
        this.customizedActions = list;
        this.nextPopUp = str5;
        this.isHighlighted = z2;
        this.defaultOn = z3;
    }

    public UniversalPopupAction(String str, String str2, String str3, String str4, int i, Boolean bool, Boolean bool2, Boolean bool3, boolean z, List list, String str5, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? Boolean.FALSE : bool, (i2 & 64) != 0 ? Boolean.FALSE : bool2, (i2 & 128) != 0 ? Boolean.FALSE : bool3, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? C13BV.INSTANCE : list, (i2 & 1024) != 0 ? null : str5, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z3 : false);
    }
}
