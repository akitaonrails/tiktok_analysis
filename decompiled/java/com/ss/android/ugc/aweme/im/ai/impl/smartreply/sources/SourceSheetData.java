package com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetContext;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetData;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetETParam;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.sources.SourceSheetItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SourceSheetData implements Parcelable {
    public static final Parcelable.Creator<SourceSheetData> CREATOR = new Parcelable.Creator<SourceSheetData>() { // from class: X.0wSr
        @Override // android.os.Parcelable.Creator
        public final SourceSheetData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            SourceSheetETParam sourceSheetETParamCreateFromParcel;
            SourceSheetContext sourceSheetContextCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SourceSheetItem.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                sourceSheetETParamCreateFromParcel = null;
            } else {
                sourceSheetETParamCreateFromParcel = SourceSheetETParam.CREATOR.createFromParcel(parcel);
            }
            SourceSheetETParam sourceSheetETParam = sourceSheetETParamCreateFromParcel;
            if (parcel.readInt() != 0) {
                sourceSheetContextCreateFromParcel = SourceSheetContext.CREATOR.createFromParcel(parcel);
            }
            return new SourceSheetData(arrayList, sourceSheetETParam, sourceSheetContextCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SourceSheetData[] newArray(int i) {
            return new SourceSheetData[i];
        }
    };
    public final SourceSheetContext context;
    public final SourceSheetETParam etParam;
    public final List<SourceSheetItem> items;

    public SourceSheetData() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceSheetData)) {
            return false;
        }
        SourceSheetData sourceSheetData = (SourceSheetData) obj;
        return Intrinsics.LJFF(this.items, sourceSheetData.items) && Intrinsics.LJFF(this.etParam, sourceSheetData.etParam) && Intrinsics.LJFF(this.context, sourceSheetData.context);
    }

    public final int hashCode() {
        List<SourceSheetItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        SourceSheetETParam sourceSheetETParam = this.etParam;
        int iHashCode2 = (iHashCode + (sourceSheetETParam == null ? 0 : sourceSheetETParam.hashCode())) * 31;
        SourceSheetContext sourceSheetContext = this.context;
        return iHashCode2 + (sourceSheetContext != null ? sourceSheetContext.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SourceSheetData(items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", etParam=");
        sbLIZ.append(this.etParam);
        sbLIZ.append(", context=");
        sbLIZ.append(this.context);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<SourceSheetItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SourceSheetItem> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        SourceSheetETParam sourceSheetETParam = this.etParam;
        if (sourceSheetETParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sourceSheetETParam.enterFrom);
        }
        SourceSheetContext sourceSheetContext = this.context;
        if (sourceSheetContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sourceSheetContext.writeToParcel(parcel, i);
        }
    }

    public SourceSheetData(List<SourceSheetItem> list, SourceSheetETParam sourceSheetETParam, SourceSheetContext sourceSheetContext) {
        this.items = list;
        this.etParam = sourceSheetETParam;
        this.context = sourceSheetContext;
    }
}
