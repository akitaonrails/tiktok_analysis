package com.ss.android.ugc.aweme.shortvideo;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.StitchContext;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class StitchContext implements Parcelable {
    public static final Parcelable.Creator<StitchContext> CREATOR = new Parcelable.Creator<StitchContext>() { // from class: X.0nfq
        @Override // android.os.Parcelable.Creator
        public final StitchContext createFromParcel(Parcel parcel) {
            return new StitchContext((StitchParams) parcel.readParcelable(StitchContext.class.getClassLoader()), (TimeSpeedModelExtension) parcel.readParcelable(StitchContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StitchContext[] newArray(int i) {
            return new StitchContext[i];
        }
    };
    public TimeSpeedModelExtension stitchClip;
    public StitchParams stitchParams;

    public StitchContext() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchContext)) {
            return false;
        }
        StitchContext stitchContext = (StitchContext) obj;
        return Intrinsics.LJFF(this.stitchParams, stitchContext.stitchParams) && Intrinsics.LJFF(this.stitchClip, stitchContext.stitchClip);
    }

    public final int hashCode() {
        StitchParams stitchParams = this.stitchParams;
        int iHashCode = (stitchParams == null ? 0 : stitchParams.hashCode()) * 31;
        TimeSpeedModelExtension timeSpeedModelExtension = this.stitchClip;
        return iHashCode + (timeSpeedModelExtension != null ? timeSpeedModelExtension.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StitchContext(stitchParams=");
        sbLIZ.append(this.stitchParams);
        sbLIZ.append(", stitchClip=");
        sbLIZ.append(this.stitchClip);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.stitchParams, i);
        parcel.writeParcelable(this.stitchClip, i);
    }

    public StitchContext(StitchParams stitchParams, TimeSpeedModelExtension timeSpeedModelExtension) {
        this.stitchParams = stitchParams;
        this.stitchClip = timeSpeedModelExtension;
    }
}
