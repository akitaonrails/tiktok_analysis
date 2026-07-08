package tikcast.api.standingscore;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class GetFeedbackOptionsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("feedback_options")
        public List<FeedbackOption> feedbackOptions = new ArrayList();
    }
}
