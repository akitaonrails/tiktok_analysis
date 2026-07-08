package com.ss.android.ugc.aweme.ug.shortcut;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class UninstallRemoveData {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("link")
    public final String link;

    @C09CT("text")
    public final String text;

    @C09CT("use_mini_card")
    public final boolean useMiniCard;

    public UninstallRemoveData() {
        this(false, "", "", false);
    }

    public UninstallRemoveData(boolean z, String str, String str2, boolean z2) {
        this.enable = z;
        this.text = str;
        this.link = str2;
        this.useMiniCard = z2;
    }
}
