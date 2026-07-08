package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class CrossScreenDurationParams {
    public static final TypeAdapter ADAPTER = new CrossScreenDurationParams_OptTypeAdapter(NormalGson.singleton());

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public long f31default;

    @C09CT("duration_info_list")
    public List<DurationInfo> durationInfoList;

    public CrossScreenDurationParams() {
        this(0L, null, 3, null);
    }

    public CrossScreenDurationParams(long j, List<DurationInfo> list) {
        this.f31default = j;
        this.durationInfoList = list;
    }

    public CrossScreenDurationParams(long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
