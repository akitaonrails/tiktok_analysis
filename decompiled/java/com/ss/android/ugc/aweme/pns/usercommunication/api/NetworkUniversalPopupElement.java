package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class NetworkUniversalPopupElement implements Serializable {

    @C09CT("action")
    public final NetworkUniversalPopupAction action;

    @C09CT("align")
    public final String align;

    @C09CT("body_links")
    public final List<NetworkUniversalPopupBodyLink> bodyLinks;

    @C09CT("font")
    public final String font;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("icon_style")
    public final String iconStyle;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("icon_url_dark")
    public final String iconUrlDark;

    @C09CT("subtype")
    public final String subtype;

    @C09CT("text")
    public final String text;

    public NetworkUniversalPopupElement() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public NetworkUniversalPopupElement(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<NetworkUniversalPopupBodyLink> list, NetworkUniversalPopupAction networkUniversalPopupAction, String str8) {
        this.subtype = str;
        this.text = str2;
        this.font = str3;
        this.iconUrl = str4;
        this.iconUrlDark = str5;
        this.iconStyle = str6;
        this.align = str7;
        this.bodyLinks = list;
        this.action = networkUniversalPopupAction;
        this.groupId = str8;
    }

    public NetworkUniversalPopupElement(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, NetworkUniversalPopupAction networkUniversalPopupAction, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? str7 : null, (i & 128) != 0 ? C13BV.INSTANCE : list, (i & 256) != 0 ? new NetworkUniversalPopupAction(null, null, 0, null, null, false, null, false, false, 511, null) : networkUniversalPopupAction, (i & 512) != 0 ? "default_group" : str8);
    }
}
