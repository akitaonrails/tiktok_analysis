package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ElementDownAnimation implements Serializable {

    @C09CT("element_down_animation_type")
    public final int elementDownAnimationType;

    @C09CT("emoji")
    public final String emoji;

    @C09CT("sticker_url")
    public final String stickerUrl;

    public ElementDownAnimation() {
        this(0, null, null);
    }

    public ElementDownAnimation(int i, String str, String str2) {
        this.elementDownAnimationType = i;
        this.emoji = str;
        this.stickerUrl = str2;
    }
}
