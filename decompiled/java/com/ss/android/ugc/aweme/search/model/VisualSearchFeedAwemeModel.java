package com.ss.android.ugc.aweme.search.model;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class VisualSearchFeedAwemeModel implements Serializable {
    public final String authorId;
    public final Aweme aweme;
    public final String awemeId;
    public final String fromGroupContext;
    public final Boolean isExpandedToEcomCartVideo;

    public VisualSearchFeedAwemeModel() {
        this("", "", null, null, null);
    }

    public final Boolean isExpandedToEcomCartVideo() {
        return this.isExpandedToEcomCartVideo;
    }

    public VisualSearchFeedAwemeModel(String str, String str2, String str3, Aweme aweme, Boolean bool) {
        this.awemeId = str;
        this.authorId = str2;
        this.fromGroupContext = str3;
        this.aweme = aweme;
        this.isExpandedToEcomCartVideo = bool;
    }
}
