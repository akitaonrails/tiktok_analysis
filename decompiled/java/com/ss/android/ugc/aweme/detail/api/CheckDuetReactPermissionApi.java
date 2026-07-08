package com.ss.android.ugc.aweme.detail.api;

import X.C0X9S;
import X.C2188811AlT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;

/* JADX INFO: loaded from: classes35.dex */
public final class CheckDuetReactPermissionApi {
    public static final String LIZ;

    public interface CheckDuetReactPermissionRequest {
        @InterfaceC1501160pAQ("/aweme/v1/permission/check/")
        C0X9S<CheckDuetReactPermissionResponse> checkDuetReactPermission(@InterfaceC1501070pAH("aweme_id") String str, @InterfaceC1501070pAH("check_type") int i);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
