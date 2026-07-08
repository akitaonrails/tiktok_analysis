package com.ss.android.ugc.aweme.ttsvoice.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class TTSVoiceStruct {

    @C09CT("creator_user_id")
    public final String creatorUserId;

    @C09CT("creator_user_name")
    public final String creatorUserName;

    @C09CT("video_list_next_offset")
    public final Integer cursor;

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
    public final Integer videoCount;

    @C09CT("video_list")
    public List<Aweme> videoList;

    @C09CT("tts_voice_id")
    public final String voiceId;

    public TTSVoiceStruct() {
        this("", "", null, null, 0, null, 0, 0, "", "", false);
    }

    public TTSVoiceStruct(String str, String str2, UrlStruct urlStruct, UrlStruct urlStruct2, Integer num, List<Aweme> list, Integer num2, Integer num3, String str3, String str4, boolean z) {
        this.voiceId = str;
        this.description = str2;
        this.iconUrl = urlStruct;
        this.previewAudioUrl = urlStruct2;
        this.videoCount = num;
        this.videoList = list;
        this.hasMore = num2;
        this.cursor = num3;
        this.creatorUserId = str3;
        this.creatorUserName = str4;
        this.showCreatorProfile = z;
    }
}
