package tikcast.api.perception;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AppealRequest {

    @C09CT("appeal_req_scene")
    public int appealReqScene;

    @C09CT("punish_id")
    public long punishId;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("punish_type")
    public String punishType = "";

    @C09CT("text_evidence_title")
    public String textEvidenceTitle = "";

    @C09CT("text_evidence_desc")
    public String textEvidenceDesc = "";

    @C09CT("suppliment_materials")
    public List<String> supplimentMaterials = new ArrayList();

    @C09CT("suppliment_desc")
    public String supplimentDesc = "";

    @C09CT("enter_from")
    public String enterFrom = "";
}
