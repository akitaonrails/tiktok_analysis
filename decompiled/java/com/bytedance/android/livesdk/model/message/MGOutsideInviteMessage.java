package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class MGOutsideInviteMessage extends AbstractC1136060ffY {

    @C09CT("anchor_avatar")
    public ImageModel anchorAvatar;

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("anchor_nickname")
    public String anchorNickname;

    @C09CT("follow_relation")
    public int followRelation;

    @C09CT("invite_time")
    public long inviteTime;

    @C09CT("room_id")
    public long roomId;

    public MGOutsideInviteMessage() {
        this.type = C001A.M_G_OUTSIDE_INVITE_MESSAGE;
        this.anchorNickname = "";
    }
}
