package com.ss.android.ugc.aweme.profile.org;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class PanelIcon implements Serializable {

    @C09CT("icon_color")
    public final String iconColor;

    @C09CT("icon_key")
    public final String iconKey;

    public PanelIcon() {
        this(null, null);
    }

    public PanelIcon(String str, String str2) {
        this.iconKey = str;
        this.iconColor = str2;
    }
}
