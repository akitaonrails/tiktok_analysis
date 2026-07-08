package com.bytedance.android.livesdk.comp.api.linkcore.model;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class RtcLiveVideoParam {
    public final String configId;
    public final String rtcBusinessId;
    public final RtcMixParam rtcMixParam;
    public final int rtcMixType;
    public final int rtcVideoParamMode;
    public final ArrayList<RtcResolution> videoResolutions;

    public RtcLiveVideoParam(int i, int i2, RtcMixParam rtcMixParam, ArrayList<RtcResolution> arrayList, String str, String str2) {
        this.rtcVideoParamMode = i;
        this.rtcMixType = i2;
        this.rtcMixParam = rtcMixParam;
        this.videoResolutions = arrayList;
        this.rtcBusinessId = str;
        this.configId = str2;
    }
}
