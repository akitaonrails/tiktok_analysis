package com.ss.ttlivestreamer.core.abnormal_detect;

import X.C1275590jIb;
import android.opengl.GLES30;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHAbnormalDetectorJava extends NativeObject {
    public TTLHAbnormalDetectConfigJava mConfig;
    public long mLastCheckedTimestampMs;
    public C1275590jIb mLatestFrameExtraInfo;
    public int mLatestFrameHeight;
    public int mLatestFrameWidth;

    private native long nativeCreateAbnormalDetector(TTLHAbnormalDetectConfigJava tTLHAbnormalDetectConfigJava, ITTLHAbnormalDetectNativeCallback iTTLHAbnormalDetectNativeCallback);

    private native void nativeProcessI420(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, long j);

    private native void nativeProcessTexture(int i, int i2, int i3, boolean z, long j);

    private native void nativeUpdateStats(TTLHAbnormalDetectStats tTLHAbnormalDetectStats, String str, int i, long j);

    private boolean checkNeedProcess(long j) {
        if (j - this.mLastCheckedTimestampMs >= this.mConfig.blackDetectConfig.detectIntervalMs) {
            this.mLastCheckedTimestampMs = j;
            return true;
        }
        return false;
    }

    public TTLHAbnormalDetectorJava(TTLHAbnormalDetectConfigJava tTLHAbnormalDetectConfigJava, ITTLHAbnormalDetectNativeCallback iTTLHAbnormalDetectNativeCallback) {
        TTLHAbnormalDetectConfigJava tTLHAbnormalDetectConfigJava2;
        if (tTLHAbnormalDetectConfigJava != null) {
            tTLHAbnormalDetectConfigJava2 = tTLHAbnormalDetectConfigJava.m354clone();
        } else {
            tTLHAbnormalDetectConfigJava2 = new TTLHAbnormalDetectConfigJava();
        }
        this.mConfig = tTLHAbnormalDetectConfigJava2;
        nativeCreateAbnormalDetector(tTLHAbnormalDetectConfigJava, iTTLHAbnormalDetectNativeCallback);
    }

    public TTLHAbnormalDetectStats updateStats(String str, int i) {
        TTLHAbnormalDetectStats tTLHAbnormalDetectStats = new TTLHAbnormalDetectStats();
        nativeUpdateStats(tTLHAbnormalDetectStats, str, i, System.currentTimeMillis());
        if (this.mConfig.enableReportTextureDetail) {
            tTLHAbnormalDetectStats.extraFrameInfo = this.mLatestFrameExtraInfo;
            tTLHAbnormalDetectStats.frameWidth = this.mLatestFrameWidth;
            tTLHAbnormalDetectStats.frameHeight = this.mLatestFrameHeight;
        }
        return tTLHAbnormalDetectStats;
    }

    public void processTexture(int i, int i2, int i3, boolean z, C1275590jIb c1275590jIb) {
        processTexture(i, i2, i3, z, 0L, c1275590jIb);
    }

    public void processTexture(int i, int i2, int i3, boolean z, long j, C1275590jIb c1275590jIb) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!checkNeedProcess(jCurrentTimeMillis) || this.mNativeObj == 0 || i == 0) {
            return;
        }
        if (j > 0 && GLES30.glIsSync(j)) {
            GLES30.glClientWaitSync(j, 1, -1L);
            if (GLES30.glGetError() != 0) {
                return;
            }
        }
        this.mLatestFrameWidth = i2;
        this.mLatestFrameHeight = i3;
        this.mLatestFrameExtraInfo = c1275590jIb;
        nativeProcessTexture(i, i2, i3, z, jCurrentTimeMillis);
    }

    public void processI420(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!checkNeedProcess(jCurrentTimeMillis) || this.mNativeObj == 0) {
            return;
        }
        nativeProcessI420(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, jCurrentTimeMillis);
    }
}
