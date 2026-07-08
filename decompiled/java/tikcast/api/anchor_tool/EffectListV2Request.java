package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class EffectListV2Request {

    @C09CT("access_key")
    public String accessKey = "";

    @C09CT("app_channel")
    public String appChannel = "";

    @C09CT("items")
    public List<ReqInfo> items = new ArrayList();

    @C09CT("extra_param")
    public String extraParam = "";

    @C09CT("platform_sdk_version")
    public String platformSdkVersion = "";

    public static final class ReqInfo {

        @C09CT("panel")
        public String panel = "";

        @C09CT("test_status")
        public String testStatus = "";

        @C09CT("version")
        public String version = "";

        @C09CT("group")
        public Map<String, String> group = new LinkedHashMap();
    }
}
