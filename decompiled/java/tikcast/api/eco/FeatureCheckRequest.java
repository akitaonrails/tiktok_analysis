package tikcast.api.eco;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FeatureCheckRequest {

    @C09CT("feature_list")
    public List<Integer> featureList = new ArrayList();

    @C09CT("is_fail_retry")
    public boolean isFailRetry;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
