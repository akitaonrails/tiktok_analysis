package com.ss.android.ugc.aweme.portrait.model;

import X.C09CT;
import X.C2188811AlT;
import X.C546860Lca;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSessionModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitSessionModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitSessionModel implements Parcelable {
    public static final Parcelable.Creator<AIPortraitSessionModel> CREATOR = new Parcelable.Creator<AIPortraitSessionModel>() { // from class: X.0LfW
        @Override // android.os.Parcelable.Creator
        public final AIPortraitSessionModel createFromParcel(Parcel parcel) {
            return new AIPortraitSessionModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitSessionModel[] newArray(int i) {
            return new AIPortraitSessionModel[i];
        }
    };

    @C09CT("creation_id")
    public String creationId;

    @C09CT("trace_id")
    public String traceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitSessionModel)) {
            return false;
        }
        AIPortraitSessionModel aIPortraitSessionModel = (AIPortraitSessionModel) obj;
        return Intrinsics.LJFF(this.traceId, aIPortraitSessionModel.traceId) && Intrinsics.LJFF(this.creationId, aIPortraitSessionModel.creationId);
    }

    public final int hashCode() {
        return (this.traceId.hashCode() * 31) + this.creationId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitSessionModel(traceId=");
        sbLIZ.append(this.traceId);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.traceId);
        parcel.writeString(this.creationId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AIPortraitSessionModel() {
        this(C546860Lca.LIZ(), "");
        AIGCSessionModel.Companion.getClass();
    }

    public AIPortraitSessionModel(String str, String str2) {
        this.traceId = str;
        this.creationId = str2;
    }
}
