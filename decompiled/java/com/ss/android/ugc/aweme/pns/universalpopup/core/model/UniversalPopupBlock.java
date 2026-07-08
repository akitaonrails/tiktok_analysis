package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupBlock implements Serializable {

    @C09CT("action")
    public final UniversalPopupAction action;

    @C09CT("block_extra")
    public final Map<String, Object> blockExtra;

    @C09CT("body")
    public final String body;

    @C09CT("body_link_list")
    public final List<UniversalPopupBodyLinkList> bodyLinkList;

    @C09CT("button")
    public final List<UniversalPopupButton> buttons;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public Boolean f73default;

    @C09CT("elements")
    public final Map<String, UniversalPopupBlockElement> elements;

    @C09CT("format")
    public final UniversalPopupBlockFormat format;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("pin")
    public final String pin;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final String type;

    public UniversalPopupBlock() {
        this("", "", null, null, null, Boolean.FALSE, null, null, null, null, C2097608Jq.LJ(), null);
    }

    public final UniversalPopupBlock copy(String str, String str2, String str3, String str4, List<UniversalPopupBodyLinkList> list, Boolean bool, List<UniversalPopupButton> list2, Map<String, ? extends Object> map, String str5, UniversalPopupBlockFormat universalPopupBlockFormat, Map<String, UniversalPopupBlockElement> map2, UniversalPopupAction universalPopupAction) {
        return new UniversalPopupBlock(str, str2, str3, str4, list, bool, list2, map, str5, universalPopupBlockFormat, map2, universalPopupAction);
    }

    public final void setDefault(Boolean bool) {
        this.f73default = bool;
    }

    public UniversalPopupBlock(String str, String str2, String str3, String str4, List<UniversalPopupBodyLinkList> list, Boolean bool, List<UniversalPopupButton> list2, Map<String, ? extends Object> map, String str5, UniversalPopupBlockFormat universalPopupBlockFormat, Map<String, UniversalPopupBlockElement> map2, UniversalPopupAction universalPopupAction) {
        this.type = str;
        this.id = str2;
        this.title = str3;
        this.body = str4;
        this.bodyLinkList = list;
        this.f73default = bool;
        this.buttons = list2;
        this.blockExtra = map;
        this.pin = str5;
        this.format = universalPopupBlockFormat;
        this.elements = map2;
        this.action = universalPopupAction;
    }
}
