package tikcast.api.anchor_data;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes13.dex */
public final class GetRealtimeLiveCenterOverviewRequest {

    @C09CT("need_detail")
    public int needDetail;

    @C09CT("need_layout")
    public int needLayout;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("white_box_suggestion_id")
    public String whiteBoxSuggestionId = "";

    @C09CT("tips_suggestion_id")
    public String tipsSuggestionId = "";
}
