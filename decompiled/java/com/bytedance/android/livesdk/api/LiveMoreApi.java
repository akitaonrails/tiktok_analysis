package com.bytedance.android.livesdk.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import tikcast.api.anchor.ActionResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface LiveMoreApi {
    @InterfaceC1501170pAR("/webcast/anchor/action/")
    C11NZ<C470590Icr<ActionResponse>> updateMoreClickStatus(@InterfaceC1501070pAH("action_type") int i, @InterfaceC1501070pAH("action") int i2);
}
