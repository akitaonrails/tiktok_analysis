package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network;

import X.InterfaceC1323360kXe;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes21.dex */
public interface INetworkUtilDependencyService extends IECommerceHostService {
    boolean isNetworkAvailable(Context context);

    boolean isWeakNetwork();

    boolean isWifi(Context context);

    void observerNetworkChange(InterfaceC1323360kXe interfaceC1323360kXe);

    void removeNetworkChangeObserver(InterfaceC1323360kXe interfaceC1323360kXe);
}
