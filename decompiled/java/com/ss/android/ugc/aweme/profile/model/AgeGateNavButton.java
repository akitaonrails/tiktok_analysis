package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class AgeGateNavButton implements Serializable {

    @C09CT("action_url")
    public String actionUrl;

    @C09CT("content")
    public String content;

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("position")
    public Integer position;

    @C09CT("type")
    public Integer type;

    public AgeGateNavButton() {
        this(null, null, null, null, null);
    }

    public final void setActionUrl(String str) {
        this.actionUrl = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public AgeGateNavButton(Integer num, Integer num2, String str, String str2, String str3) {
        this.position = num;
        this.type = num2;
        this.iconUrl = str;
        this.content = str2;
        this.actionUrl = str3;
    }
}
