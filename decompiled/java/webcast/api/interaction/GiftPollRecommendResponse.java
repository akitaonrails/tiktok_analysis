package webcast.api.interaction;

import X.C09CT;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftPollRecommendResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("gift")
        public Gift gift;

        @C09CT("questions")
        public List<RecommendQuestion> questions = new ArrayList();
    }
}
