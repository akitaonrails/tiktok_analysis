package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class NetworkUniversalPopupBlock implements Serializable {

    @C09CT("action")
    public final NetworkUniversalPopupAction action;

    @C09CT("elements")
    public final Map<String, NetworkUniversalPopupElement> elements;

    @C09CT("format")
    public final NetworkUniversalPopupBlockFormat format;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("type")
    public final String type;

    public NetworkUniversalPopupBlock() {
        this("", "", null, C2097608Jq.LJ(), null);
    }

    public NetworkUniversalPopupBlock(String str, String str2, NetworkUniversalPopupBlockFormat networkUniversalPopupBlockFormat, Map<String, NetworkUniversalPopupElement> map, NetworkUniversalPopupAction networkUniversalPopupAction) {
        this.id = str;
        this.type = str2;
        this.format = networkUniversalPopupBlockFormat;
        this.elements = map;
        this.action = networkUniversalPopupAction;
    }
}
