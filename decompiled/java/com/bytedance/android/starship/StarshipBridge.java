package com.bytedance.android.starship;

import X.C01GW;
import X.C1308130k95;
import X.C2277511ECn;
import X.C452501pT;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public final class StarshipBridge {
    public static final Companion Companion = new Companion();
    public static final C01GW<IStarshipBridgeService> bridgeService$delegate = C452501pT.LIZIZ(new C2277511ECn());

    public static final class Companion {
        public final void onAppLogEvent(Map<String, ? extends Object> map) {
            StarshipBridge.onAppLogEvent(map);
        }

        public final Object onGetFeatureData(long j, String str, String str2) {
            return StarshipBridge.onGetFeatureData(j, str, str2);
        }

        public final void onPitayaReady() {
            StarshipBridge.onPitayaReady();
        }

        public final void onSignalConfigUpdate(String str) {
            StarshipBridge.onSignalConfigUpdate(str);
        }

        public final void onStrategyConfigUpdate(String str, String str2) {
            StarshipBridge.onStrategyConfigUpdate(str, str2);
        }

        private final IStarshipBridgeService getBridgeService() {
            return StarshipBridge.bridgeService$delegate.getValue();
        }

        public final String getCxxSdkSettings() {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                return bridgeService.LJIIIIZZ();
            }
            return null;
        }

        public final String getStrategiesData() {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                return bridgeService.LJIIJ();
            }
            return null;
        }

        public final void registerStrategyConfigUpdateCallback() {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                bridgeService.LJFF(new C1308130k95());
            }
        }

        public final void toRegisterPitayaReady() {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                bridgeService.LJI();
            }
        }

        public final void toRegisterSignal() {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                bridgeService.LJ();
            }
        }

        public final String getDecisionConfigs(int i) {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                return bridgeService.LIZLLL(i);
            }
            return null;
        }

        public final String getLibraConfig(String str) {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                return bridgeService.LJII(str);
            }
            return null;
        }

        public final void subscribeAppLogEvent(String str) {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                bridgeService.LJIIIZ(str);
            }
        }

        public final void registerFeatureGroup(String str, long j) {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                bridgeService.LIZIZ(str, j);
            }
        }

        public final void trackEvent(String str, Map<String, ? extends Object> map) {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                bridgeService.LIZ(str, map);
            }
        }

        public final String getPlatformFeatureData(String str, String str2, String str3, String str4) {
            IStarshipBridgeService bridgeService = getBridgeService();
            if (bridgeService != null) {
                return bridgeService.LIZJ(str, str2, str3, str4);
            }
            return null;
        }
    }

    public static final String getCxxSdkSettings() {
        return Companion.getCxxSdkSettings();
    }

    public static final String getDecisionConfigs(int i) {
        return Companion.getDecisionConfigs(i);
    }

    public static final String getLibraConfig(String str) {
        return Companion.getLibraConfig(str);
    }

    public static final String getPlatformFeatureData(String str, String str2, String str3, String str4) {
        return Companion.getPlatformFeatureData(str, str2, str3, str4);
    }

    public static final String getStrategiesData() {
        return Companion.getStrategiesData();
    }

    public static final native void onAppLogEvent(Map<String, ? extends Object> map);

    public static final native Object onGetFeatureData(long j, String str, String str2);

    public static final native void onPitayaReady();

    public static final native void onSignalConfigUpdate(String str);

    public static final native void onStrategyConfigUpdate(String str, String str2);

    public static final void registerFeatureGroup(String str, long j) {
        Companion.registerFeatureGroup(str, j);
    }

    public static final void registerStrategyConfigUpdateCallback() {
        Companion.registerStrategyConfigUpdateCallback();
    }

    public static final void subscribeAppLogEvent(String str) {
        Companion.subscribeAppLogEvent(str);
    }

    public static final void toRegisterPitayaReady() {
        Companion.toRegisterPitayaReady();
    }

    public static final void toRegisterSignal() {
        Companion.toRegisterSignal();
    }

    public static final void trackEvent(String str, Map<String, ? extends Object> map) {
        Companion.trackEvent(str, map);
    }
}
