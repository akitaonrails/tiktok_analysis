package com.ss.android.ugc.aweme.serviceplugin;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C04TD;
import X.C312920COk;
import X.C452501pT;
import X.InterfaceC1826810xdf;
import X.InterfaceC747670TUn;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.serviceplugin.api.ServicePluginPlatformBindingCreateApi;
import com.ss.android.ugc.aweme.serviceplugin.api.ServicePluginPlatformBindingCreateApiRequest;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class ServicePluginPlatformManager implements IServicePluginPlatformManager {
    public final IRetrofit LIZ = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C312920COk.LIZ);
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 64));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 65));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 66));

    public static IServicePluginPlatformManager LIZJ() {
        Object objLIZ = C04TD.LIZ(IServicePluginPlatformManager.class, false);
        if (objLIZ != null) {
            return (IServicePluginPlatformManager) objLIZ;
        }
        if (C04TD.v4 == null) {
            synchronized (IServicePluginPlatformManager.class) {
                if (C04TD.v4 == null) {
                    C04TD.v4 = new ServicePluginPlatformManager();
                }
            }
        }
        return C04TD.v4;
    }

    @Override // com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager
    public final AbstractC19484711Kz LIZ() {
        return ((InterfaceC1826810xdf) this.LIZLLL.getValue()).LIZ(0, 0);
    }

    @Override // com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager
    public final AbstractC19484711Kz LLLF(String str) {
        return ((InterfaceC747670TUn) this.LIZIZ.getValue()).LIZ(str, 0);
    }

    @Override // com.ss.android.ugc.aweme.serviceplugin.IServicePluginPlatformManager
    public final AbstractC19484711Kz LIZIZ(Integer num, String str, String str2) {
        return ((ServicePluginPlatformBindingCreateApi) this.LIZJ.getValue()).create(new ServicePluginPlatformBindingCreateApiRequest(str, str2, num));
    }
}
