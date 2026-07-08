package webcast.data.multilive_biz;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;

/* JADX INFO: loaded from: classes.dex */
public final class BizPermitResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("host_perception_info")
        public PerceptionMessage hostPerceptionInfo;
    }
}
