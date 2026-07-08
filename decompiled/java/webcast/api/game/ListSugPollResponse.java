package webcast.api.game;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ListSugPollResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("sug_poll_questions")
        public List<SugPollQuestion> sugPollQuestions = new ArrayList();
    }

    public static final class SugPollQuestion {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id = "";

        @C09CT("title")
        public String title = "";
    }
}
