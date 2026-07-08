package com.ss.android.ugc.aweme.psp;

import X.C1886900zCa;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.bean.CompleteGameplayRequestBody;
import com.ss.android.ugc.aweme.bean.CompleteGameplayResponse;
import com.ss.android.ugc.aweme.bean.CompleteTaskRequestBody;
import com.ss.android.ugc.aweme.bean.CompleteTaskResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface ICampaignPSPTaskCompleteApi {
    public static final C1886900zCa LIZ = C1886900zCa.LIZ;

    @InterfaceC1501170pAR("/tiktok/intelligent/campaign/gameplay/trigger/")
    Object completeGameplay(@InterfaceC1501070pAH("campaign_id") String str, @InterfaceC1501070pAH("gameplay_id") String str2, @InterfaceC1485405rg CompleteGameplayRequestBody completeGameplayRequestBody, InterfaceC1364105Vn<? super CompleteGameplayResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/intelligent/campaign/task/complete/")
    Object completeTask(@InterfaceC1501070pAH("campaign_id") long j, @InterfaceC1501070pAH("task_name") String str, @InterfaceC1485405rg CompleteTaskRequestBody completeTaskRequestBody, InterfaceC1364105Vn<? super CompleteTaskResponse> interfaceC1364105Vn);
}
