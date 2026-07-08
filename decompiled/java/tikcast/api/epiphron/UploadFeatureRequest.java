package tikcast.api.epiphron;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class UploadFeatureRequest {

    @C09CT("user_action")
    public Map<String, String> userAction = new LinkedHashMap();

    @C09CT("base_info")
    public Map<String, String> baseInfo = new LinkedHashMap();

    @C09CT("performance")
    public Map<String, String> performance = new LinkedHashMap();

    @C09CT("user_profile")
    public Map<String, String> userProfile = new LinkedHashMap();

    @C09CT("room_feature")
    public Map<String, String> roomFeature = new LinkedHashMap();

    @C09CT("biz_params")
    public Map<String, String> bizParams = new LinkedHashMap();
}
