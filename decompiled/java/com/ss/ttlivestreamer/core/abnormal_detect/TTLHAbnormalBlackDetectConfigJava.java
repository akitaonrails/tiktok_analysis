package com.ss.ttlivestreamer.core.abnormal_detect;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.video.TTLHBlackDetectConfigParser;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHAbnormalBlackDetectConfigJava implements Cloneable {
    public float blackDetectThreshold;
    public int blackDetectYThreshold;
    public int detectIntervalMs;
    public boolean enable;
    public int targetPixels;

    public TTLHAbnormalBlackDetectConfigJava() {
        this.detectIntervalMs = 2000;
        this.targetPixels = 14400;
        this.blackDetectThreshold = 0.95f;
        this.blackDetectYThreshold = 8;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TTLHAbnormalBlackDetectConfigJava m353clone() {
        try {
            TTLHAbnormalBlackDetectConfigJava tTLHAbnormalBlackDetectConfigJava = (TTLHAbnormalBlackDetectConfigJava) super.clone();
            tTLHAbnormalBlackDetectConfigJava.enable = this.enable;
            tTLHAbnormalBlackDetectConfigJava.detectIntervalMs = this.detectIntervalMs;
            tTLHAbnormalBlackDetectConfigJava.targetPixels = this.targetPixels;
            tTLHAbnormalBlackDetectConfigJava.blackDetectThreshold = this.blackDetectThreshold;
            tTLHAbnormalBlackDetectConfigJava.blackDetectYThreshold = this.blackDetectYThreshold;
            return tTLHAbnormalBlackDetectConfigJava;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public float getBlackDetectThreshold() {
        return this.blackDetectThreshold;
    }

    public int getBlackDetectYThreshold() {
        return this.blackDetectYThreshold;
    }

    public int getDetectIntervalMs() {
        return this.detectIntervalMs;
    }

    public int getTargetPixels() {
        return this.targetPixels;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public TTLHAbnormalBlackDetectConfigJava(TTLHBlackDetectConfigParser tTLHBlackDetectConfigParser) {
        this.detectIntervalMs = 2000;
        this.targetPixels = 14400;
        this.blackDetectThreshold = 0.95f;
        this.blackDetectYThreshold = 8;
        this.enable = tTLHBlackDetectConfigParser.enable;
        this.detectIntervalMs = tTLHBlackDetectConfigParser.blackDetectIntervalMs;
        this.targetPixels = tTLHBlackDetectConfigParser.blackDetectTargetPixels;
        this.blackDetectThreshold = tTLHBlackDetectConfigParser.blackDetectThreshold;
        this.blackDetectYThreshold = tTLHBlackDetectConfigParser.blackDetectYthreshold;
    }
}
