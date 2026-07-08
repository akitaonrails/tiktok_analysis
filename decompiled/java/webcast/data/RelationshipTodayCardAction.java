package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.replay.proto.PostedVideo;

/* JADX INFO: loaded from: classes.dex */
public final class RelationshipTodayCardAction {

    @C09CT("action_icon")
    public ImageModel actionIcon;

    @C09CT("highlight_video")
    public PostedVideo highlightVideo;

    @C09CT("star_comment_prefill_content")
    public CelebrationStarComment starCommentPrefillContent;

    @C09CT("upgrade")
    public CelebrationUpgrade upgrade;

    @C09CT("video_post_prefill_content")
    public CelebrationPost videoPostPrefillContent;

    @C09CT("message_id")
    public String messageId = "";

    @C09CT("action_title")
    public String actionTitle = "";

    @C09CT("button_text")
    public String buttonText = "";

    @C09CT("button_type")
    public String buttonType = "";

    @C09CT("highlight_im_content")
    public String highlightImContent = "";

    @C09CT("link")
    public String link = "";
}
