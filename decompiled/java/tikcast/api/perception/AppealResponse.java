package tikcast.api.perception;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AppealResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseData {

        @C09CT("appeal_punish_id")
        public long appealPunishId;

        @C09CT("related_punish_id_list")
        public List<Long> relatedPunishIdList = new ArrayList();
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
