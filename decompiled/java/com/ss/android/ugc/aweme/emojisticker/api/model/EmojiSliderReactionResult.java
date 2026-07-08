package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class EmojiSliderReactionResult {

    @C09CT("emoji_slider_result_entry")
    public final List<EmojiSliderResultEntry> emojiSliderResultList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final long nextCursor;

    public EmojiSliderReactionResult() {
        this(false, 0L, null);
    }

    public EmojiSliderReactionResult(boolean z, long j, List<EmojiSliderResultEntry> list) {
        this.hasMore = z;
        this.nextCursor = j;
        this.emojiSliderResultList = list;
    }
}
