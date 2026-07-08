package com.ttnet.org.chromium.net;

import J.N;
import X.C786410Ut5;
import X.C787230UuP;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes14.dex */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    public final ConnectivityManager LIZ = (ConnectivityManager) C786410Ut5.H2(C787230UuP.LIZ, "connectivity");
    public final long LIZIZ;
    public boolean LIZJ;

    public void disableNotifications() {
        this.LIZJ = false;
        this.LIZ.removeDefaultNetworkActiveListener(this);
    }

    public void enableNotifications() {
        this.LIZJ = true;
        this.LIZ.addDefaultNetworkActiveListener(this);
    }

    public void fakeDefaultNetworkActive() {
        if (this.LIZJ) {
            onNetworkActive();
        }
    }

    public boolean isDefaultNetworkActive() {
        return this.LIZ.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        N.M5aI8A5Z(this.LIZIZ);
    }

    public NetworkActiveNotifier(long j) {
        this.LIZIZ = j;
    }

    public static NetworkActiveNotifier build(long j) {
        return new NetworkActiveNotifier(j);
    }
}
