package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class QRCodeGroupChatLayout {

    @C09CT("desc")
    public final String desc;

    @C09CT("invitation_info")
    public final InvitationInfo invitationInfo;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    public QRCodeGroupChatLayout(String str, String str2, String str3, InvitationInfo invitationInfo) {
        this.title = str;
        this.subTitle = str2;
        this.desc = str3;
        this.invitationInfo = invitationInfo;
    }
}
