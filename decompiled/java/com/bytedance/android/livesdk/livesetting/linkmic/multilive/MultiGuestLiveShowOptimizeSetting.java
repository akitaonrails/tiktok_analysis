package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MultiGuestLiveShowOptimizeSetting {
    public static final TypeAdapter ADAPTER;

    @C09CT("anchor_enable_transition")
    public int anchorEnableTransition;

    @C09CT("countdown_label_animated")
    public int countdownLabelAnimated;

    @C09CT("guest_show_preview")
    public int guestShowPreview;

    static {
        NormalGson.singleton();
        ADAPTER = new MultiGuestLiveShowOptimizeSetting_OptTypeAdapter();
    }

    public MultiGuestLiveShowOptimizeSetting() {
        this(1, 1, 0);
    }

    public MultiGuestLiveShowOptimizeSetting(int i, int i2, int i3) {
        this.anchorEnableTransition = i;
        this.guestShowPreview = i2;
        this.countdownLabelAnimated = i3;
    }
}
