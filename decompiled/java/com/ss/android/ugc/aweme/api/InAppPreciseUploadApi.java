package com.ss.android.ugc.aweme.api;

import X.C0WW4;
import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes14.dex */
public interface InAppPreciseUploadApi {
    public static final C0WW4 Companion = C0WW4.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/unification/privacy/user/device/settings/update/v1")
    C11NZ<BaseResponse> uploadInAppStatusInner(@InterfaceC1501050pAF("field") String str, @InterfaceC1501050pAF("value") int i);
}
