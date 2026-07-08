package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CommentFlaggedPrompt {

    @C09CT("action")
    public long action;

    @C09CT("comment_ids")
    public List<Long> commentIds = new ArrayList();

    @C09CT("show")
    public boolean show;

    @C09CT("trigger")
    public long trigger;

    @C09CT("trigger_for_new_user")
    public long triggerForNewUser;
}
