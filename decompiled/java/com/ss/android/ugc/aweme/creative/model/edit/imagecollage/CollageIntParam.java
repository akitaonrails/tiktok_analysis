package com.ss.android.ugc.aweme.creative.model.edit.imagecollage;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CellIntParam;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageIntParam;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class CollageIntParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<CollageIntParam> CREATOR = new Parcelable.Creator<CollageIntParam>() { // from class: X.0HUX
        @Override // android.os.Parcelable.Creator
        public final CollageIntParam createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(CellIntParam.CREATOR.createFromParcel(parcel));
            }
            return new CollageIntParam(string, i, i2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CollageIntParam[] newArray(int i) {
            return new CollageIntParam[i];
        }
    };

    @C09CT("cells")
    public final List<CellIntParam> cells;

    @C09CT("collage_id")
    public final String collageId;

    @C09CT("cols")
    public final int cols;

    @C09CT("rows")
    public final int rows;

    public CollageIntParam() {
        this(null, 0, 0, null, 15, null);
    }

    public final CollageIntParam copy(String str, int i, int i2, List<CellIntParam> list) {
        return new CollageIntParam(str, i, i2, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollageIntParam)) {
            return false;
        }
        CollageIntParam collageIntParam = (CollageIntParam) obj;
        return Intrinsics.LJFF(this.collageId, collageIntParam.collageId) && this.rows == collageIntParam.rows && this.cols == collageIntParam.cols && Intrinsics.LJFF(this.cells, collageIntParam.cells);
    }

    public int hashCode() {
        return (((((this.collageId.hashCode() * 31) + this.rows) * 31) + this.cols) * 31) + this.cells.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollageIntParam(collageId=");
        sbLIZ.append(this.collageId);
        sbLIZ.append(", rows=");
        sbLIZ.append(this.rows);
        sbLIZ.append(", cols=");
        sbLIZ.append(this.cols);
        sbLIZ.append(", cells=");
        sbLIZ.append(this.cells);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.collageId);
        parcel.writeInt(this.rows);
        parcel.writeInt(this.cols);
        List<CellIntParam> list = this.cells;
        parcel.writeInt(list.size());
        Iterator<CellIntParam> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public final List<CellIntParam> getCells() {
        return this.cells;
    }

    public final String getCollageId() {
        return this.collageId;
    }

    public final int getCols() {
        return this.cols;
    }

    public final int getRows() {
        return this.rows;
    }

    public CollageIntParam(String str, int i, int i2, List<CellIntParam> list) {
        this.collageId = str;
        this.rows = i;
        this.cols = i2;
        this.cells = list;
    }

    public CollageIntParam(String str, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
