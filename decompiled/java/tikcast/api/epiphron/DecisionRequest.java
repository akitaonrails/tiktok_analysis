package tikcast.api.epiphron;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class DecisionRequest {

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("features")
    public Map<String, String> features = new LinkedHashMap();
}
