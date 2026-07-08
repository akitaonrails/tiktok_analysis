package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class NetworkUniversalPopupBodyLink implements Serializable {

    @C09CT("action")
    public final NetworkUniversalPopupAction action;

    @C09CT("color")
    public final String color;

    @C09CT("font")
    public final String font;

    @C09CT("has_chevron")
    public final boolean hasChevron;

    @C09CT("icon")
    public final String icon;

    @C09CT("text")
    public final String text;

    public NetworkUniversalPopupBodyLink() {
        this("", null, "UIText1", null, false, new NetworkUniversalPopupAction(null, null, 0, null, null, false, null, false, false, 511, null));
    }

    public NetworkUniversalPopupBodyLink(String str, String str2, String str3, String str4, boolean z, NetworkUniversalPopupAction networkUniversalPopupAction) {
        this.text = str;
        this.font = str2;
        this.color = str3;
        this.icon = str4;
        this.hasChevron = z;
        this.action = networkUniversalPopupAction;
    }
}
