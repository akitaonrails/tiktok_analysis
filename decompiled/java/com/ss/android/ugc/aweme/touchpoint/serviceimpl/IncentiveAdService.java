package com.ss.android.ugc.aweme.touchpoint.serviceimpl;

import X.C01GW;
import X.C01U6;
import X.C1031810cxP;
import X.C1032720cys;
import X.C1033280czm;
import X.C1033320czq;
import X.C1033360czu;
import X.C1033460d04;
import X.C1033850d0h;
import X.C1697810uHb;
import X.C1894700zPA;
import X.C1898190zUn;
import X.C1925407gS;
import X.C19EG;
import X.C2178808gE;
import X.C452501pT;
import X.EnumC1033270czl;
import X.InterfaceC1032100cxs;
import X.InterfaceC1033100czU;
import X.InterfaceC1033840d0g;
import X.InterfaceC1898200zUo;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.touchpoint.api.model.ReportInstruction;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.service.IIncentiveAdService;
import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class IncentiveAdService implements IIncentiveAdService {
    public WeakReference<C19EG> LIZ;
    public WeakReference<Fragment> LIZIZ;
    public WeakReference<ViewGroup> LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public Map<String, String> LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 588));

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final C19EG LJFF() {
        WeakReference<C19EG> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final void exit() {
        InterfaceC1032100cxs interfaceC1032100cxsLJ;
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService == null || (interfaceC1032100cxsLJ = iCommerceSaasService.LJ()) == null) {
            return;
        }
        interfaceC1032100cxsLJ.exit(true);
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final void pause() {
        InterfaceC1032100cxs interfaceC1032100cxsLJ;
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService == null || (interfaceC1032100cxsLJ = iCommerceSaasService.LJ()) == null) {
            return;
        }
        interfaceC1032100cxsLJ.pause();
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final void resume() {
        InterfaceC1032100cxs interfaceC1032100cxsLJ;
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService == null || (interfaceC1032100cxsLJ = iCommerceSaasService.LJ()) == null) {
            return;
        }
        interfaceC1032100cxsLJ.resume();
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final boolean LJI() {
        return this.LJ;
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final Map<String, String> LJIIJ() {
        return this.LJFF;
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final boolean LJ(HashMap map) {
        InterfaceC1033840d0g interfaceC1033840d0gLJI;
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService != null && (interfaceC1033840d0gLJI = iCommerceSaasService.LJI()) != null && interfaceC1033840d0gLJI.hasPreloadAd(map)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final boolean LJIIIIZZ(Integer num) {
        int value = EnumC1033270czl.RE_ENGAGEMENT.getValue();
        if (num != null && num.intValue() == value) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final void LJIIJJI(List list) {
        InterfaceC1033840d0g interfaceC1033840d0gLJI;
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService != null && (interfaceC1033840d0gLJI = iCommerceSaasService.LJI()) != null) {
            interfaceC1033840d0gLJI.preload(list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[PHI: r1
      0x0041: PHI (r1v7 java.lang.String) = (r1v5 java.lang.String), (r1v8 java.lang.String) binds: [B:19:0x003f, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(java.util.List<java.lang.String> r10) {
        /*
            r9 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r10.iterator()
        L9:
            boolean r0 = r6.hasNext()
            r8 = 0
            if (r0 == 0) goto L55
            java.lang.Object r4 = r6.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.gson.Gson r1 = X.C20484080s.LIZIZ()     // Catch: java.lang.Exception -> L50
            java.lang.Class<com.bytedance.touchpoint.core.model.PrefetchIncentiveAdParam> r0 = com.bytedance.touchpoint.core.model.PrefetchIncentiveAdParam.class
            java.lang.Object r1 = r1.LJII(r4, r0)     // Catch: java.lang.Exception -> L50
            com.bytedance.touchpoint.core.model.PrefetchIncentiveAdParam r1 = (com.bytedance.touchpoint.core.model.PrefetchIncentiveAdParam) r1     // Catch: java.lang.Exception -> L50
            if (r1 == 0) goto L9
            com.bytedance.touchpoint.core.model.PrefetchIncentiveAdRequestParam r0 = r1.requestParams
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.taskId
            r3 = 0
            if (r0 == 0) goto L9
            int r0 = r0.length()
            if (r0 == 0) goto L9
            X.0d04 r2 = new X.0d04
            com.bytedance.touchpoint.core.model.PrefetchIncentiveAdRequestParam r0 = r1.requestParams
            if (r0 == 0) goto L3d
            java.lang.String r1 = r0.taskId
            if (r1 != 0) goto L41
        L3d:
            java.lang.String r1 = ""
            if (r0 == 0) goto L49
        L41:
            java.lang.Integer r0 = r0.index
            if (r0 == 0) goto L49
            int r3 = r0.intValue()
        L49:
            r2.<init>(r1, r3, r4)
            r5.add(r2)
            goto L9
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L9
        L55:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
            X.0czm r2 = new X.0czm
            X.0czl r0 = X.EnumC1033270czl.TASK_CENTER
            r2.<init>(r0, r1)
            java.lang.Class<com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService> r3 = com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService.class
            r4 = 0
            r7 = 14
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService r0 = (com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService) r0
            if (r0 == 0) goto L7f
            X.0czU r1 = r0.LJFF()
            if (r1 == 0) goto L7f
            r0 = 353(0x161, float:4.95E-43)
            kotlin.jvm.internal.AFwS252S0000000_16 r0 = kotlin.jvm.internal.AFwS252S0000000_16.get$arr$(r0)
            r1.requestWithConfig(r2, r8, r0)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.touchpoint.serviceimpl.IncentiveAdService.LJIIL(java.util.List):void");
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final void LJIIIZ(boolean z, Boolean bool) {
        InterfaceC1032100cxs interfaceC1032100cxsLJ;
        InterfaceC1032100cxs interfaceC1032100cxsLJ2;
        if (bool == null) {
            ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
            if (iCommerceSaasService != null && (interfaceC1032100cxsLJ2 = iCommerceSaasService.LJ()) != null) {
                interfaceC1032100cxsLJ2.taskCompleted(z, null, null);
                return;
            }
            return;
        }
        ICommerceSaasService iCommerceSaasService2 = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService2 == null || (interfaceC1032100cxsLJ = iCommerceSaasService2.LJ()) == null) {
            return;
        }
        interfaceC1032100cxsLJ.taskCompleted(z, null, new C1032720cys(bool.booleanValue()));
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final String LIZIZ(int i, int i2, String str) {
        InterfaceC1033100czU interfaceC1033100czULJFF;
        EnumC1033270czl.Companion.getClass();
        C1033320czq c1033320czq = new C1033320czq(i, str, C1033360czu.LIZ(i2));
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService == null || (interfaceC1033100czULJFF = iCommerceSaasService.LJFF()) == null) {
            return null;
        }
        return interfaceC1033100czULJFF.requestIdWithCacheConfig(c1033320czq, null);
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final void LJII(int i, int i2, String str) {
        InterfaceC1033100czU interfaceC1033100czULJFF;
        EnumC1033270czl.Companion.getClass();
        C1033320czq c1033320czq = new C1033320czq(i, str, C1033360czu.LIZ(i2));
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService != null && (interfaceC1033100czULJFF = iCommerceSaasService.LJFF()) != null) {
            interfaceC1033100czULJFF.clearWithCacheConfig(c1033320czq);
        }
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final void LIZ(int i, String str, Integer num, String str2) {
        EnumC1033270czl enumC1033270czlLIZ;
        InterfaceC1033100czU interfaceC1033100czULJFF;
        C1033460d04 c1033460d04 = new C1033460d04(str, i, str2);
        if (num == null) {
            enumC1033270czlLIZ = EnumC1033270czl.UNKNOWN;
        } else {
            C1033360czu c1033360czu = EnumC1033270czl.Companion;
            int iIntValue = num.intValue();
            c1033360czu.getClass();
            enumC1033270czlLIZ = C1033360czu.LIZ(iIntValue);
        }
        C1033280czm c1033280czm = new C1033280czm(enumC1033270czlLIZ, C1697810uHb.LJIILJJIL(c1033460d04));
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService != null && (interfaceC1033100czULJFF = iCommerceSaasService.LJFF()) != null) {
            interfaceC1033100czULJFF.requestWithConfig(c1033280czm, null, AFwS231S0000000_3.get$arr$(154));
        }
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final void LIZLLL(String str, int i, String str2, String str3, String str4, int i2, List list) {
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        List<TaskEvent> list2 = C2178808gE.LIZ().LIZIZ;
        if (list2 != null) {
            for (TaskEvent taskEvent : list2) {
                if (Intrinsics.LJFF(taskEvent.taskEventKey, str)) {
                    if (taskEvent != null) {
                        this.LIZLLL = str;
                        this.LJ = false;
                        this.LJI = false;
                        this.LJII = false;
                        this.LJIIIIZZ = false;
                        this.LJIIIZ = null;
                        C01U6.LIZIZ(new C1033850d0h(str2, str3, str4, this, str, i, i2, list));
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.touchpoint.api.service.IIncentiveAdService
    public final void LIZJ(Context context, int i, int i2, String str, String str2, String str3, String str4, List<String> list, String str5, String str6) {
        TaskEvent next;
        InterfaceC1032100cxs interfaceC1032100cxsLJ;
        int iIntValue;
        Integer num;
        InterfaceC1898200zUo interfaceC1898200zUoLIZJ;
        String str7 = str6;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        List<TaskEvent> list2 = C2178808gE.LIZ().LIZIZ;
        if (list2 != null) {
            Iterator<TaskEvent> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.taskEventKey, str7)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TaskEvent taskEvent = next;
            if (taskEvent != null) {
                this.LIZLLL = str7;
                boolean zLJFF = false;
                this.LJ = false;
                this.LJI = false;
                this.LJII = false;
                this.LJIIIIZZ = false;
                this.LJIIIZ = null;
                C1925407gS.LIZ.getClass();
                HashMap<String, Object> mapLIZJ = C1925407gS.LIZJ(str3);
                HashMap<String, String> mapLIZLLL = C1925407gS.LIZLLL(str4);
                HashMap<String, Object> mapLIZJ2 = C1925407gS.LIZJ(str5);
                this.LJFF = mapLIZLLL;
                IMultiDomainService iMultiDomainService = (IMultiDomainService) PluggableExtentionKt.pluggableSpi$default(IMultiDomainService.class, false, false, false, 14, null);
                Object objValueOf = "";
                if (iMultiDomainService != null && (interfaceC1898200zUoLIZJ = iMultiDomainService.LIZJ()) != null) {
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (mapLIZJ != null) {
                        zLJFF = Intrinsics.LJFF(mapLIZJ.get("enable_prefetch"), Boolean.TRUE);
                    }
                    interfaceC1898200zUoLIZJ.LJIIIIZZ(i, i2, str7, str, str2, str4, list, zLJFF);
                }
                ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
                if (iCommerceSaasService != null) {
                    IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
                    if (iAppContextService != null) {
                        objValueOf = Integer.valueOf(iAppContextService.getAppId());
                    }
                    objValueOf.toString();
                    ReportInstruction reportInstruction = taskEvent.reportInstruction;
                    if (reportInstruction != null && (num = reportInstruction.reportBatch) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 20;
                    }
                    iCommerceSaasService.LIZLLL(new C1031810cxP(Integer.valueOf(iIntValue), true, true, context, 224), (C1898190zUn) this.LJIIJ.getValue());
                }
                ICommerceSaasService iCommerceSaasService2 = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
                if (iCommerceSaasService2 != null && (interfaceC1032100cxsLJ = iCommerceSaasService2.LJ()) != null) {
                    interfaceC1032100cxsLJ.start(true, mapLIZJ, mapLIZLLL, mapLIZJ2, null);
                }
            }
        }
    }
}
