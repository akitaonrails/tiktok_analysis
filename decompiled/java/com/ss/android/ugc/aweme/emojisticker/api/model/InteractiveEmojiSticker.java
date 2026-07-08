package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class InteractiveEmojiSticker implements Serializable {

    @C09CT("emoji_content")
    public final String emojiContent;

    public InteractiveEmojiSticker() {
        this("");
    }

    public InteractiveEmojiSticker(String str) {
        this.emojiContent = str;
    }
}
