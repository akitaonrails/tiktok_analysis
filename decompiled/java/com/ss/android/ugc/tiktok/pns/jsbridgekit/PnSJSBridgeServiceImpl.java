package com.ss.android.ugc.tiktok.pns.jsbridgekit;

import X.C13LQ;
import X.C1556470qbd;
import X.C1697810uHb;
import X.C1876050yv5;
import X.C1876070yv7;
import X.C1876100yvA;
import X.C1876120yvC;
import X.C1876150yvF;
import X.C1876250yvP;
import X.C1876260yvQ;
import X.C1876310yvV;
import X.C1876420yvg;
import X.C1876500yvo;
import X.C1876560yvu;
import X.C1876570yvv;
import X.C1876580yvw;
import X.C2097908Jt;
import X.InterfaceC1063710dmr;
import X.InterfaceC1876060yv6;
import X.InterfaceC1876090yv9;
import X.InterfaceC1876110yvB;
import X.InterfaceC1876130yvD;
import X.InterfaceC1876160yvG;
import X.InterfaceC1876320yvW;
import X.InterfaceC1876460yvk;
import Y.AfS197S0100000_28;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bddatefmt.BDDateFormat;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.compliance.api.services.jsbridge.IPnSJSBridgeService;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.IPnSFamilyPairingService;
import com.ss.android.ugc.tiktok.pns.PnSScheduleBreakSettings;
import com.ss.android.ugc.tiktok.pns.PnSScheduleBreakWeekSettings;
import com.ss.android.ugc.tiktok.pns.PnSScreenTimeManagementDaySetting;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.filtervideo.IFilterVideoService;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IJsbBroadcastService;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IWHFeedsService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PnSJSBridgeServiceImpl implements IPnSJSBridgeService {
    public static boolean LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.jsbridge.IPnSJSBridgeService
    public final List<Class<? extends InterfaceC1063710dmr>> LIZ() {
        if (!LIZ) {
            InterfaceC1876060yv6[] interfaceC1876060yv6Arr = (InterfaceC1876060yv6[]) C13LQ.LJIJI(new InterfaceC1876060yv6[]{PluggableExtentionKt.pluggableSpi$default(IACFeedsService.class, false, false, false, 14, null), PluggableExtentionKt.pluggableSpi$default(IWHFeedsService.class, false, false, false, 14, null), PluggableExtentionKt.pluggableSpi$default(IJsbBroadcastService.class, false, false, false, 14, null), new InterfaceC1876130yvD() { // from class: X.15YU
                @Override // X.InterfaceC1876130yvD
                public final C15YT LIZIZ() {
                    Integer num;
                    Integer num2;
                    Integer num3;
                    Integer num4;
                    Boolean bool;
                    Boolean bool2;
                    Boolean bool3;
                    List<PnSScheduleBreakWeekSettings> list;
                    C15YT c15yt = (C15YT) C1909107dp.LIZJ(C15YT.class, null);
                    IPnSFamilyPairingService.LIZ.getClass();
                    IPnSFamilyPairingService iPnSFamilyPairingServiceLIZ = C1104704Tt.LIZ();
                    c15yt.setFamilyRestrictedMode(iPnSFamilyPairingServiceLIZ.LJIIIZ() ? num : 0);
                    c15yt.setFamilyTimelock(iPnSFamilyPairingServiceLIZ.LJIIIIZZ() ? num : 0);
                    c15yt.setFamilyTimelockRepeatType(Integer.valueOf(iPnSFamilyPairingServiceLIZ.LJI()));
                    c15yt.setFamilyMaxUseDurationInMinutes(Integer.valueOf(iPnSFamilyPairingServiceLIZ.LJ()));
                    c15yt.setFamilyTimelockType(Integer.valueOf(iPnSFamilyPairingServiceLIZ.LIZJ()));
                    List<PnSScreenTimeManagementDaySetting> listLIZLLL = iPnSFamilyPairingServiceLIZ.LIZLLL();
                    ArrayList arrayList = new ArrayList();
                    if (listLIZLLL != null) {
                        for (PnSScreenTimeManagementDaySetting pnSScreenTimeManagementDaySetting : listLIZLLL) {
                            InterfaceC20538415Yg interfaceC20538415Yg = (InterfaceC20538415Yg) C1909107dp.LIZJ(InterfaceC20538415Yg.class, null);
                            Integer num5 = pnSScreenTimeManagementDaySetting.dayOfWeek;
                            if (num5 == null) {
                                num5 = 0;
                            }
                            interfaceC20538415Yg.setDay(num5);
                            Integer num6 = pnSScreenTimeManagementDaySetting.screenTimeLimitForWeek;
                            if (num6 == null) {
                                num6 = 0;
                            }
                            interfaceC20538415Yg.setScreenTimeLimit(num6);
                            Integer num7 = pnSScreenTimeManagementDaySetting.screenTimeSettingTypeForWeek;
                            if (num7 == null) {
                                num7 = 0;
                            }
                            interfaceC20538415Yg.setScreenTimeSettingType(num7);
                            Integer num8 = pnSScreenTimeManagementDaySetting.screenTimeStatusForWeek;
                            if (num8 == null) {
                                num8 = 0;
                            }
                            interfaceC20538415Yg.setStatus(num8);
                            arrayList.add(interfaceC20538415Yg);
                        }
                    }
                    c15yt.setFamilyTimelockWeekSettings(arrayList);
                    c15yt.setFamilySessionDurationReminder(Integer.valueOf(iPnSFamilyPairingServiceLIZ.LJII()));
                    c15yt.setFamilySessionDurationType(Integer.valueOf(iPnSFamilyPairingServiceLIZ.LJIIJ()));
                    c15yt.setFamilyShowStmBreak(Boolean.valueOf(iPnSFamilyPairingServiceLIZ.LJFF()));
                    c15yt.setFamilyRole(Integer.valueOf(iPnSFamilyPairingServiceLIZ.LIZIZ().getValue()));
                    IPnSFamilyPairingService.LIZ.getClass();
                    PnSScheduleBreakSettings pnSScheduleBreakSettingsLIZ = C1104704Tt.LIZ().LIZ();
                    InterfaceC20538015Yc interfaceC20538015Yc = (InterfaceC20538015Yc) C1909107dp.LIZJ(InterfaceC20538015Yc.class, null);
                    interfaceC20538015Yc.setShowStmDownTime(pnSScheduleBreakSettingsLIZ != null ? Boolean.valueOf(pnSScheduleBreakSettingsLIZ.shouldShowDownTime) : Boolean.FALSE);
                    interfaceC20538015Yc.setScreenDownTimeStatus(pnSScheduleBreakSettingsLIZ != null ? Integer.valueOf(pnSScheduleBreakSettingsLIZ.downTimeStatus) : 0);
                    interfaceC20538015Yc.setScreenDownTimeType(pnSScheduleBreakSettingsLIZ != null ? Integer.valueOf(pnSScheduleBreakSettingsLIZ.type) : 0);
                    interfaceC20538015Yc.setPermissionReviewStatus(Integer.valueOf(pnSScheduleBreakSettingsLIZ != null ? pnSScheduleBreakSettingsLIZ.skipDownTimeStatus : 0));
                    ArrayList arrayList2 = new ArrayList();
                    if (pnSScheduleBreakSettingsLIZ != null && (list = pnSScheduleBreakSettingsLIZ.weekSettings) != null) {
                        for (PnSScheduleBreakWeekSettings pnSScheduleBreakWeekSettings : list) {
                            InterfaceC20538215Ye interfaceC20538215Ye = (InterfaceC20538215Ye) C1909107dp.LIZJ(InterfaceC20538215Ye.class, null);
                            interfaceC20538215Ye.setDay(Integer.valueOf(pnSScheduleBreakWeekSettings.weekDay));
                            interfaceC20538215Ye.setStartHour(Integer.valueOf(pnSScheduleBreakWeekSettings.startHour));
                            interfaceC20538215Ye.setStartMin(Integer.valueOf(pnSScheduleBreakWeekSettings.startMinute));
                            interfaceC20538215Ye.setEndHour(Integer.valueOf(pnSScheduleBreakWeekSettings.endHour));
                            interfaceC20538215Ye.setEndMin(Integer.valueOf(pnSScheduleBreakWeekSettings.endMinute));
                            interfaceC20538215Ye.setScreenDownTimeStatusDay(Integer.valueOf(pnSScheduleBreakWeekSettings.status));
                            arrayList2.add(interfaceC20538215Ye);
                        }
                    }
                    interfaceC20538015Yc.setScreenDownTimeDaySetting(arrayList2);
                    c15yt.setFamilyScreenDownTimeSettings(interfaceC20538015Yc);
                    IProtectionService iProtectionServiceLJIL = ComplianceServiceProvider.LJIL();
                    c15yt.setSelfTimelock(iProtectionServiceLJIL.LJJIL() ? num : 0);
                    c15yt.setSelfRestrictedMode(iProtectionServiceLJIL.LJJJJZI() ? num : 0);
                    c15yt.setRestrictModeHasPassword(Boolean.valueOf(iProtectionServiceLJIL.LJIIL()));
                    c15yt.setSelfWeeklyUpdate(iProtectionServiceLJIL.LJIILIIL() ? 1 : 0);
                    c15yt.setMaxUseDurationInMinutes(Integer.valueOf(iProtectionServiceLJIL.LJJJLIIL()));
                    c15yt.setSelfTimelockType(Integer.valueOf(iProtectionServiceLJIL.LJJIJIIJI()));
                    c15yt.setSessionDurationReminder(Integer.valueOf(iProtectionServiceLJIL.LJIIIZ()));
                    c15yt.setSessionDurationType(Integer.valueOf(iProtectionServiceLJIL.LJIIIIZZ()));
                    c15yt.setSelfTimelockRepeatType(Integer.valueOf(iProtectionServiceLJIL.LJIJJLI()));
                    SleepHourConfigSettings sleepHourConfigSettingsLJJIJIL = iProtectionServiceLJIL.LJJIJIL();
                    InterfaceC20538315Yf interfaceC20538315Yf = (InterfaceC20538315Yf) C1909107dp.LIZJ(InterfaceC20538315Yf.class, null);
                    if (sleepHourConfigSettingsLJJIJIL == null || (num = sleepHourConfigSettingsLJJIJIL.sleepTimeStartHour) == null) {
                        num = 0;
                    }
                    interfaceC20538315Yf.setSleepTimeStartHour(num);
                    if (sleepHourConfigSettingsLJJIJIL == null || (num2 = sleepHourConfigSettingsLJJIJIL.sleepTimeStartMinute) == null) {
                        num2 = 0;
                    }
                    interfaceC20538315Yf.setSleepTimeStartMinute(num2);
                    if (sleepHourConfigSettingsLJJIJIL == null || (num3 = sleepHourConfigSettingsLJJIJIL.sleepTimeEndHour) == null) {
                        num3 = 0;
                    }
                    interfaceC20538315Yf.setSleepTimeEndHour(num3);
                    if (sleepHourConfigSettingsLJJIJIL == null || (num4 = sleepHourConfigSettingsLJJIJIL.sleepTimeEndMinute) == null) {
                        num4 = 0;
                    }
                    interfaceC20538315Yf.setSleepTimeEndMinute(num4);
                    if (sleepHourConfigSettingsLJJIJIL == null || (bool = sleepHourConfigSettingsLJJIJIL.sleepHourEnabled) == null) {
                        bool = Boolean.FALSE;
                    }
                    interfaceC20538315Yf.setSleepReminderEnabled(bool);
                    if (sleepHourConfigSettingsLJJIJIL == null || (bool2 = sleepHourConfigSettingsLJJIJIL.skipSleepHours) == null) {
                        bool2 = Boolean.FALSE;
                    }
                    interfaceC20538315Yf.setSkipForToday(bool2);
                    c15yt.setSleepTimeSettings(interfaceC20538315Yf);
                    UserDetailsInfoBean userDetailsInfoBeanLJJII = iProtectionServiceLJIL.LJJII();
                    InterfaceC20539015Ym interfaceC20539015Ym = (InterfaceC20539015Ym) C1909107dp.LIZJ(InterfaceC20539015Ym.class, null);
                    if (userDetailsInfoBeanLJJII == null || (bool3 = userDetailsInfoBeanLJJII.isMinor) == null) {
                        bool3 = Boolean.FALSE;
                    }
                    interfaceC20539015Ym.setMinor(bool3);
                    c15yt.setUserDetails(interfaceC20539015Ym);
                    List<ScreenTimeManagementDaySetting> listLJJJJIZL = iProtectionServiceLJIL.LJJJJIZL();
                    ArrayList arrayList3 = new ArrayList();
                    if (listLJJJJIZL != null) {
                        for (ScreenTimeManagementDaySetting screenTimeManagementDaySetting : listLJJJJIZL) {
                            InterfaceC20538515Yh interfaceC20538515Yh = (InterfaceC20538515Yh) C1909107dp.LIZJ(InterfaceC20538515Yh.class, null);
                            Integer num9 = screenTimeManagementDaySetting.dayOfWeek;
                            if (num9 == null) {
                                num9 = 0;
                            }
                            interfaceC20538515Yh.setDay(num9);
                            Integer num10 = screenTimeManagementDaySetting.screenTimeLimitForWeek;
                            if (num10 == null) {
                                num10 = 0;
                            }
                            interfaceC20538515Yh.setScreenTimeLimit(num10);
                            Integer num11 = screenTimeManagementDaySetting.screenTimeSettingTypeForWeek;
                            if (num11 == null) {
                                num11 = 0;
                            }
                            interfaceC20538515Yh.setScreenTimeSettingType(num11);
                            Integer num12 = screenTimeManagementDaySetting.screenTimeStatusForWeek;
                            if (num12 == null) {
                                num12 = 0;
                            }
                            interfaceC20538515Yh.setStatus(num12);
                            arrayList3.add(interfaceC20538515Yh);
                        }
                    }
                    c15yt.setSelfTimelockWeekSettings(arrayList3);
                    return c15yt;
                }
            }, new InterfaceC1876460yvk() { // from class: X.0yvn
                @Override // X.InterfaceC1876460yvk
                public final C1876480yvm LJIIJ(long j, String str) {
                    return new C1876480yvm(new BDDateFormat(str).LIZIZ(j, Locale.getDefault()), TextUtils.equals(new BDDateFormat("LT").LIZIZ(j, Locale.getDefault()), new BDDateFormat("lt").LIZIZ(j, Locale.getDefault())));
                }
            }, new InterfaceC1876110yvB() { // from class: X.15YY
                /* JADX WARN: Removed duplicated region for block: B:83:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x017f A[PHI: r4
                  0x017f: PHI (r4v1 int) = (r4v0 int), (r4v8 int) binds: [B:91:0x017c, B:79:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:96:0x0183 A[PHI: r3 r4
                  0x0183: PHI (r3v4 int) = (r3v3 int), (r3v9 int) binds: [B:94:0x0180, B:82:0x013f] A[DONT_GENERATE, DONT_INLINE]
                  0x0183: PHI (r4v2 int) = (r4v1 int), (r4v7 int) binds: [B:94:0x0180, B:82:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0187 A[PHI: r2 r3 r4
                  0x0187: PHI (r2v4 int) = (r2v3 int), (r2v7 int) binds: [B:97:0x0184, B:85:0x0149] A[DONT_GENERATE, DONT_INLINE]
                  0x0187: PHI (r3v5 int) = (r3v4 int), (r3v8 int) binds: [B:97:0x0184, B:85:0x0149] A[DONT_GENERATE, DONT_INLINE]
                  0x0187: PHI (r4v3 int) = (r4v2 int), (r4v6 int) binds: [B:97:0x0184, B:85:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC1876110yvB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJIILIIL(X.C15YZ r21) {
                    /*
                        Method dump skipped, instruction units count: 405
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C15YY.LJIILIIL(X.15YZ):void");
                }
            }, new InterfaceC1876090yv9() { // from class: X.0yv8
                @Override // X.InterfaceC1876090yv9
                public final void LJ(InterfaceC1799360wvO interfaceC1799360wvO, Context context) {
                    IFilterVideoService iFilterVideoService = (IFilterVideoService) PluggableExtentionKt.pluggableSpi$default(IFilterVideoService.class, false, false, false, 14, null);
                    if (iFilterVideoService != null) {
                        iFilterVideoService.LJI(context, interfaceC1799360wvO.getEnterFrom());
                    }
                }
            }, new InterfaceC1876160yvG() { // from class: X.0yvN
                @Override // X.InterfaceC1876160yvG
                public final void LJIIIIZZ(InterfaceC1876190yvJ interfaceC1876190yvJ, C1876180yvI c1876180yvI) {
                    C11ON c11onLIZ;
                    List<InterfaceC1876210yvL> settings = interfaceC1876190yvJ.getSettings();
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(settings, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    for (InterfaceC1876210yvL interfaceC1876210yvL : settings) {
                        Pair pair = new Pair(interfaceC1876210yvL.getKey(), Integer.valueOf(interfaceC1876210yvL.getValue().intValue()));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    InterfaceC742660TBg interfaceC742660TBgLIZIZ = ComplianceServiceProvider.LJIJJ().LIZIZ();
                    if (interfaceC742660TBgLIZIZ != null && (c11onLIZ = interfaceC742660TBgLIZIZ.LIZ(linkedHashMap)) != null) {
                        c11onLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS197S0100000_28(c1876180yvI, 0), new AfS197S0100000_28(c1876180yvI, 1));
                    } else {
                        c1876180yvI.onFail(-3, "Privacy service is not available");
                    }
                }
            }, new InterfaceC1876320yvW() { // from class: X.0yve
                @Override // X.InterfaceC1876320yvW
                public final void LJFF(InterfaceC1876350yvZ interfaceC1876350yvZ, final C1876330yvX c1876330yvX) {
                    String enterFrom = interfaceC1876350yvZ.getEnterFrom();
                    if (enterFrom == null) {
                        enterFrom = "";
                    }
                    List<InterfaceC1876410yvf> params = interfaceC1876350yvZ.getParams();
                    ArrayList arrayList = new ArrayList();
                    Iterator<InterfaceC1876410yvf> it2 = params.iterator();
                    while (true) {
                        AFwS271S0000000_28 aFwS271S0000000_28 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        InterfaceC1876410yvf next = it2.next();
                        C1876770ywF c1876770ywF = EnumC1876780ywG.Companion;
                        int iIntValue = next.getStatus().intValue();
                        c1876770ywF.getClass();
                        EnumC1876780ywG[] enumC1876780ywGArrValues = EnumC1876780ywG.values();
                        int length = enumC1876780ywGArrValues.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                EnumC1876780ywG enumC1876780ywG = enumC1876780ywGArrValues[i];
                                if (enumC1876780ywG.getI() == iIntValue) {
                                    String consentKey = next.getConsentKey();
                                    String flow = next.getFlow();
                                    if (flow == null) {
                                        flow = "";
                                    }
                                    String collectionPointID = next.getCollectionPointID();
                                    if (collectionPointID == null) {
                                        collectionPointID = "";
                                    }
                                    if (Intrinsics.LJFF(next.getForceSync(), Boolean.TRUE)) {
                                        aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(0);
                                    }
                                    arrayList.add(new C1876860ywO(consentKey, enumC1876780ywG, flow, collectionPointID, aFwS271S0000000_28, next.getExtra(), 16));
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    if (arrayList.size() != interfaceC1876350yvZ.getParams().size()) {
                        c1876330yvX.LJIIJ("invalid consent status");
                        return;
                    }
                    if (Intrinsics.LJFF(interfaceC1876350yvZ.getSyncLocalSuccessOnly(), Boolean.TRUE)) {
                        C1915720zx4 c1915720zx4 = C1915720zx4.LIZ;
                        InterfaceC1915880zxK interfaceC1915880zxK = new InterfaceC1915880zxK() { // from class: X.0yvd
                            @Override // X.InterfaceC1915880zxK
                            public final void LIZ(int i2, String str) {
                                InterfaceC1876380yvc interfaceC1876380yvc = c1876330yvX;
                                if (interfaceC1876380yvc != null) {
                                    interfaceC1876380yvc.onSuccess();
                                }
                            }

                            @Override // X.InterfaceC1915880zxK
                            public final void onFailure(int i2, String str) {
                                InterfaceC1876380yvc interfaceC1876380yvc = c1876330yvX;
                                if (interfaceC1876380yvc != null) {
                                    interfaceC1876380yvc.LJIIJ(str);
                                }
                            }
                        };
                        c1915720zx4.getClass();
                        C1915720zx4.LJIIJ(interfaceC1915880zxK, enterFrom, arrayList);
                        return;
                    }
                    C1915720zx4.LIZ.getClass();
                    C1915720zx4.LJIIIIZZ(null, enterFrom, arrayList);
                    c1876330yvX.onSuccess();
                }

                @Override // X.InterfaceC1876320yvW
                public final InterfaceC1876290yvT LJIIJJI(String str, Map<String, String> map) {
                    C1915720zx4.LIZ.getClass();
                    EnumC1876780ywG enumC1876780ywGLIZ = C1915720zx4.LIZ(str, map);
                    InterfaceC1876290yvT interfaceC1876290yvT = (InterfaceC1876290yvT) C1909107dp.LIZJ(InterfaceC1876290yvT.class, null);
                    interfaceC1876290yvT.setConsentStatus(Integer.valueOf(enumC1876780ywGLIZ.getI()));
                    return interfaceC1876290yvT;
                }
            }}).toArray(new InterfaceC1876060yv6[0]);
            C1876250yvP c1876250yvP = C1876250yvP.LIZ;
            InterfaceC1876060yv6[] interfaceC1876060yv6Arr2 = (InterfaceC1876060yv6[]) Arrays.copyOf(interfaceC1876060yv6Arr, interfaceC1876060yv6Arr.length);
            C1556470qbd c1556470qbd = new C1556470qbd(C2097908Jt.LIZJ(new Pair("enableUseFoundation", Boolean.TRUE)));
            c1876250yvP.getClass();
            C1876250yvP.LIZIZ = interfaceC1876060yv6Arr2;
            C1876250yvP.LIZJ = c1556470qbd;
            C1876250yvP.LIZLLL = true;
            LIZ = true;
        }
        return C1697810uHb.LJIIJJI(C1876500yvo.class, C1876560yvu.class, C1876120yvC.class, C1876100yvA.class, C1876260yvQ.class, C1876310yvV.class, C1876420yvg.class, C1876580yvw.class, C1876570yvv.class, C1876070yv7.class, C1876050yv5.class, C1876150yvF.class);
    }
}
