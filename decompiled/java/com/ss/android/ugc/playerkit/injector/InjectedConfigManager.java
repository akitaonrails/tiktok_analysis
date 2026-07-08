package com.ss.android.ugc.playerkit.injector;

import X.C1481110oe5;
import X.C2188811AlT;
import X.InterfaceC1847007Lg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public class InjectedConfigManager {
    public static final Map<String, String> sConfigInterfaceImplementationMap;
    public static final Map<String, Object> sConfigMap;
    public static final Set<String> sReportedImplementationErrors;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        sConfigInterfaceImplementationMap = concurrentHashMap;
        sConfigMap = new ConcurrentHashMap();
        sReportedImplementationErrors = new CopyOnWriteArraySet();
        concurrentHashMap.put("com.ss.android.ugc.playerkit.radar.IRadarTransmitter", "com.ss.android.ugc.aweme.video.simcommon.SimRadarTransmitter");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig", "com.ss.android.ugc.aweme.video.simpreloader.VideoPreloadManagerConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.simapicommon.reporter.IALog", "com.ss.android.ugc.aweme.video.simcommon.SimALog");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper", "com.ss.android.ugc.aweme.simkit.config.SimPlayerConfigInjectWrapper");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment", "com.ss.android.ugc.aweme.video.simpreloader.PreloaderExperiment");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.model.PlayerGlobalConfig", "com.ss.android.ugc.aweme.video.simkit.PlayerGlobalConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor", "com.ss.android.ugc.aweme.video.simcommon.SimMonitor");
        concurrentHashMap.put("com.ss.android.ugc.aweme.simkit.api.ICommonConfig", "com.ss.android.ugc.aweme.video.simkit.SimKitCommonConfig");
        concurrentHashMap.put("com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig", "com.ss.android.ugc.aweme.video.simkit.SpeedConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.exp.PlayerSettingService", "com.ss.android.ugc.aweme.video.simplayer.PlayerSettingServiceImpl");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper", "com.ss.android.ugc.aweme.simkit.config.SimPreloadConfigInjectWrapper");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent", "com.ss.android.ugc.aweme.video.simcommon.SimMobEvent");
        concurrentHashMap.put("com.ss.android.ugc.aweme.simkit.ISimKitConfig", "com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.config.IPlayerExperiment", "com.ss.android.ugc.aweme.video.simplayer.PlayerExperimentImpl");
        concurrentHashMap.put("com.ss.android.ugc.playerkit.simapicommon.IAppConfig", "com.ss.android.ugc.aweme.video.simcommon.SimAppConfig");
        concurrentHashMap.put("com.ss.android.ugc.aweme.player.sdk.api.IStrategyCenterPreciseExpService", "com.ss.android.ugc.aweme.video.StrategyCenterPreciseExpService");
        concurrentHashMap.put("com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig", "com.ss.android.ugc.aweme.video.simplayer.SimReporterConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.aweme.video.config.ISimPlayerConfig", "com.ss.android.ugc.aweme.video.simplayer.PlayerConfigImpl");
        concurrentHashMap.put("com.ss.android.ugc.aweme.player.sdk.api.IPortraitService", "com.ss.android.ugc.aweme.video.SmartPortraitService");
    }

    public static String getDumpInfo() {
        StringBuffer stringBuffer = new StringBuffer("\n");
        Map<String, String> map = sConfigInterfaceImplementationMap;
        map.entrySet();
        for (String str : map.keySet()) {
            stringBuffer.append(str);
            stringBuffer.append(":");
            stringBuffer.append(sConfigInterfaceImplementationMap.get(str));
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static <T> T getConfig(Class<Object> cls) {
        Map<String, Object> map = sConfigMap;
        T t = (T) map.get(cls.getName());
        if (t == null) {
            synchronized (InjectedConfigManager.class) {
                try {
                    T t2 = (T) map.get(cls.getName());
                    if (t2 != null) {
                        return t2;
                    }
                    String str = sConfigInterfaceImplementationMap.get(cls.getName());
                    if (str != null) {
                        try {
                            T t3 = (T) Class.forName(str).newInstance();
                            map.put(cls.getName(), t3);
                            return t3;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("SimProcessor,Get service error!!!!,");
                            sbLIZ.append(e.toString());
                            C1481110oe5.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    }
                    Set<String> set = sReportedImplementationErrors;
                    if (!set.contains(cls.getName())) {
                        set.add(cls.getName());
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(cls.getName());
                        sbLIZ2.append(" dosen't have implementation.");
                        sbLIZ2.append(getDumpInfo());
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("SimProcessor,");
                        sbLIZ3.append(illegalArgumentException.toString());
                        C1481110oe5.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return t;
    }

    public static void onPluginInstall(Collection<String> collection) {
        try {
            for (String str : collection) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(".InjectedConfigInAAB");
                Map<String, String> mapLIZ = ((InterfaceC1847007Lg) Class.forName(C2188811AlT.LIZIZ(sbLIZ)).newInstance()).LIZ();
                if (mapLIZ != null && mapLIZ.size() != 0) {
                    sConfigInterfaceImplementationMap.putAll(mapLIZ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
