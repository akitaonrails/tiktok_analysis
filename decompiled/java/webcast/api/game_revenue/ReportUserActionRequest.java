package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes29.dex */
public final class ReportUserActionRequest {

    @C09CT("data")
    public RequestData data;

    public static final class RequestData {

        @C09CT("action")
        public int action;

        @C09CT("room_id")
        public String roomId = "";

        @C09CT(Scene.SCENE_SERVICE)
        public int scene;
    }
}
