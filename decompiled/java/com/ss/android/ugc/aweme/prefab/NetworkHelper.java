package com.ss.android.ugc.aweme.prefab;

import X.C036E;
import X.C0H62;
import X.C11NZ;
import X.C1701940uOG;
import X.C1749280vcc;
import X.C19EG;
import X.C627460OjI;
import X.C786410Ut5;
import X.InterfaceC420801kM;
import X.InterfaceC626120Oh8;
import android.app.Activity;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.prefab.NetworkHelper;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class NetworkHelper implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public final Activity LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final long LLIZLLLIL;
    public final LifecycleOwner LLJ;
    public C627460OjI LLJI;
    public InterfaceC420801kM LLJIJIL;
    public long LLJILJIL;

    public NetworkHelper() {
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onFragmentDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onFragmentDestroy() {
        Lifecycle lifecycle;
        InterfaceC420801kM interfaceC420801kM = this.LLJIJIL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        LifecycleOwner lifecycleOwner = this.LLJ;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    public final void LIZIZ(C1749280vcc c1749280vcc) {
        C627460OjI c627460OjI = this.LLJI;
        if (c627460OjI != null) {
            C036E.LIZ.LIZLLL(c627460OjI);
        }
        InterfaceC420801kM interfaceC420801kM = this.LLJIJIL;
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            this.LLJIJIL.dispose();
        }
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0OjI] */
    public final void LIZ(Throwable th, C1749280vcc c1749280vcc) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJIL;
        this.LLJI = new C0H62() { // from class: X.0OjI
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                if (c0o0l2 == C0O0L.AVAILABLE) {
                    Function0<Unit> function0 = this.LL.LL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    InterfaceC420801kM interfaceC420801kM = this.LL.LLJIJIL;
                    if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                        interfaceC420801kM.dispose();
                    }
                    C036E.LIZ.LIZLLL(this.LL.LLJI);
                }
            }
        };
        long j = this.LLIZLLLIL;
        Exception exc = null;
        if (jCurrentTimeMillis >= j) {
            if (th instanceof Exception) {
                exc = (Exception) th;
            }
            LIZJ(c1749280vcc, exc, 0L);
        } else {
            if (th instanceof Exception) {
                exc = (Exception) th;
            }
            LIZJ(c1749280vcc, exc, j - jCurrentTimeMillis);
            C036E.LIZ.LIZ(this.LLJI);
        }
    }

    public final void LIZJ(final C1749280vcc c1749280vcc, final Exception exc, long j) {
        C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJL(C1701940uOG.LIZIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<Long>() { // from class: X.0OjH
            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                NetworkHelper networkHelper = this.LL;
                InterfaceC420801kM interfaceC420801kM = networkHelper.LLJIJIL;
                if (interfaceC420801kM == null || interfaceC420801kM.isDisposed()) {
                    return;
                }
                networkHelper.LLJIJIL.dispose();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Long l) {
                l.longValue();
                NetworkHelper networkHelper = this.LL;
                Activity activity = networkHelper.LLILZIL;
                if (activity != null) {
                    C1257170iot.LIZIZ(activity, networkHelper.LLILZLL, exc, null);
                }
                NetworkHelper networkHelper2 = this.LL;
                if (networkHelper2.LLIZ == 0) {
                    C1749280vcc c1749280vcc2 = c1749280vcc;
                    if (c1749280vcc2 != null && c1749280vcc2.getVisibility() == 0) {
                        NetworkHelper networkHelper3 = this.LL;
                        Exception exc2 = exc;
                        C1749280vcc c1749280vcc3 = c1749280vcc;
                        if (c1749280vcc3 != null) {
                            C1264160j0A.LIZIZ(c1749280vcc3, networkHelper3.LLILZLL, exc2, new AwS553S0100000_9(networkHelper3, 37));
                            C786410Ut5.LLLZLZ(c1749280vcc3, 0);
                        } else {
                            networkHelper3.getClass();
                        }
                    }
                } else {
                    Function0<Unit> function0 = networkHelper2.LLILZ;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                C036E.LIZ.LIZLLL(this.LL.LLJI);
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                this.LL.LLJIJIL = interfaceC420801kM;
            }
        });
    }

    public NetworkHelper(Function0 function0, AwS553S0100000_9 awS553S0100000_9, Function0 function02, Function0 function03, C19EG c19eg, String str, int i, LifecycleOwner lifecycleOwner, int i2) {
        long j;
        Lifecycle lifecycle;
        function0 = (i2 & 1) != 0 ? null : function0;
        awS553S0100000_9 = (i2 & 2) != 0 ? null : awS553S0100000_9;
        function02 = (i2 & 4) != 0 ? null : function02;
        function03 = (i2 & 8) != 0 ? null : function03;
        c19eg = (i2 & 16) != 0 ? null : c19eg;
        str = (i2 & 32) != 0 ? "" : str;
        i = (i2 & 64) != 0 ? 0 : i;
        if ((i2 & 128) != 0) {
            j = 2000;
        } else {
            j = 0;
        }
        this.LL = function0;
        this.LLILLJJLI = awS553S0100000_9;
        this.LLILLL = function02;
        this.LLILZ = function03;
        this.LLILZIL = c19eg;
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = j;
        this.LLJ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
