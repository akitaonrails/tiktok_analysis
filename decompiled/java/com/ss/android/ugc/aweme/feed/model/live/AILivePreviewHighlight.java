package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class AILivePreviewHighlight implements Serializable {

    @C09CT("create_timestamp")
    public long createTimestamp;

    @C09CT("expire_timestamp")
    public long expireTimestamp;
    public boolean isShowHighlight;

    @C09CT("video_info")
    public AILivePreviewHighlightVideoInfo videoInfo;

    @C09CT("video_type")
    public int videoType;

    @C09CT("fragment_id")
    public String fragmentId = "";

    @C09CT("highlight_url")
    public String highlightUrl = "";

    @C09CT("source_type")
    public String sourceType = "";

    @C09CT("result_key")
    public String resultKey = "";
}
