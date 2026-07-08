package webcast.api.game_station;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailVideosRequest {

    @C09CT("pull_score")
    public long pullScore;

    @C09CT("pull_type")
    public int pullType;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("video_tab_type")
    public int videoTabType;

    @C09CT("item_id")
    public String itemId = "";

    @C09CT("author_id")
    public String authorId = "";

    @C09CT("game_tag_id")
    public String gameTagId = "";

    @C09CT("video_tab_id")
    public String videoTabId = "";

    @C09CT("recall_rule_id")
    public String recallRuleId = "";

    @C09CT("recall_hashtag_id")
    public String recallHashtagId = "";

    @C09CT("game_id")
    public String gameId = "";
}
