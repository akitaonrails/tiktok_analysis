package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CommentSendReq {

    @C09CT("comment_type")
    public int commentType;

    @C09CT("post_id")
    public long postId;

    @C09CT("reply_to_comment_id")
    public long replyToCommentId;

    @C09CT("reply_to_reply_id")
    public long replyToReplyId;

    @C09CT("reply_to_user_id")
    public long replyToUserId;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("text")
    public String text = "";

    @C09CT("emote_list")
    public List<EmoteIDWithIndex> emoteList = new ArrayList();

    @C09CT("at_list")
    public List<AtWithIndex> atList = new ArrayList();
}
