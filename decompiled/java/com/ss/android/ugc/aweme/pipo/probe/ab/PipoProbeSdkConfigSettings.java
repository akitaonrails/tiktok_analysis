package com.ss.android.ugc.aweme.pipo.probe.ab;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class PipoProbeSdkConfigSettings {
    public static final PipoProbeSdkConfigModel LIZ = new PipoProbeSdkConfigModel(null, null, false, null, null, 31, null);

    public static final class CommonConfig {

        @C09CT("heart_beat_enabled")
        public final boolean enableHeartBeat;

        @C09CT("event_cache_enabled")
        public final boolean eventCacheEnabled;

        @C09CT("gyroscope_jitter_threshold")
        public final double gyroscopeJitterThreshold;

        @C09CT("gyroscope_sample_rate_hz")
        public final int gyroscopeSampleRateHz;

        @C09CT("gyroscope_sample_window_sec")
        public final int gyroscopeSampleWindowSec;

        @C09CT("heart_beat_interval")
        public final long heartBeatInterval;

        @C09CT("init_report_interval_sec")
        public final int initReportIntervalSec;

        @C09CT("light_jitter_threshold")
        public final double lightJitterThreshold;

        @C09CT("light_sample_rate_hz")
        public final int lightSampleRateHz;

        @C09CT("light_sample_window_sec")
        public final int lightSampleWindowSec;

        @C09CT("max_requests_per_sec")
        public final float maxRequestsPerSec;

        @C09CT("max_requests_queue_size")
        public final int maxRequestsQueueSize;

        @C09CT("native_fields")
        public final ArrayList<String> nativeFields;

        @C09CT("pitaya_biz")
        public final String pitayaBiz;

        @C09CT("pitaya_enabled")
        public final boolean pitayaEnabled;

        @C09CT("pitaya_fields")
        public final ArrayList<String> pitayaFields;

        @C09CT("retry_base_delay_ms")
        public final long retryBaseDelayMs;

        @C09CT("retry_exponential_factor")
        public final double retryExponentialFactor;

        @C09CT("retry_max_count")
        public final int retryMaxCount;

        @C09CT("system_observer_enabled")
        public final boolean systemObserverEnabled;

        @C09CT("tear_down_enabled")
        public final boolean tearDownEnabled;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonConfig)) {
                return false;
            }
            CommonConfig commonConfig = (CommonConfig) obj;
            return this.eventCacheEnabled == commonConfig.eventCacheEnabled && this.enableHeartBeat == commonConfig.enableHeartBeat && this.heartBeatInterval == commonConfig.heartBeatInterval && this.initReportIntervalSec == commonConfig.initReportIntervalSec && Float.compare(this.maxRequestsPerSec, commonConfig.maxRequestsPerSec) == 0 && this.maxRequestsQueueSize == commonConfig.maxRequestsQueueSize && Intrinsics.LJFF(this.nativeFields, commonConfig.nativeFields) && Intrinsics.LJFF(this.pitayaBiz, commonConfig.pitayaBiz) && this.pitayaEnabled == commonConfig.pitayaEnabled && Intrinsics.LJFF(this.pitayaFields, commonConfig.pitayaFields) && this.systemObserverEnabled == commonConfig.systemObserverEnabled && this.tearDownEnabled == commonConfig.tearDownEnabled && this.retryMaxCount == commonConfig.retryMaxCount && this.retryBaseDelayMs == commonConfig.retryBaseDelayMs && Double.compare(this.retryExponentialFactor, commonConfig.retryExponentialFactor) == 0 && this.gyroscopeSampleRateHz == commonConfig.gyroscopeSampleRateHz && this.gyroscopeSampleWindowSec == commonConfig.gyroscopeSampleWindowSec && Double.compare(this.gyroscopeJitterThreshold, commonConfig.gyroscopeJitterThreshold) == 0 && this.lightSampleRateHz == commonConfig.lightSampleRateHz && this.lightSampleWindowSec == commonConfig.lightSampleWindowSec && Double.compare(this.lightJitterThreshold, commonConfig.lightJitterThreshold) == 0;
        }

        public final String toString() {
            return "CommonConfig(eventCacheEnabled=" + this.eventCacheEnabled + ", enableHeartBeat=" + this.enableHeartBeat + ", heartBeatInterval=" + this.heartBeatInterval + ", initReportIntervalSec=" + this.initReportIntervalSec + ", maxRequestsPerSec=" + this.maxRequestsPerSec + ", maxRequestsQueueSize=" + this.maxRequestsQueueSize + ", nativeFields=" + this.nativeFields + ", pitayaBiz=" + this.pitayaBiz + ", pitayaEnabled=" + this.pitayaEnabled + ", pitayaFields=" + this.pitayaFields + ", systemObserverEnabled=" + this.systemObserverEnabled + ", tearDownEnabled=" + this.tearDownEnabled + ", retryMaxCount=" + this.retryMaxCount + ", retryBaseDelayMs=" + this.retryBaseDelayMs + ", retryExponentialFactor=" + this.retryExponentialFactor + ", gyroscopeSampleRateHz=" + this.gyroscopeSampleRateHz + ", gyroscopeSampleWindowSec=" + this.gyroscopeSampleWindowSec + ", gyroscopeJitterThreshold=" + this.gyroscopeJitterThreshold + ", lightSampleRateHz=" + this.lightSampleRateHz + ", lightSampleWindowSec=" + this.lightSampleWindowSec + ", lightJitterThreshold=" + this.lightJitterThreshold + ')';
        }

        public CommonConfig() {
            this(true, true, 900L, 600, 0.5f, 10, new ArrayList(), "pipo_probe_sdk_1180_n_1233", false, new ArrayList(), true, true, 0, 0L, 1.0d, 20, 5, 0.01d, 20, 5, 0.05d);
        }

        public final int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((C786410Ut5.Z2(this.eventCacheEnabled) * 31) + C786410Ut5.Z2(this.enableHeartBeat)) * 31) + C786410Ut5.Y2(this.heartBeatInterval)) * 31) + this.initReportIntervalSec) * 31) + Float.floatToIntBits(this.maxRequestsPerSec)) * 31) + this.maxRequestsQueueSize) * 31) + this.nativeFields.hashCode()) * 31) + this.pitayaBiz.hashCode()) * 31) + C786410Ut5.Z2(this.pitayaEnabled)) * 31) + this.pitayaFields.hashCode()) * 31) + C786410Ut5.Z2(this.systemObserverEnabled)) * 31) + C786410Ut5.Z2(this.tearDownEnabled)) * 31) + this.retryMaxCount) * 31) + C786410Ut5.Y2(this.retryBaseDelayMs)) * 31) + C786410Ut5.X2(this.retryExponentialFactor)) * 31) + this.gyroscopeSampleRateHz) * 31) + this.gyroscopeSampleWindowSec) * 31) + C786410Ut5.X2(this.gyroscopeJitterThreshold)) * 31) + this.lightSampleRateHz) * 31) + this.lightSampleWindowSec) * 31) + C786410Ut5.X2(this.lightJitterThreshold);
        }

        public CommonConfig(boolean z, boolean z2, long j, int i, float f, int i2, ArrayList<String> arrayList, String str, boolean z3, ArrayList<String> arrayList2, boolean z4, boolean z5, int i3, long j2, double d, int i4, int i5, double d2, int i6, int i7, double d3) {
            this.eventCacheEnabled = z;
            this.enableHeartBeat = z2;
            this.heartBeatInterval = j;
            this.initReportIntervalSec = i;
            this.maxRequestsPerSec = f;
            this.maxRequestsQueueSize = i2;
            this.nativeFields = arrayList;
            this.pitayaBiz = str;
            this.pitayaEnabled = z3;
            this.pitayaFields = arrayList2;
            this.systemObserverEnabled = z4;
            this.tearDownEnabled = z5;
            this.retryMaxCount = i3;
            this.retryBaseDelayMs = j2;
            this.retryExponentialFactor = d;
            this.gyroscopeSampleRateHz = i4;
            this.gyroscopeSampleWindowSec = i5;
            this.gyroscopeJitterThreshold = d2;
            this.lightSampleRateHz = i6;
            this.lightSampleWindowSec = i7;
            this.lightJitterThreshold = d3;
        }
    }

    public static final PipoProbeSdkConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoProbeSdkConfigModel pipoProbeSdkConfigModel = LIZ;
        PipoProbeSdkConfigModel pipoProbeSdkConfigModel2 = (PipoProbeSdkConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_probe_sdk_config", PipoProbeSdkConfigModel.class, pipoProbeSdkConfigModel);
        return pipoProbeSdkConfigModel2 != null ? pipoProbeSdkConfigModel2 : pipoProbeSdkConfigModel;
    }

    public static final class PipoProbeSdkConfigModel {

        @C09CT("by_entrance")
        public final List<Map<String, Object>> byEntrance;

        @C09CT("common")
        public final CommonConfig common;

        @C09CT("enabled_entrance")
        public final ArrayList<String> entranceList;

        @C09CT("tts_enable_probe")
        public final boolean ttsEnableProbe;

        @C09CT("tts_url_enable_list")
        public final List<String> ttsUrlEnableList;

        public PipoProbeSdkConfigModel() {
            this(null, null, false, null, null, 31, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PipoProbeSdkConfigModel(List<? extends Map<String, ? extends Object>> list, CommonConfig commonConfig, boolean z, List<String> list2, ArrayList<String> arrayList) {
            this.byEntrance = list;
            this.common = commonConfig;
            this.ttsEnableProbe = z;
            this.ttsUrlEnableList = list2;
            this.entranceList = arrayList;
        }

        public PipoProbeSdkConfigModel(List list, CommonConfig commonConfig, boolean z, List list2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? new CommonConfig(true, true, 900L, 600, 0.5f, 10, new ArrayList(), "pipo_probe_sdk_1180_n_1233", false, new ArrayList(), true, true, 0, 0L, 1.0d, 20, 5, 0.01d, 20, 5, 0.05d) : commonConfig, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? new ArrayList() : arrayList);
        }
    }
}
