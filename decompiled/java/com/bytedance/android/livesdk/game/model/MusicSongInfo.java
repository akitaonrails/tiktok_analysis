package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes13.dex */
public final class MusicSongInfo {

    @C09CT("duration")
    public int duration;

    @C09CT("is_favourite")
    public boolean isFavourite;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("title")
    public String title = "";

    @C09CT("author")
    public String author = "";

    @C09CT("preview_url")
    public String previewUrl = "";

    @C09CT("cover_url")
    public String coverUrl = "";
}
