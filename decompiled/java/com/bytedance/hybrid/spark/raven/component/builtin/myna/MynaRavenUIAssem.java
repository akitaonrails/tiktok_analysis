package com.bytedance.hybrid.spark.raven.component.builtin.myna;

import X.AbstractC1156680gCo;
import X.C01GW;
import X.C098200Yq;
import X.C09R3;
import X.C0QSJ;
import X.C1043010dFT;
import X.C1156660gCm;
import X.C1156700gCq;
import X.C1156710gCr;
import X.C1156730gCt;
import X.C1161640gKo;
import X.C1161800gL4;
import X.C1161820gL6;
import X.C1162670gMT;
import X.C1162990gMz;
import X.C1165450gQx;
import X.C116600cO;
import X.C1168270gVV;
import X.C1168400gVi;
import X.C13LE;
import X.C189200o6;
import X.C18Z8;
import X.C2097608Jq;
import X.C21326518d5;
import X.C21326718d7;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.C989990brx;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenBaseGlueDynamicComponent;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenDataScope;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenEventScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS14S1100100_18;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS255S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MynaRavenUIAssem extends RavenBaseGlueDynamicComponent<RavenMynaModule> implements InterfaceC1146704e9 {
    public static final C989990brx LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public View LLJJIJI;
    public C1162670gMT LLJJIJIIJIL;
    public RavenMynaModule LLJJIJIL;
    public String LLJJJ;
    public RavenMynaModule LLJJJIL;
    public volatile IRavenDataAbility LLJJJJJIL;
    public volatile IRavenEventAbility LLJJJJLIIL;
    public InterfaceC665370Q7z LLJJL;
    public C0QSJ LLJJLIIIJLLLLLLLZ;
    public C0QSJ LLJL;
    public final C01GW LLJJIII = C452501pT.LIZ(EnumC452301pR.NONE, new AwS562S0100000_18(this, 62));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 61));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MynaRavenUIAssem.class, "ravenDataAbility", "getRavenDataAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenDataAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MynaRavenUIAssem.class, "ravenEventAbility", "getRavenEventAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenEventAbility;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJLIL = new C989990brx();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.eke;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{RavenDataScope.class, RavenEventScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RavenDataScope.class);
        arrayList.add(RavenEventScope.class);
        return arrayList;
    }

    public final C18Z8 op() {
        View view;
        View view2 = this.LLJJIJI;
        if (view2 != null) {
            Object parent = view2.getParent();
            while (parent != null) {
                if (parent instanceof C18Z8) {
                    return (C18Z8) parent;
                }
                if (!(parent instanceof View) || (view = (View) parent) == null) {
                    break;
                }
                parent = view.getParent();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility sp() {
        /*
            r4 = this;
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility r1 = r4.LLJJJJJIL
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility r1 = r4.LLJJJJJIL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJL     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJL = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenDataScope> r1 = com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenDataScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJLIIIJLLLLLLLZ = r1     // Catch: java.lang.Throwable -> L3a
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
            r4.LLJJJJJIL = r1     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.raven.component.builtin.myna.MynaRavenUIAssem.sp():com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility");
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJJIJIIJIL != null) {
            View view = this.LLJJIJI;
            mp(view != null ? (FrameLayout) view.findViewById(R.id.p02) : null);
            this.LLJJJIL = null;
            this.LLJJJ = null;
            this.LLJJIJIL = null;
        }
    }

    public static Map up(RavenMynaModule ravenMynaModule) {
        if (ravenMynaModule.getSchema().length() > 0) {
            String initData = ravenMynaModule.getInitData();
            if (initData != null) {
                return C116600cO.LIZJ(initData);
            }
            return C2097608Jq.LJ();
        }
        RavenMynaInstantConfigs instantConfigs = ravenMynaModule.getInstantConfigs();
        if (instantConfigs != null && instantConfigs.getDataSource() != null) {
            return C116600cO.LIZJ(ravenMynaModule.getInstantConfigs().getDataSource());
        }
        return C2097608Jq.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, X.InterfaceC1161890gLD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ab1(com.bytedance.hybrid.spark.raven.component.BaseComponentData r14) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.raven.component.builtin.myna.MynaRavenUIAssem.Ab1(com.bytedance.hybrid.spark.raven.component.BaseComponentData):void");
    }

    public final void lp(C1162670gMT c1162670gMT) {
        C1161640gKo c1161640gKo;
        C1161820gL6 c1161820gL6 = (C1161820gL6) this.LLJJIII.getValue();
        if (c1161820gL6 != null && (c1161640gKo = c1161820gL6.LIZ) != null) {
            String str = c1161640gKo.LIZ;
            C1165450gQx c1165450gQx = new C1165450gQx(str, c1161640gKo.LIZIZ, null);
            C1162990gMz c1162990gMz = c1162670gMT.LIZ;
            c1162990gMz.getClass();
            String strLIZIZ = c1162990gMz.LIZJ.LIZIZ();
            if (!Intrinsics.LJFF(str, strLIZIZ)) {
                C1168400gVi.LIZIZ(new AwS384S0200000_18(c1165450gQx, c1162990gMz, 200));
                return;
            }
            C1168270gVV.LIZ.LJIIJJI(c1165450gQx, strLIZIZ);
            C21326718d7 c21326718d7 = c1162990gMz.LJ;
            if (c21326718d7 == null) {
                return;
            }
            c21326718d7.LJIIIIZZ();
        }
    }

    public final void mp(FrameLayout frameLayout) {
        Object c098200Yq;
        ViewGroup viewGroup;
        C1162670gMT c1162670gMT = this.LLJJIJIIJIL;
        if (c1162670gMT != null) {
            ViewParent parent = c1162670gMT.LIZ().getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c1162670gMT.LIZ(), viewGroup);
            }
            C1162990gMz c1162990gMz = c1162670gMT.LIZ;
            if (!c1162990gMz.LJIIIIZZ) {
                c1162990gMz.LJIIIIZZ = true;
                try {
                    C21326518d5 c21326518d5 = c1162990gMz.LIZLLL;
                    if (c21326518d5 == null) {
                        c21326518d5 = null;
                    }
                    c21326518d5.LIZJ();
                    c1162990gMz.LIZIZ();
                    C1156700gCq c1156700gCq = c1162990gMz.LJFF;
                    if (c1156700gCq == null) {
                        c1156700gCq = null;
                    }
                    c1156700gCq.LIZ = null;
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1168400gVi.LIZIZ(new AwS255S0000000_18(thM5exceptionOrNullimpl, 11));
                }
                C1168400gVi.LIZJ(new AwS597S0100000_18(c1162990gMz, 760));
            }
        }
        this.LLJJIJIIJIL = null;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenBaseGlueDynamicComponent, com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        this.LLJJIJI = view;
        super.onViewCreated(view);
    }

    public final void tp(AbstractC1156680gCo abstractC1156680gCo) {
        String str;
        C1161820gL6 c1161820gL6;
        RavenMynaModule ravenMynaModule = this.LLJJIJIL;
        if (ravenMynaModule == null || (str = ravenMynaModule.instanceId) == null) {
            return;
        }
        if (abstractC1156680gCo instanceof C1156730gCt) {
            new C1043010dFT();
            C1043010dFT.LIZ("MynaRavenUIAssem", new AwS167S1100000_18(str, abstractC1156680gCo, 1));
            C1156730gCt c1156730gCt = (C1156730gCt) abstractC1156680gCo;
            if (c1156730gCt.LIZIZ && (c1161820gL6 = (C1161820gL6) this.LLJJIII.getValue()) != null) {
                long j = c1156730gCt.LIZ;
                if (c1161820gL6.LJFF && !c1161820gL6.LJ) {
                    if (!c1161820gL6.LJIIIZ.add(str)) {
                        new C1043010dFT();
                        C1043010dFT.LIZ("MynaMultiViews", new AwS102S1000000_18(str, 21));
                        return;
                    }
                    c1161820gL6.LIZJ = Math.max(c1161820gL6.LIZJ, j);
                    c1161820gL6.LIZLLL++;
                    new C1043010dFT();
                    C1043010dFT.LIZ("MynaMultiViews", new AwS14S1100100_18(str, j, c1161820gL6, 0));
                    if ((!c1161820gL6.LJIIJ.isEmpty()) && c1161820gL6.LJIIIZ.containsAll(c1161820gL6.LJIIJ)) {
                        c1161820gL6.LIZIZ("all-arrived");
                        return;
                    } else {
                        c1161820gL6.LJI.removeCallbacks(c1161820gL6.LJII);
                        C786410Ut5.LJJZZIII(c1161820gL6.LJI, c1161820gL6.LJII);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (!(abstractC1156680gCo instanceof C1156660gCm) && !(abstractC1156680gCo instanceof C1156710gCr)) {
            return;
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("MynaRavenUIAssem", new AwS167S1100000_18(str, abstractC1156680gCo, 2));
        C1161820gL6 c1161820gL62 = (C1161820gL6) this.LLJJIII.getValue();
        if (c1161820gL62 == null || !c1161820gL62.LJFF || c1161820gL62.LJ) {
            return;
        }
        if (!c1161820gL62.LJIIIZ.add(str)) {
            new C1043010dFT();
            C1043010dFT.LIZ("MynaMultiViews", new AwS102S1000000_18(str, 22));
            return;
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("MynaMultiViews", new AwS167S1100000_18(str, c1161820gL62, 15));
        if ((!c1161820gL62.LJIIJ.isEmpty()) && c1161820gL62.LJIIIZ.containsAll(c1161820gL62.LJIIJ)) {
            c1161820gL62.LIZIZ("all-arrived (with fails)");
        } else {
            c1161820gL62.LJI.removeCallbacks(c1161820gL62.LJII);
            C786410Ut5.LJJZZIII(c1161820gL62.LJI, c1161820gL62.LJII);
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, X.InterfaceC1161810gL5
    public final void La(View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        C1161800gL4.LIZJ(this, view, interfaceC665370Q7z);
    }
}
