package com.ss.lyrax.ttlh_adapter.push_param.push_base;

import android.text.TextUtils;
import com.ss.lyrax.ttlh_adapter.utils.ParamConverter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class PushCommonConfig {
    public boolean disableAnetFallback;
    public JSONArray disableAnetFallbackCodeList;
    public boolean enableEventDrivenOpt;
    public boolean enableEventDrivenPhase1;
    public boolean enableLyraxNetworkQualityOptV3;
    public boolean enableVideoPipelineOpt;
    public String idcName;
    public boolean incrementalParsing;
    public boolean linkmicStreamEnable;
    public JSONObject rtpTokenMap;
    public String streamName;
    public boolean supportLowLatency;

    public PushCommonConfig() {
        this.disableAnetFallbackCodeList = new JSONArray();
        this.disableAnetFallback = false;
        this.linkmicStreamEnable = false;
        this.supportLowLatency = false;
        this.incrementalParsing = false;
    }

    public boolean getDisableAnetFallback() {
        return this.disableAnetFallback;
    }

    public JSONArray getDisableAnetFallbackCodeList() {
        return this.disableAnetFallbackCodeList;
    }

    public boolean getEnableEventDrivenOpt() {
        return this.enableEventDrivenOpt;
    }

    public boolean getEnableEventDrivenPhase1() {
        return this.enableEventDrivenPhase1;
    }

    public boolean getEnableLyraxNetworkQualityOptV3() {
        return this.enableLyraxNetworkQualityOptV3;
    }

    public boolean getEnableVideoPipelineOpt() {
        return this.enableVideoPipelineOpt;
    }

    public String getIdcName() {
        return this.idcName;
    }

    public boolean getLinkmicStreamEnable() {
        return this.linkmicStreamEnable;
    }

    public JSONObject getRtpTokenMap() {
        return this.rtpTokenMap;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public boolean getSupportLowLatency() {
        return this.supportLowLatency;
    }

    public void setIdcName(String str) {
        if (TextUtils.isEmpty(this.idcName) || !this.incrementalParsing) {
            this.idcName = str;
        }
    }

    public void setIncrementalParsing(boolean z) {
        this.incrementalParsing = z;
    }

    public void setStreamName(String str) {
        if (TextUtils.isEmpty(this.streamName) || !this.incrementalParsing) {
            this.streamName = str;
        }
    }

    public PushCommonConfig(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Integer[] numArr, boolean z5, boolean z6, boolean z7, String str3) {
        JSONArray jSONArray = new JSONArray();
        this.disableAnetFallbackCodeList = jSONArray;
        this.disableAnetFallback = false;
        this.linkmicStreamEnable = false;
        this.supportLowLatency = false;
        this.incrementalParsing = false;
        this.enableEventDrivenPhase1 = z2;
        this.enableVideoPipelineOpt = z3;
        this.enableEventDrivenOpt = z4;
        this.enableLyraxNetworkQualityOptV3 = z;
        this.streamName = str;
        this.idcName = str2;
        this.disableAnetFallbackCodeList = ParamConverter.convertIntListToJsonArray(numArr, jSONArray);
        this.disableAnetFallback = z5;
        this.linkmicStreamEnable = z6;
        this.supportLowLatency = z7;
        this.rtpTokenMap = ParamConverter.convertStringToJson(str3, this.rtpTokenMap);
    }
}
