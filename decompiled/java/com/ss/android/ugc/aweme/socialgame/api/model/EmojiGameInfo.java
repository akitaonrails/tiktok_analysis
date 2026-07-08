package com.ss.android.ugc.aweme.socialgame.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class EmojiGameInfo implements Serializable {

    @C09CT("emoji")
    public final String emoji;

    @C09CT("emoji_type")
    public final Integer emojiType;

    @C09CT("sticker_struct")
    public final StickerMatchStruct stickerStruct;

    public EmojiGameInfo() {
        this(0, null, null);
    }

    public EmojiGameInfo(Integer num, String str, StickerMatchStruct stickerMatchStruct) {
        this.emojiType = num;
        this.emoji = str;
        this.stickerStruct = stickerMatchStruct;
    }
}
