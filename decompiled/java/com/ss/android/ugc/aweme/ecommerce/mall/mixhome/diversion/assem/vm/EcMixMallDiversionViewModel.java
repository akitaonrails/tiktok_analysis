package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm;

import X.C01GW;
import X.C098200Yq;
import X.C09R9;
import X.C0C64;
import X.C0PEM;
import X.C1120604Zw;
import X.C1121904a9;
import X.C13LE;
import X.C1741090vPP;
import X.C1741120vPS;
import X.C1741890vQh;
import X.C1767790w6T;
import X.C1767980w6m;
import X.C1768050w6t;
import X.C189200o6;
import X.C1AF0;
import X.C21176017tu;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C2371409Qy;
import X.C452501pT;
import X.C597620NcG;
import X.C7879035x;
import X.C948503nH;
import X.InterfaceC0148002o;
import X.InterfaceC606320NqI;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import defpackage.MixMallPitayaFetchByLynxExperiment;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallDiversionViewModel extends AssemViewModel<InterfaceC0148002o> {
    public final ShopMallMixFragment LL;
    public final InterfaceC606320NqI LLILLJJLI;
    public final C1768050w6t LLILLL;
    public long LLILZIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1386));
    public final C09R9 LLILZLL = new C09R9(this, C13LE.LIZ(C597620NcG.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new InterfaceC0148002o() { // from class: X.0vPQ
        };
    }

    public static boolean vQ2() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        MixMallPitayaFetchByLynxExperiment.MixMallPitayaFetchByLynxModel mixMallPitayaFetchByLynxModel = MixMallPitayaFetchByLynxExperiment.LIZ;
        MixMallPitayaFetchByLynxExperiment.MixMallPitayaFetchByLynxModel mixMallPitayaFetchByLynxModel2 = (MixMallPitayaFetchByLynxExperiment.MixMallPitayaFetchByLynxModel) c0c64LJIILLIIL.LJJII(MixMallPitayaFetchByLynxExperiment.MixMallPitayaFetchByLynxModel.class, mixMallPitayaFetchByLynxModel, "mix_mall_inner_push", true);
        if (mixMallPitayaFetchByLynxModel2 != null) {
            mixMallPitayaFetchByLynxModel = mixMallPitayaFetchByLynxModel2;
        }
        return mixMallPitayaFetchByLynxModel.fetchByLynx;
    }

    public static void yQ2(Long l) {
        if (C7879035x.LIZLLL()) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcUgPitaya save req cooldown time: ");
            sbLIZ.append(l);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            if (l != null) {
                l.longValue();
                if (l.longValue() > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() + (l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    IEcUgPitayaService iEcUgPitayaService = (IEcUgPitayaService) ServiceManager.get().getService(IEcUgPitayaService.class);
                    iEcUgPitayaService.LIZLLL(Long.valueOf(jCurrentTimeMillis));
                    iEcUgPitayaService.LIZ(Long.valueOf(jCurrentTimeMillis));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("EcUgPitaya save req cooldown time ts: ");
                    sbLIZ2.append(jCurrentTimeMillis);
                    C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("EcUgPitaya save req cooldown time: ");
            sbLIZ3.append(l);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            c2341109Fh2.getClass();
            C2341109Fh.LIZ(strLIZIZ2);
            if (l != null) {
                l.longValue();
                if (l.longValue() > 0) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() + (l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    IEcUgPitayaService iEcUgPitayaService2 = (IEcUgPitayaService) ServiceManager.get().getService(IEcUgPitayaService.class);
                    iEcUgPitayaService2.LIZLLL(Long.valueOf(jCurrentTimeMillis2));
                    iEcUgPitayaService2.LIZ(Long.valueOf(jCurrentTimeMillis2));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("EcUgPitaya save req cooldown time ts: ");
                    sbLIZ4.append(jCurrentTimeMillis2);
                    C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void wQ2(ReachCfgDataForMall reachCfgDataForMall, String str) {
        boolean z = false;
        if (reachCfgDataForMall != null) {
            long j = this.LLILZIL;
            long j2 = reachCfgDataForMall.createTime;
            if (j == j2) {
                z = true;
            }
            this.LLILZIL = j2;
        }
        C948503nH.LJI(this, C0PEM.LIZJ, new C1741120vPS(reachCfgDataForMall, this, z, str, null));
    }

    public final void xQ2(C1741090vPP c1741090vPP, String str) {
        String str2;
        ReachCfgDataForMall reachCfgDataForMall = null;
        if (c1741090vPP != null && (str2 = c1741090vPP.LIZ) != null && !a0.LJJJIL(str2)) {
            reachCfgDataForMall = new ReachCfgDataForMall(str2, c1741090vPP.LIZIZ, false, false, false, null, null, c1741090vPP.LJFF);
        }
        wQ2(reachCfgDataForMall, str);
    }

    public final void zQ2(long j, String str) {
        Type type;
        Type type2;
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        String str2 = null;
        if (C7879035x.LIZLLL()) {
            if (str != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    c1120604Zw.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type2 = C2371409Qy.LIZJ(C13LE.LJII(ReachCfgData.class));
                    } else {
                        type2 = new TypeToken<ReachCfgData>() { // from class: X.0vPR
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type2);
                    if (!(objFromJson instanceof ReachCfgData)) {
                        objFromJson = null;
                    }
                    ReachCfgData reachCfgData = (ReachCfgData) objFromJson;
                    if (reachCfgData != null) {
                        ReachCfgDataForMall reachCfgDataForMall = new ReachCfgDataForMall(str, reachCfgData, false, false, false, null, null, j);
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("EcUgPitaya send data to lynx");
                        this.LL.LLJJJ.getClass();
                        C1767790w6T c1767790w6T = C1767980w6m.LJII;
                        if (c1767790w6T != null) {
                            str2 = c1767790w6T.LJIIIZ;
                        }
                        wQ2(reachCfgDataForMall, str2);
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        if (str != null) {
            try {
                try {
                    Gson gsonLJFF2 = C1741890vQh.LJFF();
                    c1120604Zw.getClass();
                    C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(ReachCfgData.class));
                    } else {
                        type = new TypeToken<ReachCfgData>() { // from class: X.0vPR
                        }.getType();
                    }
                    Object objLJIIIIZZ = gsonLJFF2.LJIIIIZZ(str, type);
                    if (!(objLJIIIIZZ instanceof ReachCfgData)) {
                        objLJIIIIZZ = null;
                    }
                    ReachCfgData reachCfgData2 = (ReachCfgData) objLJIIIIZZ;
                    if (reachCfgData2 != null) {
                        ReachCfgDataForMall reachCfgDataForMall2 = new ReachCfgDataForMall(str, reachCfgData2, false, false, false, null, null, j);
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LIZ("EcUgPitaya send data to lynx");
                        this.LL.LLJJJ.getClass();
                        C1767790w6T c1767790w6T2 = C1767980w6m.LJII;
                        if (c1767790w6T2 != null) {
                            str2 = c1767790w6T2.LJIIIZ;
                        }
                        wQ2(reachCfgDataForMall2, str2);
                    }
                } catch (s e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } catch (CancellationException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw e3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    public EcMixMallDiversionViewModel(ShopMallMixFragment shopMallMixFragment, C21176017tu c21176017tu, C1768050w6t c1768050w6t) {
        this.LL = shopMallMixFragment;
        this.LLILLJJLI = c21176017tu;
        this.LLILLL = c1768050w6t;
    }
}
