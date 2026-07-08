package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class InteractiveEmojiReactionResponse extends BaseResponse {

    @C09CT("interactive_emoji_result")
    public final InteractiveEmojiReactionResult interactiveEmojiReactionResult;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InteractiveEmojiReactionResponse) && Intrinsics.LJFF(this.interactiveEmojiReactionResult, ((InteractiveEmojiReactionResponse) obj).interactiveEmojiReactionResult);
    }

    public final int hashCode() {
        InteractiveEmojiReactionResult interactiveEmojiReactionResult = this.interactiveEmojiReactionResult;
        if (interactiveEmojiReactionResult == null) {
            return 0;
        }
        return interactiveEmojiReactionResult.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractiveEmojiReactionResponse(interactiveEmojiReactionResult=");
        sbLIZ.append(this.interactiveEmojiReactionResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InteractiveEmojiReactionResponse(InteractiveEmojiReactionResult interactiveEmojiReactionResult) {
        this.interactiveEmojiReactionResult = interactiveEmojiReactionResult;
    }
}
