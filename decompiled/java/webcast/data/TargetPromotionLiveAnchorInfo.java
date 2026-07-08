package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TargetPromotionLiveAnchorInfo {

    @C09CT("current_stage")
    public long currentStage;

    @C09CT("event_expire_left_time")
    public long eventExpireLeftTime;

    @C09CT("is_event_expired")
    public boolean isEventExpired;

    @C09CT("join_time")
    public long joinTime;

    @C09CT("stage_info_list")
    public List<TargetPromotionLiveAnchorStageInfo> stageInfoList = new ArrayList();

    @C09CT("event_name")
    public String eventName = "";
}
