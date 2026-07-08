package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.EsportsMatchInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class MatchScheduleResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("tournament_type")
        public int tournamentType;

        @C09CT("tournament_name")
        public String tournamentName = "";

        @C09CT("batch_match_info_list")
        public List<EsportsMatchInfo> batchMatchInfoList = new ArrayList();
    }
}
