package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import X.C1719030upp;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.biz.wallet.network.model.ProcessItemList;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ProcessItemList implements Parcelable, Serializable {
    public static final C1719030upp CREATOR = new Parcelable.Creator<ProcessItemList>() { // from class: X.0upp
        @Override // android.os.Parcelable.Creator
        public final ProcessItemList createFromParcel(Parcel parcel) {
            return new ProcessItemList(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProcessItemList[] newArray(int i) {
            return new ProcessItemList[i];
        }
    };

    @C09CT("intermediate_process_list")
    public final ArrayList<ProcessItem> processItemList;

    @C09CT("remain_step")
    public final String remainStep;

    @C09CT("title")
    public final String title;

    public final ProcessItemList copy(ArrayList<ProcessItem> arrayList, String str, String str2) {
        return new ProcessItemList(arrayList, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessItemList)) {
            return false;
        }
        ProcessItemList processItemList = (ProcessItemList) obj;
        return Intrinsics.LJFF(this.processItemList, processItemList.processItemList) && Intrinsics.LJFF(this.remainStep, processItemList.remainStep) && Intrinsics.LJFF(this.title, processItemList.title);
    }

    public int hashCode() {
        ArrayList<ProcessItem> arrayList = this.processItemList;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.remainStep;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessItemList(processItemList=");
        sbLIZ.append(this.processItemList);
        sbLIZ.append(", remainStep=");
        sbLIZ.append(this.remainStep);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ArrayList<ProcessItem> getProcessItemList() {
        return this.processItemList;
    }

    public final String getRemainStep() {
        return this.remainStep;
    }

    public final String getTitle() {
        return this.title;
    }

    public ProcessItemList(Parcel parcel) {
        this(parcel.readArrayList(ProcessItem.class.getClassLoader()), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.processItemList);
        parcel.writeString(this.remainStep);
        parcel.writeString(this.title);
    }

    public ProcessItemList(ArrayList<ProcessItem> arrayList, String str, String str2) {
        this.processItemList = arrayList;
        this.remainStep = str;
        this.title = str2;
    }
}
