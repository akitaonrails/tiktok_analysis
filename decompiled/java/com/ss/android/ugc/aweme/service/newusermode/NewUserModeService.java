package com.ss.android.ugc.aweme.service.newusermode;

import X.AbstractC848400XPy;
import X.C052D;
import X.C0XQ7;
import X.C1514430pVp;
import X.C15O7;
import X.C1911920zqw;
import X.C1911930zqx;
import X.C2188811AlT;
import X.C277460Au8;
import X.C844470XAv;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes29.dex */
public final class NewUserModeService implements INewUserModeService {
    @Override // com.ss.android.ugc.aweme.service.newusermode.INewUserModeService
    public final void LIZ() {
        C1911930zqx.LIZ.getClass();
        Keva keva = C1911930zqx.LIZIZ;
        int i = keva.getInt("active_days", 1);
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C1911930zqx.LIZIZ() || keva.contains("new_user_mode_days")) {
            return;
        }
        keva.storeInt("new_user_mode_days", i);
    }

    @Override // com.ss.android.ugc.aweme.service.newusermode.INewUserModeService
    public final boolean LIZIZ() {
        return ((Boolean) C277460Au8.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.service.newusermode.INewUserModeService
    public final void LIZJ() {
        C1911930zqx.LIZ.getClass();
        C15O7.LIZJ(new Callable() { // from class: X.0zqv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("NewUserModeHelper@d6ac.updateActiveDays$1");
                Keva keva = C1911930zqx.LIZIZ;
                int i = keva.getInt("active_days", 1);
                if (i < 15) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(jCurrentTimeMillis);
                    int i2 = calendar.get(5);
                    int i3 = calendar.get(2);
                    int i4 = calendar.get(1);
                    long j = keva.getLong("last_active_date", 0L);
                    if (j == 0) {
                        keva.storeLong("last_active_date", jCurrentTimeMillis);
                        keva.storeLong("active_days", 1L);
                    } else {
                        calendar.setTimeInMillis(j);
                        int i5 = calendar.get(5);
                        int i6 = calendar.get(2);
                        int i7 = calendar.get(1);
                        if (i5 != i2 || i6 != i3 || i7 != i4) {
                            keva.storeLong("last_active_date", jCurrentTimeMillis);
                            keva.storeInt("active_days", i + 1);
                        }
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("NewUserModeHelper@d6ac.updateActiveDays$1");
                return unit;
            }
        });
        C052D.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.newusermode.INewUserModeService
    public final long LJ() {
        long j;
        List listLJJLIIIJILLIZJL;
        Long l = C1911920zqw.LIZ;
        Long l2 = C1911920zqw.LIZ;
        if (l2 != null) {
            return l2.longValue();
        }
        long j2 = C1911920zqw.LIZIZ.getLong("first_install_version", -1L);
        if (j2 == -1) {
            if (C1514430pVp.LIZLLL().booleanValue()) {
                C844470XAv.LIZ.getClass();
                try {
                    listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C844470XAv.LJFF(), new String[]{e3.d}, 0, 6);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (listLJJLIIIJILLIZJL.size() >= 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) listLJJLIIIJILLIZJL.get(0));
                    sbLIZ.append('0');
                    sbLIZ.append((String) listLJJLIIIJILLIZJL.get(1));
                    sbLIZ.append("00");
                    j = CastLongProtector.parseLong(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    j = -3;
                }
            } else {
                j = 370700;
            }
            C1911920zqw.LIZ = Long.valueOf(j);
            C1911920zqw.LIZIZ.storeLong("first_install_version", j);
        } else {
            C1911920zqw.LIZ = Long.valueOf(j2);
        }
        Long l3 = C1911920zqw.LIZ;
        if (l3 != null) {
            return l3.longValue();
        }
        return -1L;
    }

    @Override // com.ss.android.ugc.aweme.service.newusermode.INewUserModeService
    public final int LIZLLL() {
        return C052D.LIZ();
    }
}
