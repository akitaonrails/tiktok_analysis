package tikcast.api.eco;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class RulesAndGuidanceResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseData {

        @C09CT("banner_area")
        public RulesAndGuidanceBannerArea bannerArea;

        @C09CT("check_bubble")
        public CheckBubble checkBubble;

        @C09CT("config")
        public RulesAndGuidanceConfig config;

        @C09CT("content_area")
        public RulesAndGuidanceContentArea contentArea;

        @C09CT("function_area")
        public RulesAndGuidanceFunctionArea functionArea;
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
