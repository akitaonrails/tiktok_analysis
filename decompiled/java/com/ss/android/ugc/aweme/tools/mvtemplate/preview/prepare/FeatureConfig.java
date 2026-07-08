package com.ss.android.ugc.aweme.tools.mvtemplate.preview.prepare;

import X.C09CT;
import X.C1779690wPf;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.mvtemplate.preview.prepare.FeatureConfig;

/* JADX INFO: loaded from: classes28.dex */
public final class FeatureConfig implements Parcelable {
    public static final int $stable = 0;
    public static final C1779690wPf CREATOR = new Parcelable.Creator<FeatureConfig>() { // from class: X.0wPf
        @Override // android.os.Parcelable.Creator
        public final FeatureConfig createFromParcel(Parcel parcel) {
            return new FeatureConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FeatureConfig[] newArray(int i) {
            return new FeatureConfig[i];
        }
    };

    @C09CT("import_fps")
    public final int importFps;

    @C09CT("import_resolution_threshold")
    public final int importResolutionRatio;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureConfig)) {
            return false;
        }
        FeatureConfig featureConfig = (FeatureConfig) obj;
        return this.importFps == featureConfig.importFps && this.importResolutionRatio == featureConfig.importResolutionRatio;
    }

    public final int hashCode() {
        return (this.importFps * 31) + this.importResolutionRatio;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeatureConfig(importFps=");
        sbLIZ.append(this.importFps);
        sbLIZ.append(", importResolutionRatio=");
        sbLIZ.append(this.importResolutionRatio);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeatureConfig() {
        this(40, 3686400);
    }

    public FeatureConfig(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt());
    }

    public FeatureConfig(int i, int i2) {
        this.importFps = i;
        this.importResolutionRatio = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.importFps);
        parcel.writeInt(this.importResolutionRatio);
    }
}
