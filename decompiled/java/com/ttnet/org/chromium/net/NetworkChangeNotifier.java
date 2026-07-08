package com.ttnet.org.chromium.net;

import J.N;
import X.AbstractC1499210p7H;
import X.C1499120p78;
import X.C1499130p79;
import X.C1499150p7B;
import X.C1499180p7E;
import X.C1499230p7J;
import X.C1499290p7P;
import X.InterfaceC1499190p7F;
import Y.ARunnableS123S0100000_23;
import android.net.Network;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes24.dex */
public class NetworkChangeNotifier {
    public static NetworkChangeNotifier LJFF;
    public final ArrayList<Long> LIZ = new ArrayList<>();
    public final C1499130p79<InterfaceC1499190p7F> LIZIZ = new C1499130p79<>();
    public NetworkChangeNotifierAutoDetect LIZJ;
    public int LIZLLL;
    public int LJ;

    public static void forceUpdateNetworkTypeInfo() throws Throwable {
        NetworkChangeNotifier networkChangeNotifier = LJFF;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = networkChangeNotifier.LIZJ;
        if (networkChangeNotifierAutoDetect != null) {
            C1499290p7P c1499290p7PLIZLLL = networkChangeNotifierAutoDetect.LIZLLL();
            if (networkChangeNotifier.LIZLLL != c1499290p7PLIZLLL.LIZIZ()) {
                networkChangeNotifier.LIZLLL = c1499290p7PLIZLLL.LIZIZ();
                networkChangeNotifier.LIZJ.LJFF(new ARunnableS123S0100000_23(networkChangeNotifier, 65));
            }
        }
    }

    public static NetworkChangeNotifier init() {
        if (LJFF == null) {
            LJFF = new NetworkChangeNotifier();
        }
        return LJFF;
    }

    public int getCurrentConnectionSubtype() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        return networkChangeNotifierAutoDetect.LIZLLL().LIZ();
    }

    public long getCurrentDefaultNetId() {
        Network networkLIZIZ;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null || (networkLIZIZ = networkChangeNotifierAutoDetect.LJI.LIZIZ()) == null) {
            return -1L;
        }
        return NetworkChangeNotifierAutoDetect.LJ(networkLIZIZ);
    }

    public long[] getCurrentNetworksAndTypes() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null) {
            return new long[0];
        }
        Network[] networkArrLIZJ = NetworkChangeNotifierAutoDetect.LIZJ(networkChangeNotifierAutoDetect.LJI, null);
        long[] jArr = new long[networkArrLIZJ.length * 2];
        int i = 0;
        for (Network network : networkArrLIZJ) {
            int i2 = i + 1;
            jArr[i] = NetworkChangeNotifierAutoDetect.LJ(network);
            i = i2 + 1;
            jArr[i2] = networkChangeNotifierAutoDetect.LJI.LIZ(r3);
        }
        return jArr;
    }

    public long getCurrentVpnNetId() {
        C1499230p7J c1499230p7J;
        Network network;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null || (c1499230p7J = networkChangeNotifierAutoDetect.LJII) == null || (network = c1499230p7J.LIZ) == null) {
            return -1L;
        }
        return NetworkChangeNotifierAutoDetect.LJ(network);
    }

    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZJ;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.LJIILIIL;
    }

    public int getCurrentConnectionCost() {
        return this.LJ;
    }

    public int getCurrentConnectionType() {
        return this.LIZLLL;
    }

    public static void fakeConnectionCostChanged(int i) throws Throwable {
        setAutoDetectConnectivityState(false);
        LJFF.LIZ(i);
    }

    public static void fakeConnectionSubtypeChanged(int i) throws Throwable {
        setAutoDetectConnectivityState(false);
        LJFF.LIZIZ(i);
    }

    public static void fakeNetworkDisconnected(long j) throws Throwable {
        setAutoDetectConnectivityState(false);
        LJFF.LJ(j, false);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j) throws Throwable {
        setAutoDetectConnectivityState(false);
        LJFF.LJFF(j);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) throws Throwable {
        setAutoDetectConnectivityState(false);
        LJFF.LJI(jArr);
    }

    public static void forceConnectivityState(boolean z) throws Throwable {
        boolean z2;
        int i = 0;
        setAutoDetectConnectivityState(false);
        NetworkChangeNotifier networkChangeNotifier = LJFF;
        if (networkChangeNotifier.LIZLLL != 6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 6;
            }
            networkChangeNotifier.LIZLLL = i;
            networkChangeNotifier.LIZJ(i, networkChangeNotifier.getCurrentDefaultNetId());
            networkChangeNotifier.LIZIZ(!z ? 1 : 0);
        }
    }

    public static void setAutoDetectConnectivityState(boolean z) throws Throwable {
        LJFF.LJII(z, new C1499150p7B());
    }

    public final void LIZ(int i) {
        Iterator<Long> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            N.MZnuk2LK(it2.next().longValue(), this, i);
        }
    }

    public final void LIZIZ(int i) {
        Iterator<Long> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            N.MqNJnYjG(it2.next().longValue(), this, i);
        }
    }

    public final void LJFF(long j) {
        Iterator<Long> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            N.MssT8yD3(it2.next().longValue(), this, j);
        }
    }

    public final void LJI(long[] jArr) {
        Iterator<Long> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            N.Mvng38R0(it2.next().longValue(), this, jArr);
        }
    }

    public void addNativeObserver(long j) {
        this.LIZ.add(Long.valueOf(j));
    }

    public void removeNativeObserver(long j) {
        this.LIZ.remove(Long.valueOf(j));
    }

    public static void fakeDefaultNetwork(long j, int i) throws Throwable {
        setAutoDetectConnectivityState(false);
        LJFF.LIZJ(i, j);
    }

    public static void fakeNetworkConnected(long j, int i) throws Throwable {
        setAutoDetectConnectivityState(false);
        LJFF.LIZLLL(i, j, false);
    }

    public final void LIZJ(int i, long j) {
        Iterator<Long> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            N.MjJzrRFH(it2.next().longValue(), this, i, j);
        }
        Iterator<InterfaceC1499190p7F> it3 = this.LIZIZ.iterator();
        while (true) {
            C1499120p78 c1499120p78 = (C1499120p78) it3;
            if (c1499120p78.hasNext()) {
                ((InterfaceC1499190p7F) c1499120p78.next()).LIZ();
            } else {
                return;
            }
        }
    }

    public final void LJ(long j, boolean z) {
        Iterator<Long> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            N.Ms7JLaGI(it2.next().longValue(), this, z, j);
        }
    }

    public final void LJII(boolean z, AbstractC1499210p7H abstractC1499210p7H) throws Throwable {
        int i;
        if (z) {
            if (this.LIZJ == null) {
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(new C1499180p7E(this), abstractC1499210p7H);
                this.LIZJ = networkChangeNotifierAutoDetect;
                C1499290p7P c1499290p7PLIZLLL = networkChangeNotifierAutoDetect.LIZLLL();
                int iLIZIZ = c1499290p7PLIZLLL.LIZIZ();
                this.LIZLLL = iLIZIZ;
                LIZJ(iLIZIZ, getCurrentDefaultNetId());
                if (c1499290p7PLIZLLL.LIZLLL) {
                    i = 2;
                } else {
                    i = 1;
                }
                this.LJ = i;
                LIZ(i);
                LIZIZ(c1499290p7PLIZLLL.LIZ());
                return;
            }
            return;
        }
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect2 = this.LIZJ;
        if (networkChangeNotifierAutoDetect2 == null) {
            return;
        }
        networkChangeNotifierAutoDetect2.LJ.LIZ();
        networkChangeNotifierAutoDetect2.LJI();
        this.LIZJ = null;
    }

    public final void LIZLLL(int i, long j, boolean z) {
        Iterator<Long> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            N.MZ5e75rQ(it2.next().longValue(), this, j, z, i);
        }
    }
}
