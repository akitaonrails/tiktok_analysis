package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class TrayShowConfig {

    @C09CT("animation_duration")
    public List<Integer> animationDuration;
    public static final transient TrayShowConfig LIZ = new TrayShowConfig(null, 1, null);
    public static final TypeAdapter ADAPTER = new TrayShowConfig_OptTypeAdapter(NormalGson.singleton());

    public TrayShowConfig() {
        this(null, 1, null);
    }

    public TrayShowConfig(List<Integer> list) {
        this.animationDuration = list;
    }

    public TrayShowConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
