package com.ss.ugc.android.editor.base.music;

import com.ss.ugc.android.editor.base.data.MusicItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class IMusicFetcher$MusicCustomResponse {
    public final List<MusicItem> data;
    public final boolean hasMore;

    public IMusicFetcher$MusicCustomResponse(List<MusicItem> list, boolean z) {
        this.data = list;
        this.hasMore = z;
    }
}
