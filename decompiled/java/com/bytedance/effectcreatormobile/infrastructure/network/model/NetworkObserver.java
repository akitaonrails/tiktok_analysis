package com.bytedance.effectcreatormobile.infrastructure.network.model;

import X.AnonymousClass0951;
import X.C054G;
import X.C09IC;
import X.C0PEM;
import X.C1706630uVp;
import X.C1BNE;
import X.C1DFK;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C356901a3;
import X.C786410Ut5;
import X.C789920Uyk;
import X.C805570Vit;
import X.C805600Viw;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.effectcreatormobile.infrastructure.network.model.NetworkObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final Context LL;
    public final Lifecycle LLILLJJLI;
    public C789920Uyk LLILLL;
    public ConnectivityManager LLILZ;
    public final HashSet<Network> LLILZIL = new HashSet<>();
    public C1DFK LLILZLL;
    public C054G LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final AtomicBoolean LLJ;
    public final AnonymousClass0951 LLJI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZ() {
        C054G c054g = this.LLIZ;
        if (c054g == null) {
            c054g = null;
        }
        C23250099c.LIZLLL(c054g, null, null, new C805570Vit(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        this.LLILZ = (ConnectivityManager) C786410Ut5.H2(this.LL, "connectivity");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Uyk] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        ConnectivityManager connectivityManager;
        C356901a3.LJ(this, lifecycleOwner);
        if (this.LLILLJJLI.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            C1DFK c1dfkLIZ = C23118094a.LIZ();
            this.LLILZLL = c1dfkLIZ;
            this.LLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(c1dfkLIZ));
            this.LLILLL = new ConnectivityManager.NetworkCallback() { // from class: X.0Uyk
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) {
                    NetworkCapabilities networkCapabilitiesLJLJL;
                    ConnectivityManager connectivityManager2 = this.LIZ.LLILZ;
                    if (connectivityManager2 != null && (networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager2, network, new C0WZX("dzBzEgAjS8/YVFkiQFyBYEX3a2w90uwm6aLMSbFiJWE1UvIsGBUlSnj4PBTU1O2EsPSD6WONRQ1LfhnFANcIYVq08EFEGj84wydFbcKR", null))) != null) {
                        NetworkObserver networkObserver = this.LIZ;
                        if (networkCapabilitiesLJLJL.hasCapability(12)) {
                            networkObserver.LLILZIL.add(network);
                        }
                        networkObserver.LIZ();
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
                    super.onLost(network);
                    this.LIZ.LLILZIL.remove(network);
                    this.LIZ.LIZ();
                }
            };
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
            C789920Uyk c789920Uyk = this.LLILLL;
            if (c789920Uyk != null && (connectivityManager = this.LLILZ) != null) {
                connectivityManager.registerNetworkCallback(networkRequestBuild, c789920Uyk);
            }
        }
        LIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        ConnectivityManager connectivityManager;
        C356901a3.LJFF(this, lifecycleOwner);
        try {
            this.LLILZIL.clear();
            C789920Uyk c789920Uyk = this.LLILLL;
            if (c789920Uyk != null && (connectivityManager = this.LLILZ) != null) {
                connectivityManager.unregisterNetworkCallback(c789920Uyk);
            }
            C1DFK c1dfk = this.LLILZLL;
            if (c1dfk == null) {
                c1dfk = null;
            }
            c1dfk.LIZIZ(null);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unregisterNetworkCallback error: ");
            sbLIZ.append(e.getMessage());
            C1706630uVp.LIZJ("NetworkObserver", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public NetworkObserver(Context context, Lifecycle lifecycle) {
        this.LL = context;
        this.LLILLJJLI = lifecycle;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C805600Viw.LIZ);
        this.LLIZLLLIL = c2252321DDqLIZ;
        this.LLJ = new AtomicBoolean(true);
        this.LLJI = C09IC.LIZIZ(c2252321DDqLIZ);
    }
}
