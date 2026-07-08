package com.ss.android.ugc.aweme.pns.agegate.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSHyperlink implements Serializable {

    @C09CT("age_gate_hyperlink_action")
    public final String ageGateHyperlinkAction;

    @C09CT("age_gate_hyperlink_text")
    public final String ageGateHyperlinkText;

    public PNSHyperlink() {
        this(null, null);
    }

    public PNSHyperlink(String str, String str2) {
        this.ageGateHyperlinkText = str;
        this.ageGateHyperlinkAction = str2;
    }
}
