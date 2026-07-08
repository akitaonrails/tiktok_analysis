package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;
import X.C2188811AlT;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes35.dex */
public final class SearchPhotoLandingPrefetchConfig {

    @C09CT("fast_rows")
    public final int fastRows;

    @C09CT("fast_vel_threshold")
    public final int fastVelThreshold;

    @C09CT("max_rows_cap")
    public final int maxRowsCap;

    @C09CT("med_rows")
    public final int medRows;

    @C09CT("med_vel_threshold")
    public final int medVelThreshold;

    @C09CT("slow_rows")
    public final int slowRows;

    public SearchPhotoLandingPrefetchConfig() {
        this(2, 4, 6, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 3400, 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPhotoLandingPrefetchConfig)) {
            return false;
        }
        SearchPhotoLandingPrefetchConfig searchPhotoLandingPrefetchConfig = (SearchPhotoLandingPrefetchConfig) obj;
        return this.slowRows == searchPhotoLandingPrefetchConfig.slowRows && this.medRows == searchPhotoLandingPrefetchConfig.medRows && this.fastRows == searchPhotoLandingPrefetchConfig.fastRows && this.medVelThreshold == searchPhotoLandingPrefetchConfig.medVelThreshold && this.fastVelThreshold == searchPhotoLandingPrefetchConfig.fastVelThreshold && this.maxRowsCap == searchPhotoLandingPrefetchConfig.maxRowsCap;
    }

    public final int hashCode() {
        return (((((((((this.slowRows * 31) + this.medRows) * 31) + this.fastRows) * 31) + this.medVelThreshold) * 31) + this.fastVelThreshold) * 31) + this.maxRowsCap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPhotoLandingPrefetchConfig(slowRows=");
        sbLIZ.append(this.slowRows);
        sbLIZ.append(", medRows=");
        sbLIZ.append(this.medRows);
        sbLIZ.append(", fastRows=");
        sbLIZ.append(this.fastRows);
        sbLIZ.append(", medVelThreshold=");
        sbLIZ.append(this.medVelThreshold);
        sbLIZ.append(", fastVelThreshold=");
        sbLIZ.append(this.fastVelThreshold);
        sbLIZ.append(", maxRowsCap=");
        sbLIZ.append(this.maxRowsCap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchPhotoLandingPrefetchConfig(int i, int i2, int i3, int i4, int i5, int i6) {
        this.slowRows = i;
        this.medRows = i2;
        this.fastRows = i3;
        this.medVelThreshold = i4;
        this.fastVelThreshold = i5;
        this.maxRowsCap = i6;
    }
}
