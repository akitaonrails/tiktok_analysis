package webcast.api.ranklist;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class LeagueMatchRankRequestParams {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("track")
    public int track;
}
