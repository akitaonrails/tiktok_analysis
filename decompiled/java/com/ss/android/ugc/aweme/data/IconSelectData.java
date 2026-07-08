package com.ss.android.ugc.aweme.data;

import X.C2188811AlT;
import X.EnumC1737340vJM;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.data.IconSelectData;
import com.ss.android.ugc.aweme.data.media.MediaPhotoExtraData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class IconSelectData implements Parcelable {
    public static final Parcelable.Creator<IconSelectData> CREATOR = new Parcelable.Creator<IconSelectData>() { // from class: X.0vIr
        @Override // android.os.Parcelable.Creator
        public final IconSelectData createFromParcel(Parcel parcel) {
            MediaPhotoExtraData mediaPhotoExtraDataCreateFromParcel;
            String string = parcel.readString();
            EnumC1737340vJM enumC1737340vJMValueOf = EnumC1737340vJM.valueOf(parcel.readString());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                mediaPhotoExtraDataCreateFromParcel = null;
            } else {
                mediaPhotoExtraDataCreateFromParcel = MediaPhotoExtraData.CREATOR.createFromParcel(parcel);
            }
            return new IconSelectData(string, enumC1737340vJMValueOf, string2, mediaPhotoExtraDataCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IconSelectData[] newArray(int i) {
            return new IconSelectData[i];
        }
    };
    public final String iconScenes;
    public final String id;
    public final MediaPhotoExtraData photoExtraData;
    public final EnumC1737340vJM selectType;
    public final String url;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconSelectData)) {
            return false;
        }
        IconSelectData iconSelectData = (IconSelectData) obj;
        return Intrinsics.LJFF(this.url, iconSelectData.url) && this.selectType == iconSelectData.selectType && Intrinsics.LJFF(this.id, iconSelectData.id) && Intrinsics.LJFF(this.photoExtraData, iconSelectData.photoExtraData) && Intrinsics.LJFF(this.iconScenes, iconSelectData.iconScenes);
    }

    public final int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.selectType.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MediaPhotoExtraData mediaPhotoExtraData = this.photoExtraData;
        int iHashCode3 = (iHashCode2 + (mediaPhotoExtraData == null ? 0 : mediaPhotoExtraData.hashCode())) * 31;
        String str2 = this.iconScenes;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconSelectData(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(", selectType=");
        sbLIZ.append(this.selectType);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", photoExtraData=");
        sbLIZ.append(this.photoExtraData);
        sbLIZ.append(", iconScenes=");
        sbLIZ.append(this.iconScenes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.selectType.name());
        parcel.writeString(this.id);
        MediaPhotoExtraData mediaPhotoExtraData = this.photoExtraData;
        if (mediaPhotoExtraData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaPhotoExtraData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.iconScenes);
    }

    public IconSelectData(String str, EnumC1737340vJM enumC1737340vJM, String str2, MediaPhotoExtraData mediaPhotoExtraData, String str3) {
        this.url = str;
        this.selectType = enumC1737340vJM;
        this.id = str2;
        this.photoExtraData = mediaPhotoExtraData;
        this.iconScenes = str3;
    }

    public /* synthetic */ IconSelectData(String str, EnumC1737340vJM enumC1737340vJM, String str2, MediaPhotoExtraData mediaPhotoExtraData, String str3, int i) {
        this(str, (i & 2) != 0 ? EnumC1737340vJM.NOT_SET : enumC1737340vJM, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : mediaPhotoExtraData, (i & 16) == 0 ? str3 : null);
    }
}
