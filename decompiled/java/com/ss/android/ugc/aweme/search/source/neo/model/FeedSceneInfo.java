package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FeedSceneInfo {

    @C09CT("act")
    public final Set<String> actSet;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_play_time")
    public final Long musicPlayTime;

    @C09CT("play_time")
    public final Long playTime;

    @C09CT("poi_id")
    public final String poiId;

    @C09CT("timestamp")
    public final Long timestamp;

    public FeedSceneInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSceneInfo)) {
            return false;
        }
        FeedSceneInfo feedSceneInfo = (FeedSceneInfo) obj;
        return Intrinsics.LJFF(this.timestamp, feedSceneInfo.timestamp) && Intrinsics.LJFF(this.awemeId, feedSceneInfo.awemeId) && Intrinsics.LJFF(this.playTime, feedSceneInfo.playTime) && Intrinsics.LJFF(this.musicPlayTime, feedSceneInfo.musicPlayTime) && Intrinsics.LJFF(this.musicId, feedSceneInfo.musicId) && Intrinsics.LJFF(this.effectId, feedSceneInfo.effectId) && Intrinsics.LJFF(this.poiId, feedSceneInfo.poiId) && Intrinsics.LJFF(this.actSet, feedSceneInfo.actSet);
    }

    public static FeedSceneInfo LIZ(FeedSceneInfo feedSceneInfo, Long l, Long l2, String str, String str2, Set set, int i) {
        Long l3;
        String str3;
        String str4 = str2;
        String str5 = str;
        Set set2 = set;
        Long l4 = l2;
        Long l5 = l;
        String str6 = null;
        if ((i & 1) != 0) {
            l3 = feedSceneInfo.timestamp;
        } else {
            l3 = null;
        }
        if ((i & 2) != 0) {
            str3 = feedSceneInfo.awemeId;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            l5 = feedSceneInfo.playTime;
        }
        if ((i & 8) != 0) {
            l4 = feedSceneInfo.musicPlayTime;
        }
        if ((i & 16) != 0) {
            str5 = feedSceneInfo.musicId;
        }
        if ((i & 32) != 0) {
            str4 = feedSceneInfo.effectId;
        }
        if ((i & 64) != 0) {
            str6 = feedSceneInfo.poiId;
        }
        if ((i & 128) != 0) {
            set2 = feedSceneInfo.actSet;
        }
        return new FeedSceneInfo(l3, str3, l5, l4, str5, str4, str6, set2);
    }

    public FeedSceneInfo(Long l, String str, Long l2, Long l3, String str2, String str3, String str4, Set<String> set) {
        this.timestamp = l;
        this.awemeId = str;
        this.playTime = l2;
        this.musicPlayTime = l3;
        this.musicId = str2;
        this.effectId = str3;
        this.poiId = str4;
        this.actSet = set;
    }

    public FeedSceneInfo(Long l, String str, Long l2, Long l3, String str2, String str3, String str4, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null, (i & 128) != 0 ? C08CX.INSTANCE : set);
    }
}
