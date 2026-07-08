package webcast.api.partnership;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class FeedbackTagResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("tags")
        public List<FeedbackTag> tags = new ArrayList();

        public static final class FeedbackTag {

            @C09CT(FollowStatusChangeMethod.PARAM_UID)
            public String id = "";

            @C09CT("name")
            public String name = "";

            @C09CT("sub_tags")
            public List<FeedbackSubTag> subTags = new ArrayList();

            public static final class FeedbackSubTag {

                @C09CT(FollowStatusChangeMethod.PARAM_UID)
                public String id = "";

                @C09CT("name")
                public String name = "";
            }
        }
    }
}
