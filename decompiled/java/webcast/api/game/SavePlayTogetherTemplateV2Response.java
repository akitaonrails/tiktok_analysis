package webcast.api.game;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class SavePlayTogetherTemplateV2Response {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("review_not_pass_fields")
        public long reviewNotPassFields;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("template_id")
        public String templateId = "";
    }
}
