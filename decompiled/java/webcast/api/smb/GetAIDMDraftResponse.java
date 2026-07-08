package webcast.api.smb;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AIDMQuestionSet;
import webcast.data.AIDMWelcomeSet;

/* JADX INFO: loaded from: classes.dex */
public final class GetAIDMDraftResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("welcome_sets")
        public List<AIDMWelcomeSet> welcomeSets = new ArrayList();

        @C09CT("question_sets")
        public List<AIDMQuestionSet> questionSets = new ArrayList();
    }
}
