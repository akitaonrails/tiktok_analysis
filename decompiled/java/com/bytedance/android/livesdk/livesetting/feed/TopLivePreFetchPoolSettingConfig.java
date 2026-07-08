package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLivePreFetchPoolSettingConfig {
    public static final TypeAdapter ADAPTER = new TopLivePreFetchPoolSettingConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("cache_time")
    public long cacheTime;

    @C09CT("enable_check_room_state")
    public boolean enableCheckRoomState;

    @C09CT("enable_prefetch")
    public boolean enablePrefetch;

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("refresh_delay_time_on_exit")
    public long refreshDelayTime;

    @C09CT("refresh_on_cache_invalid")
    public boolean refreshOnCacheInvalid;

    @C09CT("prefetch_req")
    public String reqFrom;

    @C09CT("request_delay_time_on_start")
    public long requestDelayTime;

    @C09CT("waiting_api_time_android")
    public long waitingTime;

    public TopLivePreFetchPoolSettingConfig() {
        this(false, 1800000L, 0L, true, 0L, true, "tiktok_message_toplive_preload_rec", 0L, true);
    }

    public final long getCacheTime() {
        return this.cacheTime;
    }

    public final boolean getEnableCheckRoomState() {
        return this.enableCheckRoomState;
    }

    public final boolean getEnablePrefetch() {
        return this.enablePrefetch;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getRefreshDelayTime() {
        return this.refreshDelayTime;
    }

    public final boolean getRefreshOnCacheInvalid() {
        return this.refreshOnCacheInvalid;
    }

    public final String getReqFrom() {
        return this.reqFrom;
    }

    public final long getRequestDelayTime() {
        return this.requestDelayTime;
    }

    public final long getWaitingTime() {
        return this.waitingTime;
    }

    public final void setCacheTime(long j) {
        this.cacheTime = j;
    }

    public final void setEnableCheckRoomState(boolean z) {
        this.enableCheckRoomState = z;
    }

    public final void setEnablePrefetch(boolean z) {
        this.enablePrefetch = z;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setRefreshDelayTime(long j) {
        this.refreshDelayTime = j;
    }

    public final void setRefreshOnCacheInvalid(boolean z) {
        this.refreshOnCacheInvalid = z;
    }

    public final void setReqFrom(String str) {
        this.reqFrom = str;
    }

    public final void setRequestDelayTime(long j) {
        this.requestDelayTime = j;
    }

    public final void setWaitingTime(long j) {
        this.waitingTime = j;
    }

    public TopLivePreFetchPoolSettingConfig(boolean z, long j, long j2, boolean z2, long j3, boolean z3, String str, long j4, boolean z4) {
        this.enabled = z;
        this.cacheTime = j;
        this.waitingTime = j2;
        this.refreshOnCacheInvalid = z2;
        this.refreshDelayTime = j3;
        this.enablePrefetch = z3;
        this.reqFrom = str;
        this.requestDelayTime = j4;
        this.enableCheckRoomState = z4;
    }
}
