package webcast.api.game;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class CreatePlayTogetherResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("template_id")
        public String templateId = "";

        @C09CT("play_together_id")
        public String playTogetherId = "";
    }
}
