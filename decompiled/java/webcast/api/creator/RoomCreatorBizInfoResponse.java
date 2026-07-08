package webcast.api.creator;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor_data.HostFirstGiftInfo;
import tikcast.api.perception.ViolationStatusResponse;
import webcast.data.ColdStartStatData;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeViolationRecord;
import webcast.data.WhiteBoxData;

/* JADX INFO: loaded from: classes13.dex */
public final class RoomCreatorBizInfoResponse {

    @C09CT("data")
    public BizInfoData data;

    public static final class BizInfoData {

        @C09CT("live_center_realtime_overview_data")
        public BizInfoLiveCenterRealtimeOverview liveCenterRealtimeOverviewData;

        @C09CT("live_goal_get_data")
        public BizInfoLiveGoalGet liveGoalGetData;

        @C09CT("perception_violation_status")
        public BizInfoPerceptionViolationStatus perceptionViolationStatus;

        /* JADX INFO: loaded from: classes30.dex */
        public static final class BizInfoLiveCenterRealtimeOverview {

            @C09CT("base_info")
            public RealtimeLiveCenterBaseData baseInfo;

            @C09CT("cold_start_stat_data")
            public ColdStartStatData coldStartStatData;

            @C09CT("host_first_gift_info")
            public HostFirstGiftInfo hostFirstGiftInfo;

            @C09CT("room_id")
            public long roomId;

            @C09CT("violation_records")
            public List<RealtimeViolationRecord> violationRecords = new ArrayList();

            @C09CT("white_box_data")
            public WhiteBoxData whiteBoxData;
        }

        public static final class BizInfoLiveGoalGet {

            @C09CT("ongoing_goal")
            public LiveStreamGoal ongoingGoal;
        }

        public static final class BizInfoPerceptionViolationStatus {

            @C09CT("violation_status_response")
            public ViolationStatusResponse violationStatusResponse;
        }
    }
}
