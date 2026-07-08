package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GameEmotesTab;

/* JADX INFO: loaded from: classes.dex */
public final class RevenueGuessGetEmotesResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("game_emotes_tab")
        public GameEmotesTab gameEmotesTab;
    }
}
