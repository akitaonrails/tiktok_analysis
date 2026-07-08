package com.bytedance.android.livesdk.livesetting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveInteractionMaskConfig {
    public static final TypeAdapter ADAPTER = new LiveInteractionMaskConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("mask_show_after_first_frame")
    public boolean maskShowAfterFirstFrame;

    @C09CT("preview_card_enter_mask_sync")
    public boolean previewCardEnterMaskSync;

    @C09CT("respect_clear_screen_anim")
    public boolean respectClearScreenAnim;

    @C09CT("top_mask_height")
    public int topMaskHeight;

    public LiveInteractionMaskConfig() {
        this(false, false, false, 140);
    }

    public LiveInteractionMaskConfig(boolean z, boolean z2, boolean z3, int i) {
        this.respectClearScreenAnim = z;
        this.previewCardEnterMaskSync = z2;
        this.maskShowAfterFirstFrame = z3;
        this.topMaskHeight = i;
    }
}
