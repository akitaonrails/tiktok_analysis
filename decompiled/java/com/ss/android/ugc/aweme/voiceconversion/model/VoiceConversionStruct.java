package com.ss.android.ugc.aweme.voiceconversion.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class VoiceConversionStruct {

    @C09CT("creator_user_id")
    public final Long creatorUserId;

    @C09CT("creator_user_name")
    public final String creatorUserName;

    @C09CT("video_list_next_offset")
    public final Long cursor;

    @C09CT("description")
    public final String description;

    @C09CT("video_list_has_more")
    public Integer hasMore;

    @C09CT("icon_url")
    public final UrlStruct iconUrl;

    @C09CT("preview_audio_url")
    public final UrlStruct previewAudioUrl;

    @C09CT("should_show_creator_profile_entrance")
    public final boolean showCreatorProfile;

    @C09CT("total_video_count")
    public final Long videoCount;

    @C09CT("video_list")
    public List<Aweme> videoList;

    @C09CT("vc_filter_id")
    public final String voiceId;

    public VoiceConversionStruct() {
        this("", "", null, null, false, 0L, "", 0L, null, 0, 0L);
    }

    public VoiceConversionStruct(String str, String str2, UrlStruct urlStruct, UrlStruct urlStruct2, boolean z, Long l, String str3, Long l2, List<Aweme> list, Integer num, Long l3) {
        this.voiceId = str;
        this.description = str2;
        this.iconUrl = urlStruct;
        this.previewAudioUrl = urlStruct2;
        this.showCreatorProfile = z;
        this.creatorUserId = l;
        this.creatorUserName = str3;
        this.videoCount = l2;
        this.videoList = list;
        this.hasMore = num;
        this.cursor = l3;
    }
}
