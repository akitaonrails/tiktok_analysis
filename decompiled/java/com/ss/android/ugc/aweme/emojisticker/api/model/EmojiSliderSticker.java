package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class EmojiSliderSticker implements Serializable {

    @C09CT("emoji_content")
    public final String emojiContent;

    @C09CT("percentage_value")
    public final int voteVal;

    public EmojiSliderSticker() {
        this("", 0);
    }

    public EmojiSliderSticker(String str, int i) {
        this.emojiContent = str;
        this.voteVal = i;
    }
}
