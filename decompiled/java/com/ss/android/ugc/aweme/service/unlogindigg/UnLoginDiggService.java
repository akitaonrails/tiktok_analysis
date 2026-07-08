package com.ss.android.ugc.aweme.service.unlogindigg;

import X.AbstractC19484711Kz;
import X.C742530TAt;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class UnLoginDiggService implements IUnLoginDiggService {
    @Override // com.ss.android.ugc.aweme.service.unlogindigg.IUnLoginDiggService
    public final AbstractC19484711Kz<UnLoggedDiggResponse> LIZ(Map<String, String> map) {
        C742530TAt.LIZ.getClass();
        ((HashMap) map).put("device_id", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        return C742530TAt.LIZIZ.LIZ(map);
    }
}
