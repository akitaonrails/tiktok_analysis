package com.ss.lyrax.engine;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxBusinessOption {
    public String appId = "";
    public String abLabel = "";
    public String businessId = "";
    public String liveRoomId = "";
    public String aid = "";
    public String deviceId = "";
    public LyraxLiveType liveType = LyraxLiveType.VIDEO;
    public String rtcUserRole = "";
    public String dmType = "";
    public String userRegion = "";

    public String getAbLabel() {
        return this.abLabel;
    }

    public String getAid() {
        return this.aid;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDmType() {
        return this.dmType;
    }

    public String getLiveRoomId() {
        return this.liveRoomId;
    }

    public LyraxLiveType getLiveType() {
        return this.liveType;
    }

    public String getRtcUserRole() {
        return this.rtcUserRole;
    }

    public String getUserRegion() {
        return this.userRegion;
    }
}
