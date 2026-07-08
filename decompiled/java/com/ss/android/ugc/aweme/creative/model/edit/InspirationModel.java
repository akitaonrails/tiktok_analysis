package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import com.ss.android.ugc.aweme.creative.model.edit.InspirationModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class InspirationModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<InspirationModel> CREATOR = new Parcelable.Creator<InspirationModel>() { // from class: X.0mcf
        @Override // android.os.Parcelable.Creator
        public final InspirationModel createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InspirationItemData.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(InspirationItemData.CREATOR.createFromParcel(parcel));
            }
            return new InspirationModel(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final InspirationModel[] newArray(int i) {
            return new InspirationModel[i];
        }
    };

    @C040H
    public List<InspirationItemData> ideaInspirationList;

    @C040H
    public List<InspirationItemData> titleInspirationList;

    public final InspirationModel copy(List<InspirationItemData> list, List<InspirationItemData> list2) {
        return new InspirationModel(list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InspirationModel)) {
            return false;
        }
        InspirationModel inspirationModel = (InspirationModel) obj;
        return Intrinsics.LJFF(this.titleInspirationList, inspirationModel.titleInspirationList) && Intrinsics.LJFF(this.ideaInspirationList, inspirationModel.ideaInspirationList);
    }

    public int hashCode() {
        return (this.titleInspirationList.hashCode() * 31) + this.ideaInspirationList.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InspirationModel(titleInspirationList=");
        sbLIZ.append(this.titleInspirationList);
        sbLIZ.append(", ideaInspirationList=");
        sbLIZ.append(this.ideaInspirationList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<InspirationItemData> list = this.titleInspirationList;
        parcel.writeInt(list.size());
        Iterator<InspirationItemData> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InspirationItemData> list2 = this.ideaInspirationList;
        parcel.writeInt(list2.size());
        Iterator<InspirationItemData> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public InspirationModel() {
        this(new ArrayList(), new ArrayList());
    }

    public final List<InspirationItemData> getIdeaInspirationList() {
        return this.ideaInspirationList;
    }

    public final List<InspirationItemData> getTitleInspirationList() {
        return this.titleInspirationList;
    }

    public final void setIdeaInspirationList(List<InspirationItemData> list) {
        this.ideaInspirationList = list;
    }

    public final void setTitleInspirationList(List<InspirationItemData> list) {
        this.titleInspirationList = list;
    }

    public InspirationModel(List<InspirationItemData> list, List<InspirationItemData> list2) {
        this.titleInspirationList = list;
        this.ideaInspirationList = list2;
    }
}
