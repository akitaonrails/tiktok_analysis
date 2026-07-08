package com.ss.android.ugc.aweme.commercialize.advideo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class VideoAuthorizationResponse implements Serializable {

    @C09CT("pushing_invitation")
    public final InvitationInfo pushingInvitation;

    @C09CT("status_code")
    public final int status_code;

    @C09CT("status_msg")
    public final String status_msg;

    public VideoAuthorizationResponse(int i, String str, InvitationInfo invitationInfo) {
        this.status_code = i;
        this.status_msg = str;
        this.pushingInvitation = invitationInfo;
    }
}
