package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinkerInviteMessageExtra {

    @C09CT("algo_request_id")
    public String algoRequestId = "";

    @C09CT("duration")
    public int duration;

    @C09CT("invite_type")
    public int inviteType;

    @C09CT("extra")
    public InviterRivalExtra inviterRivalExtra;

    @C09CT("layout")
    public int layout;

    @C09CT("match_type")
    public int matchType;

    @C09CT("other_users")
    public List<InviterRivalExtra> otherRivalExtra;

    @C09CT("sub_type")
    public int subType;

    @C09CT("theme")
    public String theme;

    @C09CT("tips")
    public String tips;

    @C09CT("topic_info")
    public CohostTopic topicInfo;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkerInviteMessageExtra{matchType=");
        sbLIZ.append(this.matchType);
        sbLIZ.append(", inviteType=");
        sbLIZ.append(this.inviteType);
        sbLIZ.append(", subType=");
        sbLIZ.append(this.subType);
        sbLIZ.append(", theme='");
        sbLIZ.append(this.theme);
        sbLIZ.append('\'');
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(", tips='");
        sbLIZ.append(this.tips);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
