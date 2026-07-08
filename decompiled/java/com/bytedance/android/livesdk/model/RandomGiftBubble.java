package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class RandomGiftBubble {

    @C09CT("display_text")
    public String bubbleDisplayText;

    @C09CT("icon_dynamic_effect")
    public ImageModel image;

    public RandomGiftBubble() {
        this(null, null);
    }

    public RandomGiftBubble(String str, ImageModel imageModel) {
        this.bubbleDisplayText = str;
        this.image = imageModel;
    }
}
