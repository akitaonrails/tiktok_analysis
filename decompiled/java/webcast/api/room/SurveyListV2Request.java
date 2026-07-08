package webcast.api.room;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class SurveyListV2Request {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("room_id")
    public long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("available_survey_ids")
    public List<Long> availableSurveyIds = new ArrayList();

    @C09CT("available_survey_ids_str")
    public String availableSurveyIdsStr = "";

    @C09CT("live_survey_rec_info")
    public String liveSurveyRecInfo = "";

    @C09CT("cur_room_position")
    public String curRoomPosition = "";

    @C09CT("feature_map")
    public Map<String, String> featureMap = new LinkedHashMap();

    @C09CT("preview_survey_id_str")
    public String previewSurveyIdStr = "";

    @C09CT("language")
    public String language = "";
}
