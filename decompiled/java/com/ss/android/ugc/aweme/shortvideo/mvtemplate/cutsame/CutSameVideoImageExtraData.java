package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CutSameVideoImageExtraData implements Parcelable {
    public static final Parcelable.Creator<CutSameVideoImageExtraData> CREATOR = new Parcelable.Creator<CutSameVideoImageExtraData>() { // from class: X.0KjA
        @Override // android.os.Parcelable.Creator
        public final CutSameVideoImageExtraData createFromParcel(Parcel parcel) {
            return new CutSameVideoImageExtraData(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameVideoImageExtraData[] newArray(int i) {
            return new CutSameVideoImageExtraData[i];
        }
    };
    public final String extraDesc;
    public long extraDuration;
    public String materialType;
    public List<String> processor;
    public String sameAssetGroup;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.extraDuration) * 31;
        String str = this.extraDesc;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.materialType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.processor;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.sameAssetGroup;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutSameVideoImageExtraData(extraDuration=");
        sbLIZ.append(this.extraDuration);
        sbLIZ.append(", extraDesc=");
        sbLIZ.append(this.extraDesc);
        sbLIZ.append(", materialType=");
        sbLIZ.append(this.materialType);
        sbLIZ.append(", processor=");
        sbLIZ.append(this.processor);
        sbLIZ.append(", sameAssetGroup=");
        sbLIZ.append(this.sameAssetGroup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.extraDuration);
        parcel.writeString(this.extraDesc);
        parcel.writeString(this.materialType);
        parcel.writeStringList(this.processor);
        parcel.writeString(this.sameAssetGroup);
    }

    public /* synthetic */ CutSameVideoImageExtraData(String str, long j, int i) {
        this((i & 2) != 0 ? null : str, null, j, null, null);
    }

    public CutSameVideoImageExtraData(String str, String str2, long j, List list, String str3) {
        this.extraDuration = j;
        this.extraDesc = str;
        this.materialType = str2;
        this.processor = list;
        this.sameAssetGroup = str3;
    }
}
