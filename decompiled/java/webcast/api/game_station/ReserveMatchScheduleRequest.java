package webcast.api.game_station;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class ReserveMatchScheduleRequest {

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("match_id")
    public String matchId = "";

    @C09CT("official_anchor_uid")
    public String officialAnchorUid = "";

    @C09CT("live_event_id")
    public String liveEventId = "";
}
