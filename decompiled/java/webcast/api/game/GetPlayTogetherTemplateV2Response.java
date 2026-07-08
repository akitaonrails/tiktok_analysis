package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PlayTogetherTemplateV2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GetPlayTogetherTemplateV2Response {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("recent_limit_type")
        public int recentLimitType;

        @C09CT("templates")
        public List<PlayTogetherTemplateV2> templates = new ArrayList();

        @C09CT("user_limit_types")
        public List<Integer> userLimitTypes = new ArrayList();
    }
}
