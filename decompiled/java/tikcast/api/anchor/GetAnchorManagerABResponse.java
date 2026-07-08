package tikcast.api.anchor;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAnchorManagerABResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("ab_config_map")
        public Map<String, Long> abConfigMap = new LinkedHashMap();
    }
}
