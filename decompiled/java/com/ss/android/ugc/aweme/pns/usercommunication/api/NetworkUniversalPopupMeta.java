package com.ss.android.ugc.aweme.pns.usercommunication.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkUniversalPopupMeta implements Serializable {

    @C09CT("after_n_swipe")
    public final Integer afterNSwipe;

    @C09CT("business")
    public final String business;

    @C09CT("force_show")
    public final boolean forceShow;

    @C09CT("is_compliance")
    public final boolean isCompliance;

    @C09CT("sub_pop_up")
    public final boolean isSubPopup;

    @C09CT("popup_id")
    public final String popup_id;

    @C09CT("version")
    public final String version;

    public NetworkUniversalPopupMeta() {
        this("", "", "", false, false, null, false);
    }

    public final boolean isCompliance() {
        return this.isCompliance;
    }

    public final boolean isSubPopup() {
        return this.isSubPopup;
    }

    public NetworkUniversalPopupMeta(String str, String str2, String str3, boolean z, boolean z2, Integer num, boolean z3) {
        this.business = str;
        this.version = str2;
        this.popup_id = str3;
        this.isSubPopup = z;
        this.forceShow = z2;
        this.afterNSwipe = num;
        this.isCompliance = z3;
    }
}
