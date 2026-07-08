package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InvitePopupInfo {

    @C09CT("button")
    public final InviteButton button;

    @C09CT("content")
    public final String content;

    @C09CT("title")
    public final String title;

    public InvitePopupInfo() {
        this(null, null, null);
    }

    public InvitePopupInfo(String str, String str2, InviteButton inviteButton) {
        this.title = str;
        this.content = str2;
        this.button = inviteButton;
    }
}
