package com.ss.android.ugc.aweme.favorites.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class StickerList {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("sticker_list")
    public List<NewFaceStickerBean> items;

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    public final boolean LIZ() {
        return this.hasMore == 1;
    }

    public final void LIZIZ(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
