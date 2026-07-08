package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveCoHostLayoutIdConfig {
    public static final TypeAdapter ADAPTER = new LiveCoHostLayoutIdConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("auto_rematch")
    public String autoRematch;

    @C09CT("auto_rematch_expand")
    public String autoRematchExpand;

    @C09CT("cohost_with_guests")
    public String cohostWithGuest;

    @C09CT("normal")
    public String normal;

    @C09CT("normal_crop")
    public String normalCrop;

    @C09CT("normal_expand")
    public String normalExpand;

    @C09CT("normal_expand_crop")
    public String normalExpandCrop;

    @C09CT("other_anchor_zoomed")
    public String otherAnchorZoomed;

    @C09CT("other_anchor_zoomed_v2")
    public String otherAnchorZoomed_v2;

    @C09CT("screen_share_config")
    public LiveCoHostScreenShareLayoutIdConfig screenShareConfig;

    @C09CT("self_anchor_zoomed")
    public String selfAnchorZoomed;

    @C09CT("self_anchor_zoomed_v2")
    public String selfAnchorZoomed_v2;

    public LiveCoHostLayoutIdConfig() {
        this("2001", "200101", "2002", "200201", "2010", "2011", "2101", "2102", "2103", "2104", "2200", new LiveCoHostScreenShareLayoutIdConfig(null, null, 3, null));
    }

    public LiveCoHostLayoutIdConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, LiveCoHostScreenShareLayoutIdConfig liveCoHostScreenShareLayoutIdConfig) {
        this.normal = str;
        this.normalCrop = str2;
        this.normalExpand = str3;
        this.normalExpandCrop = str4;
        this.autoRematch = str5;
        this.autoRematchExpand = str6;
        this.otherAnchorZoomed = str7;
        this.selfAnchorZoomed = str8;
        this.otherAnchorZoomed_v2 = str9;
        this.selfAnchorZoomed_v2 = str10;
        this.cohostWithGuest = str11;
        this.screenShareConfig = liveCoHostScreenShareLayoutIdConfig;
    }
}
