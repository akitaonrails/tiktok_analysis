package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupButton implements Serializable {

    @C09CT("action")
    public final UniversalPopupAction action;

    @C09CT("enabled")
    public final boolean isEnabled;

    @C09CT("is_highlighted")
    public final boolean isHighlighted;

    @C09CT("position")
    public final int position;

    @C09CT("text")
    public final String text;

    public UniversalPopupButton() {
        this("", new UniversalPopupAction(null, null, null, null, 0, null, null, null, false, null, null, false, false, 8191, null), false, 0, true);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public UniversalPopupButton(String str, UniversalPopupAction universalPopupAction, boolean z, int i, boolean z2) {
        this.text = str;
        this.action = universalPopupAction;
        this.isHighlighted = z;
        this.position = i;
        this.isEnabled = z2;
    }
}
