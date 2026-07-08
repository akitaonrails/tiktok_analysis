package webcast.api.ranklist;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class ContentSpotlightPageRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("content_spotlight_type")
    public int contentSpotlightType;

    @C09CT("is_sandbox")
    public boolean isSandbox;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
