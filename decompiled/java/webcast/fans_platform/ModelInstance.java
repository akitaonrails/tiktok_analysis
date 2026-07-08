package webcast.fans_platform;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ModelInstance {

    @C09CT("create_time_ms")
    public long createTimeMs;

    @C09CT("model_display_status")
    public int modelDisplayStatus;

    @C09CT("namespace")
    public Namespace namespace;

    @C09CT("primary_id")
    public long primaryId;

    @C09CT("release_plan")
    public ReleasePlan releasePlan;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("update_time_ms")
    public long updateTimeMs;

    @C09CT("version")
    public long version;

    @C09CT("business_id")
    public String businessId = "";

    @C09CT("model_type")
    public String modelType = "";

    @C09CT("primary_id_str")
    public String primaryIdStr = "";

    @C09CT("creator")
    public String creator = "";

    @C09CT("operator")
    public String operator = "";

    @C09CT("create_time_ms_str")
    public String createTimeMsStr = "";

    @C09CT("update_time_ms_str")
    public String updateTimeMsStr = "";

    @C09CT("name")
    public String name = "";

    @C09CT("description")
    public String description = "";

    @C09CT("value_json")
    public String valueJson = "";

    @C09CT("meta")
    public Map<String, String> meta = new LinkedHashMap();
}
