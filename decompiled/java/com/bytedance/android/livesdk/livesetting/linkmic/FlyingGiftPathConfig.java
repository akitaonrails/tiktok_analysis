package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FlyingGiftPathConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("config_id")
    public Long configId;

    @C09CT("end_x")
    public Float endX;

    @C09CT("end_y")
    public Float endY;

    @C09CT("pos_x")
    public Float posX;

    @C09CT("pos_y")
    public Float posY;

    @C09CT("range_l")
    public Integer rangeL;

    @C09CT("range_r")
    public Integer rangeR;

    @C09CT("start_x")
    public Float startX;

    @C09CT("start_y")
    public Float startY;

    static {
        NormalGson.singleton();
        ADAPTER = new FlyingGiftPathConfig_OptTypeAdapter();
    }

    public FlyingGiftPathConfig() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public FlyingGiftPathConfig(Long l, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Integer num, Integer num2) {
        this.configId = l;
        this.startX = f;
        this.startY = f2;
        this.endX = f3;
        this.endY = f4;
        this.posX = f5;
        this.posY = f6;
        this.rangeL = num;
        this.rangeR = num2;
    }
}
