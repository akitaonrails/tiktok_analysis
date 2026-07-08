package com.ss.android.ugc.aweme.unifiedauth.api;

import X.C0CQK;
import X.C11NZ;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.unifiedauthapi.model.EdmSubscribeStatusResp;

/* JADX INFO: loaded from: classes5.dex */
public interface UnifiedAuthEdmApi {
    public static final C0CQK LIZ = C0CQK.LIZ;

    @InterfaceC1501160pAQ("/settings/emailpreferences")
    C11NZ<EdmSubscribeStatusResp> getEmailSubscribeStatus();
}
