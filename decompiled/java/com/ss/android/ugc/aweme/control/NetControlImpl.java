package com.ss.android.ugc.aweme.control;

import X.C01GW;
import X.C1489880osE;
import X.C1489950osL;
import X.C1490040osU;
import X.C1490150osf;
import X.C1490160osg;
import X.C1490170osh;
import X.C1490180osi;
import X.C259800zU;
import X.C310440CEw;
import X.C452501pT;
import X.C823050WQl;
import X.EnumC2262571Dh9;
import Y.ARunnableS37S0300000_4;
import com.bytedance.ies.ugc.aweme.network.config.NetDispatchConfig;
import com.ss.android.ugc.aweme.control.NetControlImpl;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import com.ss.android.ugc.aweme.net.control.INetControl;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes24.dex */
public final class NetControlImpl implements INetControl {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(new C1490170osh());
    public final CopyOnWriteArraySet<EnumC2262571Dh9> LIZIZ = new CopyOnWriteArraySet<>();
    public final boolean LIZJ = true;

    public final ConcurrentHashMap<EnumC2262571Dh9, DispatchConfig> LJFF() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final Set<EnumC2262571Dh9> LJ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final void LIZ(EnumC2262571Dh9 enumC2262571Dh9) {
        C310440CEw.LIZ.getClass();
        final NetDispatchConfig netDispatchConfigLIZ = C310440CEw.LIZ();
        if (!netDispatchConfigLIZ.enable || !LJFF().containsKey(enumC2262571Dh9) || this.LIZIZ.contains(enumC2262571Dh9)) {
            return;
        }
        if (this.LIZJ) {
            this.LIZIZ.clear();
            this.LIZIZ.add(enumC2262571Dh9);
        } else {
            this.LIZIZ.add(enumC2262571Dh9);
        }
        final C259800zU c259800zU = new C259800zU();
        for (EnumC2262571Dh9 enumC2262571Dh92 : this.LIZIZ) {
            T t = c259800zU.element;
            if (t == 0) {
                c259800zU.element = LJFF().get(enumC2262571Dh92);
            } else {
                ((DispatchConfig) t).LIZ(LJFF().get(enumC2262571Dh9));
            }
        }
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0CF2
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NetControlImpl@cec9.enterScene$2");
                try {
                    NetControlImpl netControlImpl = this.LL;
                    NetDispatchConfig netDispatchConfig = netDispatchConfigLIZ;
                    DispatchConfig dispatchConfig = c259800zU.element;
                    netControlImpl.getClass();
                    NetControlImpl.LJI(netDispatchConfig, dispatchConfig);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NetControlImpl@cec9.enterScene$2");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final void LIZJ(EnumC2262571Dh9 enumC2262571Dh9) {
        C310440CEw.LIZ.getClass();
        NetDispatchConfig netDispatchConfigLIZ = C310440CEw.LIZ();
        if (!netDispatchConfigLIZ.enable || !LJFF().containsKey(enumC2262571Dh9) || !this.LIZIZ.contains(enumC2262571Dh9)) {
            return;
        }
        if (this.LIZJ) {
            this.LIZIZ.clear();
        } else {
            this.LIZIZ.remove(enumC2262571Dh9);
        }
        C259800zU c259800zU = new C259800zU();
        for (EnumC2262571Dh9 enumC2262571Dh92 : this.LIZIZ) {
            T t = c259800zU.element;
            if (t == 0) {
                c259800zU.element = LJFF().get(enumC2262571Dh92);
            } else {
                ((DispatchConfig) t).LIZ(LJFF().get(enumC2262571Dh9));
            }
        }
        C823050WQl.LIZLLL().execute(new ARunnableS37S0300000_4(this, netDispatchConfigLIZ, c259800zU, 4));
    }

    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final void LIZLLL(EnumC2262571Dh9 enumC2262571Dh9) {
        C310440CEw.LIZ.getClass();
        if (!C310440CEw.LIZ().enable) {
            return;
        }
        LJFF().remove(enumC2262571Dh9);
    }

    public static void LJI(NetDispatchConfig netDispatchConfig, DispatchConfig dispatchConfig) {
        if (dispatchConfig == null) {
            C1489880osE.LJ().LJIIIIZZ(null);
            return;
        }
        C1490150osf c1490150osf = new C1490150osf();
        String str = dispatchConfig.sceneName;
        c1490150osf.LIZIZ = str;
        C1490040osU c1490040osU = c1490150osf.LIZ;
        c1490040osU.LIZ = str;
        c1490150osf.LIZJ = dispatchConfig.delayDisableTimeMs;
        Set<String> set = dispatchConfig.blackList;
        Set<String> set2 = dispatchConfig.whiteList;
        int i = dispatchConfig.maxDelayTimeMs;
        int i2 = netDispatchConfig.dcMaxSyncCount;
        int i3 = netDispatchConfig.dcMaxAsyncCount;
        int i4 = dispatchConfig.sparseSendIntervalMs;
        c1490040osU.LIZJ = i2;
        c1490040osU.LJI = i3;
        c1490040osU.LJIIJJI = i4;
        ((CopyOnWriteArraySet) c1490150osf.LJII).clear();
        ((CopyOnWriteArraySet) c1490150osf.LJIIIIZZ).clear();
        ((CopyOnWriteArraySet) c1490150osf.LJII).addAll(set);
        ((CopyOnWriteArraySet) c1490150osf.LJIIIIZZ).addAll(set2);
        c1490150osf.LJIIIZ = i;
        Set<String> set3 = dispatchConfig.dropList;
        C1489950osL c1489950osL = c1490150osf.LJ;
        ((CopyOnWriteArraySet) c1489950osL.LIZ).clear();
        ((CopyOnWriteArraySet) c1489950osL.LIZ).addAll(set3);
        Set<String> set4 = dispatchConfig.highPriorityApis;
        Set<String> set5 = dispatchConfig.defaultPriorityApis;
        Set<String> set6 = dispatchConfig.lowPriorityApis;
        C1490180osi c1490180osi = c1490150osf.LJFF;
        ((CopyOnWriteArraySet) c1490180osi.LIZ).clear();
        ((CopyOnWriteArraySet) c1490180osi.LIZIZ).clear();
        ((CopyOnWriteArraySet) c1490180osi.LIZJ).clear();
        ((CopyOnWriteArraySet) c1490180osi.LIZ).addAll(set4);
        ((CopyOnWriteArraySet) c1490180osi.LIZIZ).addAll(set5);
        ((CopyOnWriteArraySet) c1490180osi.LIZJ).addAll(set6);
        Map<String, Integer> map = dispatchConfig.throttleConfigByPath;
        Set<String> set7 = dispatchConfig.apiThrottleLimitedDomainList;
        Set<String> set8 = dispatchConfig.wsThrottleLimitedDomainList;
        long j = netDispatchConfig.throttleSpeed4Domain;
        C1490160osg c1490160osg = c1490150osf.LJI;
        ((ConcurrentHashMap) c1490160osg.LIZ).clear();
        ((CopyOnWriteArraySet) c1490160osg.LIZIZ).clear();
        ((CopyOnWriteArraySet) c1490160osg.LIZJ).clear();
        ((CopyOnWriteArraySet) c1490160osg.LIZLLL).clear();
        ((CopyOnWriteArraySet) c1490160osg.LJ).clear();
        ((ConcurrentHashMap) c1490160osg.LIZ).putAll(map);
        ((CopyOnWriteArraySet) c1490160osg.LIZIZ).addAll(set7);
        ((CopyOnWriteArraySet) c1490160osg.LIZJ).addAll(set7);
        ((CopyOnWriteArraySet) c1490160osg.LIZLLL).addAll(set8);
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) c1490160osg.LJ;
        copyOnWriteArraySet.addAll(copyOnWriteArraySet);
        c1490160osg.LJFF = j;
        c1490160osg.LJI = j;
        c1490160osg.LJII = j;
        c1490160osg.LJIIIIZZ = j;
        C1489880osE.LJ().LJIIIIZZ(c1490150osf);
    }

    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final void LIZIZ(EnumC2262571Dh9 enumC2262571Dh9, DispatchConfig dispatchConfig) {
        C310440CEw.LIZ.getClass();
        if (!C310440CEw.LIZ().enable) {
            return;
        }
        LJFF().put(enumC2262571Dh9, dispatchConfig);
    }
}
