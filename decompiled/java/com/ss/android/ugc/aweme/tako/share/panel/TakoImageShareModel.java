package com.ss.android.ugc.aweme.tako.share.panel;

import X.C1856890yQB;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.tako.share.panel.TakoImageShareModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageShareModel extends ShareModel {
    public final C1856890yQB takoImageShareInfo;
    public static final Parcelable.Creator<TakoImageShareModel> CREATOR = new Parcelable.Creator<TakoImageShareModel>() { // from class: X.0yQ9
        @Override // android.os.Parcelable.Creator
        public final TakoImageShareModel createFromParcel(Parcel parcel) {
            return new TakoImageShareModel((C1856890yQB) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TakoImageShareModel[] newArray(int i) {
            return new TakoImageShareModel[i];
        }
    };
    public static final int $stable = 8;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoImageShareModel) && Intrinsics.LJFF(this.takoImageShareInfo, ((TakoImageShareModel) obj).takoImageShareInfo);
    }

    public final int hashCode() {
        return this.takoImageShareInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageShareModel(takoImageShareInfo=");
        sbLIZ.append(this.takoImageShareInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.takoImageShareInfo);
    }

    public TakoImageShareModel(C1856890yQB c1856890yQB) {
        super(c1856890yQB);
        this.takoImageShareInfo = c1856890yQB;
    }
}
