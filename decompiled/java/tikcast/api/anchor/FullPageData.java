package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FullPageData {

    @C09CT("first_page")
    public FirstPageModule firstPage;

    @C09CT("first_stream_timestamp")
    public long firstStreamTimestamp;

    @C09CT("follower_page")
    public FollowerModule followerPage;

    @C09CT("geographic_page")
    public GeographicModule geographicPage;

    @C09CT("moment_page")
    public MomentModule momentPage;

    @C09CT("social_page")
    public SocialModule socialPage;

    @C09CT("summary_page")
    public SummaryModule summaryPage;
}
