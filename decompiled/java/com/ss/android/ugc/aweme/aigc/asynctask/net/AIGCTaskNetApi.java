package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C558130Lul;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes9.dex */
public interface AIGCTaskNetApi {
    public static final C558130Lul LIZ = C558130Lul.LIZ;

    @InterfaceC1501170pAR("/editing/aigc/task/item")
    Object createAIGCTask(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg CreateAIGCTaskBody createAIGCTaskBody, InterfaceC1364105Vn<? super CreateAIGCTaskResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/editing/aigc/quota")
    Object getAIGCQuota(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg GetAIGCQuotaBody getAIGCQuotaBody, InterfaceC1364105Vn<? super GetAIGCQuotaResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/editing/aigc/task/list")
    Object getAIGCTaskDetail(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg GetAIGCTaskDetailBody getAIGCTaskDetailBody, InterfaceC1364105Vn<? super UpdateAIGCTaskStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/editing/aigc/task/status")
    Object updateAIGCTaskStatus(@InterfaceC1501070pAH("app_version") String str, @InterfaceC1485405rg UpdateAIGCTaskStatusBody updateAIGCTaskStatusBody, InterfaceC1364105Vn<? super UpdateAIGCTaskStatusResponse> interfaceC1364105Vn);
}
