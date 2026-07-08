package webcast.api.partnership;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorCheckAndJoinEventResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("fail_reason_list")
        public List<Integer> failReasonList;

        @C09CT("fans_limit")
        public int fansLimit;

        @C09CT("game_name")
        public String gameName = "";

        @C09CT("has_joined_task_mode_list")
        public List<Integer> hasJoinedTaskModeList;

        @C09CT("has_joined_task_type_list")
        public List<Integer> hasJoinedTaskTypeList;

        @C09CT("join_success")
        public boolean joinSuccess;
    }
}
