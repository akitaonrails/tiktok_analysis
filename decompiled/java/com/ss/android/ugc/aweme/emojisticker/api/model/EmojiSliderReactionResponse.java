package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EmojiSliderReactionResponse extends BaseResponse {

    @C09CT("emoji_slider_result")
    public final EmojiSliderReactionResult emojiSliderReactionResult;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmojiSliderReactionResponse) && Intrinsics.LJFF(this.emojiSliderReactionResult, ((EmojiSliderReactionResponse) obj).emojiSliderReactionResult);
    }

    public final int hashCode() {
        EmojiSliderReactionResult emojiSliderReactionResult = this.emojiSliderReactionResult;
        if (emojiSliderReactionResult == null) {
            return 0;
        }
        return emojiSliderReactionResult.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmojiSliderReactionResponse(emojiSliderReactionResult=");
        sbLIZ.append(this.emojiSliderReactionResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EmojiSliderReactionResponse(EmojiSliderReactionResult emojiSliderReactionResult) {
        this.emojiSliderReactionResult = emojiSliderReactionResult;
    }
}
