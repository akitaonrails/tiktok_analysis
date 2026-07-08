package tikcast.api.fans;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FansBatchUpdateBenefitStatusResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("success_ids")
        public List<String> successIds = new ArrayList();

        @C09CT("failed_ids")
        public List<String> failedIds = new ArrayList();
    }
}
