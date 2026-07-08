package com.ss.android.ugc.aweme.sec;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.AnonymousClass1490;
import X.AnonymousClass1499;
import X.C01GW;
import X.C08HM;
import X.C08X7;
import X.C08X8;
import X.C0CN5;
import X.C0CNS;
import X.C0XCJ;
import X.C0XQ7;
import X.C10EU;
import X.C149A;
import X.C149B;
import X.C149E;
import X.C149M;
import X.C14B0;
import X.C1602200rnO;
import X.C1906580ziK;
import X.C1BCA;
import X.C202178148y;
import X.C20221514Aj;
import X.C20222414As;
import X.C20222814Aw;
import X.C20222914Ax;
import X.C20223014Ay;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C285090BFj;
import X.C452501pT;
import X.C786410Ut5;
import X.C807400Vlq;
import X.EnumC1494380ozU;
import X.EnumC1915930zxP;
import X.EnumC20222314Ar;
import X.EnumC312610CNf;
import X.InterfaceC1006670cIr;
import X.InterfaceC304970BxP;
import Y.ARunnableS0S3211000_30;
import Y.ARunnableS79S0200000_10;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sec.DmtSec;
import com.ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import defpackage.f3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ms.bd.o.c0;
import ms.bd.o.h2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class DmtSec {
    public static SecCaptcha captcha;
    public static long initBegin;
    public static boolean initSuccess;
    public static Keva keva;
    public static C20222814Aw msManager;
    public static boolean needDelayUpdateIds;
    public static C14B0 report;
    public static final DmtSec INSTANCE = new DmtSec();
    public static ArrayList<String> reportArray = new ArrayList<>();
    public static String delayTargetDid = "-1";
    public static String delayTargetIid = "-1";
    public static EnumC20222314Ar curMode = EnumC20222314Ar.COLLECT_MODE_INIT;
    public static ScheduledExecutorService executor = C807400Vlq.LJ();
    public static final C01GW deviceConsentService$delegate = C452501pT.LIZIZ(new C20222914Ax());
    public static final AtomicBoolean useFallbackSetDid = new AtomicBoolean(true);
    public static final AtomicBoolean useInitReport = new AtomicBoolean(false);
    public static final AtomicBoolean useInitColdStartReport = new AtomicBoolean(true);
    public static final AtomicLong delayColdStartSec = new AtomicLong(10);
    public static boolean isFirstDelayInit = true;

    public final String onEvent() {
        return "";
    }

    public static final void dismissCaptcha() {
        if (initSuccess) {
            SecCaptcha secCaptcha = captcha;
            if (secCaptcha == null) {
                secCaptcha = null;
            }
            C202178148y c202178148y = secCaptcha.LLILZIL;
            if (c202178148y == null || !c202178148y.LIZIZ) {
                return;
            }
            c202178148y.LIZJ.dismissVerifyDialog();
        }
    }

    public static final void finishInitAndProcessPending() {
        if (needDelayUpdateIds) {
            String str = delayTargetDid;
            String str2 = delayTargetIid;
            needDelayUpdateIds = false;
            updateDeviceIdAndInstallId(str, str2);
        }
        synchronized (INSTANCE) {
            try {
                ArrayList<String> arrayList = reportArray;
                if (!arrayList.isEmpty()) {
                    Iterator<String> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        report(it2.next());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private final void registerCrashCounter() {
        Npth.registerCrashCallback(new ICrashCallback() { // from class: X.14Av
            @Override // com.bytedance.crash.ICrashCallback
            public final void onCrash(CrashType crashType, String str, Thread thread) {
                int iIncreaseCrashTimes = DmtSec.INSTANCE.increaseCrashTimes(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NPTH crash = ");
                sbLIZ.append(crashType);
                sbLIZ.append(", count = ");
                sbLIZ.append(iIncreaseCrashTimes);
                sbLIZ.append(", string ");
                sbLIZ.append(str);
                sbLIZ.append(", thread ");
                sbLIZ.append(thread);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }, CrashType.NATIVE);
    }

    public final IPNSDeviceConsentService getDeviceConsentService() {
        return (IPNSDeviceConsentService) deviceConsentService$delegate.getValue();
    }

    private final boolean isUsEeaRegion() {
        EnumC1915930zxP enumC1915930zxPLJIIL = ComplianceServiceProvider.LJIILJJIL().LJIIL();
        return enumC1915930zxPLJIIL == EnumC1915930zxP.US || enumC1915930zxPLJIIL == EnumC1915930zxP.EU;
    }

    public final void setParams() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() != null ? AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() : "";
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId() != null ? AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId() : "";
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setParams:did = ");
        sbLIZ.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
        sbLIZ.append("  iid = ");
        sbLIZ.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId);
        C2344809Gs.LIZLLL(4, "Sec", C2188811AlT.LIZIZ(sbLIZ));
        fallbackSetDid(msManager, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
        C20222814Aw c20222814Aw = msManager;
        if (c20222814Aw != null) {
            c20222814Aw.setInstallID(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init setParamsTime = ");
        sbLIZ2.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final String updateSettings() {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("ms_settings_android", "5d3a57922d5da57e49f3625d79d0d4669632612f6582c496d8487843468bbb85fcbe5f71fde92348b08d9efdd9971c3040dcbab55c2b2843");
        Keva keva2 = keva;
        boolean z = keva2 != null ? keva2.getBoolean("safe_mode", false) : false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSettings, isSafeMode: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            String strLIZJ = C08HM.LIZJ(strLJI);
            Keva keva3 = keva;
            String string = keva3 != null ? keva3.getString("settings_hash", "") : null;
            if (Intrinsics.LJFF(strLIZJ, string)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("set settings to empty, md5_1 : ");
                sbLIZ2.append(strLIZJ);
                C2188811AlT.LIZIZ(sbLIZ2);
                strLJI = "";
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("new settings, remove safe mode. md5_1: ");
                sbLIZ3.append(strLIZJ);
                sbLIZ3.append(", md5_2: ");
                sbLIZ3.append(string);
                C2188811AlT.LIZIZ(sbLIZ3);
                Keva keva4 = keva;
                if (keva4 != null) {
                    keva4.storeBoolean("safe_mode", false);
                }
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("settings = ");
        sbLIZ4.append(strLJI);
        C2188811AlT.LIZIZ(sbLIZ4);
        return strLJI;
    }

    public final C20222814Aw getMsManager() {
        return msManager;
    }

    private final void innerUpdateCollectMode(EnumC20222314Ar enumC20222314Ar) {
        String strName;
        synchronized (this) {
            if (enumC20222314Ar != null) {
                try {
                    curMode = enumC20222314Ar;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("innerUpdateCollectMode, mode = ");
        if (enumC20222314Ar != null) {
            strName = enumC20222314Ar.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        C2188811AlT.LIZIZ(sbLIZ);
        if (enumC20222314Ar != null) {
            int i = C20222414As.LIZ[enumC20222314Ar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (isUsEeaRegion()) {
                                C20222814Aw c20222814Aw = msManager;
                                if (c20222814Aw != null) {
                                    c20222814Aw.LIZ(503);
                                    return;
                                }
                                return;
                            }
                            C20222814Aw c20222814Aw2 = msManager;
                            if (c20222814Aw2 == null) {
                                return;
                            }
                            c20222814Aw2.LIZ(603);
                            return;
                        }
                        return;
                    }
                    C20222814Aw c20222814Aw3 = msManager;
                    if (c20222814Aw3 == null) {
                        return;
                    }
                    c20222814Aw3.LIZ(504);
                    return;
                }
                C20222814Aw c20222814Aw4 = msManager;
                if (c20222814Aw4 == null) {
                    return;
                }
                c20222814Aw4.LIZ(10);
                return;
            }
            C20222814Aw c20222814Aw5 = msManager;
            if (c20222814Aw5 == null) {
                return;
            }
            c20222814Aw5.LIZ(5);
        }
    }

    public static final boolean isCaptchaUrl(String str) {
        if (!initSuccess) {
            return false;
        }
        SecCaptcha secCaptcha = captcha;
        if (secCaptcha == null) {
            secCaptcha = null;
        }
        secCaptcha.getClass();
        if (str.length() == 0) {
            return false;
        }
        if (!a0.LJJIIZI(str, "/passport/", false) && !a0.LJJIIZI(str, "/login/", false)) {
            return false;
        }
        return true;
    }

    public static final boolean needVerifyImage(int i) {
        if (!initSuccess) {
            return false;
        }
        SecCaptcha secCaptcha = captcha;
        if (secCaptcha == null) {
            secCaptcha = null;
        }
        secCaptcha.getClass();
        if (i != 3058 && i != 3059 && i != 1104 && i != 1105) {
            return false;
        }
        return true;
    }

    private final void registerSettingUpdateCb(final C20222814Aw c20222814Aw) {
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.14An
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                if (c20222814Aw != null) {
                    DmtSec dmtSec = DmtSec.INSTANCE;
                    c20222814Aw.LIZJ(dmtSec.updateSettings());
                    f3.LIZ.getClass();
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    n nVar = f3.LIZIZ;
                    n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("ms_dmt_config_js", n.class, nVar);
                    if (nVar2 != null) {
                        nVar = nVar2;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dmtsec_js update setting [");
                    sbLIZ.append(nVar);
                    sbLIZ.append(']');
                    C2188811AlT.LIZIZ(sbLIZ);
                    dmtSec.updateFeatureFlags(nVar);
                }
            }
        });
    }

    public static final synchronized void report(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report .... scene = ");
        sbLIZ.append(str);
        sbLIZ.append(", initSuccess = ");
        sbLIZ.append(initSuccess);
        C2188811AlT.LIZIZ(sbLIZ);
        if (initSuccess) {
            C14B0 c14b0 = null;
            if (curMode == EnumC20222314Ar.COLLECT_MODE_INIT) {
                INSTANCE.updateCollectMode(null);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C14B0 c14b02 = report;
            if (c14b02 != null) {
                c14b0 = c14b02;
            }
            c14b0.getClass();
            C20222814Aw c20222814Aw = c14b0.LIZ;
            if (c20222814Aw != null) {
                c20222814Aw.report(str);
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("report time = ");
            sbLIZ2.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            reportArray.add(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int increaseCrashTimes(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sec.DmtSec.increaseCrashTimes(java.lang.String):int");
    }

    public final void setMsManager(C20222814Aw c20222814Aw) {
        msManager = c20222814Aw;
    }

    public final void updateCollectMode(EnumC20222314Ar enumC20222314Ar) {
        EnumC20222314Ar enumC20222314Ar2;
        int i = 2;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            boolean zLJIILIIL = C10EU.LJIILIIL();
            Keva keva2 = keva;
            if (keva2 != null) {
                if (zLJIILIIL) {
                    i = 1;
                }
                keva2.storeInt("last_logged_in_user_mode", i);
            }
            if (zLJIILIIL) {
                enumC20222314Ar2 = EnumC20222314Ar.COLLECT_MODE_KIDS;
            } else {
                enumC20222314Ar2 = EnumC20222314Ar.COLLECT_MODE_ALL;
            }
            innerUpdateCollectMode(enumC20222314Ar2);
            return;
        }
        Integer numValueOf = null;
        if (((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
            innerUpdateCollectMode(EnumC20222314Ar.COLLECT_MODE_ALL);
            return;
        }
        if (((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode()) {
            innerUpdateCollectMode(EnumC20222314Ar.COLLECT_MODE_EEA_GUEST);
            return;
        }
        Keva keva3 = keva;
        if (keva3 != null) {
            numValueOf = Integer.valueOf(keva3.getInt("last_logged_in_user_mode", 0));
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1) {
                innerUpdateCollectMode(EnumC20222314Ar.COLLECT_MODE_KIDS);
                return;
            } else if (numValueOf.intValue() == 2) {
                innerUpdateCollectMode(EnumC20222314Ar.COLLECT_MODE_ALL);
                return;
            }
        }
        innerUpdateCollectMode(EnumC20222314Ar.COLLECT_MODE_INIT);
    }

    public final void updateFeatureFlags(n nVar) {
        k kVarLJJIIZ = nVar.LJJIIZ("fallback_did");
        if (kVarLJJIIZ != null) {
            useFallbackSetDid.set(kVarLJJIIZ.LJ());
        }
        k kVarLJJIIZ2 = nVar.LJJIIZ("init_report");
        if (kVarLJJIIZ2 != null) {
            useInitReport.set(kVarLJJIIZ2.LJ());
        }
        k kVarLJJIIZ3 = nVar.LJJIIZ("init_cold_start_report");
        if (kVarLJJIIZ3 != null) {
            useInitColdStartReport.set(kVarLJJIIZ3.LJ());
        }
        k kVarLJJIIZ4 = nVar.LJJIIZ("delay_cold_start_sec");
        if (kVarLJJIIZ4 != null) {
            delayColdStartSec.set(kVarLJJIIZ4.LJIIZILJ());
        }
    }

    public static final void updateDeviceIdAndInstallId(String str, String str2) {
        if (initSuccess) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            INSTANCE.fallbackSetDid(msManager, str);
            C20222814Aw c20222814Aw = msManager;
            if (c20222814Aw != null) {
                c20222814Aw.setInstallID(str2);
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateDeviceIdAndInstallId setParamsTime = ");
            sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
            sbLIZ.append(", deviceId = ");
            sbLIZ.append(str);
            sbLIZ.append(", iid = ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            SecCaptcha secCaptcha = captcha;
            if (secCaptcha == null) {
                secCaptcha = null;
            }
            secCaptcha.LIZIZ(str, str2);
            return;
        }
        delayTargetIid = str2;
        delayTargetDid = str;
        needDelayUpdateIds = true;
    }

    public final void fallbackSetDid(C20222814Aw c20222814Aw, String str) {
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
        if (useFallbackSetDid.get()) {
            if ((str.equals("") || str.equals(CardStruct.IStatusCode.DEFAULT)) && (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId()) != null) {
                str = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
            }
            if (str.equals("") || str.equals(CardStruct.IStatusCode.DEFAULT)) {
                JSONObject jSONObject = new JSONObject();
                if (C0XCJ.LIZIZ.LJFF(jSONObject) && jSONObject.has("device_id")) {
                    try {
                        String string = JSONObjectProtectorUtils.getString(jSONObject, "device_id");
                        if (!string.equals(CardStruct.IStatusCode.DEFAULT)) {
                            if (!string.equals("")) {
                                str = string;
                            }
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            if (c20222814Aw != null) {
                c20222814Aw.setDeviceID(str);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("old dpd ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c20222814Aw != null) {
            c20222814Aw.setDeviceID(str);
        }
    }

    public final Map<String, String> frameSign(String str, int i) {
        Map<String, String> mapFrameSign;
        C20222814Aw c20222814Aw = msManager;
        if (c20222814Aw == null || (mapFrameSign = c20222814Aw.frameSign(str, i)) == null) {
            return C2097608Jq.LJ();
        }
        return mapFrameSign;
    }

    public final void updateDeviceInfo(String str, String str2) {
        if (str != null) {
            fallbackSetDid(msManager, str);
        }
        C20222814Aw c20222814Aw = msManager;
        if (c20222814Aw != null) {
            c20222814Aw.setInstallID(str2);
        }
    }

    public static final void popCaptcha(int i, Activity activity, C149A c149a) {
        if (initSuccess) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SecCaptcha secCaptcha = captcha;
            if (secCaptcha == null) {
                secCaptcha = null;
            }
            if (TextUtils.isEmpty(secCaptcha.LLILLJJLI.LIZLLL) && AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId() != null) {
                secCaptcha.LLILLJJLI.LIZLLL = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
                AnonymousClass1499 anonymousClass1499 = secCaptcha.LLILLJJLI;
                secCaptcha.LIZIZ(anonymousClass1499.LJ, anonymousClass1499.LIZLLL);
            }
            if (TextUtils.isEmpty(secCaptcha.LLILLJJLI.LJ) && AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() != null) {
                secCaptcha.LLILLJJLI.LJ = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                AnonymousClass1499 anonymousClass14992 = secCaptcha.LLILLJJLI;
                secCaptcha.LIZIZ(anonymousClass14992.LJ, anonymousClass14992.LIZLLL);
            }
            if (activity.isFinishing()) {
                C2344809Gs.LIZLLL(4, "Sec", "popCaptcha-activity-finishing");
            } else {
                secCaptcha.LLILZLL = new WeakReference<>(activity);
                secCaptcha.LLIZ = c149a;
                activity.runOnUiThread(new ARunnableS79S0200000_10(C1906580ziK.LIZIZ(), secCaptcha, 64));
                secCaptcha.LIZ().LJIJJ = i;
                String str = secCaptcha.LLJ;
                String userId = secCaptcha.LLILLL.getUserId();
                String str2 = "";
                if (userId == null) {
                    userId = "";
                }
                if (!Intrinsics.LJFF(str, userId)) {
                    String userId2 = secCaptcha.LLILLL.getUserId();
                    if (userId2 == null) {
                        userId2 = "";
                    }
                    secCaptcha.LLJ = userId2;
                    String sessionId = secCaptcha.LLILLL.getSessionId();
                    if (sessionId != null) {
                        str2 = sessionId;
                    }
                    secCaptcha.LLIZLLLIL = str2;
                }
                secCaptcha.LIZ().LJIIIIZZ = secCaptcha.LLILLJJLI.LJ;
                secCaptcha.LIZ().LJI = secCaptcha.LLILLJJLI.LIZLLL;
                secCaptcha.LIZ().LJIJJLI = secCaptcha.LLIZLLLIL;
                String language = secCaptcha.LLILLL.getLanguage();
                if (language != null) {
                    secCaptcha.LIZ().LIZJ = language;
                }
                C202178148y c202178148y = secCaptcha.LLILZIL;
                if (c202178148y != null) {
                    C20221514Aj.LIZ = 1;
                    if (c202178148y.LIZJ(activity, secCaptcha)) {
                        C202178148y.LJFF = EnumC1494380ozU.POPCAPTCHA;
                        C149M c149m = new C149M(c202178148y.LIZ.LJIJJ);
                        c149m.setMaskCancel(c202178148y.LIZ.LJIILL);
                        c202178148y.LJFF(activity, c149m, secCaptcha);
                    }
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("popCaptcha time = ");
            sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void popCaptchaV2(String str, Activity activity, C149A c149a, Fragment fragment) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        String strLJIILJJIL;
        LifecycleOwner lifecycleOwnerLJFF = fragment;
        if (initSuccess) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SecCaptcha secCaptcha = captcha;
            if (secCaptcha == null) {
                secCaptcha = null;
            }
            if (TextUtils.isEmpty(secCaptcha.LLILLJJLI.LIZLLL) && AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId() != null) {
                secCaptcha.LLILLJJLI.LIZLLL = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
                AnonymousClass1499 anonymousClass1499 = secCaptcha.LLILLJJLI;
                secCaptcha.LIZIZ(anonymousClass1499.LJ, anonymousClass1499.LIZLLL);
            }
            if (TextUtils.isEmpty(secCaptcha.LLILLJJLI.LJ) && AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() != null) {
                secCaptcha.LLILLJJLI.LJ = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                AnonymousClass1499 anonymousClass14992 = secCaptcha.LLILLJJLI;
                secCaptcha.LIZIZ(anonymousClass14992.LJ, anonymousClass14992.LIZLLL);
            }
            if (activity.isFinishing()) {
                C2344809Gs.LIZLLL(4, "Sec", "popCaptchaV2-activity-finishing");
            } else {
                secCaptcha.LLILZLL = new WeakReference<>(activity);
                secCaptcha.LLIZ = c149a;
                if (lifecycleOwnerLJFF == null) {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null) {
                        lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF();
                    } else {
                        lifecycleOwnerLJFF = null;
                    }
                }
                activity.runOnUiThread(new ARunnableS79S0200000_10(lifecycleOwnerLJFF, secCaptcha, 65));
                String str2 = secCaptcha.LLJ;
                String userId = secCaptcha.LLILLL.getUserId();
                String str3 = "";
                if (userId == null) {
                    userId = "";
                }
                if (!Intrinsics.LJFF(str2, userId)) {
                    String userId2 = secCaptcha.LLILLL.getUserId();
                    if (userId2 == null) {
                        userId2 = "";
                    }
                    secCaptcha.LLJ = userId2;
                    String sessionId = secCaptcha.LLILLL.getSessionId();
                    if (sessionId == null) {
                        sessionId = "";
                    }
                    secCaptcha.LLIZLLLIL = sessionId;
                }
                secCaptcha.LIZ().LJIIIIZZ = secCaptcha.LLILLJJLI.LJ;
                secCaptcha.LIZ().LJI = secCaptcha.LLILLJJLI.LIZLLL;
                secCaptcha.LIZ().LJIJJLI = secCaptcha.LLIZLLLIL;
                AnonymousClass1490 anonymousClass1490LIZ = secCaptcha.LIZ();
                I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null && (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(secCaptcha.LL)) != null) {
                    str3 = strLJIILJJIL;
                }
                anonymousClass1490LIZ.LJIILIIL = str3;
                String language = secCaptcha.LLILLL.getLanguage();
                if (language != null) {
                    secCaptcha.LIZ().LIZJ = language;
                }
                C202178148y c202178148y = secCaptcha.LLILZIL;
                if (c202178148y != null) {
                    C20221514Aj.LIZ = 1;
                    c202178148y.LJ(activity, new C149E(str), secCaptcha);
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("popCaptchaV2 time = ");
            sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    private final void doInit(C149B c149b, boolean z, String str, int i, String str2, String str3, Context context) {
        executor.schedule(new ARunnableS0S3211000_30(context, str, i, str2, str3, z, c149b, 0), 3000L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.08X7, ms.bd.o.c0] */
    public static final void init(Context context, String str, int i, String str2, String str3, boolean z, C149B c149b) {
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init language = ");
        sbLIZ.append(str);
        sbLIZ.append(", aid = ");
        sbLIZ.append(i);
        sbLIZ.append(", appName = ");
        sbLIZ.append(str2);
        sbLIZ.append(", channel= ");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        int iIntValue = 0;
        keva = KevaImpl.getRepo("mssdk", 0);
        initBegin = System.currentTimeMillis();
        DmtSec dmtSec = INSTANCE;
        dmtSec.registerCrashCounter();
        String strUpdateSettings = dmtSec.updateSettings();
        f3.LIZ.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        n nVar = f3.LIZIZ;
        n nVar2 = (n) settingsManagerLIZLLL.LJIIIIZZ("ms_dmt_config_js", n.class, nVar);
        if (nVar2 != null) {
            nVar = nVar2;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dmtsec_js setting [");
        sbLIZ2.append(nVar);
        sbLIZ2.append(']');
        C2188811AlT.LIZIZ(sbLIZ2);
        dmtSec.updateFeatureFlags(nVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        GlobalContext.setContext(context);
        final String strValueOf = String.valueOf(i);
        ?? r7 = new c0.a<C08X7>(strValueOf) { // from class: X.08X7
        };
        r7.LJIIIZ = 0;
        r7.LIZIZ = str3;
        ((HashMap) r7.LJIILIIL).put("ms_settings_android", strUpdateSettings);
        boolean z3 = true;
        r7.LJIIJ = 1;
        if (r7.LJIIJJI != 99999) {
            if (r7.LJIIIZ != -1) {
                C08X8 c08x8 = new C08X8(r7);
                synchronized (C20223014Ay.class) {
                    h2.LIZJ(context, c08x8.LJIILJJIL);
                }
                C20222814Aw c20222814AwLIZ = C20223014Ay.LIZ(String.valueOf(i));
                msManager = c20222814AwLIZ;
                dmtSec.registerSettingUpdateCb(c20222814AwLIZ);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("init getSdkTime = ");
                sbLIZ3.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ3);
                report = new C14B0(msManager);
                int i2 = Keva.getRepo("plugin_repo").getInt("reinstall_check_result", -1);
                if (C0CNS.LIZ() && i2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!C0CNS.LIZ() || i2 != -1) {
                    z3 = false;
                }
                if (!((Boolean) C285090BFj.LJJJJZI.getValue()).booleanValue() && !z2) {
                    if (z3) {
                        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                        ARunnableS0S3211000_30 aRunnableS0S3211000_30 = new ARunnableS0S3211000_30(context, str, i, str2, str3, z, c149b, 1);
                        if (C0CNS.LIZ()) {
                            iIntValue = ((Number) C0CNS.LIZ.getValue()).intValue();
                        }
                        C786410Ut5.LJLIIL(iIntValue, bPEAHandler, aRunnableS0S3211000_30);
                    } else {
                        dmtSec.doInit(c149b, z, str, i, str2, str3, context);
                    }
                } else {
                    dmtSec.tryDelayInitUntilFirstFeed(c149b, z, str, i, str2, str3, context);
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("init Time = ");
                sbLIZ4.append(jCurrentTimeMillis3 - initBegin);
                C2188811AlT.LIZIZ(sbLIZ4);
                return;
            }
            throw new IllegalArgumentException("MSConfig init error");
        }
        throw new IllegalArgumentException("MSConfig init error!");
    }

    public final void doDelayInit(C149B c149b, boolean z, String str, int i, String str2, String str3, Context context) {
        if (isFirstDelayInit) {
            isFirstDelayInit = false;
            doInit(c149b, z, str, i, str2, str3, context);
        }
    }

    public final void tryDelayInitUntilFirstFeed(final C149B c149b, final boolean z, final String str, final int i, final String str2, final String str3, final Context context) {
        if (C0CN5.LJII()) {
            doInit(c149b, z, str, i, str2, str3, context);
        } else {
            C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.14Aq
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                    if (c1602200rnO2.LIZJ()) {
                        DmtSec.INSTANCE.doDelayInit(c149b, z, str, i, str2, str3, context);
                        C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                    }
                }
            });
            C786410Ut5.LJLIIL(2500L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.14At
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DmtSec@b504.tryDelayInitUntilFirstFeed$2");
                    try {
                        DmtSec.INSTANCE.doDelayInit(c149b, z, str, i, str2, str3, context);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DmtSec@b504.tryDelayInitUntilFirstFeed$2");
                }
            });
        }
    }
}
