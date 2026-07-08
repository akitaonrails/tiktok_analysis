package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PlayTogetherApplyInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class GetPlayTogetherApplyInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("apply_info")
        public PlayTogetherApplyInfo applyInfo;
    }
}
