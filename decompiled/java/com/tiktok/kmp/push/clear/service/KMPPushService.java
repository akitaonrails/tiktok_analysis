package com.tiktok.kmp.push.clear.service;

import X.C0C64;
import X.C10U8;
import X.C1904800zfS;
import X.C2097908Jt;
import X.C813900VwK;
import X.C814600VxS;
import X.C814640VxW;
import X.EnumC814620VxU;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.kmp.push.clear.IKMPPushService;
import java.util.Calendar;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class KMPPushService implements IKMPPushService {
    @Override // com.tiktok.kmp.push.clear.IKMPPushService
    public final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "push_foreground_clear_strategy", true) > 0;
    }

    @Override // com.tiktok.kmp.push.clear.IKMPPushService
    public final C813900VwK LIZ(long j) throws Throwable {
        C813900VwK c813900VwK;
        C814600VxS.LIZ.getClass();
        try {
            C1904800zfS.LIZ.getClass();
            EnumC814620VxU enumC814620VxU = EnumC814620VxU.Android;
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "push_foreground_clear_strategy", true);
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            calendar.setTimeInMillis(j);
            int i = calendar.get(11);
            c813900VwK = C814640VxW.LIZ(enumC814620VxU, iLJIJ, i);
            if (c813900VwK.LIZ) {
                C814600VxS.LIZ(iLJIJ, i, c813900VwK);
                return c813900VwK;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C10U8 c10u8 = C10U8.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("exception_message", message));
            c10u8.getClass();
            C10U8.LIZ("PushClearManager_onAppEnterForeground", e, mapLIZJ);
            String message2 = e.getMessage();
            if (message2 == null) {
                message2 = "exception";
            }
            c813900VwK = new C813900VwK(false, "error", message2);
        }
        return c813900VwK;
    }
}
