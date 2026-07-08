package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class PathAnimationValue {
    public static final TypeAdapter ADAPTER;

    @C09CT("channel_name")
    public String channelName;

    @C09CT("end_fly_progress")
    public Float endFlyProgress;

    @C09CT("end_position")
    public String endPos;

    @C09CT("end_size")
    public Integer endSize;

    @C09CT("file_name")
    public String fileName;

    @C09CT("h")
    public int h;

    @C09CT("start_fly_progress")
    public Float startFlyProgress;

    @C09CT("start_position")
    public String startPos;

    @C09CT("total_duration")
    public Integer totalDuration;

    @C09CT("w")
    public int w;

    static {
        NormalGson.singleton();
        ADAPTER = new PathAnimationValue_OptTypeAdapter();
    }

    public PathAnimationValue() {
        this(null, null, 1, 1, null, null, null, null, null, null);
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.channelName);
        sbLIZ.append('/');
        sbLIZ.append(this.fileName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PathAnimationValue(String str, String str2, int i, int i2, String str3, String str4, Integer num, Float f, Float f2, Integer num2) {
        this.channelName = str;
        this.fileName = str2;
        this.w = i;
        this.h = i2;
        this.startPos = str3;
        this.endPos = str4;
        this.endSize = num;
        this.startFlyProgress = f;
        this.endFlyProgress = f2;
        this.totalDuration = num2;
    }
}
