package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GameLiveFragmentDraft {

    @C09CT("fragment_detail")
    public GameLiveFragment fragmentDetail;

    @C09CT("video_duration")
    public long videoDuration;

    @C09CT("video_size")
    public long videoSize;

    @C09CT("draft_id_str")
    public String draftIdStr = "";

    @C09CT("draft_json")
    public String draftJson = "";

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("fragment_id_str")
    public String fragmentIdStr = "";

    @C09CT("title")
    public String title = "";

    @C09CT("mid_str")
    public List<String> midStr = new ArrayList();

    @C09CT("play_url_map")
    public Map<String, MusicPlayUrl> playUrlMap = new LinkedHashMap();

    @C09CT("last_update_timestamp")
    public String lastUpdateTimestamp = "";

    @C09CT("room_replay_cover_url")
    public String roomReplayCoverUrl = "";

    @C09CT("draft_cover_url")
    public String draftCoverUrl = "";
}
