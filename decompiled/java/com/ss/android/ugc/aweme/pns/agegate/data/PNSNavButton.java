package com.ss.android.ugc.aweme.pns.agegate.data;

import X.C09CT;
import X.EnumC19300210f2;
import X.EnumC19300410f4;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSNavButton implements Serializable {

    @C09CT("action_url")
    public final String actionUrl;

    @C09CT("content")
    public final String content;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("position")
    public final EnumC19300410f4 position;

    @C09CT("type")
    public final EnumC19300210f2 type;

    public PNSNavButton() {
        this(null, null, null, null, null);
    }

    public PNSNavButton(EnumC19300410f4 enumC19300410f4, EnumC19300210f2 enumC19300210f2, String str, String str2, String str3) {
        this.position = enumC19300410f4;
        this.type = enumC19300210f2;
        this.iconUrl = str;
        this.content = str2;
        this.actionUrl = str3;
    }
}
