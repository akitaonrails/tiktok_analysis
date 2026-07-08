package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessDraft;

/* JADX INFO: loaded from: classes29.dex */
public final class GetGuessDraftResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("draft_info")
        public GuessDraft draftInfo;
    }
}
