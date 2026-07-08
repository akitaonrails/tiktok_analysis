package com.ss.android.ttf.tasks.applog;

import X.C08Q0;
import X.C0BVK;
import X.C0CD2;
import X.C0DQQ;
import X.C0XCI;
import X.C0XCJ;
import X.C0XI3;
import X.C0XIO;
import X.C0XIR;
import X.C1492110ovp;
import X.C1494430ozZ;
import X.C1494690ozz;
import X.C1498560p6E;
import X.C1BWL;
import X.C20301014c4;
import X.C20301214c6;
import X.C20302314cH;
import X.C20302414cI;
import X.C2162308dZ;
import X.C2222691Bz1;
import X.C2273401Dyc;
import X.C23112093u;
import X.C256140A2a;
import X.C309570CBn;
import X.C810670Vr7;
import X.C823050WQl;
import X.C830490Whz;
import X.C830520Wi2;
import X.C844470XAv;
import X.C848040XOo;
import X.InterfaceC844780XCa;
import X.InterfaceC844860XCi;
import Y.AObjectS388S0100000_13;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.statisticlogger.experiment.AppLogEventFilterDelayExperiment;
import com.google.gson.s;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginServiceAppDiff;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.settings.DeviceZtiConfigP2;
import com.tiktok.ttf.applog.init.IInitAppLogHook;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class InitAppLogHookImpl implements IInitAppLogHook {
    @Override // com.tiktok.ttf.applog.init.IInitAppLogHook
    public final long LIZJ() {
        C844470XAv.LIZ.getClass();
        return Long.valueOf(C08Q0.LIZJ(C844470XAv.LIZ(), AppLogEventFilterDelayExperiment.KEY, 0L)).longValue();
    }

    @Override // com.tiktok.ttf.applog.init.IInitAppLogHook
    public final boolean LIZLLL() {
        return ((Boolean) C0CD2.LJI.getValue()).booleanValue();
    }

    @Override // com.tiktok.ttf.applog.init.IInitAppLogHook
    public final void LJ() {
        C0XCI c0xci = C0XCJ.LIZIZ;
        c0xci.LJIIIZ = new InterfaceC844780XCa() { // from class: X.0XDR
            @Override // X.InterfaceC844780XCa
            public final List LIZIZ() {
                if (!Intrinsics.LJFF("retry_error_codes", "retry_error_codes")) {
                    return new ArrayList();
                }
                List<Integer> list = C0XDU.LIZ().retryErrorCodes;
                return list == null ? new ArrayList() : list;
            }

            @Override // X.InterfaceC844780XCa
            public final List<String> LIZ(String str) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1794261683) {
                    if (iHashCode != -164441660) {
                        if (iHashCode == 468451986 && str.equals("need_exclude_dtoken_paths")) {
                            List<String> list = C0XDU.LIZ().excludeDtokenPaths;
                            if (list == null) {
                                return new ArrayList();
                            }
                            return list;
                        }
                    } else if (str.equals("need_dtoken_paths_prefix")) {
                        List<String> list2 = C0XDU.LIZ().dtokenPathPrefixs;
                        if (list2 != null) {
                            return list2;
                        }
                        return new ArrayList();
                    }
                } else if (str.equals("need_dtoken_paths")) {
                    List<String> list3 = C0XDU.LIZ().dtokenPath;
                    if (list3 != null) {
                        return list3;
                    }
                    return new ArrayList();
                }
                return new ArrayList();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
            @Override // X.InterfaceC844780XCa
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean LIZJ(java.lang.String r4) {
                /*
                    Method dump skipped, instruction units count: 258
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XDR.LIZJ(java.lang.String):java.lang.Boolean");
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
            @Override // X.InterfaceC844780XCa
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Long getLongValue(java.lang.String r3) {
                /*
                    r2 = this;
                    int r1 = r3.hashCode()
                    r0 = -208662197(0xfffffffff390114b, float:-2.2828415E31)
                    if (r1 == r0) goto L35
                    r0 = 733046661(0x2bb16785, float:1.2605339E-12)
                    if (r1 == r0) goto L22
                    r0 = 852092101(0x32c9e4c5, float:2.3503512E-8)
                    if (r1 != r0) goto L44
                    java.lang.String r0 = "cold_start_time"
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto L44
                    long r0 = X.C202094145s.LJII
                L1d:
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                    return r0
                L22:
                    java.lang.String r0 = "device_inode_list "
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto L44
                    X.01GW r0 = X.C0XDS.LIZIZ
                    java.lang.Object r0 = r0.getValue()
                    com.ss.android.ugc.aweme.settings.DeviceZtiConfigP2 r0 = (com.ss.android.ugc.aweme.settings.DeviceZtiConfigP2) r0
                    long r0 = r0.deviceInodeListValue
                    goto L1d
                L35:
                    java.lang.String r0 = "retry_rest_seconds"
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto L44
                    com.ss.android.ugc.aweme.settings.DeviceZtiConfig r0 = X.C0XDU.LIZ()
                    long r0 = r0.retryRestSeconds
                    goto L1d
                L44:
                    r0 = 0
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0XDR.getLongValue(java.lang.String):java.lang.Long");
            }
        };
        c0xci.LJIIJ = new InterfaceC844860XCi() { // from class: X.0XDY
            @Override // X.InterfaceC844860XCi
            public final void LIZ(String str) {
                if (!((DeviceZtiConfigP2) C0XDS.LIZIZ.getValue()).enableReportALog) {
                    return;
                }
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZ("DeviceZTIError", str);
            }

            @Override // X.InterfaceC844860XCi
            public final void LIZIZ(C0XCT c0xct) {
                C0S78.LIZJ(new AwS557S0100000_13(c0xct, 129), ((Boolean) C0B6G.LIZ.getValue()).booleanValue());
            }

            @Override // X.InterfaceC844860XCi
            public final void LIZJ(C0XCV c0xcv) {
                C0CM3 c0cm3 = new C0CM3();
                c0cm3.LIZIZ = true;
                c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
                c0cm3.LJI = new C845040XDa(c0xcv);
                C312240CLu.LIZ(c0cm3);
            }

            @Override // X.InterfaceC844860XCi
            public final void LIZLLL(C844960XCs c844960XCs) {
                C0S78.LIZJ(new AwS557S0100000_13(c844960XCs, 130), true);
            }

            @Override // X.InterfaceC844860XCi
            public final void LJ(AObjectS388S0100000_13 aObjectS388S0100000_13) {
                C0S78.LIZJ(new C0XDZ(aObjectS388S0100000_13), true);
            }
        };
    }

    @Override // com.tiktok.ttf.applog.init.IInitAppLogHook
    public final void LIZ() {
        String uid;
        User curUser;
        Application applicationLIZ = C1BWL.LIZ();
        boolean switchToBdtracker = AppLog.getSwitchToBdtracker();
        int i = C810670Vr7.LIZJ(applicationLIZ, 0, "sp_dark_mode").getInt("dark_mode", 1);
        Bundle bundle = new Bundle();
        bundle.putInt("dark_mode_setting_value", i);
        AppLog.setCustomerHeader(bundle);
        if (switchToBdtracker) {
            com.bytedance.applog.AppLog.setHeaderInfo("priority_region", C2222691Bz1.LIZ());
            ILoginServiceAppDiff iLoginServiceAppDiff = (ILoginServiceAppDiff) PluggableExtentionKt.pluggableSpi$default(ILoginServiceAppDiff.class, false, false, false, 14, null);
            if (iLoginServiceAppDiff != null) {
                iLoginServiceAppDiff.setM2HeaderInfo();
            }
        }
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0WcR
            /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static void LIZ() {
                /*
                    Method dump skipped, instruction units count: 219
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC827050WcR.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InitAppLogHookImpl@7091.configHeader$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InitAppLogHookImpl@7091.configHeader$1");
            }
        });
        C1492110ovp.LIZIZ(null, AFwS219S0000000_30.get$arr$(241), ((Boolean) C309570CBn.LIZ.getValue()).booleanValue());
        C1492110ovp.LIZIZ("coldbootBatchOpt", AFwS219S0000000_30.get$arr$(243), ((Boolean) C256140A2a.LIZIZ.getValue()).booleanValue());
        if (C2162308dZ.LJI(C1BWL.LIZ())) {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("enable_new_app_log_isolation", false)) {
                if (C20302314cH.LIZIZ) {
                    C2273401Dyc.LIZ.getClass();
                    Iterator it2 = ((C830490Whz.a) C2273401Dyc.LJI.entrySet()).iterator();
                    while (true) {
                        C830520Wi2 c830520Wi2 = (C830520Wi2) it2;
                        if (!c830520Wi2.hasNext()) {
                            break;
                        }
                        c830520Wi2.next();
                        Object key = c830520Wi2.getKey();
                        Object value = c830520Wi2.getValue();
                        if (Intrinsics.LJFF(value, "us") && C20302314cH.LIZJ.contains("us")) {
                            C20302314cH.LJ.put((String) key, (String) value);
                        }
                        if (Intrinsics.LJFF(value, "eu") && C20302314cH.LIZJ.contains("eu")) {
                            C20302314cH.LJ.put((String) key, (String) value);
                        }
                    }
                    ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(C20302314cH.LJIIZILJ);
                    C20302314cH.LIZ.getClass();
                    Iterator<T> it3 = C20302314cH.LJI.getAll().entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        C20302314cH.LJFF.put((String) entry.getKey(), String.valueOf(entry.getValue()));
                        C2273401Dyc.LJFF.put((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    C20302314cH.LIZ.getClass();
                    User userLIZ = C20302314cH.LIZ();
                    if (userLIZ == null || (uid = userLIZ.getUid()) == null) {
                        uid = CardStruct.IStatusCode.DEFAULT;
                    }
                    C20302314cH.LJIIJJI = uid;
                    C20301214c6 c20301214c6 = C20301014c4.LIZ;
                    C20301014c4.LIZ(C20302314cH.LJIILLIIL);
                    AppLog.setUserIdIsolateEnabled(true);
                    AppLog.setUserIdIsolateCallback(C20302314cH.LJIILL);
                    return;
                }
                return;
            }
            if (C20302414cI.LLILLJJLI) {
                C2273401Dyc.LIZ.getClass();
                Iterator it4 = ((C830490Whz.a) C2273401Dyc.LJI.entrySet()).iterator();
                while (true) {
                    C830520Wi2 c830520Wi22 = (C830520Wi2) it4;
                    if (!c830520Wi22.hasNext()) {
                        break;
                    }
                    c830520Wi22.next();
                    Object key2 = c830520Wi22.getKey();
                    Object value2 = c830520Wi22.getValue();
                    if (Intrinsics.LJFF(value2, "us") && C20302414cI.LLILLL.contains("us")) {
                        C20302414cI.LLILZ.put((String) key2, (String) value2);
                    }
                    if (Intrinsics.LJFF(value2, "eu") && C20302414cI.LLILLL.contains("eu")) {
                        C20302414cI.LLILZ.put((String) key2, (String) value2);
                    }
                }
                ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(C20302414cI.LLJIJIL);
                C848040XOo c848040XOo = C848040XOo.LIZ;
                C20302414cI c20302414cI = C20302414cI.LL;
                c848040XOo.getClass();
                C848040XOo.LIZ(c20302414cI);
                c20302414cI.getClass();
                Iterator<T> it5 = C20302414cI.LLILZLL.getAll().entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it5.next();
                    C20302414cI.LLILZIL.put((String) entry2.getKey(), String.valueOf(entry2.getValue()));
                    C2273401Dyc.LJFF.put((String) entry2.getKey(), String.valueOf(entry2.getValue()));
                }
                C20302414cI.LL.getClass();
                AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
                if (accountUserServiceLJIIJ.isLogin() && (curUser = accountUserServiceLJIIJ.getCurUser()) != null) {
                    curUser.getUid();
                }
                C20301214c6 c20301214c62 = C20301014c4.LIZ;
                C20301014c4.LIZ(C20302414cI.LLJI);
                AppLog.setUserIdIsolateEnabled(true);
                AppLog.setUserIdIsolateCallback(C20302414cI.LLJ);
            }
        }
    }

    @Override // com.tiktok.ttf.applog.init.IInitAppLogHook
    public final int LIZIZ(Exception exc) {
        int statusCode;
        int iLIZJ;
        C1494690ozz c1494690ozz;
        if (exc instanceof C0XIR) {
            iLIZJ = ((C23112093u) exc).getErrorCode() + 90000000;
            statusCode = (!(exc instanceof C1494690ozz) || (c1494690ozz = (C1494690ozz) exc) == null) ? -106 : c1494690ozz.getStatusCode();
        } else {
            statusCode = 0;
            if (!(exc instanceof C0XIO) && !(exc.getCause() instanceof C0XIO) && !(exc instanceof s) && !(exc.getCause() instanceof s)) {
                if (exc instanceof IllegalArgumentException) {
                    iLIZJ = 70000000;
                } else if (exc instanceof C1494690ozz) {
                    C1494690ozz c1494690ozz2 = (C1494690ozz) exc;
                    statusCode = c1494690ozz2.getStatusCode();
                    C0DQQ c0dqq = new C0DQQ(exc, null);
                    if ((((Number) C0BVK.LIZ.getValue()).intValue() & 2) != 0 && c0dqq.LIZ) {
                        iLIZJ = c0dqq.LIZIZ + 61000000;
                    } else if (statusCode > 0) {
                        iLIZJ = 60000000 + statusCode;
                    } else {
                        int cronetInternalErrorCode = c1494690ozz2.getCronetInternalErrorCode();
                        if (cronetInternalErrorCode < 0) {
                            cronetInternalErrorCode = -cronetInternalErrorCode;
                        }
                        iLIZJ = cronetInternalErrorCode + 50000000;
                    }
                } else {
                    if (exc instanceof C0XI3) {
                        return ((C0XI3) exc).getStatusCode();
                    }
                    if (exc instanceof C1494430ozZ) {
                        statusCode = ((C1494430ozZ) exc).getStatusCode();
                        if (statusCode > 0) {
                            iLIZJ = 60000000 + statusCode;
                        }
                        return statusCode;
                    }
                    if (exc instanceof IOException) {
                        iLIZJ = C1498560p6E.LIZJ(exc) + 10000000;
                    } else {
                        return 10000000;
                    }
                }
            } else {
                iLIZJ = 80000000;
            }
        }
        if (iLIZJ != 0) {
            return iLIZJ;
        }
        return statusCode;
    }
}
