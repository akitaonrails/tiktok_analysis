package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class GetTimerSubscriberListRequest {

    @C09CT("cursor")
    public long cursor;

    @C09CT("for_anchor")
    public boolean forAnchor;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("size")
    public long size;

    @C09CT("timer_id")
    public long timerId;
}
