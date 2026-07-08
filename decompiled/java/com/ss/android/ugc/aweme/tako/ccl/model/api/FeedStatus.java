package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedStatus {

    @C09CT("aweme_info")
    public final Map<String, AwemeInfo> awemeInfo;

    @C09CT("config")
    public final FeedConfig config;

    @C09CT("current_aweme_id")
    public final String currentAwemeId;

    @C09CT("current_playback_time")
    public final Long currentPlaybackTime;

    @C09CT("queue_list")
    public final List<String> queueList;

    public FeedStatus() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedStatus)) {
            return false;
        }
        FeedStatus feedStatus = (FeedStatus) obj;
        return Intrinsics.LJFF(this.currentAwemeId, feedStatus.currentAwemeId) && Intrinsics.LJFF(this.queueList, feedStatus.queueList) && Intrinsics.LJFF(this.awemeInfo, feedStatus.awemeInfo) && Intrinsics.LJFF(this.config, feedStatus.config) && Intrinsics.LJFF(this.currentPlaybackTime, feedStatus.currentPlaybackTime);
    }

    public final int hashCode() {
        String str = this.currentAwemeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.queueList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, AwemeInfo> map = this.awemeInfo;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        FeedConfig feedConfig = this.config;
        int iHashCode4 = (iHashCode3 + (feedConfig == null ? 0 : feedConfig.hashCode())) * 31;
        Long l = this.currentPlaybackTime;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedStatus(currentAwemeId=");
        sbLIZ.append(this.currentAwemeId);
        sbLIZ.append(", queueList=");
        sbLIZ.append(this.queueList);
        sbLIZ.append(", awemeInfo=");
        sbLIZ.append(this.awemeInfo);
        sbLIZ.append(", config=");
        sbLIZ.append(this.config);
        sbLIZ.append(", currentPlaybackTime=");
        sbLIZ.append(this.currentPlaybackTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedStatus(String str, List<String> list, Map<String, AwemeInfo> map, FeedConfig feedConfig, Long l) {
        this.currentAwemeId = str;
        this.queueList = list;
        this.awemeInfo = map;
        this.config = feedConfig;
        this.currentPlaybackTime = l;
    }
}
