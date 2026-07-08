package webcast.api.ranklist_class;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LeagueMatchBannerResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("banner_info")
        public LeagueMatchBannerInfo bannerInfo;

        @C09CT("is_anchor_opt_out")
        public boolean isAnchorOptOut;

        @C09CT("score_rule")
        public Map<Long, Long> scoreRule = new LinkedHashMap();
    }
}
