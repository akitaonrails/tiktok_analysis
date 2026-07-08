package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EntranceButtonInfo implements Parcelable {

    @C09CT("img")
    public final List<Image> buttonImgList;

    @C09CT("title")
    public final String buttonTitle;
    public static final Parcelable.Creator<EntranceButtonInfo> CREATOR = new Parcelable.Creator<EntranceButtonInfo>() { // from class: X.04HC
        @Override // android.os.Parcelable.Creator
        public final EntranceButtonInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(EntranceButtonInfo.class.getClassLoader()));
                }
            }
            return new EntranceButtonInfo(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EntranceButtonInfo[] newArray(int i) {
            return new EntranceButtonInfo[i];
        }
    };
    public static final int $stable = 8;

    public EntranceButtonInfo() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntranceButtonInfo)) {
            return false;
        }
        EntranceButtonInfo entranceButtonInfo = (EntranceButtonInfo) obj;
        return Intrinsics.LJFF(this.buttonTitle, entranceButtonInfo.buttonTitle) && Intrinsics.LJFF(this.buttonImgList, entranceButtonInfo.buttonImgList);
    }

    public final int hashCode() {
        String str = this.buttonTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Image> list = this.buttonImgList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntranceButtonInfo(buttonTitle=");
        sbLIZ.append(this.buttonTitle);
        sbLIZ.append(", buttonImgList=");
        sbLIZ.append(this.buttonImgList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.buttonTitle);
        List<Image> list = this.buttonImgList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Image> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public EntranceButtonInfo(String str, List<Image> list) {
        this.buttonTitle = str;
        this.buttonImgList = list;
    }
}
