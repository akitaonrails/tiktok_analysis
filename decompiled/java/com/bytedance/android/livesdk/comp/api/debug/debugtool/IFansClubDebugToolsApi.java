package com.bytedance.android.livesdk.comp.api.debug.debugtool;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174708fZ;

/* JADX INFO: loaded from: classes.dex */
public interface IFansClubDebugToolsApi {
    @InterfaceC1501160pAQ
    C0X9S<String> changeFanScore(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("user_id") String str2, @InterfaceC1501070pAH("anchor_id") String str3, @InterfaceC1501070pAH("score") String str4);

    @InterfaceC1501160pAQ
    C0X9S<String> changeTaskScore(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("user_id") String str2, @InterfaceC1501070pAH("anchor_id") String str3, @InterfaceC1501070pAH("score") String str4, @InterfaceC1501070pAH("task_type") String str5);

    @InterfaceC1501160pAQ
    C0X9S<String> quickSleep(@InterfaceC2174708fZ String str, @InterfaceC1501070pAH("user_id") String str2, @InterfaceC1501070pAH("anchor_id") String str3);
}
