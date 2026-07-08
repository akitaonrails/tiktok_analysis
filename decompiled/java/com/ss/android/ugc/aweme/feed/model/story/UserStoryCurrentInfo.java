package com.ss.android.ugc.aweme.feed.model.story;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class UserStoryCurrentInfo implements Serializable {
    public final Integer currentIndex;
    public final Aweme currentStory;
    public final int dispatchCode;

    public UserStoryCurrentInfo() {
        this(null, null, 0);
    }

    public final UserStoryCurrentInfo copy(Integer num, Aweme aweme, int i) {
        return new UserStoryCurrentInfo(num, aweme, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStoryCurrentInfo)) {
            return false;
        }
        UserStoryCurrentInfo userStoryCurrentInfo = (UserStoryCurrentInfo) obj;
        return Intrinsics.LJFF(this.currentIndex, userStoryCurrentInfo.currentIndex) && Intrinsics.LJFF(this.currentStory, userStoryCurrentInfo.currentStory) && this.dispatchCode == userStoryCurrentInfo.dispatchCode;
    }

    public int hashCode() {
        Integer num = this.currentIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Aweme aweme = this.currentStory;
        return ((iHashCode + (aweme != null ? aweme.hashCode() : 0)) * 31) + this.dispatchCode;
    }

    public UserStoryCurrentInfo(Integer num, Aweme aweme, int i) {
        this.currentIndex = num;
        this.currentStory = aweme;
        this.dispatchCode = i;
    }
}
