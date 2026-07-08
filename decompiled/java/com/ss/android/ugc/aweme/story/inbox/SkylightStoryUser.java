package com.ss.android.ugc.aweme.story.inbox;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SkylightStoryUser implements Serializable {
    public static final int $stable = 8;

    @C09CT("all_viewed")
    public final Boolean allViewed;

    @C09CT("relation_type")
    public final Integer relationType;

    @C09CT("all_unviewed_story_ids")
    public final List<String> unViewedStoryIds;

    @C09CT("user_id")
    public final Long userId;

    public SkylightStoryUser() {
        this(0L, Boolean.FALSE, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightStoryUser)) {
            return false;
        }
        SkylightStoryUser skylightStoryUser = (SkylightStoryUser) obj;
        return Intrinsics.LJFF(this.userId, skylightStoryUser.userId) && Intrinsics.LJFF(this.allViewed, skylightStoryUser.allViewed) && Intrinsics.LJFF(this.unViewedStoryIds, skylightStoryUser.unViewedStoryIds) && Intrinsics.LJFF(this.relationType, skylightStoryUser.relationType);
    }

    public SkylightStoryUser(Long l, Boolean bool, List<String> list, Integer num) {
        this.userId = l;
        this.allViewed = bool;
        this.unViewedStoryIds = list;
        this.relationType = num;
    }
}
