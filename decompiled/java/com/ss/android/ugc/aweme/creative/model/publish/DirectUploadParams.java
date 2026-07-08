package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import com.ss.android.ugc.aweme.creative.model.publish.DirectUploadParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DirectUploadParams implements Parcelable {
    public static final Parcelable.Creator<DirectUploadParams> CREATOR = new Parcelable.Creator<DirectUploadParams>() { // from class: X.0nTW
        @Override // android.os.Parcelable.Creator
        public final DirectUploadParams createFromParcel(Parcel parcel) {
            return new DirectUploadParams(CompileLevel.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DirectUploadParams[] newArray(int i) {
            return new DirectUploadParams[i];
        }
    };

    @C040H
    public final CompileLevel compileLevel;

    @C040H
    public final String nleModel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectUploadParams)) {
            return false;
        }
        DirectUploadParams directUploadParams = (DirectUploadParams) obj;
        return this.compileLevel == directUploadParams.compileLevel && Intrinsics.LJFF(this.nleModel, directUploadParams.nleModel);
    }

    public final int hashCode() {
        int iHashCode = this.compileLevel.hashCode() * 31;
        String str = this.nleModel;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DirectUploadParams(compileLevel=");
        sbLIZ.append(this.compileLevel);
        sbLIZ.append(", nleModel=");
        sbLIZ.append(this.nleModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.compileLevel.writeToParcel(parcel, i);
        parcel.writeString(this.nleModel);
    }

    public DirectUploadParams() {
        this(CompileLevel.UNKNOWN, null);
    }

    public DirectUploadParams(CompileLevel compileLevel, String str) {
        this.compileLevel = compileLevel;
        this.nleModel = str;
    }
}
