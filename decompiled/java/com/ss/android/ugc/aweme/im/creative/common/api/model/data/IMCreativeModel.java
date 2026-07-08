package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C2188811AlT;
import X.InterfaceC111300bX;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeRecordModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class IMCreativeModel implements Parcelable, IRouteArg, InterfaceC111300bX {
    public static final Parcelable.Creator<IMCreativeModel> CREATOR = new Parcelable.Creator<IMCreativeModel>() { // from class: X.0niG
        @Override // android.os.Parcelable.Creator
        public final IMCreativeModel createFromParcel(Parcel parcel) {
            IMCreativeRecordModel iMCreativeRecordModelCreateFromParcel;
            IMCreativeEditModel iMCreativeEditModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                iMCreativeRecordModelCreateFromParcel = null;
            } else {
                iMCreativeRecordModelCreateFromParcel = IMCreativeRecordModel.CREATOR.createFromParcel(parcel);
            }
            IMCreativeRecordModel iMCreativeRecordModel = iMCreativeRecordModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                iMCreativeEditModelCreateFromParcel = IMCreativeEditModel.CREATOR.createFromParcel(parcel);
            }
            return new IMCreativeModel(iMCreativeRecordModel, iMCreativeEditModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IMCreativeModel[] newArray(int i) {
            return new IMCreativeModel[i];
        }
    };
    public final IMCreativeEditModel editModel;
    public final IMCreativeRecordModel recordModel;

    public IMCreativeModel() {
        this((IMCreativeRecordModel) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMCreativeModel)) {
            return false;
        }
        IMCreativeModel iMCreativeModel = (IMCreativeModel) obj;
        return Intrinsics.LJFF(this.recordModel, iMCreativeModel.recordModel) && Intrinsics.LJFF(this.editModel, iMCreativeModel.editModel);
    }

    public final int hashCode() {
        IMCreativeRecordModel iMCreativeRecordModel = this.recordModel;
        int iHashCode = (iMCreativeRecordModel == null ? 0 : iMCreativeRecordModel.hashCode()) * 31;
        IMCreativeEditModel iMCreativeEditModel = this.editModel;
        return iHashCode + (iMCreativeEditModel != null ? iMCreativeEditModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMCreativeModel(recordModel=");
        sbLIZ.append(this.recordModel);
        sbLIZ.append(", editModel=");
        sbLIZ.append(this.editModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IMCreativeRecordModel iMCreativeRecordModel = this.recordModel;
        if (iMCreativeRecordModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iMCreativeRecordModel.writeToParcel(parcel, i);
        }
        IMCreativeEditModel iMCreativeEditModel = this.editModel;
        if (iMCreativeEditModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iMCreativeEditModel.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ IMCreativeModel(IMCreativeRecordModel iMCreativeRecordModel, int i) {
        this((i & 1) != 0 ? null : iMCreativeRecordModel, (IMCreativeEditModel) null);
    }

    public IMCreativeModel(IMCreativeRecordModel iMCreativeRecordModel, IMCreativeEditModel iMCreativeEditModel) {
        this.recordModel = iMCreativeRecordModel;
        this.editModel = iMCreativeEditModel;
    }
}
