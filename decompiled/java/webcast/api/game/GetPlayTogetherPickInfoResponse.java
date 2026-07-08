package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PlayTogetherPickInfo;

/* JADX INFO: loaded from: classes28.dex */
public final class GetPlayTogetherPickInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("pick_info")
        public PlayTogetherPickInfo pickInfo;
    }
}
