package tikcast.api.star_comment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentEvent {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("event_time_ms")
    public long eventTimeMs;

    @C09CT("order_ids")
    public List<Long> orderIds = new ArrayList();

    @C09CT("room_id")
    public long roomId;

    @C09CT("star_comment_duration")
    public int starCommentDuration;

    @C09CT("star_comment_option")
    public int starCommentOption;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_shown_count")
    public long userShownCount;
}
