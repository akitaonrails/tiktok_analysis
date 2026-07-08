package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class Portal {

    @C09CT("anchor")
    public User anchor;

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("enter_count")
    public Long enterCount;

    @C09CT("invitee_count")
    public Long inviteeCount;

    @C09CT("portal_id")
    public Long portalId;

    @C09CT("reward_duration")
    public Long rewardDuration;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("start_time")
    public Long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sugar_daddy")
    public User sugarDaddy;

    @C09CT("total_amount")
    public Long totalAmount;

    @C09CT("user_type")
    public int userType;

    @C09CT("wait_duration")
    public Long waitDuration;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.startTime != null) {
            sb.append(", start_time=");
            sb.append(this.startTime);
        }
        if (this.enterCount != null) {
            sb.append(", enter_count=");
            sb.append(this.enterCount);
        }
        if (this.sugarDaddy != null) {
            sb.append(", sugar_daddy=");
            sb.append(this.sugarDaddy);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.anchor != null) {
            sb.append(", anchor=");
            sb.append(this.anchor);
        }
        if (this.portalId != null) {
            sb.append(", portal_id=");
            sb.append(this.portalId);
        }
        sb.append(", user_type=");
        sb.append(this.userType);
        if (this.inviteeCount != null) {
            sb.append(", invitee_count=");
            sb.append(this.inviteeCount);
        }
        sb.append(", status=");
        sb.append(this.status);
        if (this.waitDuration != null) {
            sb.append(", wait_duration=");
            sb.append(this.waitDuration);
        }
        if (this.rewardDuration != null) {
            sb.append(", reward_duration=");
            sb.append(this.rewardDuration);
        }
        if (this.totalAmount != null) {
            sb.append(", total_amount=");
            sb.append(this.totalAmount);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        sb.replace(0, 2, "Portal{");
        sb.append('}');
        return sb.toString();
    }
}
