package com.bytedance.android.livesdk.api;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.smb.SMBGoLivePageResponse;

/* JADX INFO: loaded from: classes.dex */
public interface LivePCSPermissionAPI {
    @InterfaceC1501160pAQ("/webcast/smb/go_live_page/")
    Object goLivePageApi(@InterfaceC1501070pAH("need_verification_info") boolean z, InterfaceC1364105Vn<? super C470590Icr<SMBGoLivePageResponse.Data>> interfaceC1364105Vn);
}
