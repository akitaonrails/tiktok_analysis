package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskRewardResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_next_task_period")
        public boolean hasNextTaskPeriod;

        @C09CT("task_operate_infos")
        public List<TaskOperateInfo> taskOperateInfos = new ArrayList();

        @C09CT("monitor_tag")
        public String monitorTag = "";
    }
}
