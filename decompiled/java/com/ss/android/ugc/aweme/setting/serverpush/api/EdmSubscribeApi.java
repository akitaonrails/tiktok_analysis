package com.ss.android.ugc.aweme.setting.serverpush.api;

import X.C11NZ;
import X.C358001aE;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface EdmSubscribeApi {
    public static final C358001aE LIZ = C358001aE.LIZ;

    @InterfaceC1501170pAR("settings/emailpreferences/set")
    C11NZ<BaseResponse> updateEdmSubscribeStatus(@InterfaceC1485405rg UpdateEdmSubscribeStatusRequest updateEdmSubscribeStatusRequest);
}
