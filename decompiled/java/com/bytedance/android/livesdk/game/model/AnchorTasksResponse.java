package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorTasksResponse {

    @C09CT("ended_profit_infos")
    public List<TaskProfitInfo> endedProfitInfos;

    @C09CT("gamepad_show_status")
    public int gamepadShowStatus;

    @C09CT("live_promote_ban_banner_text")
    public String livePromoteBanBannerText;

    @C09CT("maximum_task_num")
    public int maximum_task_num;

    @C09CT("promoting_profit_infos")
    public List<TaskProfitInfo> promotingProfitInfos;

    @C09CT("punish_event_info")
    public PunishEventInfo punishEventInfo;

    @C09CT("punished_ended_profit_infos")
    public List<TaskProfitInfo> punishedEndedProfitInfos;

    public AnchorTasksResponse() {
        this(0, null, null, 7, null);
    }

    public AnchorTasksResponse(int i, List<TaskProfitInfo> list, List<TaskProfitInfo> list2) {
        this.maximum_task_num = i;
        this.promotingProfitInfos = list;
        this.endedProfitInfos = list2;
        this.punishedEndedProfitInfos = new ArrayList();
    }

    public AnchorTasksResponse(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
