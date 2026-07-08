package com.ss.android.ugc.aweme.unifiedauth.api;

import X.C11NZ;
import X.C496101wV;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.unifiedauthapi.model.ServerIntelligentRequest;
import com.ss.android.ugc.aweme.unifiedauthapi.model.ServerIntelligentResponse;

/* JADX INFO: loaded from: classes.dex */
public interface PushServerIntelligentApi {
    public static final C496101wV LIZ = C496101wV.LIZ;

    @InterfaceC1501170pAR("/cloudpush/popup_model")
    C11NZ<ServerIntelligentResponse> requestServerIntelligent(@InterfaceC1485405rg ServerIntelligentRequest serverIntelligentRequest);
}
