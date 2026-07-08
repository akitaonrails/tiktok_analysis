package webcast.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AILivePreviewHighlight {
    public boolean LIZ;

    @C09CT("create_timestamp")
    public long createTimestamp;

    @C09CT("expire_timestamp")
    public long expireTimestamp;

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
