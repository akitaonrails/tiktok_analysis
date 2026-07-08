package webcast.data.cohost_biz;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* JADX INFO: loaded from: classes.dex */
public final class BizJoinGroupResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("perception_message")
        public PerceptionMessage perceptionMessage;

        @C09CT("perception_status")
        public int perceptionStatus;
    }
}
