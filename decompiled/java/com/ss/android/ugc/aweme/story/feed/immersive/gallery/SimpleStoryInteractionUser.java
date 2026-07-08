package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SimpleStoryInteractionUser {

    @C09CT("interaction")
    public final StoryInteraction storyInteraction;

    @C09CT("user_info")
    public final ViewerListSimpleUser user;

    public SimpleStoryInteractionUser() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleStoryInteractionUser)) {
            return false;
        }
        SimpleStoryInteractionUser simpleStoryInteractionUser = (SimpleStoryInteractionUser) obj;
        return Intrinsics.LJFF(this.user, simpleStoryInteractionUser.user) && Intrinsics.LJFF(this.storyInteraction, simpleStoryInteractionUser.storyInteraction);
    }

    public final int hashCode() {
        ViewerListSimpleUser viewerListSimpleUser = this.user;
        int iHashCode = (viewerListSimpleUser == null ? 0 : viewerListSimpleUser.hashCode()) * 31;
        StoryInteraction storyInteraction = this.storyInteraction;
        return iHashCode + (storyInteraction != null ? storyInteraction.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleStoryInteractionUser(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", storyInteraction=");
        sbLIZ.append(this.storyInteraction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SimpleStoryInteractionUser(ViewerListSimpleUser viewerListSimpleUser, StoryInteraction storyInteraction) {
        this.user = viewerListSimpleUser;
        this.storyInteraction = storyInteraction;
    }
}
