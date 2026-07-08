package com.ss.android.ugc.aweme.configuration.scene;

import X.C010R;
import X.C010U;
import X.C04TD;
import X.C10OM;
import X.C10PM;
import X.C10QF;
import X.C10QH;
import X.C10QJ;
import X.C10QL;
import X.C10QO;
import X.C10QQ;
import X.C13LP;
import X.C19240010Ow;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import com.ss.android.ugc.aweme.configuration.models.NUFunctionModel;
import com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility;
import defpackage.g9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UGStrategyTriggerAbility implements IUGStrategyTriggerAbility {
    public static IUGStrategyTriggerAbility LJI() {
        Object objLIZ = C04TD.LIZ(IUGStrategyTriggerAbility.class, false);
        if (objLIZ != null) {
            return (IUGStrategyTriggerAbility) objLIZ;
        }
        if (C04TD.LLLLLLLLL == null) {
            synchronized (IUGStrategyTriggerAbility.class) {
                if (C04TD.LLLLLLLLL == null) {
                    C04TD.LLLLLLLLL = new UGStrategyTriggerAbility();
                }
            }
        }
        return C04TD.LLLLLLLLL;
    }

    @Override // com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility
    public final String LIZJ() {
        return new C10QQ().LIZLLL("forecast_group", "");
    }

    @Override // com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility
    public final void LIZLLL() {
        C10QO.LIZ.getClass();
        ((ArrayList) C10QO.LIZJ).add(new C10QF());
    }

    @Override // com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility
    public final long LJFF() {
        try {
            String strLIZ = ((C10QJ) new C10QQ().LIZ.getValue()).LIZ("forecast_start_interval_min");
            if (strLIZ != null) {
                return CastLongProtector.parseLong(strLIZ);
            }
            return 0L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0L;
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility
    public final void LIZ(String str) {
        List<C10QL> list;
        C10QO.LIZ.getClass();
        for (C10QH c10qh : (ArrayList) C10QO.LIZIZ) {
            if (((LinkedHashMap) c10qh.LIZIZ).keySet().contains(str) && (list = (List) ((LinkedHashMap) c10qh.LIZIZ).get(str)) != null) {
                for (C10QL c10ql : list) {
                    FilterAbilityModel filterAbilityModel = C10OM.LIZ;
                    Pair pairLIZIZ = C10OM.LIZIZ(c10ql.LIZ);
                    if (pairLIZIZ.getSecond() == null || Intrinsics.LJFF(pairLIZIZ.getSecond(), "run")) {
                        c10ql.LIZIZ.run();
                    }
                }
            }
        }
        C10QF c10qf = (C10QF) C13LP.LJJLIIIJL(C10QO.LIZJ);
        if (c10qf != null) {
            if (!c10qf.LIZ().triggers.contains(str) && !Intrinsics.LJFF(str, "link_start")) {
                return;
            }
            FilterAbilityModel filterAbilityModel2 = C10OM.LIZ;
            Pair pairLIZIZ2 = C10OM.LIZIZ(c10qf.LIZ().filters);
            if (pairLIZIZ2.getSecond() == null || !Intrinsics.LJFF(pairLIZIZ2.getSecond(), "run") || c10qf.LIZ) {
                return;
            }
            for (NUFunctionModel nUFunctionModel : c10qf.LIZ().functions) {
                Map<String, C010U> map = C010R.LIZ;
                String str2 = nUFunctionModel.name;
                Map<String, C010U> map2 = C010R.LIZ;
                if (!map2.containsKey(str2)) {
                    C19240010Ow.LIZ.getClass();
                    C19240010Ow.LIZ(str2);
                }
                C010U c010u = (C010U) ((LinkedHashMap) map2).get(str2);
                if (c010u == null) {
                    c010u = new C010U() { // from class: X.10QR
                        @Override // X.C010U
                        public final void LIZ(String str3) {
                        }

                        @Override // X.C010U
                        public final String getName() {
                            return "default_function";
                        }
                    };
                }
                c010u.LIZ(nUFunctionModel.params);
            }
            c10qf.LIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility
    public final void LIZIZ(g9 g9Var) {
        C10QO.LIZ.getClass();
        C10QH c10qh = new C10QH(g9Var);
        Iterator it2 = ((ArrayList) C10QO.LIZIZ).iterator();
        while (it2.hasNext()) {
            if (((C10QH) it2.next()).LIZ.getId() == g9Var.getId()) {
                return;
            }
        }
        ((ArrayList) C10QO.LIZIZ).add(c10qh);
    }

    @Override // com.ss.android.ugc.aweme.journey.IUGStrategyTriggerAbility
    public final void LJ(int i) {
        C10PM.LIZ = Integer.valueOf(i);
    }
}
