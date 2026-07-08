package com.ss.android.ugc.aweme.authorize;

import X.C0CQT;
import X.C0JEF;
import X.C823050WQl;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
public final class AwemeAuthorizePlatformDepend {
    public final AuthorizeApi LIZ = (AuthorizeApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(AuthorizeApi.class);
    public final ExecutorService LIZIZ = C823050WQl.LIZLLL();

    public interface AuthorizeApi {
        @InterfaceC1501160pAQ
        ListenableFuture<String> doGet(@InterfaceC2174708fZ String str);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR
        ListenableFuture<String> doPost(@InterfaceC2174708fZ String str, @InterfaceC1501150pAP Map<String, String> map);
    }

    public AwemeAuthorizePlatformDepend(C0JEF c0jef) {
        if (c0jef != null) {
            new WeakReference(c0jef);
        }
    }
}
