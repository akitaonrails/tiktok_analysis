package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class TrayDismissConfig {

    @C09CT("animation_duration")
    public List<Integer> _animationDuration;
    public static final transient TrayDismissConfig LIZ = new TrayDismissConfig(null, 1, null);
    public static final TypeAdapter ADAPTER = new TrayDismissConfig_OptTypeAdapter(NormalGson.singleton());

    public TrayDismissConfig() {
        this(null, 1, null);
    }

    public TrayDismissConfig(List<Integer> list) {
        this._animationDuration = list;
    }

    public TrayDismissConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
