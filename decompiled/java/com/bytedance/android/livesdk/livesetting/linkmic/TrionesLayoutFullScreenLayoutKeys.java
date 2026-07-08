package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "triones_layout_full_screen_layout_keys")
public final class TrionesLayoutFullScreenLayoutKeys {
    public static final ArrayList<String> DEFAULT;
    public static final TrionesLayoutFullScreenLayoutKeys INSTANCE = new TrionesLayoutFullScreenLayoutKeys();

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("full_screen");
        arrayList.add("full_screen_half");
        DEFAULT = arrayList;
    }
}
