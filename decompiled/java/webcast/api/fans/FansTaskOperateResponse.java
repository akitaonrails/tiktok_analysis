package webcast.api.fans;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import webcast.data.CelebrationPrivilege;
import webcast.data.FansClubTeamMissionDetails;
import webcast.data.FansLevelInfo;
import webcast.data.TaskMeta;

/* JADX INFO: loaded from: classes8.dex */
public final class FansTaskOperateResponse {

    @C09CT("data")
    public Data data;

    public static final class ClaimPointsData {

        @C09CT("batch_claim_results")
        public List<PerTaskClaimResult> batchClaimResults = new ArrayList();

        @C09CT("celebration_privilege")
        public CelebrationPrivilege celebrationPrivilege;

        @C09CT("collected_points")
        public long collectedPoints;

        @C09CT("team_mission_details")
        public FansClubTeamMissionDetails teamMissionDetails;

        @C09CT("updated_fans_level")
        public FansLevelInfo updatedFansLevel;

        @C09CT("updated_task")
        public TaskMeta updatedTask;
    }

    public static final class Common {

        @C09CT("updated_fans_level")
        public FansLevelInfo updatedFansLevel;
    }

    public static final class Data {

        @C09CT("claim_points_data")
        public ClaimPointsData claimPointsData;

        @C09CT("common")
        public Common common;

        @C09CT("im_message_data")
        public ImMessageData imMessageData;
    }

    public static final class ImMessageData {

        @C09CT("message_id_str")
        public String messageIdStr = "";
    }

    public static final class PerTaskClaimResult {

        @C09CT("collected_points")
        public long collectedPoints;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("task_type")
        public String taskType = "";

        @C09CT("updated_task")
        public TaskMeta updatedTask;
    }
}
