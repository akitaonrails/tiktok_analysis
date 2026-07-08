package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessWidgets;

/* JADX INFO: loaded from: classes.dex */
public final class GetGuessWidgetsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("guess_widgets")
        public GuessWidgets guessWidgets;

        @C09CT("last_round_audit_status")
        public long lastRoundAuditStatus;
    }
}
