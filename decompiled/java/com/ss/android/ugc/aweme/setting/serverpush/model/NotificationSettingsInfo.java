package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class NotificationSettingsInfo {

    @C09CT("push_device_other_channel")
    public int pushDeviceOtherChannel;

    @C09CT("push_device_recommend_video")
    public int pushDeviceRecommendVideo;

    public NotificationSettingsInfo(int i, int i2) {
        this.pushDeviceRecommendVideo = i;
        this.pushDeviceOtherChannel = i2;
    }
}
