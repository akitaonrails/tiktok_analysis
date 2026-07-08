package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubscribeStatus implements Serializable {

    @C09CT("email_categories")
    public final List<Object> categories;

    @C09CT("popup_enable")
    public final Boolean needShowAuthPopup;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("unsubscribe_all")
    public final Boolean unsubscribeAll;

    public SubscribeStatus() {
        this(null, Boolean.FALSE, new ArrayList(), Boolean.FALSE);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeStatus(nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", unsubscribeAll=");
        sbLIZ.append(this.unsubscribeAll);
        sbLIZ.append(", categories=");
        sbLIZ.append(this.categories);
        sbLIZ.append(", needShowAuthPopup=");
        sbLIZ.append(this.needShowAuthPopup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SubscribeStatus(String str, Boolean bool, List<Object> list, Boolean bool2) {
        this.nickname = str;
        this.unsubscribeAll = bool;
        this.categories = list;
        this.needShowAuthPopup = bool2;
    }
}
