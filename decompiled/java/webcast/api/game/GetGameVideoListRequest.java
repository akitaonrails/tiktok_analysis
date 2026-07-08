package webcast.api.game;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class GetGameVideoListRequest {

    @C09CT("pull_type")
    public int pullType;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("video_id")
    public String videoId = "";

    @C09CT("author_id")
    public String authorId = "";

    @C09CT("game_tag_id")
    public String gameTagId = "";
}
