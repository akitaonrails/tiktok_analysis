package com.ss.android.ugc.aweme.biz.wallet.network.model;

import X.C09CT;
import X.C1719070upt;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.biz.wallet.network.model.ProcessItem;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ProcessItem implements Parcelable, Serializable {
    public static final C1719070upt CREATOR = new Parcelable.Creator<ProcessItem>() { // from class: X.0upt
        @Override // android.os.Parcelable.Creator
        public final ProcessItem createFromParcel(Parcel parcel) {
            return new ProcessItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProcessItem[] newArray(int i) {
            return new ProcessItem[i];
        }
    };

    @C09CT("detail")
    public final String detail;

    @C09CT("step_name")
    public final String itemName;

    @C09CT("step_status")
    public final String itemStatus;

    @C09CT("title")
    public final String title;

    public final ProcessItem copy(String str, String str2, String str3, String str4) {
        return new ProcessItem(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessItem)) {
            return false;
        }
        ProcessItem processItem = (ProcessItem) obj;
        return Intrinsics.LJFF(this.itemName, processItem.itemName) && Intrinsics.LJFF(this.itemStatus, processItem.itemStatus) && Intrinsics.LJFF(this.title, processItem.title) && Intrinsics.LJFF(this.detail, processItem.detail);
    }

    public int hashCode() {
        String str = this.itemName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.detail;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessItem(itemName=");
        sbLIZ.append(this.itemName);
        sbLIZ.append(", itemStatus=");
        sbLIZ.append(this.itemStatus);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", detail=");
        sbLIZ.append(this.detail);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final String getItemStatus() {
        return this.itemStatus;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProcessItem(Parcel parcel) {
        String string = parcel.readString();
        this(string == null ? "" : string, parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemName);
        parcel.writeString(this.itemStatus);
        parcel.writeString(this.title);
        parcel.writeString(this.detail);
    }

    public ProcessItem(String str, String str2, String str3, String str4) {
        this.itemName = str;
        this.itemStatus = str2;
        this.title = str3;
        this.detail = str4;
    }
}
