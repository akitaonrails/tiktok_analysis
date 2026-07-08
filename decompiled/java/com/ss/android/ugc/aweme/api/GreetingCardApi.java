package com.ss.android.ugc.aweme.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface GreetingCardApi {
    @InterfaceC1501240pAY("/tiktok/v1/im/interactive_task/update/")
    @InterfaceC1501300pAe
    Object updateGreetingCard(@InterfaceC1501100pAK("task_type") int i, @InterfaceC1501100pAK("task_id") long j, @InterfaceC1501100pAK("conversation_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
