package webcast.api.sub;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes18.dex */
public final class LeadsEventReportRequest {

    @C09CT("action")
    public int action;

    @C09CT("report_type")
    public int reportType;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("source")
    public int source;
}
