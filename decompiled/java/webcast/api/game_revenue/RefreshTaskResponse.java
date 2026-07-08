package webcast.api.game_revenue;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessTaskPackInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class RefreshTaskResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("pack_info")
        public GuessTaskPackInfo packInfo;
    }
}
