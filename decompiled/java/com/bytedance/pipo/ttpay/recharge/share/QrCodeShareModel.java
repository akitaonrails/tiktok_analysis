package com.bytedance.pipo.ttpay.recharge.share;

import X.C1377650lxD;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.pipo.ttpay.recharge.share.QrCodeShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;

/* JADX INFO: loaded from: classes22.dex */
public final class QrCodeShareModel extends ShareModel {
    public static final Parcelable.Creator<QrCodeShareModel> CREATOR = new Parcelable.Creator<QrCodeShareModel>() { // from class: X.0lxC
        @Override // android.os.Parcelable.Creator
        public final QrCodeShareModel createFromParcel(Parcel parcel) {
            return new QrCodeShareModel((C1377650lxD) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final QrCodeShareModel[] newArray(int i) {
            return new QrCodeShareModel[i];
        }
    };
    public final C1377650lxD qrCodeData;

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.qrCodeData);
    }

    public QrCodeShareModel(C1377650lxD c1377650lxD) {
        super(c1377650lxD);
        this.qrCodeData = c1377650lxD;
    }
}
