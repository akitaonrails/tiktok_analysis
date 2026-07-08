package webcast.api.partnership;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes29.dex */
public final class ReserveMatchV2Request {

    @C09CT("enter_entrance")
    public int enterEntrance;

    @C09CT("reserve_status")
    public int reserveStatus;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("match_id")
    public String matchId = "";

    @C09CT("official_anchor_uid")
    public String officialAnchorUid = "";

    @C09CT("live_event_id")
    public String liveEventId = "";
}
