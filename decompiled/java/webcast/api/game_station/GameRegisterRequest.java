package webcast.api.game_station;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes29.dex */
public final class GameRegisterRequest {

    @C09CT("enter_from")
    public int enterFrom;

    @C09CT("is_unregister")
    public boolean isUnregister;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("touch_point")
    public int touchPoint;

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("item_id")
    public String itemId = "";

    @C09CT("author_id")
    public String authorId = "";

    @C09CT("game_tag_id")
    public String gameTagId = "";

    @C09CT("promote_task_id")
    public String promoteTaskId = "";

    @C09CT("log_extra")
    public String logExtra = "";

    @C09CT("extra_params")
    public String extraParams = "";
}
