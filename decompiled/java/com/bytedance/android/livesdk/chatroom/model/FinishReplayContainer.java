package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class FinishReplayContainer {

    @C09CT("available")
    public boolean available;

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("duration")
    public long duration;

    @C09CT("first_time")
    public boolean firstTime;

    @C09CT("more_replay")
    public boolean moreReplay;

    @C09CT("punish_type")
    public long punishType;

    @C09CT("remux_status")
    public int remuxStatus;

    @C09CT("replay")
    public boolean replay;

    @C09CT("replay_prompt")
    public int replayPrompt;

    @C09CT("show_replay")
    public boolean showReplay;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("video_info")
    public FinishVideoInfo videoInfo;

    @C09CT("watch_status")
    public int watchStatus;

    @C09CT("replay_id")
    public String replayId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("play_url")
    public String playUrl = "";

    @C09CT("m3u8_url")
    public String m3u8Url = "";
}
