package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ViewerPicksInfo {

    @C09CT("anchor_param")
    public ViewerPickAnchorParam anchorParam;

    @C09CT("display_mode")
    public int displayMode;

    @C09CT("enable_auto_restart")
    public boolean enableAutoRestart;

    @C09CT("end_time_ms")
    public long endTimeMs;

    @C09CT("extra")
    public ProfileExtra extra;

    @C09CT("has_duration")
    public boolean hasDuration;

    @C09CT("has_score")
    public boolean hasScore;

    @C09CT("header_image")
    public ViewerPicksHeaderImage headerImage;

    @C09CT("round_duration_sec")
    public long roundDurationSec;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("start_time_ms")
    public long startTimeMs;

    @C09CT("started_from_auto_restart")
    public boolean startedFromAutoRestart;

    @C09CT("started_from_auto_start")
    public boolean startedFromAutoStart;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("viewer_picks_id")
    public long viewerPicksId;

    @C09CT("gift_pick_list")
    public List<GiftPickWithScore> giftPickList = new ArrayList();

    @C09CT("viewer_picks_id_str")
    public String viewerPicksIdStr = "";
}
