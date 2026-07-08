package webcast.data;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGrowRewardInfo {

    @C09CT("num")
    public long num;

    @C09CT("type")
    public int type;

    @C09CT("use_expire_time")
    public long useExpireTime;

    @C09CT("icon")
    public String icon = "";

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("lowercase_title")
    public String lowercaseTitle = "";

    @C09CT("mot_reward_id")
    public String motRewardId = "";

    @C09CT("learn_more_schema")
    public String learnMoreSchema = "";

    @C09CT("extra_info")
    public Map<String, String> extraInfo = new LinkedHashMap();
}
