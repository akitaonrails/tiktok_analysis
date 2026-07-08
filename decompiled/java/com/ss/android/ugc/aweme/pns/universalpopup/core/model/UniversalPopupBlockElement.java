package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupBlockElement implements Serializable {

    @C09CT("action")
    public final UniversalPopupAction action;

    @C09CT("align")
    public final String align;

    @C09CT("body_links")
    public final List<UniversalPopupBodyLinkList> bodyLinks;

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

    public UniversalPopupBlockElement() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public UniversalPopupBlockElement(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<UniversalPopupBodyLinkList> list, UniversalPopupAction universalPopupAction) {
        this.subtype = str;
        this.text = str2;
        this.font = str3;
        this.iconUrl = str4;
        this.iconUrlDark = str5;
        this.iconStyle = str6;
        this.align = str7;
        this.groupId = str8;
        this.bodyLinks = list;
        this.action = universalPopupAction;
    }

    public UniversalPopupBlockElement(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, UniversalPopupAction universalPopupAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? "pns_default_group" : str8, (i & 256) != 0 ? C13BV.INSTANCE : list, (i & 512) == 0 ? universalPopupAction : null);
    }
}
