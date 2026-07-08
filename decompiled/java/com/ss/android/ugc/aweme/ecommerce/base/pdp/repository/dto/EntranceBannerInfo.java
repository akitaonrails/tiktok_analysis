package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EntranceBannerInfo implements Parcelable {

    @C09CT("button")
    public final EntranceButtonInfo buttonInfo;

    @C09CT("title")
    public final String title;

    @C09CT("title_img")
    public final Image titleImg;
    public static final Parcelable.Creator<EntranceBannerInfo> CREATOR = new Parcelable.Creator<EntranceBannerInfo>() { // from class: X.04HB
        @Override // android.os.Parcelable.Creator
        public final EntranceBannerInfo createFromParcel(Parcel parcel) {
            EntranceButtonInfo entranceButtonInfoCreateFromParcel;
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(EntranceBannerInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                entranceButtonInfoCreateFromParcel = null;
            } else {
                entranceButtonInfoCreateFromParcel = EntranceButtonInfo.CREATOR.createFromParcel(parcel);
            }
            return new EntranceBannerInfo(string, image, entranceButtonInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EntranceBannerInfo[] newArray(int i) {
            return new EntranceBannerInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntranceBannerInfo)) {
            return false;
        }
        EntranceBannerInfo entranceBannerInfo = (EntranceBannerInfo) obj;
        return Intrinsics.LJFF(this.title, entranceBannerInfo.title) && Intrinsics.LJFF(this.titleImg, entranceBannerInfo.titleImg) && Intrinsics.LJFF(this.buttonInfo, entranceBannerInfo.buttonInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.titleImg;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        EntranceButtonInfo entranceButtonInfo = this.buttonInfo;
        return iHashCode2 + (entranceButtonInfo != null ? entranceButtonInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntranceBannerInfo(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", titleImg=");
        sbLIZ.append(this.titleImg);
        sbLIZ.append(", buttonInfo=");
        sbLIZ.append(this.buttonInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.titleImg, i);
        EntranceButtonInfo entranceButtonInfo = this.buttonInfo;
        if (entranceButtonInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entranceButtonInfo.writeToParcel(parcel, i);
        }
    }

    public EntranceBannerInfo(String str, Image image, EntranceButtonInfo entranceButtonInfo) {
        this.title = str;
        this.titleImg = image;
        this.buttonInfo = entranceButtonInfo;
    }
}
