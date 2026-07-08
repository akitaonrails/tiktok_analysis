package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class DetectorInfo implements Serializable {

    @C09CT("detector_email")
    public String detectorEmail;

    @C09CT("detector_id")
    public long detectorId;

    public DetectorInfo() {
        this(-1L, "");
    }

    public final void setDetectorEmail(String str) {
        this.detectorEmail = str;
    }

    public final void setDetectorId(long j) {
        this.detectorId = j;
    }

    public DetectorInfo(long j, String str) {
        this.detectorId = j;
        this.detectorEmail = str;
    }
}
