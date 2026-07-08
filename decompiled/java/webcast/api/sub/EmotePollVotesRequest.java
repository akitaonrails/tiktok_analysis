package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class EmotePollVotesRequest {

    @C09CT("limit")
    public long limit;

    @C09CT("offset")
    public long offset;

    @C09CT("option_idx")
    public long optionIdx;

    @C09CT("poll_id")
    public long pollId;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";
}
