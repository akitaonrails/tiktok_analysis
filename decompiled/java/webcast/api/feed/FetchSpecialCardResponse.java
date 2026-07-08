package webcast.api.feed;

import X.C09CT;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FetchSpecialCardResponse {

    @C09CT("data")
    public List<FeedItem> data = new ArrayList();

    @C09CT("extra")
    public FeedExtra extra;
}
