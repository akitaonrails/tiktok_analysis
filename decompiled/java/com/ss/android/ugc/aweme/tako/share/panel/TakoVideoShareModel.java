package com.ss.android.ugc.aweme.tako.share.panel;

import X.C1856900yQC;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.tako.share.panel.TakoVideoShareModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoVideoShareModel extends ShareModel {
    public final C1856900yQC takoVideoShareInfo;
    public static final Parcelable.Creator<TakoVideoShareModel> CREATOR = new Parcelable.Creator<TakoVideoShareModel>() { // from class: X.0yQE
        @Override // android.os.Parcelable.Creator
        public final TakoVideoShareModel createFromParcel(Parcel parcel) {
            return new TakoVideoShareModel((C1856900yQC) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TakoVideoShareModel[] newArray(int i) {
            return new TakoVideoShareModel[i];
        }
    };
    public static final int $stable = 8;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoVideoShareModel) && Intrinsics.LJFF(this.takoVideoShareInfo, ((TakoVideoShareModel) obj).takoVideoShareInfo);
    }

    public final int hashCode() {
        return this.takoVideoShareInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoVideoShareModel(takoVideoShareInfo=");
        sbLIZ.append(this.takoVideoShareInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.takoVideoShareInfo);
    }

    public TakoVideoShareModel(C1856900yQC c1856900yQC) {
        super(c1856900yQC);
        this.takoVideoShareInfo = c1856900yQC;
    }
}
