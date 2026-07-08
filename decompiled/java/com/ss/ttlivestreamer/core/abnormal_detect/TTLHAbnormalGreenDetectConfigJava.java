package com.ss.ttlivestreamer.core.abnormal_detect;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.video.TTLHGreenDetectConfigParser;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHAbnormalGreenDetectConfigJava implements Cloneable {
    public int detectIntervalMs;
    public boolean enable;
    public float greenDetectThreshold;
    public int greenDetectUVThreshold;
    public int targetPixels;

    public TTLHAbnormalGreenDetectConfigJava() {
        this.detectIntervalMs = 2000;
        this.targetPixels = 14400;
        this.greenDetectThreshold = 0.95f;
        this.greenDetectUVThreshold = 8;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TTLHAbnormalGreenDetectConfigJava m355clone() {
        try {
            TTLHAbnormalGreenDetectConfigJava tTLHAbnormalGreenDetectConfigJava = (TTLHAbnormalGreenDetectConfigJava) super.clone();
            tTLHAbnormalGreenDetectConfigJava.enable = this.enable;
            tTLHAbnormalGreenDetectConfigJava.detectIntervalMs = this.detectIntervalMs;
            tTLHAbnormalGreenDetectConfigJava.targetPixels = this.targetPixels;
            tTLHAbnormalGreenDetectConfigJava.greenDetectThreshold = this.greenDetectThreshold;
            tTLHAbnormalGreenDetectConfigJava.greenDetectUVThreshold = this.greenDetectUVThreshold;
            return tTLHAbnormalGreenDetectConfigJava;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public int getDetectIntervalMs() {
        return this.detectIntervalMs;
    }

    public float getGreenDetectThreshold() {
        return this.greenDetectThreshold;
    }

    public int getGreenDetectUVThreshold() {
        return this.greenDetectUVThreshold;
    }

    public int getTargetPixels() {
        return this.targetPixels;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public TTLHAbnormalGreenDetectConfigJava(TTLHGreenDetectConfigParser tTLHGreenDetectConfigParser) {
        this.detectIntervalMs = 2000;
        this.targetPixels = 14400;
        this.greenDetectThreshold = 0.95f;
        this.greenDetectUVThreshold = 8;
        this.enable = tTLHGreenDetectConfigParser.enable;
        this.detectIntervalMs = tTLHGreenDetectConfigParser.greenDetectIntervalMs;
        this.targetPixels = tTLHGreenDetectConfigParser.greenDetectTargetPixels;
        this.greenDetectThreshold = tTLHGreenDetectConfigParser.greenDetectThreshold;
        this.greenDetectUVThreshold = tTLHGreenDetectConfigParser.greenDetectUVthreshold;
    }
}
