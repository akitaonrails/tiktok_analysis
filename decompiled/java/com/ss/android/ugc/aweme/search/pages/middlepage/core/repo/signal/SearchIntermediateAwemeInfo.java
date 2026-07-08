package com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchIntermediateAwemeInfo {

    @C09CT("channel_id")
    public final String channelId;

    @C09CT("video_duration")
    public final Integer duration;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("browing_time_extra")
    public final long innerPlayTime;

    @C09CT("browing_time")
    public final long outerPlayTime;

    @C09CT("start_time")
    public final long startPlayTimestamp;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchIntermediateAwemeInfo)) {
            return false;
        }
        SearchIntermediateAwemeInfo searchIntermediateAwemeInfo = (SearchIntermediateAwemeInfo) obj;
        return Intrinsics.LJFF(this.groupId, searchIntermediateAwemeInfo.groupId) && Intrinsics.LJFF(this.channelId, searchIntermediateAwemeInfo.channelId) && this.startPlayTimestamp == searchIntermediateAwemeInfo.startPlayTimestamp && this.innerPlayTime == searchIntermediateAwemeInfo.innerPlayTime && this.outerPlayTime == searchIntermediateAwemeInfo.outerPlayTime && Intrinsics.LJFF(this.duration, searchIntermediateAwemeInfo.duration);
    }

    public SearchIntermediateAwemeInfo() {
        this("", "", 0L, 0L, 0L, 0);
    }

    public SearchIntermediateAwemeInfo(String str, String str2, long j, long j2, long j3, Integer num) {
        this.groupId = str;
        this.channelId = str2;
        this.startPlayTimestamp = j;
        this.innerPlayTime = j2;
        this.outerPlayTime = j3;
        this.duration = num;
    }
}
