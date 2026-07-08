package com.ss.android.ugc.aweme.api;

import X.C09CT;
import com.ss.android.ugc.aweme.friendstab.model.RepostFeedRedDotRequest;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotRequest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class MultiRedDotRequest {

    @C09CT("client_read_gids_all")
    public List<String> clientReadGidsAll;

    @C09CT("multi_feeds")
    public final ArrayList<Integer> feeds;

    @C09CT("friend_feed_new_content_request")
    public SocialFeedRedDotRequest friendFeedRedDotRequest;

    @C09CT("muf_count")
    public final int mufCount;

    @C09CT("share_feed_new_content_request")
    public RepostFeedRedDotRequest repostFeedRedDotRequest;

    @C09CT("source")
    public final int source;

    public final void setClientReadGidsAll(List<String> list) {
        this.clientReadGidsAll = list;
    }

    public final void setFriendFeedRedDotRequest(SocialFeedRedDotRequest socialFeedRedDotRequest) {
        this.friendFeedRedDotRequest = socialFeedRedDotRequest;
    }

    public final void setRepostFeedRedDotRequest(RepostFeedRedDotRequest repostFeedRedDotRequest) {
        this.repostFeedRedDotRequest = repostFeedRedDotRequest;
    }

    public MultiRedDotRequest(SocialFeedRedDotRequest socialFeedRedDotRequest, RepostFeedRedDotRequest repostFeedRedDotRequest, List<String> list, ArrayList<Integer> arrayList, int i, int i2) {
        this.friendFeedRedDotRequest = socialFeedRedDotRequest;
        this.repostFeedRedDotRequest = repostFeedRedDotRequest;
        this.clientReadGidsAll = list;
        this.feeds = arrayList;
        this.source = i;
        this.mufCount = i2;
    }
}
