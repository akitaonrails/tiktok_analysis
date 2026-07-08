package com.ss.android.ugc.aweme.cubes;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C0CQ4;
import X.C0VPW;
import X.C0VPX;
import X.C0VQ1;
import X.C0VQF;
import X.C0WZX;
import X.C0XQ7;
import X.C11S5;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C797440VPy;
import X.C811110Vrp;
import X.C837870Wtt;
import X.C844470XAv;
import X.EnumC1483805rQ;
import X.InterfaceC809720Vpa;
import Y.AfS171S0100000_2;
import Y.AfS182S0100000_13;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.ugc.aweme.cubes.api.GoogleCubesVideosApi;
import com.ss.android.ugc.aweme.cubesapi.IGoogleCubesApi;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class GoogleCubesService implements IGoogleCubesApi {
    public static IGoogleCubesApi LJI() {
        Object objLIZ = C04TD.LIZ(IGoogleCubesApi.class, false);
        if (objLIZ != null) {
            return (IGoogleCubesApi) objLIZ;
        }
        if (C04TD.LLLLZ == null) {
            synchronized (IGoogleCubesApi.class) {
                if (C04TD.LLLLZ == null) {
                    C04TD.LLLLZ = new GoogleCubesService();
                }
            }
        }
        return C04TD.LLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.cubesapi.IGoogleCubesApi
    public final void LIZLLL() {
        C01GW c01gw = C797440VPy.LIZ;
        ((C0VQ1) c01gw.getValue()).LIZ();
        ((C0VQ1) c01gw.getValue()).LIZJ();
        C0VQF.LIZ().erase("cubes_update_frequency");
    }

    @Override // com.ss.android.ugc.aweme.cubesapi.IGoogleCubesApi
    public final void init() {
        C811110Vrp c811110Vrp = C811110Vrp.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        InterfaceC809720Vpa interfaceC809720Vpa = new InterfaceC809720Vpa() { // from class: X.0VQy
            @Override // X.InterfaceC809720Vpa
            public final void LIZ() {
                if (!C0VPX.LIZ) {
                    this.LIZ.LJ(true, 9);
                    return;
                }
                if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    C811110Vrp.LIZ.getClass();
                    C811110Vrp.LIZ();
                    return;
                }
                C811110Vrp.LIZ.getClass();
                C811110Vrp.LIZIZ();
                this.LIZ.LJFF(true);
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1483705rP(this.LIZ, null), 3);
                C0XQ7.LJ();
                C0XQ7.LIZ.LJIILL(new C854710Xfx(this.LIZ, 0));
                C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS171S0100000_2(this.LIZ, 5));
            }

            @Override // X.InterfaceC809720Vpa
            public final void LIZIZ(C0VQL c0vql) {
                int i = C0VQJ.LIZ[c0vql.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onInitFail(ERR_ELSE: ");
                        sbLIZ.append(c0vql);
                        sbLIZ.append(')');
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LIZ.LJFF(false);
                        return;
                    }
                    this.LIZ.LJFF(false);
                }
            }
        };
        c811110Vrp.getClass();
        C811110Vrp.LIZLLL(contextLIZ, interfaceC809720Vpa);
    }

    @Override // com.ss.android.ugc.aweme.cubesapi.IGoogleCubesApi
    public final void LIZ(EnumC1483805rQ enumC1483805rQ) throws Throwable {
        String strLLLLLIL;
        AdvertisingIdClient.Info infoLIZIZ;
        try {
            C844470XAv.LIZ.getClass();
            infoLIZIZ = C837870Wtt.LIZIZ(C844470XAv.LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (infoLIZIZ != null) {
            strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm9YZrdkhUWbK8URK6aQCHDlUSntb8sJA==", null));
            if (strLLLLLIL == null) {
                strLLLLLIL = "";
            }
        } else {
            strLLLLLIL = "";
        }
        enumC1483805rQ.name();
        GoogleCubesVideosApi.LIZ.getClass();
        C0CQ4.LIZIZ.getVideos(strLLLLLIL, 101006).LJL(C11S5.LIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS182S0100000_13(enumC1483805rQ, 64), new AfS182S0100000_13(enumC1483805rQ, 65));
    }

    @Override // com.ss.android.ugc.aweme.cubesapi.IGoogleCubesApi
    public final void LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStatusOnSetupSuccess(");
        sbLIZ.append(i);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C0VQF.LIZ().storeInt("cubes_update_frequency", i);
    }

    public final void LJFF(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkStatusChange(");
        sbLIZ.append(z);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            int i = C0VPW.LIZ;
            if (i != C0VQF.LIZ().getInt("cubes_update_frequency", 0)) {
                if (!C0VPW.LIZIZ) {
                    LJ(false, null);
                } else {
                    ((C0VQ1) C797440VPy.LIZ.getValue()).LIZIZ(i);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkStatusChange(cubes available) - Update frequency changed! ");
                sbLIZ2.append(C0VQF.LIZ().getInt("cubes_update_frequency", 0));
                sbLIZ2.append(" -> ");
                sbLIZ2.append(i);
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            return;
        }
        LJ(false, null);
    }

    @Override // com.ss.android.ugc.aweme.cubesapi.IGoogleCubesApi
    public final void LIZJ(EnumC1483805rQ enumC1483805rQ, boolean z) {
        if (!C0VPX.LIZ) {
            LJ(true, 9);
            return;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C811110Vrp.LIZ.getClass();
            C811110Vrp.LIZ();
            return;
        }
        if (z) {
            try {
                if (System.currentTimeMillis() - C0VQF.LIZ().getLong("cubes_last_updated_ts", 0L) >= TimeUnit.HOURS.toMillis(3L)) {
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NO ");
            sbLIZ.append(enumC1483805rQ.name());
            sbLIZ.append(": DuringNoUpdateInterval!!");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Task: ");
        sbLIZ2.append(enumC1483805rQ.name());
        C2188811AlT.LIZIZ(sbLIZ2);
        C811110Vrp.LIZ.getClass();
        C811110Vrp.LIZIZ();
        LIZ(enumC1483805rQ);
    }

    @Override // com.ss.android.ugc.aweme.cubesapi.IGoogleCubesApi
    public final void LJ(boolean z, Integer num) {
        int iIntValue;
        if (C0VQF.LIZ().getInt("cubes_update_frequency", 0) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkAndClearGoogleCubesContext(");
            sbLIZ.append(z);
            sbLIZ.append(", ");
            sbLIZ.append(num);
            sbLIZ.append(") - ");
            sbLIZ.append(C0VQF.LIZ().getInt("cubes_update_frequency", 0));
            sbLIZ.append(" -> 0");
            C2188811AlT.LIZIZ(sbLIZ);
            LIZLLL();
        }
        if (z) {
            C811110Vrp c811110Vrp = C811110Vrp.LIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 4;
            }
            c811110Vrp.getClass();
            C811110Vrp.LJ(iIntValue);
            C811110Vrp.LIZIZ();
        }
    }
}
