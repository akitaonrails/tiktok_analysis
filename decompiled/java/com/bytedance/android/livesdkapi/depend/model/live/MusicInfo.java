package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class MusicInfo {

    @C09CT("cover_hd_url")
    public MusicUrlStruct coverHdUrl;

    @C09CT("cover_large_url")
    public MusicUrlStruct coverLargeUrl;

    @C09CT("cover_medium_url")
    public MusicUrlStruct coverMediumUrl;

    @C09CT("cover_thumb_url")
    public MusicUrlStruct coverThumbUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("song_id")
    public long songId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("title")
    public String title = "";
}
