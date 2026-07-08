package com.ss.android.ugc.tiktok.pns.services;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C15Y4;
import X.C297270Bkz;
import X.EnumC20537515Xx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.tiktok.pns.FPGsonService;
import com.ss.android.ugc.tiktok.pns.FPStorageService;
import com.ss.android.ugc.tiktok.pns.FamilyPairingModel;
import com.ss.android.ugc.tiktok.pns.GuardianRestrictionBean;
import com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService;
import com.ss.android.ugc.tiktok.pns.PnSDoNotDisturbSettings;
import com.ss.android.ugc.tiktok.pns.PnSScheduleBreakSettings;
import com.ss.android.ugc.tiktok.pns.PnSScreenTimeManagementDaySetting;
import com.ss.android.ugc.tiktok.pns.services.FPStorageServiceImpl;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSFamilyPairingServiceImpl implements IPnSFamilyPairingService {
    public static C15Y4 LJIIL() {
        return C297270Bkz.LIZ() ? new C15Y4() { // from class: X.15Xp
            public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(321));

            @Override // X.C15Y4
            public final void LJIILJJIL(FamilyPairingModel familyPairingModel) {
            }

            public static C15XY LIZIZ() {
                return (C15XY) LIZIZ.getValue();
            }

            @Override // X.C15Y4
            public final PnSScheduleBreakSettings LIZ() {
                return (PnSScheduleBreakSettings) LIZIZ().LJIIIIZZ(EnumC20536615Xo.FP_SCHEDULE_DOWNTIME, PnSScheduleBreakSettings.class);
            }

            @Override // X.C15Y4
            public final int LIZJ() {
                Integer numLIZLLL = LIZIZ().LIZLLL(EnumC20536615Xo.SCREEN_TIME_TYPE);
                if (numLIZLLL != null) {
                    return numLIZLLL.intValue();
                }
                return 0;
            }

            @Override // X.C15Y4
            public final List<PnSScreenTimeManagementDaySetting> LIZLLL() {
                return (List) LIZIZ().LIZJ(EnumC20536615Xo.WEEK_SETTINGS, new TypeToken<List<? extends PnSScreenTimeManagementDaySetting>>() { // from class: X.15Xt
                }.getType());
            }

            @Override // X.C15Y4
            public final int LJI() {
                Integer numLIZLLL = LIZIZ().LIZLLL(EnumC20536615Xo.SCREEN_TIME_REPEAT_TYPE);
                if (numLIZLLL != null) {
                    return numLIZLLL.intValue();
                }
                return 0;
            }

            @Override // X.C15Y4
            public final boolean LJIIIZ() {
                Integer numLIZLLL = LIZIZ().LIZLLL(EnumC20536615Xo.RESTRICT_MODE);
                return numLIZLLL != null && numLIZLLL.intValue() == 1;
            }

            @Override // X.C15Y4
            public final int LJIIJ() {
                Integer numLIZLLL;
                if (!LJIILL() || (numLIZLLL = LIZIZ().LIZLLL(EnumC20536615Xo.FP_SESSION_DURATION)) == null) {
                    return 0;
                }
                return numLIZLLL.intValue();
            }

            @Override // X.C15Y4
            public final int LJIIJJI() {
                Integer numLIZLLL = LIZIZ().LIZLLL(EnumC20536615Xo.FP_SESSION_BREAK_TYPE);
                if (numLIZLLL != null) {
                    return numLIZLLL.intValue();
                }
                return 0;
            }

            @Override // X.C15Y4
            public final int LJIIL() {
                Integer num;
                if (LJI() != 2) {
                    Integer numLIZLLL = LIZIZ().LIZLLL(EnumC20536615Xo.SCREEN_TIME_MANAGEMENT);
                    if (numLIZLLL != null) {
                        return numLIZLLL.intValue();
                    }
                    return 0;
                }
                List<PnSScreenTimeManagementDaySetting> listLIZLLL = LIZLLL();
                if (listLIZLLL == null) {
                    return 0;
                }
                Date date = new Date();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                PnSScreenTimeManagementDaySetting pnSScreenTimeManagementDaySetting = (PnSScreenTimeManagementDaySetting) C13LP.LJJJLZIJ((calendar.get(7) != 1 ? r1 - 1 : 7) - 1, listLIZLLL);
                if (pnSScreenTimeManagementDaySetting == null || (num = pnSScreenTimeManagementDaySetting.screenTimeLimitForWeek) == null) {
                    return 0;
                }
                return num.intValue();
            }

            @Override // X.C15Y4
            public final boolean LJIILIIL() {
                Integer numLIZLLL;
                return LJIIL() > 0 && (numLIZLLL = LIZIZ().LIZLLL(EnumC20536615Xo.SCREEN_TIME_STATUS)) != null && numLIZLLL.intValue() == 1;
            }

            @Override // X.C15Y4
            public final boolean LJIILL() {
                return Intrinsics.LJFF(LIZIZ().LIZ(EnumC20536615Xo.FP_SHOULD_USE_PARENT_BREAK), Boolean.TRUE);
            }

            @Override // X.C15Y4
            public final EnumC20537515Xx LJIILLIIL(boolean z) {
                if (!z) {
                    return EnumC20537515Xx.NONE;
                }
                Integer numLIZLLL = LIZIZ().LIZLLL(EnumC20536615Xo.PARENTAL_GUARDIAN_MODE);
                if (numLIZLLL != null) {
                    if (numLIZLLL.intValue() != 0 && numLIZLLL.intValue() != 1) {
                        if (numLIZLLL.intValue() == 2) {
                            return EnumC20537515Xx.CHILD;
                        }
                        if (numLIZLLL.intValue() == 3) {
                            return EnumC20537515Xx.PARENT;
                        }
                        if (numLIZLLL.intValue() == 4) {
                            return EnumC20537515Xx.UNLINK_LOCKED;
                        }
                    } else {
                        return EnumC20537515Xx.NONE;
                    }
                }
                return EnumC20537515Xx.NONE;
            }
        } : new C15Y4() { // from class: X.15Xw
            public static final FPStorageService LIZIZ;
            public static FamilyPairingModel LIZJ;

            static {
                FPStorageService fPStorageService;
                PnSDoNotDisturbSettings pnSDoNotDisturbSettings;
                PnSScheduleBreakSettings pnSScheduleBreakSettings;
                List list;
                FPStorageService.LIZ.getClass();
                Object objLIZ = C04TD.LIZ(FPStorageService.class, false);
                if (objLIZ != null) {
                    fPStorageService = (FPStorageService) objLIZ;
                } else {
                    if (C04TD.a7 == null) {
                        synchronized (FPStorageService.class) {
                            if (C04TD.a7 == null) {
                                C04TD.a7 = new FPStorageServiceImpl();
                            }
                        }
                    }
                    fPStorageService = C04TD.a7;
                }
                LIZIZ = fPStorageService;
                if (fPStorageService.getBoolean("valid")) {
                    int i = fPStorageService.getInt("parentalGuardianMode");
                    int i2 = fPStorageService.getInt("parentalGuardianChildCount");
                    int i3 = fPStorageService.getInt("parentalGuardianLinkCount");
                    long jLJ = fPStorageService.LJ();
                    int i4 = fPStorageService.getInt("teen_mode");
                    int i5 = fPStorageService.getInt("screenTimeManagement");
                    int i6 = fPStorageService.getInt("searchRestriction");
                    int i7 = fPStorageService.getInt("parentalSessionBreakType");
                    int i8 = fPStorageService.getInt("parentalSessionBreakDuration");
                    try {
                        FPGsonService.LIZ.getClass();
                        pnSDoNotDisturbSettings = (PnSDoNotDisturbSettings) C04TJ.LIZ().LIZLLL(fPStorageService.getString("doNotDisturbSettings"), PnSDoNotDisturbSettings.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        pnSDoNotDisturbSettings = null;
                    }
                    FPStorageService fPStorageService2 = LIZIZ;
                    int i9 = fPStorageService2.getInt("screenTimeManagementStatus");
                    int i10 = fPStorageService2.getInt("screenTimeManagementType");
                    boolean z = fPStorageService2.getBoolean("shouldUseParentalSessionBreak");
                    int i11 = fPStorageService2.getInt("screenTimeManagementRepeatType");
                    try {
                        FPGsonService.LIZ.getClass();
                        pnSScheduleBreakSettings = (PnSScheduleBreakSettings) C04TJ.LIZ().LIZLLL(fPStorageService2.getString("parentSetScheduleDowntimeForTeen"), PnSScheduleBreakSettings.class);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        pnSScheduleBreakSettings = null;
                    }
                    try {
                        FPGsonService.LIZ.getClass();
                        list = (List) C04TJ.LIZ().LJ(LIZIZ.getString("screenTimeManagementWeekSettings"), new TypeToken<List<? extends PnSScreenTimeManagementDaySetting>>() { // from class: X.15Y2
                        }.getType());
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        list = null;
                    }
                    LIZIZ(new FamilyPairingModel(Integer.valueOf(i), new GuardianRestrictionBean(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i6), pnSDoNotDisturbSettings, Integer.valueOf(i8), Integer.valueOf(i7), Integer.valueOf(i9), Integer.valueOf(i10), i11, list, z, pnSScheduleBreakSettings), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(jLJ)));
                }
            }

            @Override // X.C15Y4
            public final PnSScheduleBreakSettings LIZ() {
                GuardianRestrictionBean guardianRestrictionBean;
                FamilyPairingModel familyPairingModel = LIZJ;
                if (familyPairingModel == null || (guardianRestrictionBean = familyPairingModel.restriction) == null) {
                    return null;
                }
                return guardianRestrictionBean.screenDownTimeSettings;
            }

            @Override // X.C15Y4
            public final int LIZJ() {
                GuardianRestrictionBean guardianRestrictionBean;
                Integer num;
                FamilyPairingModel familyPairingModel = LIZJ;
                if (familyPairingModel == null || (guardianRestrictionBean = familyPairingModel.restriction) == null || (num = guardianRestrictionBean.screenTimeManagementType) == null) {
                    return 0;
                }
                return num.intValue();
            }

            @Override // X.C15Y4
            public final List<PnSScreenTimeManagementDaySetting> LIZLLL() {
                GuardianRestrictionBean guardianRestrictionBean;
                FamilyPairingModel familyPairingModel = LIZJ;
                if (familyPairingModel == null || (guardianRestrictionBean = familyPairingModel.restriction) == null) {
                    return null;
                }
                return guardianRestrictionBean.screenTimeManagementWeekSettings;
            }

            @Override // X.C15Y4
            public final int LJI() {
                GuardianRestrictionBean guardianRestrictionBean;
                FamilyPairingModel familyPairingModel = LIZJ;
                if (familyPairingModel == null || (guardianRestrictionBean = familyPairingModel.restriction) == null) {
                    return 0;
                }
                return guardianRestrictionBean.screenTimeManagementRepeatType;
            }

            @Override // X.C15Y4
            public final boolean LJIIIZ() {
                GuardianRestrictionBean guardianRestrictionBean;
                Integer num;
                FamilyPairingModel familyPairingModel = LIZJ;
                return (familyPairingModel == null || (guardianRestrictionBean = familyPairingModel.restriction) == null || (num = guardianRestrictionBean.restrictMode) == null || num.intValue() != 1) ? false : true;
            }

            @Override // X.C15Y4
            public final int LJIIJ() {
                GuardianRestrictionBean guardianRestrictionBean;
                GuardianRestrictionBean guardianRestrictionBean2;
                Integer num;
                FamilyPairingModel familyPairingModel = LIZJ;
                if (familyPairingModel == null || (guardianRestrictionBean = familyPairingModel.restriction) == null || !guardianRestrictionBean.shouldShowScreenBreak || (guardianRestrictionBean2 = familyPairingModel.restriction) == null || (num = guardianRestrictionBean2.screenTimeBreaks) == null) {
                    return 0;
                }
                return num.intValue();
            }

            @Override // X.C15Y4
            public final int LJIIJJI() {
                GuardianRestrictionBean guardianRestrictionBean;
                Integer num;
                FamilyPairingModel familyPairingModel = LIZJ;
                if (familyPairingModel == null || (guardianRestrictionBean = familyPairingModel.restriction) == null || (num = guardianRestrictionBean.screenDurationType) == null) {
                    return 0;
                }
                return num.intValue();
            }

            @Override // X.C15Y4
            public final int LJIIL() {
                Integer num;
                List<PnSScreenTimeManagementDaySetting> list;
                Integer num2;
                FamilyPairingModel familyPairingModel = LIZJ;
                if (familyPairingModel == null) {
                    return 0;
                }
                GuardianRestrictionBean guardianRestrictionBean = familyPairingModel.restriction;
                if (guardianRestrictionBean == null || guardianRestrictionBean.screenTimeManagementRepeatType != 2) {
                    GuardianRestrictionBean guardianRestrictionBean2 = familyPairingModel.restriction;
                    if (guardianRestrictionBean2 == null || (num = guardianRestrictionBean2.screenTimeManagement) == null) {
                        return 0;
                    }
                    return num.intValue();
                }
                GuardianRestrictionBean guardianRestrictionBean3 = familyPairingModel.restriction;
                if (guardianRestrictionBean3 == null || (list = guardianRestrictionBean3.screenTimeManagementWeekSettings) == null) {
                    return 0;
                }
                Date date = new Date();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int i = calendar.get(7);
                PnSScreenTimeManagementDaySetting pnSScreenTimeManagementDaySetting = (PnSScreenTimeManagementDaySetting) C13LP.LJJJLZIJ((i != 1 ? i - 1 : 7) - 1, list);
                if (pnSScreenTimeManagementDaySetting == null || (num2 = pnSScreenTimeManagementDaySetting.screenTimeLimitForWeek) == null) {
                    return 0;
                }
                return num2.intValue();
            }

            @Override // X.C15Y4
            public final boolean LJIILL() {
                GuardianRestrictionBean guardianRestrictionBean;
                FamilyPairingModel familyPairingModel = LIZJ;
                if (familyPairingModel == null || (guardianRestrictionBean = familyPairingModel.restriction) == null) {
                    return false;
                }
                return guardianRestrictionBean.shouldShowScreenBreak;
            }

            @Override // X.C15Y4
            public final boolean LJIILIIL() {
                FamilyPairingModel familyPairingModel;
                GuardianRestrictionBean guardianRestrictionBean;
                Integer num;
                return (LJIIL() <= 0 || (familyPairingModel = LIZJ) == null || (guardianRestrictionBean = familyPairingModel.restriction) == null || (num = guardianRestrictionBean.screenTimeManagementStatus) == null || num.intValue() != 1) ? false : true;
            }

            public static void LIZIZ(FamilyPairingModel familyPairingModel) {
                int iIntValue;
                int iIntValue2;
                int iIntValue3;
                long jLongValue;
                int iIntValue4;
                int iIntValue5;
                int iIntValue6;
                Object obj;
                int i;
                int iIntValue7;
                int iIntValue8;
                Object obj2;
                int iIntValue9;
                int iIntValue10;
                PnSScheduleBreakSettings pnSScheduleBreakSettings;
                Integer num;
                Integer num2;
                Integer num3;
                Integer num4;
                Integer num5;
                Integer num6;
                Integer num7;
                LIZJ = familyPairingModel;
                boolean z = false;
                if (familyPairingModel == null) {
                    LIZIZ.LIZLLL("valid", false);
                    return;
                }
                FPStorageService fPStorageService = LIZIZ;
                fPStorageService.LIZLLL("valid", true);
                GuardianRestrictionBean guardianRestrictionBean = familyPairingModel.restriction;
                if (guardianRestrictionBean != null && (num7 = guardianRestrictionBean.restrictMode) != null) {
                    iIntValue = num7.intValue();
                } else {
                    iIntValue = 0;
                }
                fPStorageService.LIZJ("teen_mode", iIntValue);
                Integer num8 = familyPairingModel.userIdentity;
                if (num8 != null) {
                    iIntValue2 = num8.intValue();
                } else {
                    iIntValue2 = 0;
                }
                fPStorageService.LIZJ("parentalGuardianMode", iIntValue2);
                Integer num9 = familyPairingModel.childrenCount;
                if (num9 != null) {
                    iIntValue3 = num9.intValue();
                } else {
                    iIntValue3 = 0;
                }
                fPStorageService.LIZJ("parentalGuardianChildCount", iIntValue3);
                Long l = familyPairingModel.duration;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                fPStorageService.LJFF(jLongValue);
                Integer num10 = familyPairingModel.linkCount;
                if (num10 != null) {
                    iIntValue4 = num10.intValue();
                } else {
                    iIntValue4 = 0;
                }
                fPStorageService.LIZJ("parentalGuardianLinkCount", iIntValue4);
                GuardianRestrictionBean guardianRestrictionBean2 = familyPairingModel.restriction;
                if (guardianRestrictionBean2 != null && (num6 = guardianRestrictionBean2.screenTimeManagement) != null) {
                    iIntValue5 = num6.intValue();
                } else {
                    iIntValue5 = 0;
                }
                fPStorageService.LIZJ("screenTimeManagement", iIntValue5);
                GuardianRestrictionBean guardianRestrictionBean3 = familyPairingModel.restriction;
                if (guardianRestrictionBean3 != null && (num5 = guardianRestrictionBean3.searchRestriction) != null) {
                    iIntValue6 = num5.intValue();
                } else {
                    iIntValue6 = 0;
                }
                fPStorageService.LIZJ("searchRestriction", iIntValue6);
                FPGsonService.LIZ.getClass();
                FPGsonService fPGsonServiceLIZ = C04TJ.LIZ();
                GuardianRestrictionBean guardianRestrictionBean4 = familyPairingModel.restriction;
                Object obj3 = "";
                if (guardianRestrictionBean4 == null || (obj = guardianRestrictionBean4.pnSDoNotDisturbSettings) == null) {
                    obj = "";
                }
                fPStorageService.LIZIZ("doNotDisturbSettings", fPGsonServiceLIZ.LIZJ(obj));
                GuardianRestrictionBean guardianRestrictionBean5 = familyPairingModel.restriction;
                if (guardianRestrictionBean5 != null) {
                    i = guardianRestrictionBean5.screenTimeManagementRepeatType;
                } else {
                    i = 0;
                }
                fPStorageService.LIZJ("screenTimeManagementRepeatType", i);
                GuardianRestrictionBean guardianRestrictionBean6 = familyPairingModel.restriction;
                if (guardianRestrictionBean6 != null && (num4 = guardianRestrictionBean6.screenTimeManagementType) != null) {
                    iIntValue7 = num4.intValue();
                } else {
                    iIntValue7 = 0;
                }
                fPStorageService.LIZJ("screenTimeManagementType", iIntValue7);
                GuardianRestrictionBean guardianRestrictionBean7 = familyPairingModel.restriction;
                if (guardianRestrictionBean7 != null && (num3 = guardianRestrictionBean7.screenTimeManagementStatus) != null) {
                    iIntValue8 = num3.intValue();
                } else {
                    iIntValue8 = 0;
                }
                fPStorageService.LIZJ("screenTimeManagementStatus", iIntValue8);
                FPGsonService fPGsonServiceLIZ2 = C04TJ.LIZ();
                GuardianRestrictionBean guardianRestrictionBean8 = familyPairingModel.restriction;
                if (guardianRestrictionBean8 == null || (obj2 = guardianRestrictionBean8.screenTimeManagementWeekSettings) == null) {
                    obj2 = "";
                }
                fPStorageService.LIZIZ("screenTimeManagementWeekSettings", fPGsonServiceLIZ2.LIZJ(obj2));
                GuardianRestrictionBean guardianRestrictionBean9 = familyPairingModel.restriction;
                if (guardianRestrictionBean9 != null && (num2 = guardianRestrictionBean9.screenDurationType) != null) {
                    iIntValue9 = num2.intValue();
                } else {
                    iIntValue9 = 0;
                }
                fPStorageService.LIZJ("parentalSessionBreakType", iIntValue9);
                GuardianRestrictionBean guardianRestrictionBean10 = familyPairingModel.restriction;
                if (guardianRestrictionBean10 != null && (num = guardianRestrictionBean10.screenTimeBreaks) != null) {
                    iIntValue10 = num.intValue();
                } else {
                    iIntValue10 = 0;
                }
                fPStorageService.LIZJ("parentalSessionBreakDuration", iIntValue10);
                GuardianRestrictionBean guardianRestrictionBean11 = familyPairingModel.restriction;
                if (guardianRestrictionBean11 != null) {
                    z = guardianRestrictionBean11.shouldShowScreenBreak;
                }
                fPStorageService.LIZLLL("shouldUseParentalSessionBreak", z);
                FPGsonService fPGsonServiceLIZ3 = C04TJ.LIZ();
                GuardianRestrictionBean guardianRestrictionBean12 = familyPairingModel.restriction;
                if (guardianRestrictionBean12 != null && (pnSScheduleBreakSettings = guardianRestrictionBean12.screenDownTimeSettings) != null) {
                    obj3 = pnSScheduleBreakSettings;
                }
                fPStorageService.LIZIZ("parentSetScheduleDowntimeForTeen", fPGsonServiceLIZ3.LIZJ(obj3));
            }

            @Override // X.C15Y4
            public final void LJIILJJIL(FamilyPairingModel familyPairingModel) {
                LIZIZ(familyPairingModel);
            }

            @Override // X.C15Y4
            public final EnumC20537515Xx LJIILLIIL(boolean z) {
                FamilyPairingModel familyPairingModel = LIZJ;
                if (familyPairingModel != null && z) {
                    Integer num = familyPairingModel.userIdentity;
                    if (num != null) {
                        if (num.intValue() != 0 && num.intValue() != 1) {
                            if (num.intValue() == 2) {
                                return EnumC20537515Xx.CHILD;
                            }
                            if (num.intValue() == 3) {
                                return EnumC20537515Xx.PARENT;
                            }
                            if (num.intValue() == 4) {
                                return EnumC20537515Xx.UNLINK_LOCKED;
                            }
                        } else {
                            return EnumC20537515Xx.NONE;
                        }
                    }
                    return EnumC20537515Xx.NONE;
                }
                return EnumC20537515Xx.NONE;
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final PnSScheduleBreakSettings LIZ() {
        return LJIIL().LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final EnumC20537515Xx LIZIZ() {
        return LJIIL().LJIILLIIL(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin());
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final int LIZJ() {
        return LJIIL().LIZJ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final List<PnSScreenTimeManagementDaySetting> LIZLLL() {
        return LJIIL().LIZLLL();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final int LJ() {
        return LJIIL().LJIIL();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final boolean LJFF() {
        return LJIIL().LJIILL();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final int LJI() {
        return LJIIL().LJI();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final int LJII() {
        return LJIIL().LJIIJ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final boolean LJIIIIZZ() {
        return LJIIL().LJIILIIL();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final boolean LJIIIZ() {
        return LJIIL().LJIIIZ();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final int LJIIJ() {
        return LJIIL().LJIIJJI();
    }

    @Override // com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService
    public final void LJIIJJI(FamilyPairingModel familyPairingModel) {
        LJIIL().LJIILJJIL(familyPairingModel);
    }
}
