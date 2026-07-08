package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorTaskRecordV2 {

    @C09CT("create_time")
    public long createTime;

    @C09CT("reward_num")
    public long rewardNum;

    @C09CT("reward_status")
    public int rewardStatus;

    @C09CT("task_effective_time")
    public long taskEffectiveTime;

    @C09CT("task_expire_time")
    public long taskExpireTime;

    @C09CT("task_progress")
    public AnchorTaskRecordV2Progress taskProgress;

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("task_type")
    public int taskType;

    @C09CT("update_time")
    public long updateTime;

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("record_id")
    public String recordId = "";

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("task_info_extra")
    public String taskInfoExtra = "";

    @C09CT("extra")
    public Map<String, String> extra = new LinkedHashMap();

    @C09CT("biz_key")
    public String bizKey = "";
}
