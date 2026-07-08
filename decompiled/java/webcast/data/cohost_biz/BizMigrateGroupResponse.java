package webcast.data.cohost_biz;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;
import tikcast.linkmic.common.CohostUserInfo;

/* JADX INFO: loaded from: classes.dex */
public final class BizMigrateGroupResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("user_infos")
        public Map<Long, CohostUserInfo> userInfos = new LinkedHashMap();
    }
}
