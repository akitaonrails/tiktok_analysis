package com.ss.android.ugc.aweme.ecommerce.mix.view;

import X.C03NS;
import X.C09R3;
import X.C0QSJ;
import X.C1161040gJq;
import X.C1161210gK7;
import X.C1162160gLe;
import X.C1162560gMI;
import X.C1162700gMW;
import X.C1162720gMY;
import X.C1163360gNa;
import X.C13LE;
import X.C18Z8;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C687700QyG;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ARunnableS51S0300000_18;
import Y.ARunnableS87S0200000_18;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixDataCenterScope;
import com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope;
import com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class ECBaseMixTabFragment extends RavenFragment<C1162160gLe> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLZIL;
    public final BPEAHandler LLLLLLL = new BPEAHandler(Looper.getMainLooper());
    public final C1162560gMI LLLLLLLLL = new C1162700gMW() { // from class: X.0gMI
        {
            super("MixUIContentAssem", 0L, 6);
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
            Map<String, Class<?>> mapHU = this.LIZLLL.hU();
            if (mapHU != null) {
                cls = mapHU.get(ravenEvent.eventName);
            } else {
                cls = null;
            }
            if (!Intrinsics.LJFF(cls, JavaOnlyMap.class) && !Intrinsics.LJFF(cls, JavaOnlyArray.class)) {
                if (cls != null) {
                    Object objLJII = C1741890vQh.LJII(cls, ravenEvent.data);
                    ECBaseMixTabFragment eCBaseMixTabFragment = this.LIZLLL;
                    C786410Ut5.LJJZZIII(eCBaseMixTabFragment.LLLLLLL, new ARunnableS51S0300000_18(eCBaseMixTabFragment, ravenEvent, objLJII, 1));
                    return;
                }
                return;
            }
            ECBaseMixTabFragment eCBaseMixTabFragment2 = this.LIZLLL;
            C786410Ut5.LJJZZIII(eCBaseMixTabFragment2.LLLLLLL, new ARunnableS87S0200000_18(eCBaseMixTabFragment2, ravenEvent, 4));
        }
    };
    public volatile IRavenDataAbility LLLLLLLLLL;
    public volatile IRavenEventAbility LLLLLLLZIL;
    public InterfaceC665370Q7z LLLLLLZ;
    public C0QSJ LLLLLLZZ;
    public C0QSJ LLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECBaseMixTabFragment.class, "ravenDataAbility", "getRavenDataAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenDataAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ECBaseMixTabFragment.class, "ravenEventAbility", "getRavenEventAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenEventAbility;", 0);
        c09r3.getClass();
        LLLLLZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final void RR() {
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public C1161040gJq VT(C1161040gJq c1161040gJq) {
        return c1161040gJq;
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final void ZR() {
    }

    public C03NS cU() {
        return null;
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MixEventCenterScope.class, MixDataCenterScope.class});
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(MixEventCenterScope.class);
        arrayList.add(MixDataCenterScope.class);
        return arrayList;
    }

    public abstract Map<String, Class<?>> hU();

    public abstract void jU(Object obj, String str);

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment
    public final C1162720gMY<C1162160gLe> WR() {
        return new C1162720gMY<>(new Object() { // from class: X.0gLe
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility dU() {
        /*
            r4 = this;
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility r1 = r4.LLLLLLLLLL
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility r1 = r4.LLLLLLLLLL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLLLLLZZ     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLLLLZ     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLLLLLZ = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.mix.base.MixDataCenterScope> r1 = com.ss.android.ugc.aweme.ecommerce.mix.base.MixDataCenterScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLLLLLZZ = r1     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            r1 = 0
            goto L36
        L29:
            java.lang.Class<com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility> r0 = com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility.class
            java.lang.Object r1 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3a
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility r1 = (com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility> r0 = com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility.class
            X.C687700QyG.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3a
        L36:
            r4.LLLLLLLLLL = r1     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment.dU():com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility eU() {
        /*
            r4 = this;
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = r4.LLLLLLLZIL
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = r4.LLLLLLLZIL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLLLLZ     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLLLLLZ     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLLLLLZ = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope> r1 = com.ss.android.ugc.aweme.ecommerce.mix.base.MixEventCenterScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLLLLZ = r1     // Catch: java.lang.Throwable -> L3a
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
            r4.LLLLLLLZIL = r1     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment.eU():com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility");
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Map<String, Class<?>> mapHU = hU();
        if (mapHU != null) {
            Iterator<Map.Entry<String, Class<?>>> it2 = mapHU.entrySet().iterator();
            while (it2.hasNext()) {
                eU().Fk2(it2.next().getKey(), this.LLLLLLLLL.LIZIZ);
            }
        }
        this.LLLLLLL.removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C18Z8 c18z8 = this.LLJILJIL;
        if (c18z8 != null) {
            c18z8.clearOnScrollListeners();
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        new C1161210gK7(Ay()).LIZ();
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        this.LLILLJJLI = dU();
        this.LL = eU();
        Map<String, Class<?>> mapHU = hU();
        if (mapHU != null) {
            Iterator<Map.Entry<String, Class<?>>> it2 = mapHU.entrySet().iterator();
            while (it2.hasNext()) {
                eU().Lp0(it2.next().getKey(), this.LLLLLLLLL);
            }
        }
        super.onCreate(bundle);
    }

    public final void kU(String str, JavaOnlyMap javaOnlyMap) {
        if (C1163360gNa.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("postEvent: ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(javaOnlyMap);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        eU().dZ1(new RavenEvent(str, -1L, javaOnlyMap));
    }

    @Override // com.bytedance.hybrid.spark.raven.page.RavenFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C03NS c03nsCU = cU();
        if (c03nsCU != null) {
            c03nsCU.LIZIZ(this.LLJILJIL);
        }
    }
}
