package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class PlayTogetherMember {

    @C09CT("accept_time")
    public long acceptTime;

    @C09CT("application_id")
    public long applicationId;

    @C09CT("apply_time")
    public long applyTime;

    @C09CT("is_creator_follow")
    public boolean isCreatorFollow;

    @C09CT("is_recent_picked")
    public boolean isRecentPicked;

    @C09CT("is_send_gift")
    public boolean isSendGift;

    @C09CT("rank_point")
    public long rankPoint;

    @C09CT("relation_tag_enum")
    public int relationTagEnum;

    @C09CT("user_id")
    public String userId = "";

    @C09CT("avatar")
    public String avatar = "";

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("apply_message")
    public String applyMessage = "";

    @C09CT("relation_tag")
    public String relationTag = "";

    @C09CT("application_id_str")
    public String applicationIdStr = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("userId : ");
        sbLIZ.append(this.userId);
        sbLIZ.append(" \t acceptTime: ");
        sbLIZ.append(this.acceptTime);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
