package webcast.api.envelope;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class RevenuePermissionResponse {

    @C09CT("data")
    public ResponseData data;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ResponseData {

        @C09CT("envelope_permission")
        public Map<Long, Boolean> envelopePermission;

        @C09CT("goody_bag_permission")
        public Map<Long, Boolean> goodyBagPermission;
    }
}
