package com.bytedance.vcloud.strategy.model;

import X.C08FF;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyConfigItem;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class LiveStartupConfig {
    public StrategyConfigItem mBandwidthEstimatorItem;
    public boolean mHasABRStrategy;
    public boolean mHasBandwidthStrategy;
    public boolean mHasStartupStrategy;
    public final AtomicBoolean mIsEnableABRAndStartup;
    public StrategyConfigItem mStartupBitrateItem;

    public boolean hasStartupAndAbrStrategy() {
        return this.mHasStartupStrategy && this.mHasABRStrategy;
    }

    public boolean isEnableABRAndStartup() {
        return this.mIsEnableABRAndStartup.get();
    }

    public enum StrategyType {
        abr("live_stream_strategy_abr_predict_bitrate", ""),
        startup("live_stream_strategy_startup_bitrate_predict", "{\n  \"Enable\": 1,\n  \"EnableSmartStrategyConfig\": 0,\n  \"InputFeatureList\": [\n    \"PLAY-BitrateList\",\n    \"NETWORK-RecommendBitrate\",\n    \"PLAY-ResolutionMap\",\n    \"PLAY-IsPreview\",\n    \"PLAY-PushResolution\",\n    \"PLAY-NeptuneName\",\n    \"PLAY-ProbeStartupBandwidth\",\n    \"DEVICE-PhoneLevel\",\n    \"NETWORK-NetworkLevel\"\n  ],\n  \"InputSettingsParam\": {\n    \"EnableUsePRDStrategy\": 1,\n    \"PRDSettings\": {\n      \"BaselineParams\": {\n        \"DefaultResolution\": \"hd\"\n      },\n      \"BweToBitrateParams\": {\n        \"BottomLineParams\": {\n          \"Default\": {\n            \"hd\": 1100000,\n            \"sd\": 980000,\n            \"ld\": 480000,\n            \"uhd\": 12500000\n          },\n          \"SourceCCTK-NoPreview\": {\n            \"default\": {\n              \"hd\": 1100000,\n              \"sd\": 980000,\n              \"ld\": 480000,\n              \"uhd\": 12500000\n            }\n          },\n          \"SourceCCTK-Preview\": {\n            \"default\": {\n              \"hd\": 1100000,\n              \"sd\": 980000,\n              \"ld\": 480000,\n              \"uhd\": 11000000\n            }\n          },\n          \"SourceVoD-NoPreview\": {\n            \"default\": {\n              \"hd\": 500000,\n              \"sd\": 400000,\n              \"ld\": 300000,\n              \"uhd\": 2530000\n            }\n          },\n          \"SourceVoD-Preview\": {\n            \"default\": {\n              \"hd\": 500000,\n              \"sd\": 400000,\n              \"ld\": 300000,\n              \"uhd\": 2530000\n            }\n          }\n        },\n        \"Mode\": \"bottomline\"\n      },\n      \"JudgePipeline\": {\n        \"NoPreview\": [\n          \"High-Bwe\"\n        ],\n        \"Preview\": [\n          \"High-Bwe\"\n        ]\n      }\n    }\n  }\n}"),
        bandwidth("live_stream_strategy_bandwidth_estimator", "{\n  \"Enable\": 1,\n  \"EnableSmartStrategyConfig\": 0,\n  \"InputFeatureList\": [\n    \"PLAY-CCTKCongestionInfo\",\n    \"NETWORK-RecommendBitrate\",\n    \"PLAY-Bitrate\"\n  ],\n  \"InputSettingsParam\": {\n    \"CalculateEWMAFactor\": 0.5,\n    \"CalculateFunc\": 2,\n    \"CalculateSize\": 10,\n    \"LiveProtectedDuration\": 0,\n    \"MaxBandwidthSampleDuration\": 60,\n    \"MaxBwSampleSize\": 10,\n    \"MaxSessionSize\": 10,\n    \"MinBwEstimatorBitrate\": 0,\n    \"MinPlayedDurationThresh\": 0,\n    \"NetworkMatchMode\": 1,\n    \"OverallStrategy\": 1,\n    \"PriorityMap\": {\n      \"cctkBw\": 10000,\n      \"vodBitrate\": 100\n    },\n    \"RemoveSampleTimer\": 1,\n    \"UseWithAttributionImpl\": 1\n  }\n}");

        public final String params;
        public final String value;

        public String getParams() {
            return this.params;
        }

        public String getStrategyType() {
            return this.value;
        }

        public static StrategyType valueOf(String str) {
            return (StrategyType) C08FF.LIZ(StrategyType.class, str);
        }

        StrategyType(String str, String str2) {
            this.value = str;
            this.params = str2;
        }
    }

    public StrategyConfigItem getBandwidthEstimatorItem() {
        return this.mBandwidthEstimatorItem;
    }

    public StrategyConfigItem getStartupBitrateItem() {
        return this.mStartupBitrateItem;
    }

    public boolean hasBandwidthStrategy() {
        return this.mHasBandwidthStrategy;
    }

    public boolean hasStartupStrategy() {
        return this.mHasStartupStrategy;
    }

    private String getNeptuneName(LiveStreamData liveStreamData) {
        LiveGear liveGear;
        if (liveStreamData == null || liveStreamData.common == null || (liveGear = liveStreamData.gears.get("origin")) == null) {
            return "";
        }
        LivePreference livePreference = liveGear.main;
        if (livePreference.sdkParams == null) {
            return "";
        }
        String str = livePreference.flv;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split(".flv?");
        if (strArrSplit.length <= 0 || strArrSplit[0].lastIndexOf("/") <= 1) {
            return "";
        }
        String str2 = strArrSplit[0];
        return str2.substring(str2.lastIndexOf("/") - 1, strArrSplit[0].lastIndexOf("/"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public StrategyConfigItem mergePresetAndDeliveryParam(StrategyConfigItem strategyConfigItem) {
        StrategyConfigItem strategyConfigItem2;
        if (strategyConfigItem == null) {
            return null;
        }
        String str = strategyConfigItem.mName;
        str.getClass();
        switch (str.hashCode()) {
            case -1019015374:
                if (str.equals("live_stream_strategy_bandwidth_estimator")) {
                    strategyConfigItem2 = this.mBandwidthEstimatorItem;
                    this.mHasBandwidthStrategy = true;
                    break;
                }
                return strategyConfigItem;
            case -992152071:
                if (str.equals("live_stream_strategy_abr_predict_bitrate")) {
                    this.mHasABRStrategy = true;
                    return strategyConfigItem;
                }
                return strategyConfigItem;
            case 533689349:
                if (str.equals("live_stream_strategy_startup_bitrate_predict")) {
                    strategyConfigItem2 = this.mStartupBitrateItem;
                    this.mHasStartupStrategy = true;
                    break;
                }
                return strategyConfigItem;
            default:
                return strategyConfigItem;
        }
        if (strategyConfigItem2 != null) {
            strategyConfigItem2.mEnable = strategyConfigItem.mEnable;
            strategyConfigItem2.mStrategyInputParams = mergeJsons(strategyConfigItem.mStrategyInputParams, strategyConfigItem2.mStrategyInputParams);
        }
        return strategyConfigItem2;
    }

    public void updateDefaultResolution(String str) {
        JSONObject jSONObject;
        StrategyConfigItem strategyConfigItem = this.mStartupBitrateItem;
        if (strategyConfigItem != null && (jSONObject = strategyConfigItem.mStrategyInputParams) != null) {
            try {
                JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(jSONObject, "InputSettingsParam"), "PRDSettings"), "BaselineParams").put("DefaultResolution", str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    private boolean isEnablePresetConfig(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            if (!z) {
                return true;
            }
            return false;
        }
        StrategyType strategyType = StrategyType.abr;
        if ((jSONObject.has(strategyType.getStrategyType()) && jSONObject.has(StrategyType.startup.getStrategyType())) || ((!jSONObject.has(strategyType.getStrategyType()) && !jSONObject.has(StrategyType.startup.getStrategyType()) && !z) || jSONObject.has(strategyType.getStrategyType()) || jSONObject.has(StrategyType.startup.getStrategyType()))) {
            return true;
        }
        return false;
    }

    public static JSONArray mergeArrays(JSONArray jSONArray, JSONArray jSONArray2) throws JSONException {
        JSONArray jSONArray3 = new JSONArray();
        int iMax = Math.max(jSONArray.length(), jSONArray2.length());
        for (int i = 0; i < iMax; i++) {
            if (i < jSONArray.length() && i < jSONArray2.length()) {
                Object obj = jSONArray.get(i);
                Object obj2 = jSONArray2.get(i);
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    jSONArray3.put(mergeObjects((JSONObject) obj, (JSONObject) obj2));
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    jSONArray3.put(mergeArrays((JSONArray) obj, (JSONArray) obj2));
                } else {
                    jSONArray3.put(obj);
                }
            } else if (i < jSONArray.length()) {
                jSONArray3.put(jSONArray.get(i));
            } else {
                jSONArray3.put(jSONArray2.get(i));
            }
        }
        return jSONArray3;
    }

    public static JSONObject mergeJsons(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3 = mergeObjects(jSONObject, jSONObject2);
            return jSONObject3;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject3;
        }
    }

    public static JSONObject mergeObjects(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (jSONObject2.has(next)) {
                Object obj = jSONObject.get(next);
                Object obj2 = jSONObject2.get(next);
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    jSONObject3.put(next, mergeObjects((JSONObject) obj, (JSONObject) obj2));
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    jSONObject3.put(next, mergeArrays((JSONArray) obj, (JSONArray) obj2));
                } else {
                    jSONObject3.put(next, obj);
                }
            } else {
                jSONObject3.put(next, jSONObject.get(next));
            }
        }
        Iterator<String> itKeys2 = jSONObject2.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            if (!jSONObject.has(next2)) {
                jSONObject3.put(next2, jSONObject2.get(next2));
            }
        }
        return jSONObject3;
    }

    public LiveStartupConfig(JSONObject jSONObject, LiveStreamData liveStreamData, boolean z) {
        JSONObject jSONObject2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mIsEnableABRAndStartup = atomicBoolean;
        this.mHasStartupStrategy = false;
        this.mHasABRStrategy = false;
        this.mHasBandwidthStrategy = false;
        if (isEnablePresetConfig(jSONObject, z)) {
            atomicBoolean.set(true);
        }
        if (!atomicBoolean.get()) {
            return;
        }
        String neptuneName = getNeptuneName(liveStreamData);
        for (StrategyType strategyType : StrategyType.values()) {
            StrategyConfigItem strategyConfigItem = new StrategyConfigItem();
            strategyConfigItem.mName = strategyType.getStrategyType();
            strategyConfigItem.mEnable = true;
            try {
                strategyConfigItem.mStrategyInputParams = new JSONObject(strategyType.getParams());
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            String strategyType2 = strategyType.getStrategyType();
            strategyType2.getClass();
            if (!strategyType2.equals("live_stream_strategy_bandwidth_estimator")) {
                if (strategyType2.equals("live_stream_strategy_startup_bitrate_predict")) {
                    this.mStartupBitrateItem = strategyConfigItem;
                    if (neptuneName.equals("game") && (jSONObject2 = this.mStartupBitrateItem.mStrategyInputParams) != null) {
                        try {
                            JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "InputSettingsParam"), "PRDSettings"), "BweToBitrateParams").put("BottomLineParams", "{\n  \"SourceCCTK-NoPreview\": {\n    \"default\": {\n      \"hd_60\": 3132000,\n      \"uhd_60\": 16000000,\n      \"uhd\": 14000000,\n      \"hd\": 1927000,\n      \"sd\": 1204000\n    }\n  },\n  \"SourceCCTK-Preview\": {\n    \"default\": {\n      \"hd_60\": 3132000,\n      \"uhd_60\": 16000000,\n      \"uhd\": 14000000,\n      \"hd\": 1927000,\n      \"sd\": 1204000\n    }\n  },\n  \"SourceVoD-NoPreview\": {\n    \"default\": {\n      \"hd_60\": 3466000,\n      \"uhd_60\": 5333000,\n      \"uhd\": 4500000,\n      \"hd\": 980000,\n      \"sd\": 4800000\n    }\n  },\n  \"SourceVoD-Preview\": {\n    \"default\": {\n      \"hd_60\": 3466000,\n      \"uhd_60\": 5333000,\n      \"uhd\": 4500000,\n      \"hd\": 980000,\n      \"sd\": 4800000\n    }\n  }\n}");
                        } catch (JSONException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
            } else {
                this.mBandwidthEstimatorItem = strategyConfigItem;
            }
        }
    }
}
