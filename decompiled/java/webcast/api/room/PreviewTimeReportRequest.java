package webcast.api.room;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes4.dex */
public final class PreviewTimeReportRequest {

    @C09CT("preview_time_ms")
    public long previewTimeMs;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;
}
