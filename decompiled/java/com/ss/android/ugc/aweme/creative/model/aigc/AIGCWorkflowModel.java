package com.ss.android.ugc.aweme.creative.model.aigc;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCWorkflowModel;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCWorkflowModel implements Parcelable {
    public static final Parcelable.Creator<AIGCWorkflowModel> CREATOR = new Parcelable.Creator<AIGCWorkflowModel>() { // from class: X.0M0d
        @Override // android.os.Parcelable.Creator
        public final AIGCWorkflowModel createFromParcel(Parcel parcel) {
            boolean z;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AIGCWorkflowModel(z);
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCWorkflowModel[] newArray(int i) {
            return new AIGCWorkflowModel[i];
        }
    };

    @C09CT("has_aigc_new_framework_task")
    public boolean hasAigcNewFrameworkTask;

    public AIGCWorkflowModel() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AIGCWorkflowModel) && this.hasAigcNewFrameworkTask == ((AIGCWorkflowModel) obj).hasAigcNewFrameworkTask;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.hasAigcNewFrameworkTask);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowModel(hasAigcNewFrameworkTask=");
        sbLIZ.append(this.hasAigcNewFrameworkTask);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasAigcNewFrameworkTask ? 1 : 0);
    }

    public AIGCWorkflowModel(boolean z) {
        this.hasAigcNewFrameworkTask = z;
    }
}
