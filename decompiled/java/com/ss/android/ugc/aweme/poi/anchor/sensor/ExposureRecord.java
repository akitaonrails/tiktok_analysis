package com.ss.android.ugc.aweme.poi.anchor.sensor;

import X.C09CT;
import X.C1227904rF;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class ExposureRecord implements Serializable {

    @C09CT("last_exposure_time")
    public final Long lastExposureTime;

    @C09CT("poi_id")
    public final String poiId;

    public final String getExposureRecordSerializableResult() {
        C1227904rF.LIZ.getClass();
        return GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), this);
    }

    public ExposureRecord(String str, Long l) {
        this.poiId = str;
        this.lastExposureTime = l;
    }
}
