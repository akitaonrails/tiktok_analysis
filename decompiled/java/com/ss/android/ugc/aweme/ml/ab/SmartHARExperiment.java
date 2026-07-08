package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartHARExperiment {
    public static boolean LIZ;
    public static SmartHarModel LIZIZ;

    public static final class SmartHarModel {

        @C09CT("enable")
        public boolean enable;

        @C09CT("enable_monitor")
        public boolean enableMonitor;

        @C09CT("ml_sdk_url")
        public String mlSdkPackageUrl;

        @C09CT("opt_sensor_register")
        public boolean optSensorRegister;

        @C09CT("pitaya_ml")
        public PitayaMLConfig pitayaMLConfig;

        @C09CT("report_track_rate")
        public float reportTrackRate;

        @C09CT("use_screen_status")
        public boolean useScreenStatus;

        @C09CT("use_smooth")
        public boolean useSmooth;

        @C09CT("engine_type")
        public String engineType = "mlsdk";

        @C09CT("skip_count")
        public int skipCount = -1;

        @C09CT("run_delay")
        public int runDelay = 500;

        @C09CT("run_time_gap")
        public int runTimeGap = -1;

        @C09CT("run_feed_gap")
        public int runFeedGap = -1;

        @C09CT("run_continues_gap")
        public int runContinuesGapMs = -1;

        @C09CT("run_mode")
        public int runMode = 1;

        public String toString() {
            return super.toString();
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final boolean getEnableMonitor() {
            return this.enableMonitor;
        }

        public final String getEngineType() {
            return this.engineType;
        }

        public final String getMlSdkPackageUrl() {
            return this.mlSdkPackageUrl;
        }

        public final boolean getOptSensorRegister() {
            return this.optSensorRegister;
        }

        public final PitayaMLConfig getPitayaMLConfig() {
            return this.pitayaMLConfig;
        }

        public final float getReportTrackRate() {
            return this.reportTrackRate;
        }

        public final int getRunContinuesGapMs() {
            return this.runContinuesGapMs;
        }

        public final int getRunDelay() {
            return this.runDelay;
        }

        public final int getRunFeedGap() {
            return this.runFeedGap;
        }

        public final int getRunMode() {
            return this.runMode;
        }

        public final int getRunTimeGap() {
            return this.runTimeGap;
        }

        public final int getSkipCount() {
            return this.skipCount;
        }

        public final boolean getUseScreenStatus() {
            return this.useScreenStatus;
        }

        public final boolean getUseSmooth() {
            return this.useSmooth;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setEnableMonitor(boolean z) {
            this.enableMonitor = z;
        }

        public final void setEngineType(String str) {
            this.engineType = str;
        }

        public final void setMlSdkPackageUrl(String str) {
            this.mlSdkPackageUrl = str;
        }

        public final void setOptSensorRegister(boolean z) {
            this.optSensorRegister = z;
        }

        public final void setPitayaMLConfig(PitayaMLConfig pitayaMLConfig) {
            this.pitayaMLConfig = pitayaMLConfig;
        }

        public final void setReportTrackRate(float f) {
            this.reportTrackRate = f;
        }

        public final void setRunContinuesGapMs(int i) {
            this.runContinuesGapMs = i;
        }

        public final void setRunDelay(int i) {
            this.runDelay = i;
        }

        public final void setRunFeedGap(int i) {
            this.runFeedGap = i;
        }

        public final void setRunMode(int i) {
            this.runMode = i;
        }

        public final void setRunTimeGap(int i) {
            this.runTimeGap = i;
        }

        public final void setSkipCount(int i) {
            this.skipCount = i;
        }

        public final void setUseScreenStatus(boolean z) {
            this.useScreenStatus = z;
        }

        public final void setUseSmooth(boolean z) {
            this.useSmooth = z;
        }
    }
}
