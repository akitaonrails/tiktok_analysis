package webcast.api.ranklist;

import X.C09CT;
import com.bytedance.android.livesdk.rank.model.ActivityRankLabel;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes.dex */
public final class DiscoverFriendsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("items")
        public List<DiscoverFriendItem> items = new ArrayList();

        public static final class DiscoverFriendItem {

            @C09CT("button_status")
            public int buttonStatus;

            @C09CT("label")
            public ActivityRankLabel label;

            @C09CT("rank_user")
            public RankUser rankUser;

            @C09CT("room_id")
            public long roomId;
        }
    }
}
