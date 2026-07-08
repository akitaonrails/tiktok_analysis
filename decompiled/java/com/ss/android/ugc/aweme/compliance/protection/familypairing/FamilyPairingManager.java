package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C054G;
import X.C05KK;
import X.C05KM;
import X.C05KN;
import X.C05KO;
import X.C08JS;
import X.C0PEM;
import X.C0XPD;
import X.C0XQ7;
import X.C1227904rF;
import X.C1233040iBy;
import X.C13LP;
import X.C13LQ;
import X.C14EU;
import X.C15XE;
import X.C15YD;
import X.C15YE;
import X.C1DEV;
import X.C20537215Xu;
import X.C2191201ApK;
import X.C2214201BlK;
import X.C2296808zG;
import X.C23250099c;
import X.C286080BJe;
import X.C452501pT;
import X.C484220Iyq;
import X.C734760Sry;
import X.C7740030o;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC20537615Xy;
import Y.ARunnableS4S0010000_31;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.api.model.EngagementCountSettings;
import com.ss.android.ugc.aweme.compliance.api.model.FamilyPairingBean;
import com.ss.android.ugc.aweme.compliance.api.model.GuardianRestrictionBean;
import com.ss.android.ugc.aweme.compliance.api.model.ScheduleBreakSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes32.dex */
public final class FamilyPairingManager implements C15YD {
    public static final FamilyPairingManager LIZ;
    public static final C01GW LIZIZ;
    public static final Set<C05KM> LIZJ;
    public static final C1DEV LIZLLL;
    public static final C054G LJ;
    public static FamilyPairingBean LJFF;

    static {
        DoNotDisturbSettings doNotDisturbSettings;
        ScheduleBreakSettings scheduleBreakSettings;
        List listLJJLL;
        EngagementCountSettings engagementCountSettings;
        FamilyPairingManager familyPairingManager = new FamilyPairingManager();
        LIZ = familyPairingManager;
        LIZIZ = C452501pT.LIZIZ(new C15XE());
        LIZJ = Collections.newSetFromMap(new WeakHashMap());
        LIZLLL = C2191201ApK.LIZ();
        LJ = C2296808zG.LIZ(C0PEM.LIZ);
        EventBus.LIZLLL().LJIJJ(familyPairingManager);
        if (LJJI().getBoolean("valid", false)) {
            int i = LJJI().getInt("parentalGuardianMode", 0);
            int i2 = LJJI().getInt("parentalGuardianChildCount", 0);
            int i3 = LJJI().getInt("parentalGuardianLinkCount", 0);
            long j = LJJI().getLong("parentalGuardianDuration", 0L);
            int i4 = LJJI().getInt("teen_mode", 0);
            int i5 = LJJI().getInt("screenTimeManagement", 0);
            int i6 = LJJI().getInt("searchRestriction", 0);
            int i7 = LJJI().getInt("parentalSessionBreakType", 0);
            int i8 = LJJI().getInt("parentalSessionBreakDuration", 0);
            try {
                doNotDisturbSettings = (DoNotDisturbSettings) C08JS.LIZ(LJJI().getString("doNotDisturbSettings", ""), DoNotDisturbSettings.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                doNotDisturbSettings = null;
            }
            int i9 = LJJI().getInt("screenTimeManagementStatus", 0);
            int i10 = LJJI().getInt("screenTimeManagementType", 0);
            boolean z = LJJI().getBoolean("shouldUseParentalSessionBreak", false);
            int i11 = LJJI().getInt("screenTimeManagementRepeatType", 0);
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String string = LJJI().getString("parentSetScheduleDowntimeForTeen", "");
                c1227904rF.getClass();
                scheduleBreakSettings = (ScheduleBreakSettings) C1227904rF.LIZIZ(string, ScheduleBreakSettings.class);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                scheduleBreakSettings = null;
            }
            try {
                listLJJLL = C13LQ.LJJLL((Object[]) C7740030o.LIZ().getGson().LJII(LJJI().getString("screenTimeManagementWeekSettings", ""), ScreenTimeManagementDaySetting[].class));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                listLJJLL = null;
            }
            try {
                engagementCountSettings = (EngagementCountSettings) C7740030o.LIZ().getGson().LJII(LJJI().getString("engagementCountSettings", ""), EngagementCountSettings.class);
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                engagementCountSettings = null;
            }
            DoNotDisturbSettings doNotDisturbSettings2 = doNotDisturbSettings;
            ScheduleBreakSettings scheduleBreakSettings2 = scheduleBreakSettings;
            EngagementCountSettings engagementCountSettings2 = engagementCountSettings;
            familyPairingManager.LJIJI(new FamilyPairingBean(Integer.valueOf(i), new GuardianRestrictionBean(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i6), doNotDisturbSettings2, Integer.valueOf(i8), Integer.valueOf(i7), Integer.valueOf(i9), Integer.valueOf(i10), i11, listLJJLL, z, scheduleBreakSettings2, engagementCountSettings2, Integer.valueOf(LJJI().getInt("screenTimeManagementBlockType", 0))), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j)));
        }
    }

    public static Keva LJJI() {
        return (Keva) LIZIZ.getValue();
    }

    @Override // X.C15YD
    public final ScheduleBreakSettings LIZ() {
        GuardianRestrictionBean guardianRestrictionBean;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null) {
            return null;
        }
        return guardianRestrictionBean.screenDownTimeSettings;
    }

    @Override // X.C15YD
    public final int LIZJ() {
        GuardianRestrictionBean guardianRestrictionBean;
        Integer num;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (num = guardianRestrictionBean.screenTimeManagementType) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.C15YD
    public final List<ScreenTimeManagementDaySetting> LIZLLL() {
        GuardianRestrictionBean guardianRestrictionBean;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null) {
            return null;
        }
        return guardianRestrictionBean.screenTimeManagementWeekSettings;
    }

    @Override // X.C15YD
    public final int LJ() {
        Integer num;
        List<ScreenTimeManagementDaySetting> list;
        ScreenTimeManagementDaySetting screenTimeManagementDaySetting;
        Integer num2;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null) {
            return 0;
        }
        GuardianRestrictionBean guardianRestrictionBean = familyPairingBean.restriction;
        if (guardianRestrictionBean == null || guardianRestrictionBean.screenTimeManagementRepeatType != 2) {
            GuardianRestrictionBean guardianRestrictionBean2 = familyPairingBean.restriction;
            if (guardianRestrictionBean2 == null || (num = guardianRestrictionBean2.screenTimeManagement) == null) {
                return 0;
            }
            return num.intValue();
        }
        GuardianRestrictionBean guardianRestrictionBean3 = familyPairingBean.restriction;
        if (guardianRestrictionBean3 == null || (list = guardianRestrictionBean3.screenTimeManagementWeekSettings) == null || (screenTimeManagementDaySetting = (ScreenTimeManagementDaySetting) C13LP.LJJJLZIJ(C20537215Xu.LIZ() - 1, list)) == null || (num2 = screenTimeManagementDaySetting.screenTimeLimitForWeek) == null) {
            return 0;
        }
        return num2.intValue();
    }

    @Override // X.C15YD
    public final boolean LJFF() {
        GuardianRestrictionBean guardianRestrictionBean;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null) {
            return false;
        }
        return guardianRestrictionBean.shouldShowScreenBreak;
    }

    @Override // X.C15YD
    public final int LJII() {
        GuardianRestrictionBean guardianRestrictionBean;
        GuardianRestrictionBean guardianRestrictionBean2;
        Integer num;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || !guardianRestrictionBean.shouldShowScreenBreak || (guardianRestrictionBean2 = familyPairingBean.restriction) == null || (num = guardianRestrictionBean2.screenTimeBreaks) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.C15YD
    public final boolean LJIIIZ() {
        GuardianRestrictionBean guardianRestrictionBean;
        Integer num;
        FamilyPairingBean familyPairingBean = LJFF;
        return (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (num = guardianRestrictionBean.searchRestriction) == null || num.intValue() != 2) ? false : true;
    }

    @Override // X.C15YD
    public final int LJIIJ() {
        GuardianRestrictionBean guardianRestrictionBean;
        Integer num;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (num = guardianRestrictionBean.screenDurationType) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.C15YD
    public final int LJIILIIL() {
        GuardianRestrictionBean guardianRestrictionBean;
        Integer num;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (num = guardianRestrictionBean.screenTimeManagementBlockType) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.C15YD
    public final long LJIILL() {
        Long l;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (l = familyPairingBean.duration) == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // X.C15YD
    public final boolean LJIILLIIL() {
        GuardianRestrictionBean guardianRestrictionBean;
        DoNotDisturbSettings doNotDisturbSettings;
        Boolean bool;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (doNotDisturbSettings = guardianRestrictionBean.doNotDisturbSettings) == null || (bool = doNotDisturbSettings.pauseNotificationEnabled) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.C15YD
    public final int LJIJ() {
        GuardianRestrictionBean guardianRestrictionBean;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null) {
            return 0;
        }
        return guardianRestrictionBean.screenTimeManagementRepeatType;
    }

    @Override // X.C15YD
    public final int LJIJJ() {
        Integer num;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (num = familyPairingBean.linkCount) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // X.C15YD
    public final DoNotDisturbSettings LJIJJLI() {
        GuardianRestrictionBean guardianRestrictionBean;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null) {
            return null;
        }
        return guardianRestrictionBean.doNotDisturbSettings;
    }

    @Override // X.C15YD
    public final boolean LJIL() {
        GuardianRestrictionBean guardianRestrictionBean;
        Integer num;
        FamilyPairingBean familyPairingBean = LJFF;
        return (familyPairingBean == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (num = guardianRestrictionBean.restrictMode) == null || num.intValue() != 1) ? false : true;
    }

    @Override // X.C15YD
    public final int LJJ() {
        Integer num;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (num = familyPairingBean.userIdentity) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.C15YD
    public final int getChildCount() {
        Integer num;
        FamilyPairingBean familyPairingBean = LJFF;
        if (familyPairingBean == null || (num = familyPairingBean.childrenCount) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // X.C15YD
    public final EnumC20537615Xy LIZIZ() {
        FamilyPairingBean familyPairingBean;
        return (!C0XQ7.LJFF().isLogin() || (familyPairingBean = LJFF) == null) ? EnumC20537615Xy.NONE : LJJIFFI(familyPairingBean.userIdentity);
    }

    @Override // X.C15YD
    public final boolean LJIIIIZZ() {
        FamilyPairingBean familyPairingBean;
        GuardianRestrictionBean guardianRestrictionBean;
        Integer num;
        return (LJ() <= 0 || (familyPairingBean = LJFF) == null || (guardianRestrictionBean = familyPairingBean.restriction) == null || (num = guardianRestrictionBean.screenTimeManagementStatus) == null || num.intValue() != 1) ? false : true;
    }

    @Override // X.C15YD
    public final FamilyPairingBean LJIIZILJ() {
        return LJFF;
    }

    public static boolean LJJII(FamilyPairingBean familyPairingBean) {
        GuardianRestrictionBean guardianRestrictionBean;
        EngagementCountSettings engagementCountSettings;
        C01GW c01gw = C286080BJe.LIZ;
        boolean z = false;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            if (((Number) c01gw.getValue()).intValue() != 2) {
                return false;
            }
            return true;
        }
        if (familyPairingBean != null && (guardianRestrictionBean = familyPairingBean.restriction) != null && (engagementCountSettings = guardianRestrictionBean.engagementCountSettings) != null && engagementCountSettings.engagementCountStatus == 0) {
            z = true;
        }
        return !z;
    }

    @Override // X.C15YD
    public final void LJI(C734760Sry c734760Sry) {
        C23250099c.LIZLLL(LJ, null, null, new C05KN(c734760Sry, null), 3);
    }

    @Override // X.C15YD
    public final boolean LJIIJJI(String str) {
        if (TextUtils.isEmpty(str) || str == null || !a0.LJJIIZI(str, "/falcon/rn/guardian_child", true) || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        C0XPD.LIZIZ(C2214201BlK.LJFF(), "qr_code_detail", "auto", null, null);
        C844470XAv.LIZ.getClass();
        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
        c1233040iBy.LIZIZ(2131836823);
        c1233040iBy.LIZLLL();
        return true;
    }

    @Override // X.C15YD
    public final void LJIIL(C734760Sry c734760Sry) {
        C23250099c.LIZLLL(LJ, null, null, new C05KO(c734760Sry, null), 3);
    }

    @Override // X.C15YD
    public final void LJIILJJIL(FamilyPairingBean familyPairingBean) {
        boolean z;
        Looper looperMyLooper;
        Looper looperMyLooper2;
        FamilyPairingBean familyPairingBean2 = LJFF;
        Set<C05KM> set = LIZJ;
        if (set != null && !set.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Integer num = null;
        if (!z) {
            boolean zLJJII = LJJII(familyPairingBean2);
            boolean zLJJII2 = LJJII(familyPairingBean);
            if (zLJJII != zLJJII2) {
                C23250099c.LIZLLL(LJ, null, null, new C05KK(zLJJII2, null), 3);
            }
        }
        C15YE.LIZ.getClass();
        boolean zLJIIJ = C15YE.LJIIJ();
        FamilyPairingBean familyPairingBean3 = LJFF;
        LJIJI(familyPairingBean);
        boolean zLJIL = LJIL();
        if (familyPairingBean3 != null) {
            num = familyPairingBean3.userIdentity;
        }
        EnumC20537615Xy enumC20537615XyLJJIFFI = LJJIFFI(num);
        EnumC20537615Xy enumC20537615Xy = EnumC20537615Xy.CHILD;
        if (enumC20537615XyLJJIFFI == enumC20537615Xy && LIZIZ() != enumC20537615Xy) {
            if (LIZIZ() != EnumC20537615Xy.UNLINK_LOCKED && zLJIIJ && (looperMyLooper2 = Looper.myLooper()) != null) {
                C786410Ut5.LJJZZIII(new BPEAHandler(looperMyLooper2), new ARunnableS4S0010000_31(false, 0));
                return;
            }
            return;
        }
        if (LIZIZ() == enumC20537615Xy && zLJIL != zLJIIJ && (looperMyLooper = Looper.myLooper()) != null) {
            C786410Ut5.LJJZZIII(new BPEAHandler(looperMyLooper), new ARunnableS4S0010000_31(zLJIL, 0));
        }
    }

    @Override // X.C15YD
    public final void LJIJI(FamilyPairingBean familyPairingBean) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        long jLongValue;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        DoNotDisturbSettings doNotDisturbSettings;
        int i;
        int iIntValue7;
        int iIntValue8;
        List<ScreenTimeManagementDaySetting> list;
        int iIntValue9;
        int iIntValue10;
        boolean z;
        ScheduleBreakSettings scheduleBreakSettings;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        LJFF = familyPairingBean;
        int iIntValue11 = 0;
        if (familyPairingBean == null) {
            LJJI().storeBoolean("valid", false);
            return;
        }
        LJJI().storeBoolean("valid", true);
        Keva kevaLJJI = LJJI();
        GuardianRestrictionBean guardianRestrictionBean = familyPairingBean.restriction;
        if (guardianRestrictionBean != null && (num8 = guardianRestrictionBean.restrictMode) != null) {
            iIntValue = num8.intValue();
        } else {
            iIntValue = 0;
        }
        kevaLJJI.storeInt("teen_mode", iIntValue);
        Keva kevaLJJI2 = LJJI();
        Integer num9 = familyPairingBean.userIdentity;
        if (num9 != null) {
            iIntValue2 = num9.intValue();
        } else {
            iIntValue2 = 0;
        }
        kevaLJJI2.storeInt("parentalGuardianMode", iIntValue2);
        Keva kevaLJJI3 = LJJI();
        Integer num10 = familyPairingBean.childrenCount;
        if (num10 != null) {
            iIntValue3 = num10.intValue();
        } else {
            iIntValue3 = 0;
        }
        kevaLJJI3.storeInt("parentalGuardianChildCount", iIntValue3);
        Keva kevaLJJI4 = LJJI();
        Long l = familyPairingBean.duration;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        kevaLJJI4.storeLong("parentalGuardianDuration", jLongValue);
        Keva kevaLJJI5 = LJJI();
        Integer num11 = familyPairingBean.linkCount;
        if (num11 != null) {
            iIntValue4 = num11.intValue();
        } else {
            iIntValue4 = 0;
        }
        kevaLJJI5.storeInt("parentalGuardianLinkCount", iIntValue4);
        Keva kevaLJJI6 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean2 = familyPairingBean.restriction;
        if (guardianRestrictionBean2 != null && (num7 = guardianRestrictionBean2.screenTimeManagement) != null) {
            iIntValue5 = num7.intValue();
        } else {
            iIntValue5 = 0;
        }
        kevaLJJI6.storeInt("screenTimeManagement", iIntValue5);
        Keva kevaLJJI7 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean3 = familyPairingBean.restriction;
        if (guardianRestrictionBean3 != null && (num6 = guardianRestrictionBean3.searchRestriction) != null) {
            iIntValue6 = num6.intValue();
        } else {
            iIntValue6 = 0;
        }
        kevaLJJI7.storeInt("searchRestriction", iIntValue6);
        Keva kevaLJJI8 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean4 = familyPairingBean.restriction;
        EngagementCountSettings engagementCountSettings = null;
        if (guardianRestrictionBean4 != null) {
            doNotDisturbSettings = guardianRestrictionBean4.doNotDisturbSettings;
        } else {
            doNotDisturbSettings = null;
        }
        kevaLJJI8.storeString("doNotDisturbSettings", C08JS.LIZLLL(doNotDisturbSettings));
        Keva kevaLJJI9 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean5 = familyPairingBean.restriction;
        if (guardianRestrictionBean5 != null) {
            i = guardianRestrictionBean5.screenTimeManagementRepeatType;
        } else {
            i = 0;
        }
        kevaLJJI9.storeInt("screenTimeManagementRepeatType", i);
        Keva kevaLJJI10 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean6 = familyPairingBean.restriction;
        if (guardianRestrictionBean6 != null && (num5 = guardianRestrictionBean6.screenTimeManagementType) != null) {
            iIntValue7 = num5.intValue();
        } else {
            iIntValue7 = 0;
        }
        kevaLJJI10.storeInt("screenTimeManagementType", iIntValue7);
        Keva kevaLJJI11 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean7 = familyPairingBean.restriction;
        if (guardianRestrictionBean7 != null && (num4 = guardianRestrictionBean7.screenTimeManagementStatus) != null) {
            iIntValue8 = num4.intValue();
        } else {
            iIntValue8 = 0;
        }
        kevaLJJI11.storeInt("screenTimeManagementStatus", iIntValue8);
        Keva kevaLJJI12 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean8 = familyPairingBean.restriction;
        if (guardianRestrictionBean8 != null) {
            list = guardianRestrictionBean8.screenTimeManagementWeekSettings;
        } else {
            list = null;
        }
        kevaLJJI12.storeString("screenTimeManagementWeekSettings", C08JS.LIZLLL(list));
        Keva kevaLJJI13 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean9 = familyPairingBean.restriction;
        if (guardianRestrictionBean9 != null && (num3 = guardianRestrictionBean9.screenDurationType) != null) {
            iIntValue9 = num3.intValue();
        } else {
            iIntValue9 = 0;
        }
        kevaLJJI13.storeInt("parentalSessionBreakType", iIntValue9);
        Keva kevaLJJI14 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean10 = familyPairingBean.restriction;
        if (guardianRestrictionBean10 != null && (num2 = guardianRestrictionBean10.screenTimeBreaks) != null) {
            iIntValue10 = num2.intValue();
        } else {
            iIntValue10 = 0;
        }
        kevaLJJI14.storeInt("parentalSessionBreakDuration", iIntValue10);
        Keva kevaLJJI15 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean11 = familyPairingBean.restriction;
        if (guardianRestrictionBean11 != null) {
            z = guardianRestrictionBean11.shouldShowScreenBreak;
        } else {
            z = false;
        }
        kevaLJJI15.storeBoolean("shouldUseParentalSessionBreak", z);
        Keva kevaLJJI16 = LJJI();
        C1227904rF c1227904rF = C1227904rF.LIZ;
        GuardianRestrictionBean guardianRestrictionBean12 = familyPairingBean.restriction;
        if (guardianRestrictionBean12 != null) {
            scheduleBreakSettings = guardianRestrictionBean12.screenDownTimeSettings;
        } else {
            scheduleBreakSettings = null;
        }
        c1227904rF.getClass();
        kevaLJJI16.storeString("parentSetScheduleDowntimeForTeen", C1227904rF.LJI(scheduleBreakSettings));
        Keva kevaLJJI17 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean13 = familyPairingBean.restriction;
        if (guardianRestrictionBean13 != null) {
            engagementCountSettings = guardianRestrictionBean13.engagementCountSettings;
        }
        kevaLJJI17.storeString("engagementCountSettings", C08JS.LIZLLL(engagementCountSettings));
        Keva kevaLJJI18 = LJJI();
        GuardianRestrictionBean guardianRestrictionBean14 = familyPairingBean.restriction;
        if (guardianRestrictionBean14 != null && (num = guardianRestrictionBean14.screenTimeManagementBlockType) != null) {
            iIntValue11 = num.intValue();
        }
        kevaLJJI18.storeInt("screenTimeManagementBlockType", iIntValue11);
    }

    public final EnumC20537615Xy LJJIFFI(Integer num) {
        if (num != null) {
            if (num.intValue() != 0 && num.intValue() != 1) {
                if (num.intValue() == 2) {
                    return EnumC20537615Xy.CHILD;
                }
                if (num.intValue() == 3) {
                    return EnumC20537615Xy.PARENT;
                }
                if (num.intValue() == 4) {
                    return EnumC20537615Xy.UNLINK_LOCKED;
                }
            } else {
                return EnumC20537615Xy.NONE;
            }
        }
        return EnumC20537615Xy.NONE;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public void onParentalModeChanged(C484220Iyq c484220Iyq) {
        if (TextUtils.equals("guardian_platform_open", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) || TextUtils.equals("guardian_platform_close", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) || TextUtils.equals("guardian_platform_child_unlink", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName")) || TextUtils.equals("refresh_guadig_settings", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
            C15YE.LIZ.getClass();
            C15YE.LJIILL(null, "");
        }
    }
}
