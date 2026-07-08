package tikcast.api.epiphron;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class DecisionResponse {

    @C09CT("data")
    public DecisionData data;

    @C09CT("extra")
    public DecisionExtra extra;

    @C09CT("biz_type")
    public String bizType = "";

    @C09CT("sub_type")
    public String subType = "";

    public static final class DecisionData {

        @C09CT("features")
        public Map<String, String> features = new LinkedHashMap();

        @C09CT("decisions")
        public Map<String, String> decisions = new LinkedHashMap();
    }

    public static final class DecisionExtra {

        @C09CT("uniq_id")
        public long uniqId;
    }
}
