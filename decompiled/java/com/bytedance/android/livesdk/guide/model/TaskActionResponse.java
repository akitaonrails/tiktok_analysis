package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TaskActionResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("monitor_tag")
        public String monitorTag = "";

        @C09CT("task_infos")
        public List<TaskInfo> taskInfos = new ArrayList();

        @C09CT("target_users")
        public List<UserBaseData> targetUsers = new ArrayList();

        @C09CT("toast")
        public Map<String, String> toast = new LinkedHashMap();

        @C09CT("task_process")
        public List<TaskProcess> taskProcess = new ArrayList();
    }

    public static final class TaskProcess {

        @C09CT("completed_num")
        public long completedNum;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("target_id")
        public String targetId = "";

        @C09CT("target_num")
        public long targetNum;

        @C09CT("target_type")
        public int targetType;

        @C09CT("task_biz_type")
        public int taskBizType;
    }
}
