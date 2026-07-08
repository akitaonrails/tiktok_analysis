package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipInfo {

    @C09CT("game_info_list")
    public List<PartnershipGameInfo> gameInfoList;

    @C09CT("partnership_room")
    public Boolean partnershipRoom;

    @C09CT("promoting_room")
    public boolean promotingRoom;

    @C09CT("promoting_task_type")
    public int promotingTaskType;

    @C09CT("show_task_type")
    public int showTaskType;

    @C09CT("task_id_list")
    public List<String> taskIdList;

    @C09CT("show_task_id")
    public String showTaskId = "";

    @C09CT("promoting_task_id")
    public String promotingTaskId = "";

    @C09CT("promoting_drops_id")
    public String promotingDropsId = "";

    @C09CT("promoting_game_id")
    public String promotingGameId = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.partnershipRoom != null) {
            sb.append(", partnership_room=");
            sb.append(this.partnershipRoom);
        }
        if (this.promotingTaskId != null) {
            sb.append(", promoting_task_id=");
            sb.append(this.promotingTaskId);
        }
        List<String> list = this.taskIdList;
        if (list != null && !list.isEmpty()) {
            sb.append(", task_id_list=");
            sb.append(this.taskIdList);
        }
        sb.replace(0, 2, "PartnershipInfo{");
        sb.append('}');
        return sb.toString();
    }
}
