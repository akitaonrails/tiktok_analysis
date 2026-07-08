package com.ss.android.ugc.aweme.unifiedauth.api;

import X.C0CQJ;
import X.C11NZ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupInfoResp;

/* JADX INFO: loaded from: classes5.dex */
public interface UnifiedAuthConfigApi {
    public static final C0CQJ LIZ = C0CQJ.LIZ;

    @InterfaceC1501170pAR("/notification/authorization/config")
    C11NZ<UnifiedAuthPopupInfoResp> getPopupConfigs();
}
