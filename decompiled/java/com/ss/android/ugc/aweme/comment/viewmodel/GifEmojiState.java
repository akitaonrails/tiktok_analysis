package com.ss.android.ugc.aweme.comment.viewmodel;

import X.C004I;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class GifEmojiState implements C004I {
    public static final int $stable = 8;
    public final GifEmoji gifEmoji;

    public final GifEmojiState copy(GifEmoji gifEmoji) {
        return new GifEmojiState(gifEmoji);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GifEmojiState) && Intrinsics.LJFF(this.gifEmoji, ((GifEmojiState) obj).gifEmoji);
    }

    public int hashCode() {
        return this.gifEmoji.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GifEmojiState(gifEmoji=");
        sbLIZ.append(this.gifEmoji);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GifEmojiState() {
        this(new GifEmoji());
    }

    public final GifEmoji getGifEmoji() {
        return this.gifEmoji;
    }

    public GifEmojiState(GifEmoji gifEmoji) {
        this.gifEmoji = gifEmoji;
    }
}
