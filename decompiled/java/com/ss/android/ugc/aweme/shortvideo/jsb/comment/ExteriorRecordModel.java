package com.ss.android.ugc.aweme.shortvideo.jsb.comment;

import X.C0LGC;
import X.C0LGK;
import X.C0LGL;
import X.C0MJU;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ExteriorRecordModel implements Parcelable {
    public final String PreviousPage;
    public final C0LGK bottomTabType;
    public final Float imageCompress;
    public final long maxRecordSeconds;
    public final int maxSelectAssetCount;
    public final int maxSelectVideoCount;
    public final long minRecordSeconds;
    public final C0LGC recordPageType;
    public final boolean showPreviewAfterRecord;
    public final ArrayList<Integer> targetSize;
    public final List<C0MJU> toolBarList;
    public final Float videoCompress;
    public static final C0LGL Companion = new Object() { // from class: X.0LGL
    };
    public static final Parcelable.Creator<ExteriorRecordModel> CREATOR = new Parcelable.Creator<ExteriorRecordModel>() { // from class: X.0LGJ
        @Override // android.os.Parcelable.Creator
        public final ExteriorRecordModel createFromParcel(Parcel parcel) {
            Float fValueOf;
            Float fValueOf2;
            C0LGC c0lgcValueOf = C0LGC.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z = false;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(C0MJU.valueOf(parcel.readString()));
            }
            C0LGK c0lgkValueOf = C0LGK.valueOf(parcel.readString());
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                fValueOf2 = null;
            } else {
                fValueOf2 = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
            }
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new ExteriorRecordModel(c0lgcValueOf, arrayList, c0lgkValueOf, j, j2, i3, i4, fValueOf, fValueOf2, arrayList2, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExteriorRecordModel[] newArray(int i) {
            return new ExteriorRecordModel[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExteriorRecordModel)) {
            return false;
        }
        ExteriorRecordModel exteriorRecordModel = (ExteriorRecordModel) obj;
        return this.recordPageType == exteriorRecordModel.recordPageType && Intrinsics.LJFF(this.toolBarList, exteriorRecordModel.toolBarList) && this.bottomTabType == exteriorRecordModel.bottomTabType && this.minRecordSeconds == exteriorRecordModel.minRecordSeconds && this.maxRecordSeconds == exteriorRecordModel.maxRecordSeconds && this.maxSelectVideoCount == exteriorRecordModel.maxSelectVideoCount && this.maxSelectAssetCount == exteriorRecordModel.maxSelectAssetCount && Intrinsics.LJFF(this.imageCompress, exteriorRecordModel.imageCompress) && Intrinsics.LJFF(this.videoCompress, exteriorRecordModel.videoCompress) && Intrinsics.LJFF(this.targetSize, exteriorRecordModel.targetSize) && this.showPreviewAfterRecord == exteriorRecordModel.showPreviewAfterRecord && Intrinsics.LJFF(this.PreviousPage, exteriorRecordModel.PreviousPage);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.recordPageType.hashCode() * 31) + this.toolBarList.hashCode()) * 31) + this.bottomTabType.hashCode()) * 31) + C786410Ut5.Y2(this.minRecordSeconds)) * 31) + C786410Ut5.Y2(this.maxRecordSeconds)) * 31) + this.maxSelectVideoCount) * 31) + this.maxSelectAssetCount) * 31;
        Float f = this.imageCompress;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.videoCompress;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        ArrayList<Integer> arrayList = this.targetSize;
        int iHashCode4 = (((iHashCode3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + C786410Ut5.Z2(this.showPreviewAfterRecord)) * 31;
        String str = this.PreviousPage;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ExteriorRecordModel(recordPageType=" + this.recordPageType + ", toolBarList=" + this.toolBarList + ", bottomTabType=" + this.bottomTabType + ", minRecordSeconds=" + this.minRecordSeconds + ", maxRecordSeconds=" + this.maxRecordSeconds + ", maxSelectVideoCount=" + this.maxSelectVideoCount + ", maxSelectAssetCount=" + this.maxSelectAssetCount + ", imageCompress=" + this.imageCompress + ", videoCompress=" + this.videoCompress + ", targetSize=" + this.targetSize + ", showPreviewAfterRecord=" + this.showPreviewAfterRecord + ", PreviousPage=" + this.PreviousPage + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.recordPageType.name());
        List<C0MJU> list = this.toolBarList;
        parcel.writeInt(list.size());
        Iterator<C0MJU> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().name());
        }
        parcel.writeString(this.bottomTabType.name());
        parcel.writeLong(this.minRecordSeconds);
        parcel.writeLong(this.maxRecordSeconds);
        parcel.writeInt(this.maxSelectVideoCount);
        parcel.writeInt(this.maxSelectAssetCount);
        Float f = this.imageCompress;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.videoCompress;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        ArrayList<Integer> arrayList = this.targetSize;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Integer> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                parcel.writeInt(it3.next().intValue());
            }
        }
        parcel.writeInt(this.showPreviewAfterRecord ? 1 : 0);
        parcel.writeString(this.PreviousPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExteriorRecordModel(C0LGC c0lgc, List<? extends C0MJU> list, C0LGK c0lgk, long j, long j2, int i, int i2, Float f, Float f2, ArrayList<Integer> arrayList, boolean z, String str) {
        this.recordPageType = c0lgc;
        this.toolBarList = list;
        this.bottomTabType = c0lgk;
        this.minRecordSeconds = j;
        this.maxRecordSeconds = j2;
        this.maxSelectVideoCount = i;
        this.maxSelectAssetCount = i2;
        this.imageCompress = f;
        this.videoCompress = f2;
        this.targetSize = arrayList;
        this.showPreviewAfterRecord = z;
        this.PreviousPage = str;
    }
}
