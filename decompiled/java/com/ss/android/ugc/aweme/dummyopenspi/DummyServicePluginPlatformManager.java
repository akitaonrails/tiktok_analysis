package com.ss.android.ugc.aweme.dummyopenspi;

import X.AbstractC19484711Kz;
import com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager;
import com.ss.android.ugc.aweme.serviceplugin.entity.ServicePluginBindingCreateResponse;
import com.ss.android.ugc.aweme.serviceplugin.entity.ServicePluginPlatformBindingResponse;
import com.ss.android.ugc.aweme.serviceplugin.entity.ServicePluginUrlValidateResponse;

/* JADX INFO: loaded from: classes13.dex */
public final class DummyServicePluginPlatformManager implements IServicePluginPlatformManager {
    @Override // com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager
    public final AbstractC19484711Kz LIZ() {
        return AbstractC19484711Kz.LJIJJLI(new ServicePluginPlatformBindingResponse(0, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager
    public final AbstractC19484711Kz LLLF(String str) {
        return AbstractC19484711Kz.LJIJJLI(new ServicePluginUrlValidateResponse(0, null, null, null, null));
    }

    @Override // com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager
    public final AbstractC19484711Kz LIZIZ(Integer num, String str, String str2) {
        return AbstractC19484711Kz.LJIJJLI(new ServicePluginBindingCreateResponse(0, null, null));
    }
}
