package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ClientControlInfo {

    @C09CT("event_tracking_info")
    public final EventTrackingInfo eventTrackingInfo;

    @C09CT("invite_card_control_info")
    public final InviteCardControlInfo inviteCardControlInfo;

    @C09CT("rec_card_control_info")
    public final RecCardControlInfo recCardControlInfo;

    public ClientControlInfo(RecCardControlInfo recCardControlInfo, InviteCardControlInfo inviteCardControlInfo, EventTrackingInfo eventTrackingInfo) {
        this.recCardControlInfo = recCardControlInfo;
        this.inviteCardControlInfo = inviteCardControlInfo;
        this.eventTrackingInfo = eventTrackingInfo;
    }
}
