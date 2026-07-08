package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdStickerData implements Serializable {

    @C09CT("angle")
    public final float angle;

    @C09CT("enable_show_interval")
    public final boolean enableShowInterval;

    @C09CT("gecko_channel")
    public final List<String> geckoChannel;

    @C09CT("height")
    public final float height;

    @C09CT("position_x")
    public final float positionX;

    @C09CT("position_y")
    public final float positionY;

    @C09CT("show_seconds")
    public final int showSeconds;

    @C09CT("start_show_time")
    public final float startShowTime;

    @C09CT("sticker_data")
    public final String stickerData;

    @C09CT("sticker_url")
    public final String stickerUrl;

    @C09CT("stop_show_time")
    public final float stopShowTime;

    @C09CT("width")
    public final float width;

    public AdStickerData() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0, 0.0f, 0.0f, null, null, null);
    }

    public AdStickerData(float f, float f2, float f3, float f4, float f5, boolean z, int i, float f6, float f7, String str, List<String> list, String str2) {
        this.positionX = f;
        this.positionY = f2;
        this.height = f3;
        this.width = f4;
        this.angle = f5;
        this.enableShowInterval = z;
        this.showSeconds = i;
        this.startShowTime = f6;
        this.stopShowTime = f7;
        this.stickerUrl = str;
        this.geckoChannel = list;
        this.stickerData = str2;
    }
}
