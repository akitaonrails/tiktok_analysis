package com.ss.android.ugc.aweme.tako.share.panel;

import X.C1382950m5l;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.tako.share.panel.TakoBatchShareModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TakoBatchShareModel extends ShareModel {
    public final C1382950m5l takoBatchShareInfo;
    public static final Parcelable.Creator<TakoBatchShareModel> CREATOR = new Parcelable.Creator<TakoBatchShareModel>() { // from class: X.0m5m
        @Override // android.os.Parcelable.Creator
        public final TakoBatchShareModel createFromParcel(Parcel parcel) {
            return new TakoBatchShareModel((C1382950m5l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TakoBatchShareModel[] newArray(int i) {
            return new TakoBatchShareModel[i];
        }
    };
    public static final int $stable = 8;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoBatchShareModel) && Intrinsics.LJFF(this.takoBatchShareInfo, ((TakoBatchShareModel) obj).takoBatchShareInfo);
    }

    public final int hashCode() {
        return this.takoBatchShareInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoBatchShareModel(takoBatchShareInfo=");
        sbLIZ.append(this.takoBatchShareInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.takoBatchShareInfo);
    }

    public TakoBatchShareModel(C1382950m5l c1382950m5l) {
        super(c1382950m5l);
        this.takoBatchShareInfo = c1382950m5l;
    }
}
