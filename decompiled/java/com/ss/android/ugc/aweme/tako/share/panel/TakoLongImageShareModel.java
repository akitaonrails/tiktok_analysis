package com.ss.android.ugc.aweme.tako.share.panel;

import X.C1388210mEF;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageShareModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TakoLongImageShareModel extends ShareModel {
    public final C1388210mEF takoLongImageShareInfo;
    public static final Parcelable.Creator<TakoLongImageShareModel> CREATOR = new Parcelable.Creator<TakoLongImageShareModel>() { // from class: X.0mEG
        @Override // android.os.Parcelable.Creator
        public final TakoLongImageShareModel createFromParcel(Parcel parcel) {
            return new TakoLongImageShareModel((C1388210mEF) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TakoLongImageShareModel[] newArray(int i) {
            return new TakoLongImageShareModel[i];
        }
    };
    public static final int $stable = 8;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoLongImageShareModel) && Intrinsics.LJFF(this.takoLongImageShareInfo, ((TakoLongImageShareModel) obj).takoLongImageShareInfo);
    }

    public final int hashCode() {
        return this.takoLongImageShareInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoLongImageShareModel(takoLongImageShareInfo=");
        sbLIZ.append(this.takoLongImageShareInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.takoLongImageShareInfo);
    }

    public TakoLongImageShareModel(C1388210mEF c1388210mEF) {
        super(c1388210mEF);
        this.takoLongImageShareInfo = c1388210mEF;
    }
}
