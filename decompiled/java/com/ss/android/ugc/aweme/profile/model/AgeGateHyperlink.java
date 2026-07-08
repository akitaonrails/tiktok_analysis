package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateHyperlink implements Serializable {

    @C09CT("age_gate_hyperlink_action")
    public String ageGateHyperlinkAction;

    @C09CT("age_gate_hyperlink_text")
    public String ageGateHyperlinkText;

    public AgeGateHyperlink() {
        this(null, null);
    }

    public final void setAgeGateHyperlinkAction(String str) {
        this.ageGateHyperlinkAction = str;
    }

    public final void setAgeGateHyperlinkText(String str) {
        this.ageGateHyperlinkText = str;
    }

    public AgeGateHyperlink(String str, String str2) {
        this.ageGateHyperlinkText = str;
        this.ageGateHyperlinkAction = str2;
    }
}
