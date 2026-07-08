package com.ss.android.ugc.aweme.slash.component;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class ComponentStyle {

    @C09CT("allow_drag")
    public final Boolean allowDrag;

    @C09CT("margin")
    public final Margin margin;

    @C09CT("position")
    public final String position;

    @C09CT("safe_area_insets_enable")
    public final Boolean safeAreaInsetsEnable;

    public ComponentStyle() {
        this(null, null, null, null);
    }

    public ComponentStyle(String str, Margin margin, Boolean bool, Boolean bool2) {
        this.position = str;
        this.margin = margin;
        this.safeAreaInsetsEnable = bool;
        this.allowDrag = bool2;
    }
}
