package com.ttnet.org.chromium.net.impl;

import X.AbstractC1495350p13;
import X.AbstractC1497340p4G;
import X.AbstractC1497700p4q;
import X.AbstractC1498430p61;
import X.C1497210p43;
import X.C1497640p4k;
import X.C1498110p5V;
import X.C847270XLp;
import X.ExecutorC1497250p47;
import X.InterfaceC1498130p5X;
import com.ttnet.org.chromium.net.g0;
import com.ttnet.org.chromium.net.i;
import com.ttnet.org.chromium.net.k0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes24.dex */
public abstract class d extends i {
    public abstract g0 LJJJJL(InterfaceC1498130p5X interfaceC1498130p5X, Executor executor, int i, List<String> list, int i2, int i3, int i4);

    public abstract w0 LJJJJLI(String str, AbstractC1497700p4q abstractC1497700p4q, Executor executor, int i, boolean z, boolean z2, int i2, boolean z3, int i3, AbstractC1495350p13 abstractC1495350p13, long j);

    public abstract k0 LJJJJLL(AbstractC1498430p61 abstractC1498430p61, Executor executor, List list, int i, String str, long j, int i2, long j2, String str2, int i3, Map map, Map map2, boolean z);

    public abstract k0 LJJJJZ(AbstractC1498430p61 abstractC1498430p61, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z);

    @Override // com.ttnet.org.chromium.net.e
    public final C1498110p5V LIZIZ(InterfaceC1498130p5X interfaceC1498130p5X) {
        return new C1498110p5V(interfaceC1498130p5X, this);
    }

    @Override // com.ttnet.org.chromium.net.e
    public final C847270XLp LIZLLL(AbstractC1498430p61 abstractC1498430p61, Executor executor) {
        return new C847270XLp(abstractC1498430p61, executor, this);
    }

    @Override // com.ttnet.org.chromium.net.i, com.ttnet.org.chromium.net.e
    public AbstractC1497340p4G LIZJ(String str, C1497210p43 c1497210p43, ExecutorC1497250p47 executorC1497250p47) {
        return new C1497640p4k(str, c1497210p43, executorC1497250p47, this);
    }

    @Override // com.ttnet.org.chromium.net.i
    /* JADX INFO: renamed from: LJJIII */
    public final C1497640p4k LIZJ(String str, C1497210p43 c1497210p43, ExecutorC1497250p47 executorC1497250p47) {
        return new C1497640p4k(str, c1497210p43, executorC1497250p47, this);
    }
}
