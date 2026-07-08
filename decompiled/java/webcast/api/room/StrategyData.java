package webcast.api.room;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class StrategyData {

    @C09CT("duration_ms")
    public long durationMs;

    @C09CT("global_frequency")
    public FrequencyGroup globalFrequency;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("show_mode")
    public ShowMode showMode;

    @C09CT("strategy_platform_config")
    public StrategyResource strategyPlatformConfig;

    @C09CT("action_type")
    public String actionType = "";

    @C09CT("trigger")
    public List<StrategyTrigger> trigger = new ArrayList();

    @C09CT("filter")
    public List<StrategyFilter> filter = new ArrayList();

    @C09CT("group_frequency")
    public Map<String, FrequencyGroup> groupFrequency = new LinkedHashMap();

    @C09CT("strategy_id")
    public String strategyId = "";

    @C09CT("global_frequency_group")
    public Map<String, FrequencyGroup> globalFrequencyGroup = new LinkedHashMap();
}
