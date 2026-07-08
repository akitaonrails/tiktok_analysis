package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C557830LuH;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface AIGCWorkflowNetApi {
    public static final C557830LuH LIZ = C557830LuH.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/aigc/tasks/discard")
    Object cancelAIGCTask(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg TaskDiscardBody taskDiscardBody, InterfaceC1364105Vn<Object> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/aigc/generate")
    @InterfaceC1501310pAf({"CONNECT_TIMEOUT:60000", "READ_TIMEOUT:60000", "WRITE_TIMEOUT:60000"})
    Object createAIGCTaskWithTimeout(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg CreateTaskBody createTaskBody, InterfaceC1364105Vn<? super CreateTaskResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/aigc/generate")
    @InterfaceC1501310pAf({"CONNECT_TIMEOUT:60000", "READ_TIMEOUT:60000", "WRITE_TIMEOUT:60000"})
    Object generateAIGCTaskWithTimeout(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg GenerateTaskBody generateTaskBody, InterfaceC1364105Vn<? super CreateTaskResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/aigc/quota")
    Object getAIGCQuota(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1501070pAH("aigc_ids") List<Long> list, @InterfaceC1501070pAH("job_type") String str2, @InterfaceC1501070pAH("business_scene") String str3, InterfaceC1364105Vn<? super QuotaResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/aigc/tasks")
    Object getAIGCTaskList(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1501070pAH("task_ids") List<String> list, @InterfaceC1501070pAH("style_ids") List<String> list2, @InterfaceC1501070pAH("filter_status") List<Integer> list3, @InterfaceC1501070pAH("cursor") Integer num, @InterfaceC1501070pAH("count") Integer num2, @InterfaceC1501070pAH("need_waiting_detail") Boolean bool, @InterfaceC1501070pAH("need_style_detail") Boolean bool2, @InterfaceC1501070pAH("job_type") String str2, InterfaceC1364105Vn<? super TasksDetailResponse> interfaceC1364105Vn);
}
