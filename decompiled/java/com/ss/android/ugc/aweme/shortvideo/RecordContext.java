package com.ss.android.ugc.aweme.shortvideo;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.shortvideo.RecordContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class RecordContext implements Parcelable {
    public static final Parcelable.Creator<RecordContext> CREATOR = new Parcelable.Creator<RecordContext>() { // from class: X.0suj
        @Override // android.os.Parcelable.Creator
        public final RecordContext createFromParcel(Parcel parcel) {
            return new RecordContext((StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()), (StrArray) parcel.readParcelable(RecordContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecordContext[] newArray(int i) {
            return new RecordContext[i];
        }
    };
    public final StrArray eyesLables;
    public final StrArray filterCategoryKeys;
    public final StrArray filterEnterMethod;
    public final StrArray filterIds;
    public final StrArray filterIsDefaultInfos;
    public final StrArray filterLabels;
    public final StrArray filterValues;
    public final StrArray reshapeLabels;
    public final StrArray smoothSkinLabels;
    public final StrArray tanningLabels;

    /* JADX WARN: Illegal instructions before constructor call */
    public RecordContext() {
        StrArray strArray = null;
        this(strArray, strArray, strArray, strArray, strArray, strArray, strArray, 1023);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordContext)) {
            return false;
        }
        RecordContext recordContext = (RecordContext) obj;
        return Intrinsics.LJFF(this.filterLabels, recordContext.filterLabels) && Intrinsics.LJFF(this.filterIds, recordContext.filterIds) && Intrinsics.LJFF(this.filterValues, recordContext.filterValues) && Intrinsics.LJFF(this.filterEnterMethod, recordContext.filterEnterMethod) && Intrinsics.LJFF(this.smoothSkinLabels, recordContext.smoothSkinLabels) && Intrinsics.LJFF(this.reshapeLabels, recordContext.reshapeLabels) && Intrinsics.LJFF(this.eyesLables, recordContext.eyesLables) && Intrinsics.LJFF(this.tanningLabels, recordContext.tanningLabels) && Intrinsics.LJFF(this.filterCategoryKeys, recordContext.filterCategoryKeys) && Intrinsics.LJFF(this.filterIsDefaultInfos, recordContext.filterIsDefaultInfos);
    }

    public final int hashCode() {
        return (((((((((((((((((this.filterLabels.hashCode() * 31) + this.filterIds.hashCode()) * 31) + this.filterValues.hashCode()) * 31) + this.filterEnterMethod.hashCode()) * 31) + this.smoothSkinLabels.hashCode()) * 31) + this.reshapeLabels.hashCode()) * 31) + this.eyesLables.hashCode()) * 31) + this.tanningLabels.hashCode()) * 31) + this.filterCategoryKeys.hashCode()) * 31) + this.filterIsDefaultInfos.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordContext(filterLabels=");
        sbLIZ.append(this.filterLabels);
        sbLIZ.append(", filterIds=");
        sbLIZ.append(this.filterIds);
        sbLIZ.append(", filterValues=");
        sbLIZ.append(this.filterValues);
        sbLIZ.append(", filterEnterMethod=");
        sbLIZ.append(this.filterEnterMethod);
        sbLIZ.append(", smoothSkinLabels=");
        sbLIZ.append(this.smoothSkinLabels);
        sbLIZ.append(", reshapeLabels=");
        sbLIZ.append(this.reshapeLabels);
        sbLIZ.append(", eyesLables=");
        sbLIZ.append(this.eyesLables);
        sbLIZ.append(", tanningLabels=");
        sbLIZ.append(this.tanningLabels);
        sbLIZ.append(", filterCategoryKeys=");
        sbLIZ.append(this.filterCategoryKeys);
        sbLIZ.append(", filterIsDefaultInfos=");
        sbLIZ.append(this.filterIsDefaultInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.filterLabels, i);
        parcel.writeParcelable(this.filterIds, i);
        parcel.writeParcelable(this.filterValues, i);
        parcel.writeParcelable(this.filterEnterMethod, i);
        parcel.writeParcelable(this.smoothSkinLabels, i);
        parcel.writeParcelable(this.reshapeLabels, i);
        parcel.writeParcelable(this.eyesLables, i);
        parcel.writeParcelable(this.tanningLabels, i);
        parcel.writeParcelable(this.filterCategoryKeys, i);
        parcel.writeParcelable(this.filterIsDefaultInfos, i);
    }

    public /* synthetic */ RecordContext(StrArray strArray, StrArray strArray2, StrArray strArray3, StrArray strArray4, StrArray strArray5, StrArray strArray6, StrArray strArray7, int i) {
        StrArray strArray8;
        StrArray strArray9;
        StrArray strArray10 = strArray7;
        StrArray strArray11 = strArray6;
        StrArray strArray12 = strArray5;
        StrArray strArray13 = strArray4;
        StrArray strArray14 = strArray3;
        StrArray strArray15 = strArray2;
        StrArray strArray16 = (i & 1) != 0 ? new StrArray() : strArray;
        strArray15 = (i & 2) != 0 ? new StrArray() : strArray15;
        strArray14 = (i & 4) != 0 ? new StrArray() : strArray14;
        strArray13 = (i & 8) != 0 ? new StrArray() : strArray13;
        strArray12 = (i & 16) != 0 ? new StrArray() : strArray12;
        strArray11 = (i & 32) != 0 ? new StrArray() : strArray11;
        strArray10 = (i & 64) != 0 ? new StrArray() : strArray10;
        if ((i & 128) != 0) {
            strArray8 = new StrArray();
        } else {
            strArray8 = null;
        }
        if ((i & 256) != 0) {
            strArray9 = new StrArray();
        } else {
            strArray9 = null;
        }
        this(strArray16, strArray15, strArray14, strArray13, strArray12, strArray11, strArray10, strArray8, strArray9, (i & 512) != 0 ? new StrArray() : null);
    }

    public RecordContext(StrArray strArray, StrArray strArray2, StrArray strArray3, StrArray strArray4, StrArray strArray5, StrArray strArray6, StrArray strArray7, StrArray strArray8, StrArray strArray9, StrArray strArray10) {
        this.filterLabels = strArray;
        this.filterIds = strArray2;
        this.filterValues = strArray3;
        this.filterEnterMethod = strArray4;
        this.smoothSkinLabels = strArray5;
        this.reshapeLabels = strArray6;
        this.eyesLables = strArray7;
        this.tanningLabels = strArray8;
        this.filterCategoryKeys = strArray9;
        this.filterIsDefaultInfos = strArray10;
    }
}
