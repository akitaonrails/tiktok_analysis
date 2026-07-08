package webcast.api.fans;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes29.dex */
public final class FansGetAnchorPageV3Request {

    @C09CT("rank_count")
    public long rankCount;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("specific_rank_type")
    public int specificRankType;

    @C09CT("with_rank")
    public boolean withRank;
}
