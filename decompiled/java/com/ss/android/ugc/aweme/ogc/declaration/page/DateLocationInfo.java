package com.ss.android.ugc.aweme.ogc.declaration.page;

import X.C09CT;
import X.C1618480sDe;
import X.C708510Rqj;
import com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class DateLocationInfo implements Serializable {

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("location")
    public final LocationInfo location;

    public DateLocationInfo() {
        this(null, null);
    }

    public final String getDisplayDate() {
        Long l = this.createTime;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        IDeclarationService.LIZ.getClass();
        IDeclarationService iDeclarationServiceLIZ = C708510Rqj.LIZ();
        if (iDeclarationServiceLIZ == null || iDeclarationServiceLIZ.getPublisher() == null) {
            return null;
        }
        return C1618480sDe.LIZIZ(jLongValue);
    }

    public final String getDisplayLocation() {
        String str;
        LocationInfo locationInfo = this.location;
        if (locationInfo == null || (str = locationInfo.name) == null || str.length() <= 0) {
            return null;
        }
        return this.location.name;
    }

    public final boolean isValid() {
        LocationInfo locationInfo;
        return this.createTime != null || ((locationInfo = this.location) != null && locationInfo.isValid());
    }

    public DateLocationInfo(Long l, LocationInfo locationInfo) {
        this.createTime = l;
        this.location = locationInfo;
    }
}
