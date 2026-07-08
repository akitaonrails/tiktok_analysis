package tikcast.api.eco;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class CheckDetectPermissionResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("detector_info")
        public DetectorInfo detectorInfo;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public boolean status;

        public static final class DetectorInfo {

            @C09CT("detector_email")
            public String detectorEmail = "";

            @C09CT("detector_id")
            public long detectorId;
        }
    }
}
