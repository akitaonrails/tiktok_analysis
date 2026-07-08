package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PhotoModeExposureData implements Parcelable {
    public static final Parcelable.Creator<PhotoModeExposureData> CREATOR = new Creator();
    public final List<SingleImageData> imageList;

    public static final class Creator implements Parcelable.Creator<PhotoModeExposureData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoModeExposureData createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(PhotoModeExposureData.class.getClassLoader()));
            }
            return new PhotoModeExposureData(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoModeExposureData[] newArray(int i) {
            return new PhotoModeExposureData[i];
        }
    }

    public final PhotoModeExposureData copy(List<SingleImageData> list) {
        return new PhotoModeExposureData(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhotoModeExposureData) && Intrinsics.LJFF(this.imageList, ((PhotoModeExposureData) obj).imageList);
    }

    public int hashCode() {
        return this.imageList.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeExposureData(imageList=");
        sbLIZ.append(this.imageList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SingleImageData> list = this.imageList;
        parcel.writeInt(list.size());
        Iterator<SingleImageData> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public final List<SingleImageData> getImageList() {
        return this.imageList;
    }

    public PhotoModeExposureData(List<SingleImageData> list) {
        this.imageList = list;
    }
}
