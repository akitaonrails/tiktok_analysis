package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StickerBean implements Serializable {
    public static final int $stable = 8;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("next_cursor")
    public int nextCursor;

    @C09CT("sticker_source")
    public int source;

    @C09CT("sticker_list")
    public List<GifEmoji> stickerList;

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public final int getSource() {
        return this.source;
    }

    public final List<GifEmoji> getStickerList() {
        return this.stickerList;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setNextCursor(int i) {
        this.nextCursor = i;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setStickerList(List<GifEmoji> list) {
        this.stickerList = list;
    }
}
