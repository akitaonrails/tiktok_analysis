package com.bytedance.android.livesdk.live.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePreviewCardMaskConfig implements Serializable {
    public static final TypeAdapter ADAPTER = new LivePreviewCardMaskConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_preview_card_mask_top_optimized")
    public boolean topOptimized;

    @C09CT("live_preview_card_bottom_mask_height")
    public int bottomMaskHeight = -1;

    @C09CT("live_preview_card_bottom_mask_alpha")
    public int bottomMaskAlpha = 50;

    public final int getBottomMaskAlpha() {
        return this.bottomMaskAlpha;
    }

    public final int getBottomMaskHeight() {
        return this.bottomMaskHeight;
    }

    public final boolean getTopOptimized() {
        return this.topOptimized;
    }

    public final void setBottomMaskAlpha(int i) {
        this.bottomMaskAlpha = i;
    }

    public final void setBottomMaskHeight(int i) {
        this.bottomMaskHeight = i;
    }

    public final void setTopOptimized(boolean z) {
        this.topOptimized = z;
    }
}
