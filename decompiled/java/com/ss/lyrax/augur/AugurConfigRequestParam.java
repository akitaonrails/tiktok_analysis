package com.ss.lyrax.augur;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class AugurConfigRequestParam {
    public String abLabel;
    public String appId;
    public String businessId;
    public String deviceId;
    public String roomId;
    public String starshipStrategyGroups;
    public String streamId;
    public List<String> streamScene;
    public String userId;

    public String getAbLabel() {
        return this.abLabel;
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

    public String getRoomId() {
        return this.roomId;
    }

    public String getStarshipStrategyGroups() {
        return this.starshipStrategyGroups;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public List<String> getStreamScene() {
        return this.streamScene;
    }

    public String getUserId() {
        return this.userId;
    }

    public AugurConfigRequestParam setAbLabel(String str) {
        this.abLabel = str;
        return this;
    }

    public AugurConfigRequestParam setAppId(String str) {
        this.appId = str;
        return this;
    }

    public AugurConfigRequestParam setBusinessId(String str) {
        this.businessId = str;
        return this;
    }

    public AugurConfigRequestParam setDeviceId(String str) {
        this.deviceId = str;
        return this;
    }

    public AugurConfigRequestParam setRoomId(String str) {
        this.roomId = str;
        return this;
    }

    public AugurConfigRequestParam setStarshipStrategyGroups(String str) {
        this.starshipStrategyGroups = str;
        return this;
    }

    public AugurConfigRequestParam setStreamId(String str) {
        this.streamId = str;
        return this;
    }

    public AugurConfigRequestParam setStreamScene(List<String> list) {
        this.streamScene = list;
        return this;
    }

    public AugurConfigRequestParam setUserId(String str) {
        this.userId = str;
        return this;
    }
}
