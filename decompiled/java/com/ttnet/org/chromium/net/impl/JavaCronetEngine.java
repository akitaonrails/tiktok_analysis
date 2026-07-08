package com.ttnet.org.chromium.net.impl;

import X.AbstractC1495350p13;
import X.AbstractC1497340p4G;
import X.AbstractC1497700p4q;
import X.AbstractC1498430p61;
import X.C1497210p43;
import X.C1497640p4k;
import X.C1497900p5A;
import X.ExecutorC1497250p47;
import X.InterfaceC1498130p5X;
import com.ttnet.org.chromium.net.f0;
import com.ttnet.org.chromium.net.g0;
import com.ttnet.org.chromium.net.k0;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes24.dex */
public final class JavaCronetEngine extends d {
    @Override // com.ttnet.org.chromium.net.e
    public final f0 LIZ() {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.e
    public final void LJFF(String str) {
    }

    @Override // com.ttnet.org.chromium.net.e
    public final void LJI() {
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIILL() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIILLIIL() {
        return 0;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJIJJLI() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.i
    public final int LJJI() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.impl.d
    public final g0 LJJJJL(InterfaceC1498130p5X interfaceC1498130p5X, Executor executor, int i, List<String> list, int i2, int i3, int i4) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.d
    public final k0 LJJJJLL(AbstractC1498430p61 abstractC1498430p61, Executor executor, List list, int i, String str, long j, int i2, long j2, String str2, int i3, Map map, Map map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.d
    public final k0 LJJJJZ(AbstractC1498430p61 abstractC1498430p61, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.d, com.ttnet.org.chromium.net.i, com.ttnet.org.chromium.net.e
    public final AbstractC1497340p4G LIZJ(String str, C1497210p43 c1497210p43, ExecutorC1497250p47 executorC1497250p47) {
        return new C1497640p4k(str, c1497210p43, executorC1497250p47, this);
    }

    @Override // com.ttnet.org.chromium.net.e
    public final URLConnection LJ(URL url, Proxy proxy, boolean z) {
        return url.openConnection(proxy);
    }

    @Override // com.ttnet.org.chromium.net.impl.d
    public final w0 LJJJJLI(String str, AbstractC1497700p4q abstractC1497700p4q, Executor executor, int i, boolean z, boolean z2, int i2, boolean z3, int i3, AbstractC1495350p13 abstractC1495350p13, long j) {
        if (j == -1) {
            new C1497900p5A(this, abstractC1497700p4q, executor, str, z2, i2, z3, i3);
            throw null;
        }
        throw new UnsupportedOperationException("The multi-network API is not supported by the Java implementation of Cronet Engine");
    }
}
