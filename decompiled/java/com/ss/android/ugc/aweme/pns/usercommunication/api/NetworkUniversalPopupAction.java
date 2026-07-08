package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class NetworkUniversalPopupAction implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String actionId;

    @C09CT("action_type")
    public final List<String> actionType;

    @C09CT("callback")
    public final boolean callback;

    @C09CT("default_on")
    public final boolean defaultOn;

    @C09CT("dismiss")
    public final Boolean dismiss;

    @C09CT("dismiss_all")
    public final Boolean dismissAll;

    @C09CT("is_highlighted")
    public final boolean isHighlighted;

    @C09CT("link")
    public final String link;

    @C09CT("operation")
    public final int operation;

    public NetworkUniversalPopupAction() {
        this(null, null, 0, null, null, false, null, false, false, 511, null);
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public NetworkUniversalPopupAction(String str, List<String> list, int i, Boolean bool, Boolean bool2, boolean z, String str2, boolean z2, boolean z3) {
        this.link = str;
        this.actionType = list;
        this.operation = i;
        this.dismiss = bool;
        this.dismissAll = bool2;
        this.callback = z;
        this.actionId = str2;
        this.isHighlighted = z2;
        this.defaultOn = z3;
    }

    public NetworkUniversalPopupAction(String str, List list, int i, Boolean bool, Boolean bool2, boolean z, String str2, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? Boolean.FALSE : bool, (i2 & 16) != 0 ? Boolean.FALSE : bool2, (i2 & 32) != 0 ? false : z, (i2 & 64) == 0 ? str2 : "", (i2 & 128) != 0 ? false : z2, (i2 & 256) == 0 ? z3 : false);
    }
}
