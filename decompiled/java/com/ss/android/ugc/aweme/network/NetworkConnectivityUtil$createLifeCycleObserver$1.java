package com.ss.android.ugc.aweme.network;

import X.C098200Yq;
import X.C189200o6;
import X.C356901a3;
import X.C805620Viy;
import X.InterfaceC565580MGe;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkConnectivityUtil$createLifeCycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final C805620Viy LL;
    public final /* synthetic */ ConnectivityManager LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final void LIZ() {
        try {
            this.LLILLJJLI.unregisterNetworkCallback(this.LL);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        LIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        LIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLILLJJLI.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(3).build(), this.LL);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Viy] */
    public NetworkConnectivityUtil$createLifeCycleObserver$1(ConnectivityManager connectivityManager, final InterfaceC565580MGe interfaceC565580MGe) {
        this.LLILLJJLI = connectivityManager;
        this.LL = new ConnectivityManager.NetworkCallback() { // from class: X.0Viy
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                interfaceC565580MGe.LIZ(EnumC565560MGc.UNAVAILABLE);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                super.onCapabilitiesChanged(network, networkCapabilities);
                if (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3)) {
                    interfaceC565580MGe.LIZ(EnumC565560MGc.AVAILABLE);
                }
            }
        };
    }
}
