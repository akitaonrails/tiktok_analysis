package tikcast.api.eco;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SubfeaturePunishInfo {

    @C09CT("violation_reasons")
    public List<String> violationReasons = new ArrayList();

    @C09CT("rank_detail")
    public List<RankDetail> rankDetail = new ArrayList();

    @C09CT("moderation_info")
    public String moderationInfo = "";

    public static final class RankDetail {

        @C09CT("rank_name")
        public String rankName = "";

        @C09CT("rank_name_key")
        public String rankNameKey = "";

        @C09CT("rank_url")
        public String rankUrl = "";
    }
}
