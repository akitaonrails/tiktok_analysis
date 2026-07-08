package com.ss.android.ugc.aweme.creative.model.editorpro.aigc;

import X.C09CT;
import X.C0MY0;
import X.C2188811AlT;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.MagicI2InfoModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MagicI2InfoModel implements Parcelable {
    public static final Parcelable.Creator<MagicI2InfoModel> CREATOR = new Parcelable.Creator<MagicI2InfoModel>() { // from class: X.09ot
        @Override // android.os.Parcelable.Creator
        public final MagicI2InfoModel createFromParcel(Parcel parcel) {
            return new MagicI2InfoModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MagicI2InfoModel[] newArray(int i) {
            return new MagicI2InfoModel[i];
        }
    };

    @InterfaceC2270908v5
    @InterfaceC2270808v4
    @C09CT("filePath")
    @C0MY0
    public String filePath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MagicI2InfoModel) && Intrinsics.LJFF(this.filePath, ((MagicI2InfoModel) obj).filePath);
    }

    public final int hashCode() {
        return this.filePath.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MagicI2InfoModel(filePath=");
        sbLIZ.append(this.filePath);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filePath);
    }

    public MagicI2InfoModel() {
        this("");
    }

    public MagicI2InfoModel(String str) {
        this.filePath = str;
    }
}
