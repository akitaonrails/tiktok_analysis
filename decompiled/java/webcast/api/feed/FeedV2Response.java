package webcast.api.feed;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FeedV2Response {

    @C09CT("aweme_list")
    public List<AwemeStructV2> awemeList = new ArrayList();

    @C09CT("extra")
    public ExtraStructV2 extra;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("log_pb")
    public LogPbStructV2 logPb;
}
