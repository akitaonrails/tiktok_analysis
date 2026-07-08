package com.ttnet.org.chromium.net;

import J.N;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C787210UuN;
import X.C787220UuO;
import X.C787230UuP;
import X.C788530UwV;
import Y.ARunnableS82S0200000_13;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.net.ProxyChangeListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class ProxyChangeListener {
    public static final /* synthetic */ int LJ = 0;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.myLooper());
    public long LIZIZ;
    public ProxyReceiver LIZJ;
    public C787210UuN LIZLLL;

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0UuN, android.content.BroadcastReceiver] */
    public final void LIZIZ() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        ProxyReceiver proxyReceiver = new ProxyReceiver();
        this.LIZJ = proxyReceiver;
        C787230UuP.LIZ(C787230UuP.LIZ, proxyReceiver, new IntentFilter());
        ?? r1 = new BroadcastReceiver(this) { // from class: X.0UuN
            public final ProxyChangeListener LIZ;

            {
                this.LIZ = this;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                        ProxyChangeListener proxyChangeListener = this.LIZ;
                        C786410Ut5.LJLIIL(1000L, proxyChangeListener.LIZ, new ARunnableS82S0200000_13(intent, proxyChangeListener, 40));
                        return;
                    }
                    return;
                }
                C2408409cA.LIZ();
                if (!intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                    return;
                }
                ProxyChangeListener proxyChangeListener2 = this.LIZ;
                C786410Ut5.LJLIIL(1000L, proxyChangeListener2.LIZ, new ARunnableS82S0200000_13(intent, proxyChangeListener2, 40));
            }
        };
        this.LIZLLL = r1;
        C787230UuP.LIZ(C787230UuP.LIZ, r1, intentFilter);
    }

    public void stop() {
        this.LIZIZ = 0L;
        C786410Ut5.LJJIFFI(C787230UuP.LIZ, this.LIZJ);
        C787210UuN c787210UuN = this.LIZLLL;
        if (c787210UuN != null) {
            C786410Ut5.LJJIFFI(C787230UuP.LIZ, c787210UuN);
        }
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    public class ProxyReceiver extends BroadcastReceiver {
        public static final /* synthetic */ int LIZIZ = 0;

        public ProxyReceiver() {
        }

        public void com_ttnet_org_chromium_net_ProxyChangeListener$ProxyReceiver__onReceive$___twin___(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                C786410Ut5.LJLIIL(1000L, ProxyChangeListener.this.LIZ, new ARunnableS82S0200000_13(intent, this, 41));
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                com_ttnet_org_chromium_net_ProxyChangeListener$ProxyReceiver__onReceive$___twin___(context, intent);
            } else {
                C2408409cA.LIZ();
                com_ttnet_org_chromium_net_ProxyChangeListener$ProxyReceiver__onReceive$___twin___(context, intent);
            }
        }
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    public final void LIZ(C787220UuO c787220UuO) {
        if (this.LIZIZ == 0) {
            return;
        }
        if (c787220UuO != null) {
            N.MtXZ30qk(this.LIZIZ, this, c787220UuO.LIZ, c787220UuO.LIZIZ, c787220UuO.LIZJ, c787220UuO.LIZLLL);
        } else {
            N.MKwsFZ4t(this.LIZIZ, this);
        }
    }

    public void start(long j) {
        TraceEvent traceEventLIZ = TraceEvent.LIZ("ProxyChangeListener.start");
        try {
            this.LIZIZ = j;
            LIZIZ();
            if (traceEventLIZ != null) {
                traceEventLIZ.close();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (traceEventLIZ != null) {
                try {
                    traceEventLIZ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
