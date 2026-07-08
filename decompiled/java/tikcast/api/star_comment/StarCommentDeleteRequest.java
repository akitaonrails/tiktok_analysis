package tikcast.api.star_comment;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentDeleteRequest {

    @C09CT("client_cur_msg_start_time_ms")
    public long clientCurMsgStartTimeMs;

    @C09CT("current_version")
    public int currentVersion;

    @C09CT("need_ban")
    public boolean needBan;

    @C09CT("role")
    public int role;

    @C09CT("star_comment_msg_id")
    public String starCommentMsgId = "";

    @C09CT("room_id")
    public String roomId = "";
}
