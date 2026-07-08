package com.ss.android.ugc.aweme.compliance.business.banappeal;

import X.AbstractC1387200mCc;
import X.C0XQ7;
import X.C11S5;
import X.C1227904rF;
import X.C1388190mED;
import X.C1701940uOG;
import X.C1906580ziK;
import X.C1914170zuZ;
import X.C1917460zzs;
import X.C19EG;
import X.C596440NaM;
import Y.AfS138S0200000_2;
import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.tiktok.ban.IUserBanDepService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS61S0500000_28;

/* JADX INFO: loaded from: classes24.dex */
public final class UserBanDepServiceImpl implements IUserBanDepService {
    public AtomicBoolean LIZIZ;

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final boolean LJFF() {
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final int LJI() {
        int i;
        try {
            i = CastIntegerProtector.parseInt(C596440NaM.LIZ.LIZIZ("appeal_status_source", "1"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = 1;
        }
        C596440NaM.LIZ.LIZ.erase("appeal_status_source");
        return i;
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final Gson getGson() {
        C1227904rF.LIZ.getClass();
        return C1227904rF.LIZLLL();
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final boolean LIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("enable_user_ban_sdk_monitor", false);
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final C1914170zuZ LJ() {
        return ComplianceServiceProvider.LJIJI().LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final String getUserId() {
        C0XQ7.LJ();
        return C0XQ7.LIZ.LJIIJ().getCurUserId();
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final void logout() {
        C0XQ7.LIZJ().logout("user_banned", "user_banned");
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final AtomicBoolean LIZJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final int getAppId() {
        return 1233;
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final void LIZIZ(AtomicBoolean atomicBoolean) {
        this.LIZIZ = atomicBoolean;
    }

    @Override // com.ss.android.ugc.tiktok.ban.IUserBanDepService
    public final void LIZLLL(AwS61S0500000_28 awS61S0500000_28, C1917460zzs c1917460zzs) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            awS61S0500000_28.invoke(c19egLIZIZ);
        } else {
            C1906580ziK.LIZJ().LJIIJ().LJL(C11S5.LIZIZ).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS138S0200000_2(this, awS61S0500000_28, c1917460zzs, 4));
        }
    }
}
