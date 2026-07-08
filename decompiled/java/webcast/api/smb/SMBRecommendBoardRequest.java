package webcast.api.smb;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class SMBRecommendBoardRequest {

    @C09CT("count")
    public long count;

    @C09CT("offset")
    public long offset;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("supported_dsl_version")
    public long supportedDslVersion;
}
