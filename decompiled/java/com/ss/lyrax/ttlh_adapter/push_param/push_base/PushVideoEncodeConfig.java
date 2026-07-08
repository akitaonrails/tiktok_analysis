package com.ss.lyrax.ttlh_adapter.push_param.push_base;

import com.ss.lyrax.ttlh_adapter.utils.ParamConverter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class PushVideoEncodeConfig {
    public boolean enableBFrame;
    public float gopSec;
    public boolean incrementalParsing;
    public boolean useHardwareEncode;
    public String vCodec;
    public JSONObject videoEncoderStrategy;

    public float getGopSec() {
        if (this.gopSec == -1.0f) {
            this.gopSec = 0.0f;
        }
        return this.gopSec;
    }

    public PushVideoEncodeConfig() {
        this.useHardwareEncode = true;
        this.enableBFrame = true;
        this.gopSec = -1.0f;
    }

    public boolean getEnableBFrame() {
        return this.enableBFrame;
    }

    public boolean getUseHardwareEncode() {
        return this.useHardwareEncode;
    }

    public String getVCodec() {
        return this.vCodec;
    }

    public JSONObject getVideoEncoderStrategy() {
        return this.videoEncoderStrategy;
    }

    public void setEnableBFrame(boolean z) {
        if (!this.incrementalParsing) {
            this.enableBFrame = z;
        }
    }

    public void setGopSec(float f) {
        if (this.gopSec == -1.0f || !this.incrementalParsing) {
            this.gopSec = f;
        }
    }

    public void setIncrementalParsing(boolean z) {
        this.incrementalParsing = z;
    }

    public void setUseHardwareEncode(boolean z) {
        if (!this.incrementalParsing) {
            this.useHardwareEncode = z;
        }
    }

    public PushVideoEncodeConfig(String str, String str2, boolean z, float f, boolean z2) {
        this.useHardwareEncode = true;
        this.enableBFrame = true;
        this.gopSec = -1.0f;
        this.vCodec = str;
        this.videoEncoderStrategy = ParamConverter.convertStringToJson(str2, this.videoEncoderStrategy);
        this.enableBFrame = z;
        this.gopSec = f;
        this.useHardwareEncode = z2;
    }
}
