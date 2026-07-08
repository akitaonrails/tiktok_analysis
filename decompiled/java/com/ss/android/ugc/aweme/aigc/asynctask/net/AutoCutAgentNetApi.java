package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes31.dex */
public interface AutoCutAgentNetApi {
    @InterfaceC1501170pAR("/api/aigc/autocutagent/canceltask")
    Object cancelTask(@InterfaceC1485405rg AutoCutAgentCancelTaskBody autoCutAgentCancelTaskBody, InterfaceC1364105Vn<? super AutoCutAgentCancelTaskResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/aigc/autocutagent/checkstatusbatch")
    Object checkStatus(@InterfaceC1501070pAH("request_id") String str, InterfaceC1364105Vn<? super AutoCutAgentCheckStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/aigc/autocutagent/generate")
    Object createAutoCutTask(@InterfaceC1485405rg AutoCutAgentTaskBody autoCutAgentTaskBody, InterfaceC1364105Vn<? super AutoCutAgentCreateTaskResponse> interfaceC1364105Vn);
}
