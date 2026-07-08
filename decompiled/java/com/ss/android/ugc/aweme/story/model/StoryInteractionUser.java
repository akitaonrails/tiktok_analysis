package com.ss.android.ugc.aweme.story.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryInteractionUser implements Serializable {
    public static final int $stable = 8;

    @C09CT("interaction")
    public final StoryInteraction storyInteraction;

    @C09CT("user_info")
    public final User user;

    public final StoryInteractionUser copy(User user, StoryInteraction storyInteraction) {
        return new StoryInteractionUser(user, storyInteraction);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryInteractionUser(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", storyInteraction=");
        sbLIZ.append(this.storyInteraction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        StoryInteractionUser storyInteractionUser;
        String uid;
        String uid2 = null;
        if (obj instanceof StoryInteractionUser) {
            storyInteractionUser = (StoryInteractionUser) obj;
        } else {
            storyInteractionUser = null;
        }
        if (storyInteractionUser == null) {
            return false;
        }
        User user = this.user;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        User user2 = storyInteractionUser.user;
        if (user2 != null) {
            uid2 = user2.getUid();
        }
        if (!Intrinsics.LJFF(uid, uid2) || !Intrinsics.LJFF(this.storyInteraction, storyInteractionUser.storyInteraction)) {
            return false;
        }
        return true;
    }

    public StoryInteractionUser(User user, StoryInteraction storyInteraction) {
        this.user = user;
        this.storyInteraction = storyInteraction;
    }
}
