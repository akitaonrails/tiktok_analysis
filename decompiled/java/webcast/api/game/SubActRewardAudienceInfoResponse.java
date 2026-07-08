package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SubActRewardAudienceInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("audience_infos")
        public List<AudienceInfo> audienceInfos = new ArrayList();
    }
}
