package com.ss.android.ugc.aweme.ui.layout;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ui.layout.FeedContentUiConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedContentUiConfig implements Parcelable {
    public static final Parcelable.Creator<FeedContentUiConfig> CREATOR = new Parcelable.Creator<FeedContentUiConfig>() { // from class: X.0SN4
        @Override // android.os.Parcelable.Creator
        public final FeedContentUiConfig createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new FeedContentUiConfig(z, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedContentUiConfig[] newArray(int i) {
            return new FeedContentUiConfig[i];
        }
    };
    public final boolean isLightBg;
    public final int photoRadius;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedContentUiConfig)) {
            return false;
        }
        FeedContentUiConfig feedContentUiConfig = (FeedContentUiConfig) obj;
        return this.isLightBg == feedContentUiConfig.isLightBg && this.photoRadius == feedContentUiConfig.photoRadius;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.isLightBg) * 31) + this.photoRadius;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedContentUiConfig(isLightBg=");
        sbLIZ.append(this.isLightBg);
        sbLIZ.append(", photoRadius=");
        sbLIZ.append(this.photoRadius);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isLightBg ? 1 : 0);
        parcel.writeInt(this.photoRadius);
    }

    public FeedContentUiConfig(boolean z, int i) {
        this.isLightBg = z;
        this.photoRadius = i;
    }
}
