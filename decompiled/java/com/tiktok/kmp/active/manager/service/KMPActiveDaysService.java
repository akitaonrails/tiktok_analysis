package com.tiktok.kmp.active.manager.service;

import X.C10U8;
import X.C1904800zfS;
import X.C19281710c3;
import X.C19282110c7;
import X.C19282410cA;
import X.C2097908Jt;
import X.C2188811AlT;
import X.EnumC19282510cB;
import X.EnumC814620VxU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.kmp.active.manager.IKMPActiveDaysService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class KMPActiveDaysService implements IKMPActiveDaysService {
    @Override // com.tiktok.kmp.active.manager.IKMPActiveDaysService
    public final boolean LIZIZ() {
        EnumC19282510cB enumC19282510cBLIZ;
        C19282410cA c19282410cA = C19282110c7.LJ.getValue().LIZJ;
        if (c19282410cA == null || (enumC19282510cBLIZ = c19282410cA.LIZ()) == null) {
            enumC19282510cBLIZ = EnumC19282510cB.NORMAL;
        }
        return enumC19282510cBLIZ == EnumC19282510cB.RETURN_USER;
    }

    @Override // com.tiktok.kmp.active.manager.IKMPActiveDaysService
    public final void LIZ(String str) throws Throwable {
        try {
            C1904800zfS.LIZ.getClass();
            EnumC814620VxU enumC814620VxU = EnumC814620VxU.Android;
            if (Intrinsics.LJFF(str, "settings")) {
                C19281710c3.LIZIZ();
            }
            if (enumC814620VxU == EnumC814620VxU.iOS && Intrinsics.LJFF(str, "app_launch")) {
                C19281710c3.LIZIZ();
            }
            C19281710c3.LIZ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ActiveDaysService onAppLaunch error: ");
            sbLIZ.append(e.getMessage());
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
            C10U8 c10u8 = C10U8.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("exception_message", message));
            c10u8.getClass();
            C10U8.LIZ("ActiveDaysService_onAppLaunch", e, mapLIZJ);
        }
    }
}
