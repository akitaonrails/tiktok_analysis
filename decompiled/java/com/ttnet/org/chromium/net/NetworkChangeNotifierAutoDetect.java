package com.ttnet.org.chromium.net;

import X.AbstractC1499210p7H;
import X.C0WZX;
import X.C1499180p7E;
import X.C1499220p7I;
import X.C1499230p7J;
import X.C1499290p7P;
import X.C2188191AkT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C787230UuP;
import X.C788530UwV;
import X.InterfaceC1499200p7G;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import com.tts.oecverify.BdTuring;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final Looper LIZ;
    public final BPEAHandler LIZIZ;
    public final NetworkConnectivityIntentFilter LIZJ;
    public final InterfaceC1499200p7G LIZLLL;
    public final AbstractC1499210p7H LJ;
    public ConnectivityManager.NetworkCallback LJFF;
    public final C1499220p7I LJI;
    public C1499230p7J LJII;
    public final NetworkRequest LJIIIIZZ;
    public boolean LJIIIZ;
    public C1499290p7P LJIIJ;
    public boolean LJIIJJI;
    public final boolean LJIIL;
    public boolean LJIILIIL;

    public static int LIZIZ(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i != 4 && i != 5) {
                if (i == 6) {
                    return 5;
                }
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i2 == 20) {
            return 8;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case 14:
            case 15:
                return 4;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return 5;
            default:
                return 0;
        }
    }

    public static class NetworkConnectivityIntentFilter extends IntentFilter {
        public NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public final C1499290p7P LIZLLL() throws Throwable {
        Network networkLIZIZ;
        C1499220p7I c1499220p7I = this.LJI;
        c1499220p7I.getClass();
        try {
            networkLIZIZ = c1499220p7I.LIZIZ();
        } catch (Throwable th) {
            th = th;
        }
        try {
            NetworkInfo networkInfoLIZLLL = c1499220p7I.LIZLLL(networkLIZIZ);
            if (networkInfoLIZLLL != null) {
                if (C2204961BRm.LJLLILLLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)) == 17) {
                    networkInfoLIZLLL = C786410Ut5.LJIJ(c1499220p7I.LIZ);
                }
                if (networkInfoLIZLLL != null && (networkInfoLIZLLL.isConnected() || (networkInfoLIZLLL.getDetailedState() == NetworkInfo.DetailedState.BLOCKED && ApplicationStatus.getStateForApplication() == 1))) {
                    if (networkLIZIZ == null) {
                        C2204961BRm.LJLLILLLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null));
                        return new C1499290p7P(true, C2204961BRm.LJLLILLLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)), C2204961BRm.LJLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)), false, null, null, false, "");
                    }
                    NetworkCapabilities networkCapabilitiesLIZJ = c1499220p7I.LIZJ(networkLIZIZ);
                    boolean z = (networkCapabilitiesLIZJ == null || networkCapabilitiesLIZJ.hasCapability(11)) ? false : true;
                    DnsStatus dnsStatusLIZIZ = AndroidNetworkLibrary.LIZIZ(networkLIZIZ);
                    if (dnsStatusLIZIZ == null) {
                        return new C1499290p7P(true, C2204961BRm.LJLLILLLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)), C2204961BRm.LJLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)), z, String.valueOf(LJ(networkLIZIZ)), null, false, "");
                    }
                    ArrayList arrayList = new ArrayList();
                    try {
                        for (byte[] bArr : dnsStatusLIZIZ.getDnsServers()) {
                            arrayList.add(InetAddress.getByAddress(bArr));
                        }
                    } catch (UnknownHostException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    return new C1499290p7P(true, C2204961BRm.LJLLILLLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)), C2204961BRm.LJLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)), z, String.valueOf(LJ(networkLIZIZ)), arrayList, dnsStatusLIZIZ.getPrivateDnsActive(), dnsStatusLIZIZ.getPrivateDnsServerName());
                }
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
        }
        return new C1499290p7P(false, -1, -1, false, null, null, false, "");
    }

    public final void LJI() {
        if (this.LJIIIZ) {
            this.LJIIIZ = false;
            C1499230p7J c1499230p7J = this.LJII;
            if (c1499230p7J != null) {
                C1499220p7I c1499220p7I = this.LJI;
                c1499220p7I.getClass();
                try {
                    c1499220p7I.LIZ.unregisterNetworkCallback(c1499230p7J);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            ConnectivityManager.NetworkCallback networkCallback = this.LJFF;
            if (networkCallback == null) {
                C786410Ut5.LJJIFFI(C787230UuP.LIZ, this);
                return;
            }
            C1499220p7I c1499220p7I2 = this.LJI;
            c1499220p7I2.getClass();
            try {
                c1499220p7I2.LIZ.unregisterNetworkCallback(networkCallback);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public static long LJ(Network network) {
        if (network == null) {
            return 0L;
        }
        return network.getNetworkHandle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1499290p7P r5) {
        /*
            r4 = this;
            int r1 = r5.LIZIZ()
            X.0p7P r0 = r4.LJIIJ
            int r0 = r0.LIZIZ()
            if (r1 != r0) goto L36
            java.lang.String r1 = r5.LJ
            X.0p7P r0 = r4.LJIIJ
            java.lang.String r0 = r0.LJ
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            java.util.List<java.net.InetAddress> r1 = r5.LJFF
            X.0p7P r0 = r4.LJIIJ
            java.util.List<java.net.InetAddress> r0 = r0.LJFF
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            boolean r1 = r5.LJI
            X.0p7P r2 = r4.LJIIJ
            boolean r0 = r2.LJI
            if (r1 != r0) goto L36
            java.lang.String r1 = r5.LJII
            java.lang.String r0 = r2.LJII
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
        L36:
            X.0p7G r0 = r4.LIZLLL
            int r3 = r5.LIZIZ()
            X.0p7E r0 = (X.C1499180p7E) r0
            com.ttnet.org.chromium.net.NetworkChangeNotifier r2 = r0.LIZ
            r2.LIZLLL = r3
            long r0 = r2.getCurrentDefaultNetId()
            r2.LIZJ(r3, r0)
        L49:
            int r1 = r5.LIZIZ()
            X.0p7P r0 = r4.LJIIJ
            int r0 = r0.LIZIZ()
            if (r1 != r0) goto L61
            int r1 = r5.LIZ()
            X.0p7P r0 = r4.LJIIJ
            int r0 = r0.LIZ()
            if (r1 == r0) goto L6e
        L61:
            X.0p7G r0 = r4.LIZLLL
            int r1 = r5.LIZ()
            X.0p7E r0 = (X.C1499180p7E) r0
            com.ttnet.org.chromium.net.NetworkChangeNotifier r0 = r0.LIZ
            r0.LIZIZ(r1)
        L6e:
            boolean r3 = r5.LIZLLL
            r2 = 2
            if (r3 == 0) goto L8e
            r1 = 2
        L74:
            X.0p7P r0 = r4.LJIIJ
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L8c
            r0 = 2
        L7b:
            if (r1 == r0) goto L89
            X.0p7G r0 = r4.LIZLLL
            if (r3 != 0) goto L82
            r2 = 1
        L82:
            X.0p7E r0 = (X.C1499180p7E) r0
            com.ttnet.org.chromium.net.NetworkChangeNotifier r0 = r0.LIZ
            r0.LIZ(r2)
        L89:
            r4.LJIIJ = r5
            return
        L8c:
            r0 = 1
            goto L7b
        L8e:
            r1 = 1
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.LIZ(X.0p7P):void");
    }

    public final void LJFF(Runnable runnable) {
        if (this.LIZ == Looper.myLooper()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS92S0200000_23(this, runnable, 40));
        }
    }

    public NetworkChangeNotifierAutoDetect(C1499180p7E c1499180p7E, AbstractC1499210p7H abstractC1499210p7H) {
        ConnectivityManager.NetworkCallback networkCallback;
        Looper looperMyLooper = Looper.myLooper();
        this.LIZ = looperMyLooper;
        this.LIZIZ = new BPEAHandler(looperMyLooper);
        this.LIZLLL = c1499180p7E;
        this.LJI = new C1499220p7I(C787230UuP.LIZ);
        this.LJII = new C1499230p7J(this);
        this.LJIIIIZZ = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LJFF = new ConnectivityManager.NetworkCallback() { // from class: X.0p7K
                public LinkProperties LIZ;
                public NetworkCapabilities LIZIZ;

                public final C1499290p7P LIZ(Network network) throws Throwable {
                    int iLJLLILLLL;
                    int iLJLL = -1;
                    if (!this.LIZIZ.hasTransport(1) && !this.LIZIZ.hasTransport(5)) {
                        if (this.LIZIZ.hasTransport(0)) {
                            NetworkInfo networkInfoLJ = this.LIZJ.LJI.LJ(network);
                            if (networkInfoLJ != null) {
                                iLJLL = C2204961BRm.LJLL(networkInfoLJ, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null));
                            }
                            iLJLLILLLL = 0;
                        } else if (this.LIZIZ.hasTransport(3)) {
                            iLJLLILLLL = 9;
                        } else if (this.LIZIZ.hasTransport(2)) {
                            iLJLLILLLL = 7;
                        } else if (this.LIZIZ.hasTransport(4)) {
                            NetworkInfo networkInfoLIZLLL = this.LIZJ.LJI.LIZLLL(network);
                            if (networkInfoLIZLLL != null) {
                                iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null));
                            } else {
                                iLJLLILLLL = 17;
                            }
                        } else {
                            iLJLLILLLL = -1;
                            iLJLL = -1;
                        }
                        return new C1499290p7P(true, iLJLLILLLL, iLJLL, !this.LIZIZ.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.LJ(network)), null, this.LIZ.isPrivateDnsActive(), this.LIZ.getPrivateDnsServerName());
                    }
                    iLJLLILLLL = 1;
                    iLJLL = -1;
                    return new C1499290p7P(true, iLJLLILLLL, iLJLL, !this.LIZIZ.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.LJ(network)), null, this.LIZ.isPrivateDnsActive(), this.LIZ.getPrivateDnsServerName());
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(Network network) {
                    this.LIZ = null;
                    this.LIZIZ = null;
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
                    this.LIZ = null;
                    this.LIZIZ = null;
                    NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
                    if (networkChangeNotifierAutoDetect.LJIIIZ) {
                        networkChangeNotifierAutoDetect.LIZ(new C1499290p7P(false, -1, -1, false, null, null, false, ""));
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    this.LIZIZ = networkCapabilities;
                    NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
                    if (networkChangeNotifierAutoDetect.LJIIIZ && this.LIZ != null && networkCapabilities != null) {
                        networkChangeNotifierAutoDetect.LIZ(LIZ(network));
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                    this.LIZ = linkProperties;
                    NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
                    if (networkChangeNotifierAutoDetect.LJIIIZ && linkProperties != null && this.LIZIZ != null) {
                        networkChangeNotifierAutoDetect.LIZ(LIZ(network));
                    }
                }
            };
        } else {
            if (i >= 28) {
                networkCallback = new ConnectivityManager.NetworkCallback() { // from class: X.0p7Q
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network) {
                        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZ;
                        if (networkChangeNotifierAutoDetect.LJIIIZ) {
                            networkChangeNotifierAutoDetect.LIZ(networkChangeNotifierAutoDetect.LIZLLL());
                        }
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLost(Network network) {
                        onAvailable(null);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        onAvailable(null);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                        onAvailable(null);
                    }
                };
            } else {
                networkCallback = null;
            }
            this.LJFF = networkCallback;
        }
        this.LJIIJ = LIZLLL();
        this.LIZJ = new NetworkConnectivityIntentFilter();
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJ = abstractC1499210p7H;
        abstractC1499210p7H.LIZIZ(this);
        this.LJIIL = true;
    }

    public static Network[] LIZJ(C1499220p7I c1499220p7I, Network network) {
        Network[] allNetworks;
        NetworkCapabilities networkCapabilitiesLIZJ;
        c1499220p7I.getClass();
        try {
            allNetworks = c1499220p7I.LIZ.getAllNetworks();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            allNetworks = null;
        }
        if (allNetworks == null) {
            allNetworks = new Network[0];
        }
        int i = 0;
        for (Network network2 : allNetworks) {
            if (network2 != null && !network2.equals(network) && (networkCapabilitiesLIZJ = c1499220p7I.LIZJ(network2)) != null && networkCapabilitiesLIZJ.hasCapability(12)) {
                if (networkCapabilitiesLIZJ.hasTransport(4)) {
                    if (C1499220p7I.LJFF(network2)) {
                        return new Network[]{network2};
                    }
                } else {
                    allNetworks[i] = network2;
                    i++;
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworks, i);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LJFF(new ARunnableS123S0100000_23(this, 52));
        } else {
            C2408409cA.LIZ();
            LJFF(new ARunnableS123S0100000_23(this, 52));
        }
    }
}
