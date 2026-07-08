package com.ss.ttlivestreamer.core.abnormal_detect;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class TTLHAbnormalDetectResultJava {
    public String abnormalType;
    public String nodeName;
    public float blackPixelRatio = -1.0f;
    public float greenPixelRatio = -1.0f;
    public float avgY = -1.0f;
    public float avgU = -1.0f;
    public float avgV = -1.0f;
    public String remoteUserId = "";
    public int streamIndex = -1;

    public Map<String, String> toDictionary() {
        HashMap map = new HashMap();
        String str = this.nodeName;
        if (str == null) {
            str = "";
        }
        map.put("node_name", str);
        String str2 = this.abnormalType;
        if (str2 == null) {
            str2 = "";
        }
        map.put("abnormal_type", str2);
        map.put("black_pixel_ratio", String.valueOf(this.blackPixelRatio));
        map.put("green_pixel_ratio", String.valueOf(this.greenPixelRatio));
        map.put("avg_y", String.valueOf(this.avgY));
        map.put("avg_u", String.valueOf(this.avgU));
        map.put("avg_v", String.valueOf(this.avgV));
        map.put("stream_index", String.valueOf(this.streamIndex));
        String str3 = this.remoteUserId;
        if (str3 != null && !"".equals(str3)) {
            map.put("remote_user_id", this.remoteUserId);
        }
        return map;
    }

    public void setRemoteUserId(String str) {
        this.remoteUserId = str;
    }

    public void setStreamIndex(int i) {
        this.streamIndex = i;
    }

    public TTLHAbnormalDetectResultJava(String str, String str2) {
        this.nodeName = str;
        this.abnormalType = str2;
    }

    public void setBlackDetectResults(float f, float f2) {
        this.blackPixelRatio = f;
        this.avgY = f2;
    }

    public void setGreenDetectResults(float f, float f2, float f3) {
        this.greenPixelRatio = f;
        this.avgU = f2;
        this.avgV = f3;
    }
}
