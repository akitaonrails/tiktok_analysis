package com.ss.android.ugc.aweme.services;

import X.C0CQT;
import X.C0XDN;
import X.C1499850p8J;
import X.C7740030o;
import X.InterfaceC1445350niP;
import X.InterfaceC1904907d9;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkServiceImpl implements InterfaceC1445350niP {
    @Override // X.InterfaceC1445350niP
    public Gson getRetrofitFactoryGson() {
        return C7740030o.LIZ().getGson();
    }

    @Override // X.InterfaceC1445350niP
    public String getApiHost() {
        return C0CQT.LIZIZ;
    }

    @Override // X.InterfaceC1445350niP
    public <T> T createDefaultRetrofit(Class<T> cls) {
        return (T) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(getApiHost()).create(cls);
    }

    public void putCommonParams(HashMap<String, String> map, boolean z) {
        C0XDN.LIZJ(map, z);
    }

    @Override // X.InterfaceC1445350niP
    public <T> T retrofitCreate(String str, Class<T> cls) {
        return (T) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(str).create(cls);
    }

    @Override // X.InterfaceC1445350niP
    public <T> T createRetrofit(String str, boolean z, Class<T> cls) {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        if (!z) {
            c1499850p8JCreateBuilder.LIZJ = true;
        } else {
            c1499850p8JCreateBuilder.getClass();
        }
        return (T) c1499850p8JCreateBuilder.build().retrofit.LIZ(cls);
    }

    @Override // X.InterfaceC1445350niP
    public <T> T createRetrofitWithInterceptors(String str, boolean z, Class<T> cls, List<? extends InterfaceC1904907d9> list) {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str);
        if (!z) {
            c1499850p8JCreateBuilder.LIZJ = true;
        } else {
            c1499850p8JCreateBuilder.getClass();
        }
        c1499850p8JCreateBuilder.LJFF(list);
        return (T) c1499850p8JCreateBuilder.build().retrofit.LIZ(cls);
    }
}
