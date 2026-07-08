package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.DailyChallenges;
import webcast.data.PaginationInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class DailyChallengesChallengeHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("daily_challenges")
        public List<DailyChallenges> dailyChallenges = new ArrayList();

        @C09CT("pagination_info")
        public PaginationInfo paginationInfo;
    }
}
