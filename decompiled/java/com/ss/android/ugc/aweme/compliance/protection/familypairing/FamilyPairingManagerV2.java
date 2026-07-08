package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XPD;
import X.C0XQ7;
import X.C1233040iBy;
import X.C13LP;
import X.C14EU;
import X.C15XD;
import X.C15XY;
import X.C15YD;
import X.C15YE;
import X.C15YI;
import X.C1906580ziK;
import X.C20537215Xu;
import X.C2107508Nl;
import X.C23250099c;
import X.C297270Bkz;
import X.C452501pT;
import X.C484220Iyq;
import X.C734760Sry;
import X.C817503Hh;
import X.C844470XAv;
import X.EnumC20536615Xo;
import X.EnumC20537615Xy;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.api.model.FamilyPairingBean;
import com.ss.android.ugc.aweme.compliance.api.model.ScheduleBreakSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes32.dex */
public final class FamilyPairingManagerV2 implements C15YD {
    public static final FamilyPairingManagerV2 LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static EnumC20537615Xy LIZLLL;
    public static boolean LJ;
    public static FamilyPairingBean LJFF;

    @Override // X.C15YD
    public final void LJI(C734760Sry c734760Sry) {
    }

    @Override // X.C15YD
    public final void LJIIL(C734760Sry c734760Sry) {
    }

    @Override // X.C15YD
    public final void LJIILJJIL(FamilyPairingBean familyPairingBean) {
    }

    static {
        FamilyPairingManagerV2 familyPairingManagerV2 = new FamilyPairingManagerV2();
        LIZ = familyPairingManagerV2;
        LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(117));
        LIZJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(118));
        LIZLLL = EnumC20537615Xy.NONE;
        EventBus.LIZLLL().LJIJJ(familyPairingManagerV2);
        if (C297270Bkz.LIZ()) {
            LIZLLL = familyPairingManagerV2.LIZIZ();
            C15YE.LIZ.getClass();
            LJ = C15YE.LJIIJ();
            C23250099c.LIZLLL(C817503Hh.LL, C2107508Nl.LIZ, null, new C15XD(null), 2);
        }
    }

    public static C15XY LJJI() {
        return (C15XY) LIZIZ.getValue();
    }

    @Override // X.C15YD
    public final ScheduleBreakSettings LIZ() {
        return (ScheduleBreakSettings) LJJI().LJIIIIZZ(EnumC20536615Xo.FP_SCHEDULE_DOWNTIME_LEGACY, ScheduleBreakSettings.class);
    }

    @Override // X.C15YD
    public final EnumC20537615Xy LIZIZ() {
        if (!C0XQ7.LJFF().isLogin()) {
            return EnumC20537615Xy.NONE;
        }
        Integer numValueOf = Integer.valueOf(LJJ());
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0 || numValueOf.intValue() == 1) {
                return EnumC20537615Xy.NONE;
            }
            if (numValueOf.intValue() == 2) {
                return EnumC20537615Xy.CHILD;
            }
            if (numValueOf.intValue() == 3) {
                return EnumC20537615Xy.PARENT;
            }
            if (numValueOf.intValue() == 4) {
                return EnumC20537615Xy.UNLINK_LOCKED;
            }
        }
        return EnumC20537615Xy.NONE;
    }

    @Override // X.C15YD
    public final int LIZJ() {
        Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.SCREEN_TIME_TYPE);
        if (numLIZLLL != null) {
            return numLIZLLL.intValue();
        }
        return 0;
    }

    @Override // X.C15YD
    public final List<ScreenTimeManagementDaySetting> LIZLLL() {
        return (List) LJJI().LIZJ(EnumC20536615Xo.WEEK_SETTINGS_LEGACY, new TypeToken<List<? extends ScreenTimeManagementDaySetting>>() { // from class: X.15Xn
        }.getType());
    }

    @Override // X.C15YD
    public final int LJ() {
        ScreenTimeManagementDaySetting screenTimeManagementDaySetting;
        Integer num;
        if (LJIJ() != 2) {
            Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.SCREEN_TIME_MANAGEMENT);
            if (numLIZLLL != null) {
                return numLIZLLL.intValue();
            }
            return 0;
        }
        List<ScreenTimeManagementDaySetting> listLIZLLL = LIZLLL();
        if (listLIZLLL == null || (screenTimeManagementDaySetting = (ScreenTimeManagementDaySetting) C13LP.LJJJLZIJ(C20537215Xu.LIZ() - 1, listLIZLLL)) == null || (num = screenTimeManagementDaySetting.screenTimeLimitForWeek) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.C15YD
    public final boolean LJFF() {
        return Intrinsics.LJFF(LJJI().LIZ(EnumC20536615Xo.FP_SHOULD_USE_PARENT_BREAK), Boolean.TRUE);
    }

    @Override // X.C15YD
    public final int LJII() {
        Integer numLIZLLL;
        if (!LJFF() || (numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.FP_SESSION_DURATION)) == null) {
            return 0;
        }
        return numLIZLLL.intValue();
    }

    @Override // X.C15YD
    public final boolean LJIIIIZZ() {
        Integer numLIZLLL;
        return LJ() > 0 && (numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.SCREEN_TIME_STATUS)) != null && numLIZLLL.intValue() == 1;
    }

    @Override // X.C15YD
    public final boolean LJIIIZ() {
        Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.SEARCH_RESTRICTION);
        return numLIZLLL != null && numLIZLLL.intValue() == 2;
    }

    @Override // X.C15YD
    public final int LJIIJ() {
        Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.FP_SESSION_BREAK_TYPE);
        if (numLIZLLL != null) {
            return numLIZLLL.intValue();
        }
        return 0;
    }

    @Override // X.C15YD
    public final int LJIILIIL() {
        Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.SCREEN_TIME_MANAGEMENT_BLOCK_TYPE);
        if (numLIZLLL != null) {
            return numLIZLLL.intValue();
        }
        return 0;
    }

    @Override // X.C15YD
    public final long LJIILL() {
        Long lLJFF = LJJI().LJFF(EnumC20536615Xo.PARENTAL_GUARDIAN_DURATION);
        if (lLJFF != null) {
            return lLJFF.longValue();
        }
        return -1L;
    }

    @Override // X.C15YD
    public final boolean LJIILLIIL() {
        DoNotDisturbSettings doNotDisturbSettingsLJIJJLI = LJIJJLI();
        if (doNotDisturbSettingsLJIJJLI != null) {
            return Intrinsics.LJFF(doNotDisturbSettingsLJIJJLI.pauseNotificationEnabled, Boolean.TRUE);
        }
        return false;
    }

    @Override // X.C15YD
    public final int LJIJ() {
        Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.SCREEN_TIME_REPEAT_TYPE);
        if (numLIZLLL != null) {
            return numLIZLLL.intValue();
        }
        return 0;
    }

    @Override // X.C15YD
    public final int LJIJJ() {
        Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.PARENTAL_GUARDIAN_LINK_COUNT);
        if (numLIZLLL != null) {
            return numLIZLLL.intValue();
        }
        return -1;
    }

    @Override // X.C15YD
    public final DoNotDisturbSettings LJIJJLI() {
        return (DoNotDisturbSettings) LJJI().LJIIIIZZ(EnumC20536615Xo.DO_NOT_DISTURB_SETTINGS_LEGACY, DoNotDisturbSettings.class);
    }

    @Override // X.C15YD
    public final boolean LJIL() {
        Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.RESTRICT_MODE);
        return numLIZLLL != null && numLIZLLL.intValue() == 1;
    }

    @Override // X.C15YD
    public final int LJJ() {
        Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.PARENTAL_GUARDIAN_MODE);
        if (numLIZLLL != null) {
            return numLIZLLL.intValue();
        }
        return 0;
    }

    @Override // X.C15YD
    public final int getChildCount() {
        Integer numLIZLLL = LJJI().LIZLLL(EnumC20536615Xo.PARENTAL_GUARDIAN_CHILD_COUNT);
        if (numLIZLLL != null) {
            return numLIZLLL.intValue();
        }
        return -1;
    }

    @Override // X.C15YD
    public final FamilyPairingBean LJIIZILJ() {
        return LJFF;
    }

    @Override // X.C15YD
    public final boolean LJIIJJI(String str) {
        Activity activityLIZIZ;
        if (TextUtils.isEmpty(str) || str == null || !a0.LJJIIZI(str, "/falcon/rn/guardian_child", true) || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if (!(activityLIZIZ instanceof Activity)) {
            activityLIZIZ = null;
        }
        C0XPD.LIZIZ(activityLIZIZ, "qr_code_detail", "auto", null, null);
        C844470XAv.LIZ.getClass();
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZIZ(2131836823);
        c1233040iBy.LIZLLL();
        return true;
    }

    @Override // X.C15YD
    public final void LJIJI(FamilyPairingBean familyPairingBean) {
        LJFF = null;
        ((C15YI) LIZJ.getValue()).LIZ(EnumC20536615Xo.class);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onParentalModeChanged(C484220Iyq c484220Iyq) {
        if (TextUtils.equals("guardian_platform_open", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) || TextUtils.equals("guardian_platform_close", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) || TextUtils.equals("guardian_platform_child_unlink", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) || TextUtils.equals("refresh_guadig_settings", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
            C15YE.LIZ.getClass();
            C15YE.LJIILL(null, "");
        }
    }
}
