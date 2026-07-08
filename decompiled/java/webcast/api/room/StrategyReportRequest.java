package webcast.api.room;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class StrategyReportRequest {

    @C09CT("action_type")
    public int actionType;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("strategy_id")
    public String strategyId = "";

    @C09CT("style_type")
    public String styleType = "";
}
