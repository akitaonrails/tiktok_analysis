package com.ss.android.ugc.aweme.ecommerce.mix.view;

import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C1161750gKz;
import X.C1162700gMW;
import X.C1163070gN7;
import X.C1163360gNa;
import X.C1165500gR2;
import X.C1165930gRj;
import X.C13LE;
import X.C1741890vQh;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C703302op;
import X.C723850SaN;
import X.InterfaceC1146704e9;
import X.InterfaceC1164530gPT;
import X.InterfaceC1165510gR3;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ARunnableS51S0300000_18;
import android.os.Looper;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixEvent;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixDataCenterScope;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope;
import com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class MixUIContentAssem<T extends C1161750gKz> extends UIContentAssem implements InterfaceC1164530gPT, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final BPEAHandler LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
    public final C1163070gN7 LLJ = new C1162700gMW(this) { // from class: X.0gN7
        public final /* synthetic */ MixUIContentAssem<T> LIZLLL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super("MixUIContentAssem", 0L, 6);
            this.LIZLLL = this;
        }

        @Override // X.C1162700gMW
        public final void LIZ(RavenEvent ravenEvent) {
            Class<?> cls;
            if (C1163360gNa.LIZIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReceiveEvent: ");
                sbLIZ.append(ravenEvent);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            Map<String, Class<?>> mapLo = this.LIZLLL.Lo();
            Object objLJII = null;
            if (mapLo != null && (cls = mapLo.get(ravenEvent.eventName)) != null) {
                Object obj = ravenEvent.data;
                if (obj != null) {
                    objLJII = C1741890vQh.LJII(cls, obj);
                }
                MixUIContentAssem<T> mixUIContentAssem = this.LIZLLL;
                C786410Ut5.LJJZZIII(mixUIContentAssem.LLIZLLLIL, new ARunnableS51S0300000_18(mixUIContentAssem, ravenEvent, objLJII, 2));
            }
        }
    };
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS562S0100000_18((MixUIContentAssem) this, 197));
    public volatile IRavenDataAbility LLJIJIL;
    public volatile IRavenEventAbility LLJILJIL;
    public InterfaceC665370Q7z LLJILJILJ;
    public C0QSJ LLJILLL;
    public C0QSJ LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixUIContentAssem.class, "ravenDataAbility", "getRavenDataAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenDataAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MixUIContentAssem.class, "ravenEventAbility", "getRavenEventAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenEventAbility;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public Map<String, Class<?>> Lo() {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MixEventCenterScope.class, MixDataCenterScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MixEventCenterScope.class);
        arrayList.add(MixDataCenterScope.class);
        return arrayList;
    }

    public final T Ho() {
        return (T) C723850SaN.LJFF(this, "container_context");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility Jo() {
        /*
            r4 = this;
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = r4.LLJILJIL
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = r4.LLJILJIL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLJJ     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJILJILJ     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLJILJILJ = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope> r1 = com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJ = r1     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            r1 = 0
            goto L36
        L29:
            java.lang.Class<com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility> r0 = com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3a
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = (com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility> r0 = com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility.class
            X.C687700QyG.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L36:
            r4.LLJILJIL = r1     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            return r1
        L3a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3d:
            monitor-exit(r4)
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem.Jo():com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Map<String, Class<?>> mapLo = Lo();
        if (mapLo != null) {
            Iterator<Map.Entry<String, Class<?>>> it2 = mapLo.entrySet().iterator();
            while (it2.hasNext()) {
                ((InterfaceC1165510gR3) this.LLJI.getValue()).LIZIZ(it2.next().getKey());
            }
        }
        this.LLIZLLLIL.removeCallbacksAndMessages(null);
    }

    public final void Go(SparkContext sparkContext) {
        if (C1165500gR2.LIZ.ravenEnable) {
            IRavenDataAbility iRavenDataAbility = this.LLJIJIL;
            if (iRavenDataAbility == null) {
                synchronized (this) {
                    iRavenDataAbility = this.LLJIJIL;
                    if (iRavenDataAbility == null) {
                        C0QSJ c0qsjLIZLLL = this.LLJILLL;
                        if (c0qsjLIZLLL == null) {
                            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJILJILJ;
                            if (interfaceC665370Q7zLJIIIZ == null) {
                                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                                this.LLJILJILJ = interfaceC665370Q7zLJIIIZ;
                            }
                            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MixDataCenterScope.class});
                            this.LLJILLL = c0qsjLIZLLL;
                            if (c0qsjLIZLLL == null) {
                                iRavenDataAbility = null;
                            }
                            this.LLJIJIL = iRavenDataAbility;
                        }
                        iRavenDataAbility = (IRavenDataAbility) c0qsjLIZLLL.getAbility(IRavenDataAbility.class);
                        C687700QyG.LJ(iRavenDataAbility, IRavenDataAbility.class);
                        this.LLJIJIL = iRavenDataAbility;
                    }
                }
            }
            sparkContext.LJJ(C1165930gRj.class, new C1165930gRj(iRavenDataAbility, Jo()));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        Map<String, Class<?>> mapLo = Lo();
        if (mapLo != null) {
            Iterator<Map.Entry<String, Class<?>>> it2 = mapLo.entrySet().iterator();
            while (it2.hasNext()) {
                ((InterfaceC1165510gR3) this.LLJI.getValue()).LIZ(it2.next().getKey());
            }
        }
    }

    public void No(Object obj, String str) {
        if (C1163360gNa.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRealEvent: ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(obj);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Class<?> cls;
        Object objFromJson;
        if (C1163360gNa.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEvent ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Map<String, Class<?>> mapLo = Lo();
        String str3 = null;
        if (mapLo != null && (cls = mapLo.get(str)) != null) {
            try {
                objFromJson = GsonProtectorUtils.fromJson(C1741890vQh.LJFF(), str2, (Class<Object>) cls);
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                objFromJson = null;
            }
            if (objFromJson instanceof BaseMixEvent) {
                BaseMixEvent baseMixEvent = (BaseMixEvent) objFromJson;
                C1161750gKz c1161750gKzHo = Ho();
                if (c1161750gKzHo != null) {
                    str3 = c1161750gKzHo.LIZ;
                }
                if (C703302op.LIZ(baseMixEvent.pageId) && Intrinsics.LJFF(baseMixEvent.pageId, str3)) {
                    No(objFromJson, str);
                }
            }
        }
    }
}
