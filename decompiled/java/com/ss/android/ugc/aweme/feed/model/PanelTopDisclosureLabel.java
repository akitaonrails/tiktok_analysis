package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PanelTopDisclosureLabel implements Serializable {

    @C09CT("display_text")
    public final String displayText;

    @C09CT("truncatable_text")
    public final String truncatableText;

    public PanelTopDisclosureLabel() {
        this(null, null);
    }

    public PanelTopDisclosureLabel(String str, String str2) {
        this.displayText = str;
        this.truncatableText = str2;
    }
}
