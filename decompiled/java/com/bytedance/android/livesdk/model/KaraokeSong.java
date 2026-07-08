package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class KaraokeSong {

    @C09CT("accompaniment_info")
    public AccompanimentStruct accompanimentInfo;

    @C09CT("audio_info")
    public AudioStruct audioInfo;

    @C09CT("duration")
    public int duration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_added")
    public boolean isAdded;

    @C09CT("is_favorite")
    public boolean isFavorite;

    @C09CT("is_request")
    public boolean isRequest;

    @C09CT("is_you_sing_request")
    public boolean isYouSingRequest;

    @C09CT("lyric_info")
    public LyricStruct lyricInfo;

    @C09CT("postlude")
    public int postlude;

    @C09CT("prelude")
    public int prelude;

    @C09CT("singer")
    public User singer;

    @C09CT("song_status")
    public int songStatus;

    @C09CT("title")
    public String title = "";

    @C09CT("display_artist")
    public String displayArtist = "";

    @C09CT("album")
    public String album = "";

    @C09CT("cover_vid")
    public String coverVid = "";

    @C09CT("cover_urls")
    public List<String> coverUrls = new ArrayList();

    @C09CT("label_ids")
    public List<Long> labelIds = new ArrayList();
}
