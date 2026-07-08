package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeedCard {

    @C09CT("current_time")
    public long currentTime;

    @C09CT("hit_fyp_experiment")
    public long hitFypExperiment;

    @C09CT("preview_card_style")
    public long previewCardStyle;

    @C09CT("linked_user_list")
    public List<LinkedUserInfo> linkedUserList = new ArrayList();

    @C09CT("ai_live_summary")
    public String aiLiveSummary = "";
}
