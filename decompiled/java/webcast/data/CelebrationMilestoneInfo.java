package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;

/* JADX INFO: loaded from: classes.dex */
public final class CelebrationMilestoneInfo {

    @C09CT("emote")
    public EmoteModel emote;

    @C09CT("post")
    public CelebrationPost post;

    @C09CT("star_comment")
    public CelebrationStarComment starComment;

    @C09CT("milestone_id")
    public String milestoneId = "";

    @C09CT("celebration_title")
    public String celebrationTitle = "";
}
