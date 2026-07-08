package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CaptionVideoPlayerListModel implements Serializable {

    @C09CT("list")
    public final List<CaptionVideoPlayerItemModel> list;

    public CaptionVideoPlayerListModel() {
        this(null);
    }

    public CaptionVideoPlayerListModel(List<CaptionVideoPlayerItemModel> list) {
        this.list = list;
    }
}
