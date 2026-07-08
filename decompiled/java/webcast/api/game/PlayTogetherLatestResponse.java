package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PlayTogetherInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PlayTogetherLatestResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("apply_status")
        public ApplyStatusInfo applyStatus;

        @C09CT("info")
        public PlayTogetherInfo info;
    }
}
