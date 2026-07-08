package webcast.api.cohost;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CohostCheckPointResponse {

    @C09CT("data")
    public CohostCheckPointData data;

    public static final class CohostCheckPointData {

        @C09CT("current_preference_tag")
        public int currentPreferenceTag;

        @C09CT("inviters")
        public List<CohostCheckPointInviter> inviters = new ArrayList();

        @C09CT("available_preference_tags")
        public List<Integer> availablePreferenceTags = new ArrayList();

        /* JADX INFO: loaded from: classes16.dex */
        public static final class CohostCheckPointInviter {

            @C09CT("play_type")
            public int playType;

            @C09CT("room_info")
            public Room roomInfo;

            @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
            public int status;

            @C09CT("user_info")
            public User userInfo;
        }
    }
}
