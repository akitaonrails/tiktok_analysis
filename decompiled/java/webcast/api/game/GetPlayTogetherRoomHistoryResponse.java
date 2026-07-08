package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PlayTogetherHistoryPickInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class GetPlayTogetherRoomHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("pick_info")
        public PlayTogetherHistoryPickInfo pickInfo;
    }
}
