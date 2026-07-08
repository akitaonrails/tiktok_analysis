package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC1076640e7i;
import X.AbstractC19875512pd;
import X.C09GI;
import X.C09GK;
import X.C0SRQ;
import X.C0Z0Y;
import X.C1121990fIr;
import X.C123100dR;
import X.C1300840jxK;
import X.C1533710q0v;
import X.C1551950qUL;
import X.C1552050qUV;
import X.C1727970v4F;
import X.C1728000v4I;
import X.C1A5L;
import X.C2213321Bju;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2280601EOk;
import X.C786410Ut5;
import X.C794320VDy;
import X.C837920Wty;
import X.InterfaceC1123070fKb;
import X.InterfaceC882520Yji;
import X.InterfaceC892690Z0h;
import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.util.LruCache;
import android.view.View;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tars.TarsInstConfig;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveHostPCS implements IHostPCS {
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zC2() {
        /*
            r9 = this;
            r2 = 0
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r3 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            r4 = 0
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2f
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2a
            java.lang.String r1 = r0.getBindPhone()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2a
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L2f
            if (r0 <= 0) goto L24
            goto L26
        L24:
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L2f
            goto L3b
        L2f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L3b:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L42
            r2 = r1
        L42:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.LiveHostPCS.zC2():java.lang.String");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final String F12() {
        C2213321Bju.LIZ.getClass();
        return "pitaya_output";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final String e60() {
        C2213321Bju.LIZ.getClass();
        return "text";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final String t52() {
        IAdAutofillService iAdAutofillService = (IAdAutofillService) PluggableExtentionKt.pluggableSpi$default(IAdAutofillService.class, false, false, false, 14, null);
        if (iAdAutofillService != null && iAdAutofillService.LJIIL()) {
            return iAdAutofillService.LJIILIIL();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final void GP(View view) {
        C2271391DvN.LIZ(view, (C1A5L) C2271381DvM.LLFZ.getValue());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final void Pz(C09GI c09gi) {
        C0Z0Y c0z0yLIZJ;
        C2213321Bju.LIZ.getClass();
        TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
        if (tarsSharedInterface != null && (c0z0yLIZJ = tarsSharedInterface.LIZJ(c09gi.LIZ, new TarsInstConfig(true))) != null) {
            c0z0yLIZJ.release();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final C1728000v4I S40(Context context) {
        Resources resources = context.getResources();
        String string = resources.getString(2131847134);
        String string2 = resources.getString(2131842799);
        resources.getString(2131837665);
        return new C1728000v4I(string, string2, resources.getString(R.string.f99));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final List<C1727970v4F> Zt2(Context context) {
        String string;
        boolean z;
        C2280601EOk c2280601EOk = C2280601EOk.LJFF;
        AbstractC19875512pd<C2280601EOk> abstractC19875512pd = C2280601EOk.LJI;
        ArrayList arrayList = new ArrayList();
        for (C2280601EOk c2280601EOk2 : abstractC19875512pd) {
            C1727970v4F c1727970v4F = null;
            try {
                string = context.getResources().getString(c2280601EOk2.LIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = null;
            }
            if (string != null && string.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                string.toString();
                c1727970v4F = new C1727970v4F(string, c2280601EOk2.LIZIZ, c2280601EOk2.LIZJ, c2280601EOk2.LIZLLL);
            }
            if (c1727970v4F != null) {
                arrayList.add(c1727970v4F);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final void b02(final C1121990fIr c1121990fIr) {
        C0Z0Y c0z0yLIZJ;
        C2213321Bju.LIZ.getClass();
        TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
        if (tarsSharedInterface != null && (c0z0yLIZJ = tarsSharedInterface.LIZJ(C1121990fIr.LIZ(), new TarsInstConfig(true))) != null) {
            c0z0yLIZJ.LJFF(new InterfaceC882520Yji() { // from class: X.0fJ0
                @Override // X.InterfaceC882520Yji
                public final void LIZIZ(Map<String, ? extends Object> map) {
                }

                @Override // X.InterfaceC882520Yji
                public final void LIZ(C892820Z0u c892820Z0u) {
                    String message = c892820Z0u.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c1121990fIr.LIZJ().invoke(new C1122070fIz(new C1122110fJ3(-999, message)));
                }

                @Override // X.InterfaceC882520Yji
                public final void onSuccess(Object obj) {
                    c1121990fIr.LIZJ().invoke(new AbstractC1122060fIy(new C1122100fJ2(null, null)) { // from class: X.0fJ1
                        public final C1122100fJ2 LIZ;

                        public final boolean equals(Object obj2) {
                            if (this == obj2) {
                                return true;
                            }
                            return (obj2 instanceof C1122090fJ1) && Intrinsics.LJFF(this.LIZ, ((C1122090fJ1) obj2).LIZ);
                        }

                        public final int hashCode() {
                            return this.LIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Success(result=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LIZ = c1122100fJ2;
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final void bc2(final C09GK c09gk) {
        final C0Z0Y c0z0yLIZJ;
        C2213321Bju.LIZ.getClass();
        TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
        if (tarsSharedInterface != null) {
            c0z0yLIZJ = tarsSharedInterface.LIZJ(c09gk.LIZIZ, new TarsInstConfig(true));
        } else {
            c0z0yLIZJ = null;
        }
        InterfaceC882520Yji interfaceC882520Yji = new InterfaceC882520Yji() { // from class: X.0fK3
            @Override // X.InterfaceC882520Yji
            public final void LIZIZ(Map<String, ? extends Object> map) {
            }

            @Override // X.InterfaceC882520Yji
            public final void LIZ(C892820Z0u c892820Z0u) {
                String message = c892820Z0u.getMessage();
                if (message == null) {
                    message = "";
                }
                c09gk.LIZJ().invoke(new C1122720fK2(new C1122110fJ3(-999, message)));
            }

            @Override // X.InterfaceC882520Yji
            public final void onSuccess(Object obj) {
                final C1122100fJ2 c1122100fJ2 = new C1122100fJ2(null, null);
                c09gk.LIZJ().invoke(new AbstractC1122920fKM(c1122100fJ2) { // from class: X.0fK4
                    public final C1122100fJ2 LIZ;

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof C1122740fK4) && Intrinsics.LJFF(this.LIZ, ((C1122740fK4) obj2).LIZ);
                    }

                    public final int hashCode() {
                        return this.LIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Success(result=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = c1122100fJ2;
                    }
                });
                c09gk.LIZ();
                C0Z0Y c0z0y = c0z0yLIZJ;
                if (c0z0y != null) {
                    c0z0y.LIZ(null);
                }
            }
        };
        if (c0z0yLIZJ != null) {
            c0z0yLIZJ.LJI(interfaceC882520Yji);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final void jU0(View view) {
        C2271391DvN.LIZ(view, (C1A5L) C2271381DvM.LLI.getValue());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final void jb2(String str) {
        C0Z0Y c0z0yLIZJ;
        C2213321Bju.LIZ.getClass();
        TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
        if (tarsSharedInterface != null && (c0z0yLIZJ = tarsSharedInterface.LIZJ(str, new TarsInstConfig(true))) != null) {
            c0z0yLIZJ.release();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final void mc0(final SparkContext sparkContext) {
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(sparkContext, false);
        if (iResourceServiceXLIZIZ != null) {
            sparkContext.LJJ(IResourceServiceX.class, iResourceServiceXLIZIZ.copyAndModifyConfig(new AbstractC1076640e7i() { // from class: X.0dTI
                @Override // X.AbstractC1076640e7i
                public final C1533560q0g LIZ(C1533560q0g c1533560q0g) {
                    String strK0;
                    SparkContext sparkContext2 = sparkContext;
                    IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) PluggableExtentionKt.pluggableSpi$default(IAdLandPagePreloadService.class, false, false, false, 14, null);
                    if (iAdLandPagePreloadService != null && (strK0 = iAdLandPagePreloadService.K0("lynx_feed")) != null) {
                        sparkContext2.LJJJZ("access_key", strK0);
                        C1533570q0h c1533570q0h = c1533560q0g.LIZIZ;
                        if (c1533570q0h != null) {
                            c1533570q0h.LIZ = strK0;
                        }
                    }
                    return c1533560q0g;
                }
            }));
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final void ok1(final InterfaceC1123070fKb interfaceC1123070fKb) {
        TarsSharedInterface tarsSharedInterface;
        C0Z0Y c0z0yLIZJ;
        C2213321Bju.LIZ.getClass();
        if (interfaceC1123070fKb.isActive() && (tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null)) != null && (c0z0yLIZJ = tarsSharedInterface.LIZJ(interfaceC1123070fKb.getScene(), new TarsInstConfig(true))) != null) {
            c0z0yLIZJ.LJIIIIZZ(interfaceC1123070fKb.LIZ(), new InterfaceC892690Z0h() { // from class: X.0fKa
                @Override // X.InterfaceC892690Z0h
                public final void LIZ(C882890YkJ c882890YkJ) {
                    C1512100pS4 c1512100pS4;
                    int i;
                    Map<String, Object> map;
                    boolean z = c882890YkJ.LJ;
                    Object obj = ((LinkedHashMap) c882890YkJ.LIZJ).get(interfaceC1123070fKb.LIZIZ());
                    Map<String, Float> map2 = null;
                    if (obj instanceof C1512100pS4) {
                        c1512100pS4 = (C1512100pS4) obj;
                    } else {
                        c1512100pS4 = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("output:");
                    sbLIZ.append(c882890YkJ.LIZJ);
                    C20441214yg.LIZIZ("PCSIntelligenceManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (z) {
                        if (c1512100pS4 != null) {
                            map = c1512100pS4.LJFF;
                            map2 = c1512100pS4.LIZJ;
                        } else {
                            map = null;
                        }
                        interfaceC1123070fKb.LIZJ().invoke(new C1122130fJ5(new C1122100fJ2(map, map2)));
                        return;
                    }
                    if (c1512100pS4 != null) {
                        i = c1512100pS4.LIZ;
                    } else {
                        i = -999;
                    }
                    interfaceC1123070fKb.LIZJ().invoke(new C1122120fJ4(new C1122110fJ3(i, String.valueOf(c1512100pS4))));
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final C1727970v4F uX(Context context) {
        TelephonyManager telephonyManager;
        Object objH2 = C786410Ut5.H2(context, "phone");
        String strLIZIZ = null;
        if (objH2 instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) objH2;
        } else {
            telephonyManager = null;
        }
        C2280601EOk c2280601EOk = C2280601EOk.LJFF;
        if (telephonyManager != null) {
            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
            strLIZIZ = C1300840jxK.LJIIIIZZ(telephonyManager);
        }
        if (strLIZIZ == null || strLIZIZ.length() == 0) {
            LruCache<Integer, String> lruCache = C0SRQ.LIZ;
            strLIZIZ = C837920Wty.LIZIZ(Locale.getDefault());
        }
        if (C123100dR.LIZ(strLIZIZ)) {
            for (C2280601EOk c2280601EOk2 : C2280601EOk.LJI) {
                if (u.LJIJI(c2280601EOk2.LIZJ, strLIZIZ, true)) {
                    c2280601EOk = c2280601EOk2;
                }
            }
        }
        return new C1727970v4F(context.getResources().getString(c2280601EOk.LIZ), c2280601EOk.LIZIZ, c2280601EOk.LIZJ, c2280601EOk.LIZLLL);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPCS
    public final void zP2(List list) {
        if (list == null) {
            return;
        }
        String strK0 = null;
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) PluggableExtentionKt.pluggableSpi$default(IAdLandPagePreloadService.class, false, false, false, 14, null);
        if (iAdLandPagePreloadService != null) {
            strK0 = iAdLandPagePreloadService.K0("lynx_feed");
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
            targetChannel.channelName = str;
            arrayList.add(targetChannel);
        }
        if (strK0 != null) {
            map.put(strK0, arrayList);
            C1551950qUL c1551950qULLJIILJJIL = C1552050qUV.LJIILJJIL(strK0, null);
            if (c1551950qULLJIILJJIL != null) {
                c1551950qULLJIILJJIL.LIZIZ("default", null, map, null);
            }
        }
    }
}
