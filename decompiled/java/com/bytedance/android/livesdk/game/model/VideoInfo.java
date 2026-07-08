package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class VideoInfo {

    @C09CT("duration_ts")
    public int durationTs;

    @C09CT("height")
    public int height;

    @C09CT("play_addr")
    public UrlInfo playAddr;

    @C09CT("video_cover")
    public UrlInfo videoCover;

    @C09CT("width")
    public int width;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("desc")
    public String desc = "";
}
