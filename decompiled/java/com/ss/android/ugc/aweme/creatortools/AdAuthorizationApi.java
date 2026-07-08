package com.ss.android.ugc.aweme.creatortools;

import X.C0X9S;
import X.C742580TAy;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface AdAuthorizationApi {
    public static final C742580TAy LIZ = C742580TAy.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/ad/authorization/update/")
    C0X9S<String> requestAdAuthorization(@InterfaceC1501150pAP Map<String, Object> map);
}
