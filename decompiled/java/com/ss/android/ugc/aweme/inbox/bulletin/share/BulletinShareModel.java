package com.ss.android.ugc.aweme.inbox.bulletin.share;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinShareModel extends ShareModel {
    public final String bulletinId;
    public final BulletinBoardInfo bulletinInfo;
    public final String contentPb;
    public final int identity;
    public final String shareDesc;
    public final String shareTitle;
    public final String shareUrl;
    public final Integer subscribeStatus;
    public static final Parcelable.Creator<BulletinShareModel> CREATOR = new Parcelable.Creator<BulletinShareModel>() { // from class: X.0OIN
        @Override // android.os.Parcelable.Creator
        public final BulletinShareModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            BulletinBoardInfo bulletinBoardInfo = (BulletinBoardInfo) parcel.readSerializable();
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BulletinShareModel(string, string2, string3, string4, string5, bulletinBoardInfo, i, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BulletinShareModel[] newArray(int i) {
            return new BulletinShareModel[i];
        }
    };
    public static final int $stable = 8;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinShareModel)) {
            return false;
        }
        BulletinShareModel bulletinShareModel = (BulletinShareModel) obj;
        return Intrinsics.LJFF(this.bulletinId, bulletinShareModel.bulletinId) && Intrinsics.LJFF(this.shareTitle, bulletinShareModel.shareTitle) && Intrinsics.LJFF(this.shareDesc, bulletinShareModel.shareDesc) && Intrinsics.LJFF(this.shareUrl, bulletinShareModel.shareUrl) && Intrinsics.LJFF(this.contentPb, bulletinShareModel.contentPb) && Intrinsics.LJFF(this.bulletinInfo, bulletinShareModel.bulletinInfo) && this.identity == bulletinShareModel.identity && Intrinsics.LJFF(this.subscribeStatus, bulletinShareModel.subscribeStatus);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.bulletinId.hashCode() * 31) + this.shareTitle.hashCode()) * 31) + this.shareDesc.hashCode()) * 31) + this.shareUrl.hashCode()) * 31) + this.contentPb.hashCode()) * 31) + this.bulletinInfo.hashCode()) * 31) + this.identity) * 31;
        Integer num = this.subscribeStatus;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinShareModel(bulletinId=");
        sbLIZ.append(this.bulletinId);
        sbLIZ.append(", shareTitle=");
        sbLIZ.append(this.shareTitle);
        sbLIZ.append(", shareDesc=");
        sbLIZ.append(this.shareDesc);
        sbLIZ.append(", shareUrl=");
        sbLIZ.append(this.shareUrl);
        sbLIZ.append(", contentPb=");
        sbLIZ.append(this.contentPb);
        sbLIZ.append(", bulletinInfo=");
        sbLIZ.append(this.bulletinInfo);
        sbLIZ.append(", identity=");
        sbLIZ.append(this.identity);
        sbLIZ.append(", subscribeStatus=");
        sbLIZ.append(this.subscribeStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.bulletinId);
        parcel.writeString(this.shareTitle);
        parcel.writeString(this.shareDesc);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.contentPb);
        parcel.writeSerializable(this.bulletinInfo);
        parcel.writeInt(this.identity);
        Integer num = this.subscribeStatus;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public static BulletinShareModel LIZ(BulletinShareModel bulletinShareModel, BulletinBoardInfo bulletinBoardInfo) {
        return new BulletinShareModel(bulletinShareModel.bulletinId, bulletinShareModel.shareTitle, bulletinShareModel.shareDesc, bulletinShareModel.shareUrl, bulletinShareModel.contentPb, bulletinBoardInfo, bulletinShareModel.identity, bulletinShareModel.subscribeStatus);
    }

    public BulletinShareModel(String str, String str2, String str3, String str4, String str5, BulletinBoardInfo bulletinBoardInfo, int i, Integer num) {
        super(bulletinBoardInfo);
        this.bulletinId = str;
        this.shareTitle = str2;
        this.shareDesc = str3;
        this.shareUrl = str4;
        this.contentPb = str5;
        this.bulletinInfo = bulletinBoardInfo;
        this.identity = i;
        this.subscribeStatus = num;
    }
}
