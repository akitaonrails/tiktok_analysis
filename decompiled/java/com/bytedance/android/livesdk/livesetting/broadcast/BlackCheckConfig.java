package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public final class BlackCheckConfig implements Serializable {
    public static final TypeAdapter ADAPTER = new BlackCheckConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("capture_black_sample_count")
    public int captureBlackSampleCounts;

    @C09CT("capture_black_threshold")
    public long captureBlackThreshold;

    @C09CT("capture_black_unexpected_rate")
    public float captureBlackUnexpectedRate;

    @C09CT("device_lag_fps_sample_count")
    public int deviceLagFpsSampleCounts;

    @C09CT("device_lag_fps_threshold")
    public int deviceLagFpsThreshold;

    @C09CT("device_lag_fps_unexpected_rate")
    public float deviceLagFpsUnexpectedRate;

    @C09CT("enable")
    public boolean enable;

    @C09CT("permission_bitrate_threshold")
    public long permissionBitrateThreshold;

    @C09CT("permission_fps_threshold")
    public int permissionFpsThreshold;

    @C09CT("permission_sample_count")
    public int permissionSampleCounts;

    @C09CT("permission_unexpected_rate")
    public float permissionUnexpectedRate;

    public final int getCaptureBlackSampleCounts() {
        return this.captureBlackSampleCounts;
    }

    public final long getCaptureBlackThreshold() {
        return this.captureBlackThreshold;
    }

    public final float getCaptureBlackUnexpectedRate() {
        return this.captureBlackUnexpectedRate;
    }

    public final int getDeviceLagFpsSampleCounts() {
        return this.deviceLagFpsSampleCounts;
    }

    public final int getDeviceLagFpsThreshold() {
        return this.deviceLagFpsThreshold;
    }

    public final float getDeviceLagFpsUnexpectedRate() {
        return this.deviceLagFpsUnexpectedRate;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getPermissionBitrateThreshold() {
        return this.permissionBitrateThreshold;
    }

    public final int getPermissionFpsThreshold() {
        return this.permissionFpsThreshold;
    }

    public final int getPermissionSampleCounts() {
        return this.permissionSampleCounts;
    }

    public final float getPermissionUnexpectedRate() {
        return this.permissionUnexpectedRate;
    }

    public final void setCaptureBlackSampleCounts(int i) {
        this.captureBlackSampleCounts = i;
    }

    public final void setCaptureBlackThreshold(long j) {
        this.captureBlackThreshold = j;
    }

    public final void setCaptureBlackUnexpectedRate(float f) {
        this.captureBlackUnexpectedRate = f;
    }

    public final void setDeviceLagFpsSampleCounts(int i) {
        this.deviceLagFpsSampleCounts = i;
    }

    public final void setDeviceLagFpsThreshold(int i) {
        this.deviceLagFpsThreshold = i;
    }

    public final void setDeviceLagFpsUnexpectedRate(float f) {
        this.deviceLagFpsUnexpectedRate = f;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setPermissionBitrateThreshold(long j) {
        this.permissionBitrateThreshold = j;
    }

    public final void setPermissionFpsThreshold(int i) {
        this.permissionFpsThreshold = i;
    }

    public final void setPermissionSampleCounts(int i) {
        this.permissionSampleCounts = i;
    }

    public final void setPermissionUnexpectedRate(float f) {
        this.permissionUnexpectedRate = f;
    }
}
