package com.ss.android.ugc.aweme.now;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class NowInteractionControl implements Serializable {

    @C09CT("blur_comment_action")
    public int blurCommentAction;

    @C09CT("blur_like_action")
    public int blurLikeAction;

    @C09CT("disable_comment")
    public boolean disableComment;

    @C09CT("disable_like")
    public boolean disableLike;

    @C09CT("disable_reaction")
    public boolean disableReaction;

    public NowInteractionControl() {
    }

    public NowInteractionControl(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.disableLike = z;
        this.disableComment = z2;
        this.disableReaction = z3;
        this.blurCommentAction = i;
        this.blurLikeAction = i2;
    }
}
