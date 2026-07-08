package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAnchorsExtras implements Serializable {

    @C09CT("icon")
    public final AdIcon icon;

    @C09CT("prefix")
    public final AdPrefix prefix;

    @C09CT("second_line")
    public final SecondLine secondLine;

    public AdAnchorsExtras() {
        this(null, null, null);
    }

    public AdAnchorsExtras(AdIcon adIcon, AdPrefix adPrefix, SecondLine secondLine) {
        this.icon = adIcon;
        this.prefix = adPrefix;
        this.secondLine = secondLine;
    }
}
