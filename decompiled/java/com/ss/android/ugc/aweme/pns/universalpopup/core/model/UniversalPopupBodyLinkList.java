package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupBodyLinkList implements Serializable {

    @C09CT("action")
    public final UniversalPopupAction action;

    @C09CT("color")
    public final String color;

    @C09CT("font")
    public final String font;

    @C09CT("has_chevron")
    public final boolean hasChevron;

    @C09CT("icon")
    public final String icon;

    @C09CT("name")
    public final String name;

    public UniversalPopupBodyLinkList() {
        this("", null, "UIText1", null, false, new UniversalPopupAction(null, null, null, null, 0, null, null, null, false, null, null, false, false, 8191, null));
    }

    public UniversalPopupBodyLinkList(String str, String str2, String str3, String str4, boolean z, UniversalPopupAction universalPopupAction) {
        this.name = str;
        this.font = str2;
        this.color = str3;
        this.icon = str4;
        this.hasChevron = z;
        this.action = universalPopupAction;
    }
}
