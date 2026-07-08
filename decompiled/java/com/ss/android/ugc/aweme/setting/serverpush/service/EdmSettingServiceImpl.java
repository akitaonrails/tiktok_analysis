package com.ss.android.ugc.aweme.setting.serverpush.service;

import X.C11NZ;
import X.C11S5;
import X.C19476611Hw;
import X.C2097608Jq;
import X.C358001aE;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.api.EdmSubscribeApi;
import com.ss.android.ugc.aweme.setting.serverpush.api.UpdateEdmSubscribeStatusRequest;
import com.ss.android.ugc.aweme.setting.serverpush.presenter.IEdmSettingService;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class EdmSettingServiceImpl implements IEdmSettingService {
    @Override // com.ss.android.ugc.aweme.setting.serverpush.presenter.IEdmSettingService
    public final C19476611Hw LIZ() {
        C11NZ<BaseResponse> c11nzUpdateEdmSubscribeStatus;
        Boolean bool = Boolean.TRUE;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("1", bool), new Pair("2", bool), new Pair("3", bool), new Pair("4", bool), new Pair("5", bool), new Pair("6", bool), new Pair("7", bool));
        EdmSubscribeApi.LIZ.getClass();
        EdmSubscribeApi edmSubscribeApi = C358001aE.LIZIZ;
        if (edmSubscribeApi == null || (c11nzUpdateEdmSubscribeStatus = edmSubscribeApi.updateEdmSubscribeStatus(new UpdateEdmSubscribeStatusRequest(mapLJIIIIZZ, false))) == null) {
            return null;
        }
        return c11nzUpdateEdmSubscribeStatus.LJL(C11S5.LIZ());
    }
}
