package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Task {

    @C09CT("curr_repeated_times")
    public long currRepeatedTimes;

    @C09CT("target_repeat_times")
    public long targetRepeatTimes;

    @C09CT("task_meta_data")
    public TaskMetaData taskMetaData;

    @C09CT("task_status")
    public int taskStatus;

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("task_condition")
    public String taskCondition = "";

    @C09CT("rewards_list")
    public List<Reward> rewardsList = new ArrayList();

    @C09CT("value")
    public String value = "";

    @C09CT("target_value")
    public String targetValue = "";

    @C09CT("tasks_list")
    public List<Task> tasksList = new ArrayList();

    @C09CT("biz_data")
    public Map<String, String> bizData = new LinkedHashMap();

    @C09CT("biz_data_v2")
    public String bizDataV2 = "";
}
