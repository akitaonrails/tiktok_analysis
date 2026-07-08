package com.ss.android.ugc.aweme;

import X.C01GW;
import X.C04TD;
import X.C1192804la;
import X.C452501pT;
import X.C786410Ut5;
import X.C810680Vr8;
import X.C844470XAv;
import X.EnumC810690Vr9;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.provider.Settings;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class AutobackupService implements IAutobackupService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1192804la());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C810680Vr8());
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(64));

    public static IAutobackupService LIZJ() {
        Object objLIZ = C04TD.LIZ(IAutobackupService.class, false);
        if (objLIZ != null) {
            return (IAutobackupService) objLIZ;
        }
        if (C04TD.LJJLIIIJL == null) {
            synchronized (IAutobackupService.class) {
                if (C04TD.LJJLIIIJL == null) {
                    C04TD.LJJLIIIJL = new AutobackupService();
                }
            }
        }
        return C04TD.LJJLIIIJL;
    }

    @Override // com.ss.android.ugc.aweme.IAutobackupService
    public final boolean LIZ() {
        int i;
        if (((SharedPreferences) this.LIZJ.getValue()).getAll().isEmpty()) {
            try {
                i = ((Keva) this.LIZ.getValue()).getInt("prev_data", -1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                i = -1;
            }
        } else {
            i = ((SharedPreferences) this.LIZJ.getValue()).getInt("prev_data", -1);
        }
        if (i != -1) {
            return i == 1;
        }
        int i2 = !((SharedPreferences) this.LIZIZ.getValue()).getAll().isEmpty() ? 1 : 0;
        ((SharedPreferences) this.LIZJ.getValue()).edit().putInt("prev_data", i2).apply();
        return i2 == 1;
    }

    @Override // com.ss.android.ugc.aweme.IAutobackupService
    public final EnumC810690Vr9 isAvailable() {
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            ApplicationInfo applicationInfo = C786410Ut5.Y3(contextLIZ.getPackageManager(), contextLIZ.getPackageName(), 0).applicationInfo;
            return applicationInfo == null ? EnumC810690Vr9.UNAVAILABLE : (applicationInfo.flags & 32768) != 0 ? EnumC810690Vr9.AVAILABLE : EnumC810690Vr9.UNAVAILABLE;
        } catch (Settings.SettingNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return EnumC810690Vr9.UNKNOWN;
        }
    }

    @Override // com.ss.android.ugc.aweme.IAutobackupService
    public final SharedPreferences LIZIZ() {
        LIZ();
        return (SharedPreferences) this.LIZIZ.getValue();
    }
}
