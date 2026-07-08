package webcast.api.interaction.pictionary;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.PictionaryStatistics;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PictionaryRankResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("curr_user")
        public User currUser;

        @C09CT("curr_user_duration")
        public long currUserDuration;

        @C09CT("curr_user_rank")
        public long currUserRank;

        @C09CT("is_correct")
        public boolean isCorrect;

        @C09CT("pictionary_info")
        public PictionaryInfo pictionaryInfo;

        @C09CT("pictionary_statistics")
        public PictionaryStatistics pictionaryStatistics;

        @C09CT("rank_list")
        public List<RankEntry> rankList;
    }
}
