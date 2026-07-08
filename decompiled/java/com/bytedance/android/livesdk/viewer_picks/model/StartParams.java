package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StartParams {

    @C09CT("auto_start")
    public boolean autoStart;

    @C09CT("display_mode")
    public int displayMode;

    @C09CT("enable_auto_restart")
    public boolean enableAutoRestart;

    @C09CT("gift_pick_list")
    public List<GiftPick> giftPickList = new ArrayList();

    @C09CT("has_score")
    public boolean hasScore;

    @C09CT("room_id")
    public long roomId;

    @C09CT("round_duration_sec")
    public long roundDurationSec;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("started_from_auto_restart")
    public boolean startedFromAutoRestart;

    public static final class GiftPick {

        @C09CT("customized_desc")
        public String customizedDesc = "";

        @C09CT("gift_id")
        public long giftId;
    }
}
