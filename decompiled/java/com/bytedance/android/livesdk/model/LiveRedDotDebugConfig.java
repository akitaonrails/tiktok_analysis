package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveRedDotDebugConfig {

    @C09CT("change_color")
    public boolean changeColor;

    @C09CT("close_frequency")
    public boolean closeFrequency;

    @C09CT("close_new_user")
    public final List<String> closeNewUser;

    @C09CT("debug_priority")
    public final Map<String, Integer> debugPriority;

    @C09CT("debug_version_life_times")
    public final Map<String, Integer> debugVersionLifeTimes;

    public LiveRedDotDebugConfig() {
        this(false, false, new ArrayList(), new LinkedHashMap(), new LinkedHashMap());
    }

    public LiveRedDotDebugConfig(boolean z, boolean z2, List<String> list, Map<String, Integer> map, Map<String, Integer> map2) {
        this.changeColor = z;
        this.closeFrequency = z2;
        this.closeNewUser = list;
        this.debugPriority = map;
        this.debugVersionLifeTimes = map2;
    }
}
