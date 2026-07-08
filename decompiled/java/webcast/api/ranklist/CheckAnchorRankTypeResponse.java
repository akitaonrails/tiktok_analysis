package webcast.api.ranklist;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class CheckAnchorRankTypeResponse {

    @C09CT("data")
    public Data data;

    public static final class CheckResult {

        @C09CT("is_region_valid")
        public boolean isRegionValid;

        @C09CT("rank_type")
        public int rankType;
    }

    public static final class Data {

        @C09CT("results")
        public List<CheckResult> results = new ArrayList();
    }
}
