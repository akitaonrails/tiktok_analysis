package com.bytedance.hybrid.spark.raven.component.builtin.spark;

import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C1161800gL4;
import X.C1162570gMJ;
import X.C1163080gN8;
import X.C13LE;
import X.C1533950q1J;
import X.C1537720q7O;
import X.C1540620qC4;
import X.C1546210qL5;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C452501pT;
import X.C679540Ql6;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.EnumC620100OTw;
import X.InterfaceC1146704e9;
import X.InterfaceC1541990qEH;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.ARunnableS118S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenDataScope;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenEventScope;
import com.lynx.tasm.TemplateData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SparkRavenUIAssem extends RavenBaseGlueDynamicComponent<RavenSparkModule> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public InterfaceC1541990qEH LLJJIII;
    public boolean LLJJIJI;
    public View LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS562S0100000_18(this, 63));
    public C1537720q7O LLJJJ;
    public RavenSparkModule LLJJJIL;
    public volatile IRavenDataAbility LLJJJJ;
    public volatile IRavenEventAbility LLJJJJJIL;
    public InterfaceC665370Q7z LLJJJJLIIL;
    public C0QSJ LLJJL;
    public C0QSJ LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SparkRavenUIAssem.class, "ravenDataAbility", "getRavenDataAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenDataAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SparkRavenUIAssem.class, "ravenEventAbility", "getRavenEventAbility()Lcom/bytedance/sdk/xbridge/protocol/impl/communication/abilities/IRavenEventAbility;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ekd;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x003a, PHI: r1
      0x0029: PHI (r1v4 X.0QSJ) = (r1v3 X.0QSJ), (r1v9 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0036, B:17:0x0038, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility lp() {
        /*
            r4 = this;
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = r4.LLJJJJJIL
            if (r1 != 0) goto L3e
            monitor-enter(r4)
            com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility r1 = r4.LLJJJJJIL     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L3d
            X.0QSJ r1 = r4.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJJJLIIL     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJJJLIIL = r3     // Catch: java.lang.Throwable -> L3a
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenEventScope> r1 = com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.RavenEventScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3a
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3a
            r4.LLJJLIIIJLLLLLLLZ = r1     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.raven.component.builtin.spark.SparkRavenUIAssem.lp():com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility");
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, X.InterfaceC1161890gLD
    public final void Ab1(BaseComponentData baseComponentData) {
        RavenSparkModule ravenSparkModule = (RavenSparkModule) baseComponentData;
        super.Ab1(ravenSparkModule);
        op(ravenSparkModule);
    }

    @Override // com.bytedance.hybrid.spark.raven.component.builtin.spark.RavenBaseGlueDynamicComponent, com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJIIJIL = view;
    }

    public final void op(RavenSparkModule ravenSparkModule) {
        ViewGroup viewGroup;
        C1537720q7O c1537720q7OLJIILIIL;
        ViewParent parent;
        ViewParent parent2;
        ViewParent parent3;
        ViewGroup viewGroup2;
        TemplateData templateDataLJIIIIZZ;
        Integer numValueOf;
        Integer numValueOf2;
        Integer num;
        String string;
        this.LLJJJIL = ravenSparkModule;
        if (ravenSparkModule.getSchema() != null && getContext() != null) {
            this.LLJJIJI = false;
            View view = this.LLJJIJIIJIL;
            Object objLJIJI = null;
            if (view != null) {
                viewGroup = (ViewGroup) view.findViewById(R.id.vso);
            } else {
                viewGroup = null;
            }
            so();
            Integer height = ravenSparkModule.getHeight();
            if (height == null || height.intValue() <= 0) {
                height = null;
            }
            C1540620qC4 c1540620qC4 = (C1540620qC4) this.LLJJIJIL.getValue();
            if (c1540620qC4 != null) {
                String itemId = ravenSparkModule.getItemId();
                String str = "";
                if (C1533950q1J.LJ(ravenSparkModule.getInitData())) {
                    templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(ravenSparkModule.getInitData());
                    Pair[] pairArr = new Pair[1];
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str2 = ravenSparkModule.updateType;
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMap.put("update_type", str2);
                    pairArr[0] = new Pair("raven_extra_info", linkedHashMap);
                    for (Map.Entry entry : ((LinkedHashMap) C2097608Jq.LJIIJ(pairArr)).entrySet()) {
                        templateDataLJIIIIZZ.LJIILIIL((String) entry.getKey(), entry.getValue());
                    }
                } else {
                    templateDataLJIIIIZZ = null;
                }
                Pair[] pairArr2 = new Pair[1];
                C1163080gN8 c1163080gN8 = (C1163080gN8) this.LLJJI.getValue();
                if (c1163080gN8 != null && (num = c1163080gN8.LLILZ) != null && (string = num.toString()) != null) {
                    str = string;
                }
                pairArr2[0] = new Pair("index", str);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr2);
                String schema = ravenSparkModule.getSchema();
                Integer width = ravenSparkModule.getWidth();
                if (width != null) {
                    C1546210qL5.LIZ.getClass();
                    numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(width)));
                } else {
                    numValueOf = null;
                }
                Integer height2 = ravenSparkModule.getHeight();
                if (height2 != null) {
                    C1546210qL5.LIZ.getClass();
                    numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C1546210qL5.LIZ(height2)));
                } else {
                    numValueOf2 = null;
                }
                c1537720q7OLJIILIIL = c1540620qC4.LJIILIIL(new C679540Ql6(itemId, templateDataLJIIIIZZ, Boolean.TRUE, mapLJIIJ, null, new C1162570gMJ(numValueOf, numValueOf2), null, null, schema, new AwS597S0100000_18(this, 734), 26976), this.LLJJJ);
            } else {
                c1537720q7OLJIILIIL = null;
            }
            this.LLJJJ = c1537720q7OLJIILIIL;
            if (c1537720q7OLJIILIIL != null) {
                parent = c1537720q7OLJIILIIL.getParent();
            } else {
                parent = null;
            }
            int iIntValue = -2;
            if (parent != null) {
                C1537720q7O c1537720q7O = this.LLJJJ;
                if (c1537720q7O != null) {
                    parent2 = c1537720q7O.getParent();
                } else {
                    parent2 = null;
                }
                if (!Intrinsics.LJFF(parent2, viewGroup)) {
                    C1537720q7O c1537720q7O2 = this.LLJJJ;
                    if (c1537720q7O2 != null) {
                        parent3 = c1537720q7O2.getParent();
                    } else {
                        parent3 = null;
                    }
                    if ((parent3 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent3) != null) {
                        C786410Ut5.LJJJLZIJ(this.LLJJJ, viewGroup2);
                    }
                    C1537720q7O c1537720q7O3 = this.LLJJJ;
                    if (c1537720q7O3 != null) {
                        if (height != null) {
                            iIntValue = height.intValue();
                        }
                        if (viewGroup != null) {
                            viewGroup.addView(c1537720q7O3, new ViewGroup.LayoutParams(-1, iIntValue));
                            viewGroup.invalidate();
                        }
                    }
                }
            } else {
                C1537720q7O c1537720q7O4 = this.LLJJJ;
                if (c1537720q7O4 != null) {
                    if (height != null) {
                        iIntValue = height.intValue();
                    }
                    if (viewGroup != null) {
                        viewGroup.addView(c1537720q7O4, new ViewGroup.LayoutParams(-1, iIntValue));
                        viewGroup.invalidate();
                    }
                }
            }
            mp(this.LLJJIJIIJIL, height);
            if (height != null) {
                C1537720q7O c1537720q7O5 = this.LLJJJ;
                if (c1537720q7O5 != null) {
                    HandlerHook.viewPost(c1537720q7O5, new ARunnableS118S0100000_18(this, 65));
                }
            } else {
                mp(this.LLJJIJIIJIL, null);
            }
            C1537720q7O c1537720q7O6 = this.LLJJJ;
            if (c1537720q7O6 != null) {
                objLJIJI = c1537720q7O6.LJIJI("updateType");
            }
            if (objLJIJI == EnumC620100OTw.UPDATE_DATA) {
                so();
            }
        }
    }

    public static void mp(View view, Integer num) {
        int iIntValue;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -2;
                }
                layoutParams.height = iIntValue;
            }
            if (view != null) {
                C786410Ut5.W5(view, layoutParams);
                view.requestLayout();
            }
        }
    }

    @Override // com.bytedance.hybrid.spark.raven.component.BaseRavenComponentDynamicAssem, X.InterfaceC1161810gL5
    public final void La(View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        C1161800gL4.LIZJ(this, view, interfaceC665370Q7z);
        C1540620qC4 c1540620qC4 = (C1540620qC4) this.LLJJIJIL.getValue();
        Integer numValueOf = null;
        if (c1540620qC4 != null) {
            C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
            numValueOf = Integer.valueOf(c1540620qC4.LJIIL(null, null, null));
        }
        mp(view, numValueOf);
        RavenSparkModule ravenSparkModule = this.LLJJJIL;
        if (ravenSparkModule != null) {
            op(ravenSparkModule);
        }
    }
}
