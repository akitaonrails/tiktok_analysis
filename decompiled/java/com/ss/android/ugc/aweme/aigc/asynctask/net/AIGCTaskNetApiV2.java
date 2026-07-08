package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C558020Lua;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface AIGCTaskNetApiV2 {
    public static final C558020Lua LIZ = C558020Lua.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/aigc/tasks/discard")
    Object cancelAIGCTask(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg TaskDiscardBody taskDiscardBody, InterfaceC1364105Vn<Object> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/aigc/generate")
    Object createAIGCTask(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg CreateTaskBody createTaskBody, InterfaceC1364105Vn<? super CreateTaskResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/aigc/generate")
    @InterfaceC1501310pAf({"CONNECT_TIMEOUT:60000", "READ_TIMEOUT:60000", "WRITE_TIMEOUT:60000"})
    Object createAIGCTaskWithTimeout(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg CreateTaskBody createTaskBody, InterfaceC1364105Vn<? super CreateTaskResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/aigc/quota")
    Object getAIGCQuota(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1501070pAH("aigc_ids") List<Long> list, @InterfaceC1501070pAH("job_type") String str2, @InterfaceC1501070pAH("business_scene") String str3, InterfaceC1364105Vn<? super QuotaResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/aigc/quota_list")
    Object getAIGCQuotaList(@InterfaceC1485405rg QuotaListTaskBody quotaListTaskBody, InterfaceC1364105Vn<? super QuotaListResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/aigc/tasks")
    Object getAIGCTaskList(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1501070pAH("task_ids") List<String> list, @InterfaceC1501070pAH("style_ids") List<String> list2, @InterfaceC1501070pAH("filter_status") List<Integer> list3, @InterfaceC1501070pAH("cursor") Integer num, @InterfaceC1501070pAH("count") Integer num2, @InterfaceC1501070pAH("need_waiting_detail") Boolean bool, @InterfaceC1501070pAH("need_style_detail") Boolean bool2, @InterfaceC1501070pAH("job_type") String str2, InterfaceC1364105Vn<? super TasksDetailResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/aigc/prompt_suggest")
    Object getSuggestPrompts(@InterfaceC1501070pAH("biz") int i, @InterfaceC1501070pAH("limit") int i2, @InterfaceC1501070pAH("input") String str, @InterfaceC1501070pAH("source") Integer num, InterfaceC1364105Vn<? super SuggestPromptsResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/aigc/notify_quota_refresh")
    Object notifyQuotaRefresh(@InterfaceC1485405rg QuotaRefreshBody quotaRefreshBody, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/aigc/prompt_suggest")
    Object requestSuggestPromptsWithImage(@InterfaceC1485405rg SuggestPromptsWithImageBody suggestPromptsWithImageBody, InterfaceC1364105Vn<? super SuggestPromptsWithImageResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/aigc/ep_report")
    Object submitAIGCReport(@InterfaceC1485405rg ReportTaskBody reportTaskBody, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
