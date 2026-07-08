package com.ss.android.ugc.aweme.property;

import X.C09CT;
import X.C13BV;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class SmartExtendMusicConfigModel {

    @C09CT("clip_min_length")
    public final long clipMinLength;

    @C09CT(alternate = {"recommend_by_video_content_type_allow_list"}, value = "content_type_allow_list")
    public final List<String> contentTypeAllowList;

    @C09CT("fade_in_fade_out_length")
    public final long fadeInFadeOutLength;

    @C09CT(alternate = {"recommend_by_video_shoot_way_not_allow_list"}, value = "shoot_way_block_list")
    public final List<String> shootWayBlockList;

    @C09CT("video_max_length")
    public final long videoMaxLength;

    @C09CT("video_min_length")
    public final long videoMinLength;

    public SmartExtendMusicConfigModel() {
        this(0L, 0L, 0L, 0L, null, null, 63, null);
    }

    public SmartExtendMusicConfigModel(long j, long j2, long j3, long j4, List<String> list, List<String> list2) {
        this.fadeInFadeOutLength = j;
        this.clipMinLength = j2;
        this.videoMinLength = j3;
        this.videoMaxLength = j4;
        this.shootWayBlockList = list;
        this.contentTypeAllowList = list2;
    }

    public SmartExtendMusicConfigModel(long j, long j2, long j3, long j4, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1000L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 61000L : j3, (i & 8) != 0 ? 600001L : j4, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) != 0 ? Collections.singletonList("video") : list2);
    }
}
