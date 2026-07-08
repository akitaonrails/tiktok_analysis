package webcast.api.room;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LivePermissionApplyInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("permission_info")
        public Map<String, PermissionApplyInfo> permissionInfo = new LinkedHashMap();
    }
}
