package com.ss.android.ugc.aweme.story.api;

import X.C09CT;
import java.util.Set;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightStoryNegativeFeedbackInfo {
    public final transient Set<String> LIZ;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("follow_status")
    public final int followStatus;

    @C09CT("user_actual_play_count")
    public int playCount;

    @C09CT("read_status")
    public final int readStatus;

    @C09CT("select_method_list")
    public final Set<Integer> selectedMethodList;

    @C09CT("user_actual_watch_time")
    public int watchTimeInMills;

    public SkylightStoryNegativeFeedbackInfo(String str, int i, int i2, Set<Integer> set, int i3, int i4, Set<String> set2) {
        this.authorId = str;
        this.followStatus = i;
        this.readStatus = i2;
        this.selectedMethodList = set;
        this.watchTimeInMills = i3;
        this.playCount = i4;
        this.LIZ = set2;
    }
}
