package tikcast.api.eco;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class FeatureCheckResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseData {

        @C09CT("result_list")
        public List<FeatureCheckResult> resultList = new ArrayList();
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
