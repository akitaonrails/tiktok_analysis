package com.ss.android.ugc.cut_ui;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.CutResultData;
import com.ss.android.ugc.cut_ui.MediaItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class CutResultData implements Parcelable {
    public static final Parcelable.Creator<CutResultData> CREATOR = new Parcelable.Creator<CutResultData>() { // from class: X.0L83
        @Override // android.os.Parcelable.Creator
        public final CutResultData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MediaItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new CutResultData(string, string2, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CutResultData[] newArray(int i) {
            return new CutResultData[i];
        }
    };
    public final String conactFilePath;
    public final String conactWorksapceId;
    public final ArrayList<MediaItem> editMediaItemList;
    public final List<String> lastTextList;
    public final List<String> originTextList;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutResultData)) {
            return false;
        }
        CutResultData cutResultData = (CutResultData) obj;
        return Intrinsics.LJFF(this.conactFilePath, cutResultData.conactFilePath) && Intrinsics.LJFF(this.conactWorksapceId, cutResultData.conactWorksapceId) && Intrinsics.LJFF(this.originTextList, cutResultData.originTextList) && Intrinsics.LJFF(this.lastTextList, cutResultData.lastTextList) && Intrinsics.LJFF(this.editMediaItemList, cutResultData.editMediaItemList);
    }

    public final int hashCode() {
        String str = this.conactFilePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.conactWorksapceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.originTextList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.lastTextList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ArrayList<MediaItem> arrayList = this.editMediaItemList;
        return iHashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutResultData(conactFilePath=");
        sbLIZ.append(this.conactFilePath);
        sbLIZ.append(", conactWorksapceId=");
        sbLIZ.append(this.conactWorksapceId);
        sbLIZ.append(", originTextList=");
        sbLIZ.append(this.originTextList);
        sbLIZ.append(", lastTextList=");
        sbLIZ.append(this.lastTextList);
        sbLIZ.append(", editMediaItemList=");
        sbLIZ.append(this.editMediaItemList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.conactFilePath);
        parcel.writeString(this.conactWorksapceId);
        parcel.writeStringList(this.originTextList);
        parcel.writeStringList(this.lastTextList);
        ArrayList<MediaItem> arrayList = this.editMediaItemList;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<MediaItem> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static CutResultData LIZ(CutResultData cutResultData, ArrayList arrayList, int i) {
        String str;
        String str2;
        List<String> list;
        ArrayList arrayList2 = arrayList;
        List<String> list2 = null;
        if ((i & 1) != 0) {
            str = cutResultData.conactFilePath;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = cutResultData.conactWorksapceId;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            list = cutResultData.originTextList;
        } else {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = cutResultData.lastTextList;
        }
        if ((i & 16) != 0) {
            arrayList2 = cutResultData.editMediaItemList;
        }
        return new CutResultData(str, str2, list, list2, arrayList2);
    }

    public CutResultData(String str, String str2, List<String> list, List<String> list2, ArrayList<MediaItem> arrayList) {
        this.conactFilePath = str;
        this.conactWorksapceId = str2;
        this.originTextList = list;
        this.lastTextList = list2;
        this.editMediaItemList = arrayList;
    }
}
