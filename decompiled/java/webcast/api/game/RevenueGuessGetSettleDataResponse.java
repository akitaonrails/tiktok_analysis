package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BetStats;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RevenueGuessGetSettleDataResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("user_stats")
        public List<BetStats> userStats = new ArrayList();
    }
}
