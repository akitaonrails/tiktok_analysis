package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network;

import X.InterfaceC1323360kXe;
import android.content.Context;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultNetworkUtilDependencyService implements INetworkUtilDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public boolean isNetworkAvailable(Context context) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public boolean isWeakNetwork() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public boolean isWifi(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public void observerNetworkChange(InterfaceC1323360kXe interfaceC1323360kXe) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService
    public void removeNetworkChangeObserver(InterfaceC1323360kXe interfaceC1323360kXe) {
    }
}
