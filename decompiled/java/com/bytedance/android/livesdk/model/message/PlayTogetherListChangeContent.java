package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.game.model.PlayTogetherMember;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlayTogetherListChangeContent {

    @C09CT("apply_list_members")
    public List<PlayTogetherMember> applyListMembers = new ArrayList();

    @C09CT("history_list_members")
    public List<PlayTogetherMember> historyListMembers = new ArrayList();

    @C09CT("pick_list_members")
    public List<PlayTogetherMember> pickListMembers = new ArrayList();

    @C09CT("service_time")
    public long serviceTime;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyListMembers: ");
        sbLIZ.append(this.applyListMembers);
        sbLIZ.append(", \n historyListMembers: ");
        sbLIZ.append(this.historyListMembers);
        sbLIZ.append(", \n pickListMembers: ");
        sbLIZ.append(this.pickListMembers);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
