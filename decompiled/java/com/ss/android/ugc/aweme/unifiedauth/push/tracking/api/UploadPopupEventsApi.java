package com.ss.android.ugc.aweme.unifiedauth.push.tracking.api;

import X.C10GT;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes29.dex */
public interface UploadPopupEventsApi {
    public static final C10GT LIZ = C10GT.LIZ;

    @InterfaceC1501170pAR("/cloudpush/callback/client_authority_popup/")
    C11NZ<UploadPopupEventsResponse> uploadPopupEvents(@InterfaceC1485405rg UploadPopupEventsRequest uploadPopupEventsRequest);
}
