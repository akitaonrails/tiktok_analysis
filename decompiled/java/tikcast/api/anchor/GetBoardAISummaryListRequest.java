package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class GetBoardAISummaryListRequest {

    @C09CT("limit")
    public long limit;

    @C09CT("offset")
    public long offset;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
