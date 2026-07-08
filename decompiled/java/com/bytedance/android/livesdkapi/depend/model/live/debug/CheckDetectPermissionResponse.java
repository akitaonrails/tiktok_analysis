package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class CheckDetectPermissionResponse implements Serializable {

    @C09CT("detector_info")
    public DetectorInfo detectorInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public boolean status;

    public CheckDetectPermissionResponse() {
        this(false, null);
    }

    public final void setDetectorInfo(DetectorInfo detectorInfo) {
        this.detectorInfo = detectorInfo;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }

    public CheckDetectPermissionResponse(boolean z, DetectorInfo detectorInfo) {
        this.status = z;
        this.detectorInfo = detectorInfo;
    }
}
