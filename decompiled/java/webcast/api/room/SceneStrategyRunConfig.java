package webcast.api.room;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class SceneStrategyRunConfig {

    @C09CT("scene_type")
    public int sceneType;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("strategies")
    public List<BizStrategy> strategies = new ArrayList();
}
