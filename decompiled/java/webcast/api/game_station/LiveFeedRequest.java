package webcast.api.game_station;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class LiveFeedRequest {

    @C09CT("live_tab_type")
    public int liveTabType;

    @C09CT("pull_type")
    public int pullType;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("game_tag_id")
    public String gameTagId = "";

    @C09CT("author_id")
    public String authorId = "";

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("req_from")
    public String reqFrom = "";
}
