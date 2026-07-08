package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import webcast.data.FansLevelInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class FansGetUserDataResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("Badge")
        public ImageModel badge;

        @C09CT("join_fans_timestamp_second")
        public long joinFansTimestampSecond;

        @C09CT("level_info")
        public FansLevelInfo levelInfo;

        @C09CT("send_comment_num")
        public long sendCommentNum;

        @C09CT("sending_gift_num")
        public long sendingGiftNum;

        @C09CT("show_data_types")
        public List<Integer> showDataTypes = new ArrayList();

        @C09CT("user_info")
        public User userInfo;

        @C09CT("watch_live_minute")
        public long watchLiveMinute;

        @C09CT("watch_live_times")
        public long watchLiveTimes;
    }
}
