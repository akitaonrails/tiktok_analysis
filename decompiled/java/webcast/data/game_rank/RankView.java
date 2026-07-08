package webcast.data.game_rank;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RankView {

    @C09CT("ban_type")
    public int banType;

    @C09CT("bottom_bar_type")
    public int bottomBarType;

    @C09CT("bottom_content")
    public Text bottomContent;

    @C09CT("content")
    public Text content;

    @C09CT("count_down")
    public long countDown;

    @C09CT("fresh_time")
    public long freshTime;

    @C09CT("owner_rank")
    public RankInfo ownerRank;

    @C09CT("rank_type")
    public int rankType;

    @C09CT("title")
    public Text title;

    @C09CT("rule_url")
    public String ruleUrl = "";

    @C09CT("ranks")
    public List<RankInfo> ranks = new ArrayList();

    @C09CT("extra_content")
    public Map<String, Text> extraContent = new LinkedHashMap();
}
