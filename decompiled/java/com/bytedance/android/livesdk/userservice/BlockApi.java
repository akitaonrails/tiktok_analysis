package com.bytedance.android.livesdk.userservice;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public interface BlockApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/user/relation/block_status/update/")
    C11NZ<C470590Icr<Unit>> unblock(@InterfaceC1501050pAF("block_type") int i, @InterfaceC1501050pAF("target_uid") long j, @InterfaceC1501050pAF("sec_target_uid") String str);
}
