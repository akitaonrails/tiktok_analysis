package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class MusicCollection extends BaseResponse {

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("mc_list")
    public List<MusicCollectionItem> items;

    public List<MusicCollectionItem> getItems() {
        List<MusicCollectionItem> list = this.items;
        return (list == null || list.isEmpty()) ? this.items : MusicCollectionFilterKt.distinctByName(this.items);
    }

    public long getCursor() {
        return this.cursor;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setItems(List<MusicCollectionItem> list) {
        this.items = list;
    }
}
