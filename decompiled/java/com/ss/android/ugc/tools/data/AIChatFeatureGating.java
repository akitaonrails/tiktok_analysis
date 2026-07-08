package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.AIChatFeatureGating;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatFeatureGating implements Parcelable {
    public static final Parcelable.Creator<AIChatFeatureGating> CREATOR = new Parcelable.Creator<AIChatFeatureGating>() { // from class: X.18Wj
        @Override // android.os.Parcelable.Creator
        public final AIChatFeatureGating createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new AIChatFeatureGating(z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatFeatureGating[] newArray(int i) {
            return new AIChatFeatureGating[i];
        }
    };
    public final boolean enableActionBar;
    public final boolean enableDraft;

    public AIChatFeatureGating() {
        this(true, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatFeatureGating)) {
            return false;
        }
        AIChatFeatureGating aIChatFeatureGating = (AIChatFeatureGating) obj;
        return this.enableDraft == aIChatFeatureGating.enableDraft && this.enableActionBar == aIChatFeatureGating.enableActionBar;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enableDraft) * 31) + C786410Ut5.Z2(this.enableActionBar);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatFeatureGating(enableDraft=");
        sbLIZ.append(this.enableDraft);
        sbLIZ.append(", enableActionBar=");
        sbLIZ.append(this.enableActionBar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enableDraft ? 1 : 0);
        parcel.writeInt(this.enableActionBar ? 1 : 0);
    }

    public AIChatFeatureGating(boolean z, boolean z2) {
        this.enableDraft = z;
        this.enableActionBar = z2;
    }
}
