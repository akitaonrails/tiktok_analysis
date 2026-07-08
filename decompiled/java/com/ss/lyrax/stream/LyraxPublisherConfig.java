package com.ss.lyrax.stream;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxPublisherConfig {
    public String anchor_idc;
    public boolean delayPushing;
    public boolean disableCdnForwarding;
    public boolean disableTranscodeTask;
    public boolean enablePassthrough;
    public int fallbackTimeMs;
    public List<String> ips;
    public LyraxLowLatencyParams lowLatencyParams;
    public String metaData;
    public int pushResultTimeMs;
    public String rtc_room_id;
    public String rtc_stream_id;
    public String rtc_stream_token;
    public String rtc_user_id;
    public List<String> urls;

    public LyraxPublisherConfig() {
        this.fallbackTimeMs = 300000;
        this.pushResultTimeMs = 10000;
        this.rtc_stream_id = "";
        this.rtc_stream_token = "";
        this.rtc_user_id = "";
        this.rtc_room_id = "";
        this.anchor_idc = "";
        this.urls = new ArrayList();
        this.ips = new ArrayList();
        this.lowLatencyParams = new LyraxLowLatencyParams();
    }

    public String getAnchorIdc() {
        return this.anchor_idc;
    }

    public boolean getDelayPushing() {
        return this.delayPushing;
    }

    public int getFallbackTimeMs() {
        return this.fallbackTimeMs;
    }

    public List<String> getIps() {
        return this.ips;
    }

    public LyraxLowLatencyParams getLowLatencyParams() {
        return this.lowLatencyParams;
    }

    public String getMetaData() {
        return this.metaData;
    }

    public int getPushResultTimeMs() {
        return this.pushResultTimeMs;
    }

    public String getRtcRoomId() {
        return this.rtc_room_id;
    }

    public String getRtcStreamId() {
        return this.rtc_stream_id;
    }

    public String getRtcStreamToken() {
        return this.rtc_stream_token;
    }

    public String getRtcUserId() {
        return this.rtc_user_id;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public boolean isDisableCdnForwarding() {
        return this.disableCdnForwarding;
    }

    public boolean isDisableTranscodeTask() {
        return this.disableTranscodeTask;
    }

    public boolean isEnablePassthrough() {
        return this.enablePassthrough;
    }

    public LyraxPublisherConfig(int i, int i2, String str, List<String> list, List<String> list2, boolean z) {
        this(i, i2, str, list, list2, z, null);
    }

    public LyraxPublisherConfig(int i, int i2, String str, List<String> list, List<String> list2, boolean z, LyraxLowLatencyParams lyraxLowLatencyParams) {
        this(i, i2, str, list, list2, z, lyraxLowLatencyParams, "", "", "", "");
    }

    public LyraxPublisherConfig(int i, int i2, String str, List<String> list, List<String> list2, boolean z, LyraxLowLatencyParams lyraxLowLatencyParams, String str2, String str3, String str4, String str5) {
        this.anchor_idc = "";
        this.fallbackTimeMs = i;
        this.pushResultTimeMs = i2;
        this.metaData = str;
        this.urls = list;
        this.ips = list2;
        this.delayPushing = z;
        this.lowLatencyParams = lyraxLowLatencyParams;
        this.rtc_stream_id = str2;
        this.rtc_stream_token = str3;
        this.rtc_user_id = str4;
        this.rtc_room_id = str5;
    }
}
