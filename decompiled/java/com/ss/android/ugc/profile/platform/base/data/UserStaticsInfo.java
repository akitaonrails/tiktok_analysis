package com.ss.android.ugc.profile.platform.base.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class UserStaticsInfo implements Serializable {

    @C09CT("aweme_count")
    public Integer awemeCount;

    @C09CT("visible_videos_count")
    public Integer visibleVideosCount;

    public final Integer getAwemeCount() {
        return this.awemeCount;
    }

    public final Integer getVisibleVideosCount() {
        return this.visibleVideosCount;
    }

    public final void setAwemeCount(Integer num) {
        this.awemeCount = num;
    }

    public final void setVisibleVideosCount(Integer num) {
        this.visibleVideosCount = num;
    }
}
