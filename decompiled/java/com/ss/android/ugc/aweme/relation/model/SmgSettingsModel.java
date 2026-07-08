package com.ss.android.ugc.aweme.relation.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SmgSettingsModel implements Serializable {

    @C09CT("footer_invite_all")
    public boolean isFloatInviteAll;

    @C09CT("show_invite_all")
    public boolean isShowInviteAll;

    @C09CT("limit_invite_all")
    public final int limitInviteAllCount;

    @C09CT("text")
    public String text;

    @C09CT("url")
    public String url;

    public final int getLimitInviteAllCount() {
        return this.limitInviteAllCount;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isFloatInviteAll() {
        return this.isFloatInviteAll;
    }

    public final boolean isShowInviteAll() {
        return this.isShowInviteAll;
    }

    public final void setFloatInviteAll(boolean z) {
        this.isFloatInviteAll = z;
    }

    public final void setShowInviteAll(boolean z) {
        this.isShowInviteAll = z;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
