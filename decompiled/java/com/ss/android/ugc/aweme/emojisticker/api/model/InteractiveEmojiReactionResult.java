package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class InteractiveEmojiReactionResult implements Serializable {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("interactive_emoji_result_entry")
    public final List<InteractiveEmojiResult> interactiveEmojiResultList;

    @C09CT("next_cursor")
    public final long nextCursor;

    public InteractiveEmojiReactionResult() {
        this(false, 0L, null);
    }

    public InteractiveEmojiReactionResult(boolean z, long j, List<InteractiveEmojiResult> list) {
        this.hasMore = z;
        this.nextCursor = j;
        this.interactiveEmojiResultList = list;
    }
}
