package com.bytedance.android.livesdk.utils;

import X.C01AB;
import X.C01GW;
import X.C0IJT;
import X.C0TI5;
import X.C0TI6;
import X.C0UVM;
import X.C0UVN;
import X.C0UVS;
import X.C1161920gLG;
import X.C13LP;
import X.C13LQ;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C474500IjA;
import X.C786410Ut5;
import X.C823050WQl;
import X.C930940aKi;
import X.EnumC785640Urq;
import Y.ARunnableS8S0310000_12;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAppBundleUtils {
    public static volatile boolean hasAlreadyInstalled;
    public static final LiveAppBundleUtils INSTANCE = new LiveAppBundleUtils();
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static final Keva COVERAGE_KEVA = Keva.getRepo("aab_coverage");
    public static final Keva SO_KEVA = Keva.getRepo("aab_so_load");
    public static final Set<EnumC785640Urq> sLoggedTotalSet = new CopyOnWriteArraySet();
    public static final Set<EnumC785640Urq> sLoggedInstalledSet = new CopyOnWriteArraySet();
    public static final Set<String> sLoggedSOSuccessSet = new CopyOnWriteArraySet();
    public static final Set<String> sLoggedSOFailedSet = new CopyOnWriteArraySet();
    public static final Handler mainHandler = new BPEAHandler(Looper.getMainLooper());
    public static final C01GW soNamesFilter$delegate = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(149));
    public static final C0UVM iCoverageMonitor = new Object() { // from class: X.0UVM
    };
    public static final C0UVN iSOMonitor = new Object() { // from class: X.0UVN
    };

    private final String[] getSoNamesFilter() {
        return (String[]) soNamesFilter$delegate.getValue();
    }

    public static final void initCoreSOLoader() {
        C0TI6 c0ti6 = new C0TI6() { // from class: X.0UVL
            @Override // X.C0TI6
            public final boolean loadLibrary(String str) {
                return LiveAppBundleUtils.loadSOByLoader(str, "livecore-loadLibrary", true);
            }
        };
        Context contextLIZ = C01AB.LIZ();
        C0TI5.LIZ = c0ti6;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loader ");
        sbLIZ.append(c0ti6);
        C2188811AlT.LIZIZ(sbLIZ);
        new WeakReference(contextLIZ);
    }

    private final void splitInstallIfNeed() {
        if (hasAlreadyInstalled) {
            return;
        }
        synchronized (LiveAppBundleUtils.class) {
            try {
                if (!hasAlreadyInstalled && INSTANCE.splitInstall().getFirst().booleanValue()) {
                    hasAlreadyInstalled = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final Pair<Boolean, String> splitInstall() {
        Context contextN3;
        Context contextLIZ = C01AB.LIZ();
        if (contextLIZ == null || (contextN3 = C786410Ut5.N3(contextLIZ)) == null) {
            return new Pair<>(Boolean.FALSE, "appContext is null");
        }
        IHostPlugin iHostPlugin = (IHostPlugin) C1161920gLG.LIZJ(IHostPlugin.class);
        return iHostPlugin == null ? new Pair<>(Boolean.FALSE, "IHostPlugin is null") : iHostPlugin.splitCompatInstall(contextN3);
    }

    public static final void ensurePluginAvailable(EnumC785640Urq enumC785640Urq) {
        ensurePluginAvailable(enumC785640Urq, null, true);
    }

    private final String generateErrorMsg(String str) {
        if (a0.LJJIIZI(str, "PathClassLoader", false)) {
            StringBuilder sb = new StringBuilder("Existing Live's df: ");
            EnumC785640Urq[] enumC785640UrqArrValues = EnumC785640Urq.values();
            ArrayList arrayList = new ArrayList();
            for (EnumC785640Urq enumC785640Urq : enumC785640UrqArrValues) {
                if (a0.LJJIIZI(str, enumC785640Urq.getDfModuleName(), false)) {
                    arrayList.add(enumC785640Urq);
                }
            }
            sb.append(C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63));
            return sb.toString();
        }
        return str;
    }

    public static final File getPluginNativeFolder(EnumC785640Urq enumC785640Urq) {
        return ((IHostPlugin) C1161920gLG.LIZJ(IHostPlugin.class)).getPluginNativeLibrariesFolder(enumC785640Urq.getPackageName());
    }

    private final void logTotalIfNeed(EnumC785640Urq enumC785640Urq) {
        Set<EnumC785640Urq> set = sLoggedTotalSet;
        if (set.contains(enumC785640Urq)) {
            return;
        }
        set.add(enumC785640Urq);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC785640Urq.name());
        sbLIZ.append("total");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str = DATE_FORMAT.format(new Date(System.currentTimeMillis()));
        Keva keva = COVERAGE_KEVA;
        if (!str.equals(keva.getString(strLIZIZ, str)) || !keva.contains(strLIZIZ)) {
            C0UVM c0uvm = iCoverageMonitor;
            JSONObject coverageBaseExtra = getCoverageBaseExtra("coverage_total", enumC785640Urq);
            c0uvm.getClass();
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_coverage_monitor", 0.0d)) {
                C1CC2.LJIIIIZZ("ttlive_client_coverage_monitor", 0, coverageBaseExtra);
            }
            keva.storeString(strLIZIZ, str);
        }
    }

    public final void logInstalledIfNeed(EnumC785640Urq enumC785640Urq) {
        Set<EnumC785640Urq> set = sLoggedInstalledSet;
        if (set.contains(enumC785640Urq)) {
            return;
        }
        set.add(enumC785640Urq);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC785640Urq.name());
        sbLIZ.append("installed");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str = DATE_FORMAT.format(new Date(System.currentTimeMillis()));
        Keva keva = COVERAGE_KEVA;
        if (!str.equals(keva.getString(strLIZIZ, str)) || !keva.contains(strLIZIZ)) {
            C0UVM c0uvm = iCoverageMonitor;
            JSONObject coverageBaseExtra = getCoverageBaseExtra("coverage_installed", enumC785640Urq);
            c0uvm.getClass();
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_coverage_monitor", 0.0d)) {
                C1CC2.LJIIIIZZ("ttlive_client_coverage_monitor", 0, coverageBaseExtra);
            }
            keva.storeString(strLIZIZ, str);
        }
    }

    public static final void ensurePluginAvailable(EnumC785640Urq enumC785640Urq, C0UVS c0uvs) {
        ensurePluginAvailable(enumC785640Urq, c0uvs, true);
    }

    private final JSONObject getCoverageBaseExtra(String str, EnumC785640Urq enumC785640Urq) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str);
            jSONObject.put("plugin_names", enumC785640Urq.getPackageName());
            jSONObject.put("flag", "3");
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    private final boolean isPluginAndDependsInstalled(EnumC785640Urq enumC785640Urq, boolean z) {
        for (String str : enumC785640Urq.getDependPlugins()) {
            IHostPlugin iHostPlugin = (IHostPlugin) C1161920gLG.LIZJ(IHostPlugin.class);
            if (iHostPlugin == null || !iHostPlugin.checkPluginInstalled(str)) {
                return false;
            }
        }
        if (z) {
            IHostPlugin iHostPlugin2 = (IHostPlugin) C1161920gLG.LIZJ(IHostPlugin.class);
            if (iHostPlugin2 == null) {
                return false;
            }
            return iHostPlugin2.checkPluginInstalledV2(enumC785640Urq.getPackageName());
        }
        IHostPlugin iHostPlugin3 = (IHostPlugin) C1161920gLG.LIZJ(IHostPlugin.class);
        if (iHostPlugin3 == null) {
            return false;
        }
        return iHostPlugin3.checkPluginInstalled(enumC785640Urq.getPackageName());
    }

    public static final boolean isPluginAvailable(EnumC785640Urq enumC785640Urq, String str) {
        return INSTANCE.isPluginAvailableInner(enumC785640Urq, str, false);
    }

    public static final boolean isPluginAvailableV2(EnumC785640Urq enumC785640Urq, String str) {
        return INSTANCE.isPluginAvailableInner(enumC785640Urq, str, true);
    }

    private final void logPluginNotAvailable(String str, EnumC785640Urq enumC785640Urq) {
        if (!Intrinsics.LJFF(str, "get_rtc_version") && !Intrinsics.LJFF(str, "get_rtc_device_id")) {
            HashMap map = new HashMap();
            map.put("source", str);
            map.put("aab_name", enumC785640Urq.getDfModuleName());
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                map.put("room_id", room.getIdStr());
                map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
                map.put("live_type", room.getStreamType().logStreamingType);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_aab_not_install");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
        }
    }

    public static final void ensurePluginAvailable(EnumC785640Urq enumC785640Urq, C0UVS c0uvs, boolean z) {
        LiveAppBundleUtils liveAppBundleUtils = INSTANCE;
        liveAppBundleUtils.splitInstallIfNeed();
        liveAppBundleUtils.logTotalIfNeed(enumC785640Urq);
        boolean zIsPluginAvailable = isPluginAvailable(enumC785640Urq, "other");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAvailable: ");
        sbLIZ.append(zIsPluginAvailable);
        sbLIZ.append(' ');
        sbLIZ.append(enumC785640Urq);
        C20441214yg.LJIIIZ("FindCrashLog#LiveAppBundleUtils#ensurePluginAvailable", C2188811AlT.LIZIZ(sbLIZ));
        if (zIsPluginAvailable) {
            liveAppBundleUtils.logInstalledIfNeed(enumC785640Urq);
            if (c0uvs != null) {
                c0uvs.onSuccess();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" onPluginLoadCallback != null ");
            sbLIZ2.append(enumC785640Urq);
            C20441214yg.LJIIIZ("FindCrashLog#LiveAppBundleUtils#ensurePluginAvailable", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        INSTANCE.startInstallPlugin(enumC785640Urq, c0uvs, z);
    }

    private final JSONObject getBaseExtra(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str2);
            jSONObject.put("so_name", str);
            jSONObject.put("flag", "3");
            jSONObject.put("load_from", str3);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    private final boolean isPluginAvailableInner(EnumC785640Urq enumC785640Urq, String str, boolean z) {
        boolean zIsPluginAndDependsInstalled;
        logTotalIfNeed(enumC785640Urq);
        if (enumC785640Urq.isSkipAAB()) {
            zIsPluginAndDependsInstalled = true;
        } else {
            splitInstallIfNeed();
            zIsPluginAndDependsInstalled = isPluginAndDependsInstalled(enumC785640Urq, z);
            if (!zIsPluginAndDependsInstalled) {
                logPluginNotAvailable(str, enumC785640Urq);
                return zIsPluginAndDependsInstalled;
            }
        }
        logInstalledIfNeed(enumC785640Urq);
        return zIsPluginAndDependsInstalled;
    }

    public static final boolean loadSOByLoader(String str, String str2, boolean z) {
        if (str == null) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            if (!z) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
            INSTANCE.monitorLoadSuccessIfNeed(str, SystemClock.uptimeMillis() - jUptimeMillis, str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" Load succeed ");
            sbLIZ.append(str2);
            C20441214yg.LJIIIZ("FindCrashLog#LiveAppBundleUtils#tryLoadAppBundlePlugin", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            INSTANCE.monitorLoadFailedIfNeed(str, SystemClock.uptimeMillis() - jUptimeMillis, th.toString(), str2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" Load Failed ");
            sbLIZ2.append(str2);
            sbLIZ2.append(", ");
            sbLIZ2.append(th);
            C20441214yg.LJ("FindCrashLog#LiveAppBundleUtils#tryLoadAppBundlePlugin", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
    }

    private final void monitorLoadSuccessIfNeed(String str, long j, String str2) {
        if (!C13LQ.LJIILLIIL(str, getSoNamesFilter())) {
            return;
        }
        Set<String> set = sLoggedSOSuccessSet;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("success");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str3 = DATE_FORMAT.format(new Date(System.currentTimeMillis()));
        Keva keva = SO_KEVA;
        if (!str3.equals(keva.getString(strLIZIZ, str3)) || !keva.contains(strLIZIZ)) {
            JSONObject baseExtra = getBaseExtra(str, "so_load_success", str2);
            try {
                baseExtra.put("duration", j);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            iSOMonitor.getClass();
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_so_monitor", 0.01d)) {
                C1CC2.LJIIIIZZ("ttlive_client_so_monitor", 0, baseExtra);
            }
            SO_KEVA.storeString(strLIZIZ, str3);
        }
    }

    private final void startInstallPlugin(EnumC785640Urq enumC785640Urq, C0UVS c0uvs, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("starInstallPlugin ");
        sbLIZ.append(enumC785640Urq);
        sbLIZ.append(" callback ");
        sbLIZ.append(c0uvs);
        C20441214yg.LJIIIZ("LiveAppBundleUtils", C2188811AlT.LIZIZ(sbLIZ));
        IHostPlugin iHostPlugin = (IHostPlugin) C1161920gLG.LIZJ(IHostPlugin.class);
        if (iHostPlugin == null) {
            return;
        }
        C823050WQl.LJFF().submit(new ARunnableS8S0310000_12(iHostPlugin, enumC785640Urq, z, new WeakReference(c0uvs), 0));
    }

    private final void monitorLoadFailedIfNeed(String str, long j, String str2, String str3) {
        if (!C13LQ.LJIILLIIL(str, getSoNamesFilter())) {
            return;
        }
        Set<String> set = sLoggedSOFailedSet;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("failed");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str4 = DATE_FORMAT.format(new Date(System.currentTimeMillis()));
        Keva keva = SO_KEVA;
        if (!str4.equals(keva.getString(strLIZIZ, str4)) || !keva.contains(strLIZIZ)) {
            JSONObject baseExtra = getBaseExtra(str, "so_load_failed", str3);
            try {
                baseExtra.put("duration", j);
                baseExtra.put("error_msg", generateErrorMsg(str2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            iSOMonitor.getClass();
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_so_monitor", 0.01d)) {
                C1CC2.LJIIIIZZ("ttlive_client_so_monitor", 0, baseExtra);
            }
            SO_KEVA.storeString(strLIZIZ, str4);
        }
    }
}
