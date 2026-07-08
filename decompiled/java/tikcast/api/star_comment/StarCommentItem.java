package tikcast.api.star_comment;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentItem {

    @C09CT("force_insert")
    public boolean forceInsert;

    @C09CT("server_to_show_timestamp_ms")
    public long serverToShowTimestampMs;

    @C09CT("star_comment")
    public StarCommentMessage starComment;

    @C09CT("start_comment_status")
    public int startCommentStatus;

    @C09CT("coins")
    public String coins = "";

    @C09CT("room_user_count")
    public String roomUserCount = "";
}
