package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class Icon implements Serializable {

    @C09CT("icon_color")
    public String iconColor;

    @C09CT("icon_key")
    public String localIcon;

    @C09CT("icon_url")
    public String remoteIcon;

    @C09CT("icon_url_dark")
    public String remoteIconDark;
    public final String tag = "Profile.Icon";

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getLocalIcon() {
        return this.localIcon;
    }

    public final String getRemoteIcon() {
        return this.remoteIcon;
    }

    public final String getRemoteIconDark() {
        return this.remoteIconDark;
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setIconColor(String str) {
        this.iconColor = str;
    }

    public final void setLocalIcon(String str) {
        this.localIcon = str;
    }

    public final void setRemoteIcon(String str) {
        this.remoteIcon = str;
    }

    public final void setRemoteIconDark(String str) {
        this.remoteIconDark = str;
    }
}
