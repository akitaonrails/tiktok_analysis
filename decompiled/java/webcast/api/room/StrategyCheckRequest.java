package webcast.api.room;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class StrategyCheckRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("trigger_delay")
    public long triggerDelay;

    @C09CT("trigger_type")
    public int triggerType;

    @C09CT("watch_duration")
    public long watchDuration;

    @C09CT("action_type")
    public String actionType = "";

    @C09CT("enter_from_merge")
    public String enterFromMerge = "";

    @C09CT("trigger_id")
    public String triggerId = "";

    @C09CT("strategy_id")
    public String strategyId = "";

    @C09CT("check_params")
    public String checkParams = "";
}
