package com.ss.android.ugc.aweme.inbox.workbench.data;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.ss.android.ugc.aweme.inbox.workbench.WorkBenchCardListFragment;
import com.ss.android.ugc.aweme.inbox.workbench.data.WorkBenchCardListFragmentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchCardListFragmentData extends PowerViewPagerFragmentItem<WorkBenchCardListFragment> {
    public final boolean isDefaultTab;
    public final String lastReadTime;
    public final int tabId;
    public final long wallTime;
    public static final Parcelable.Creator<WorkBenchCardListFragmentData> CREATOR = new Parcelable.Creator<WorkBenchCardListFragmentData>() { // from class: X.0Odo
        @Override // android.os.Parcelable.Creator
        public final WorkBenchCardListFragmentData createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            String string = parcel.readString();
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new WorkBenchCardListFragmentData(i, string, j, z);
        }

        @Override // android.os.Parcelable.Creator
        public final WorkBenchCardListFragmentData[] newArray(int i) {
            return new WorkBenchCardListFragmentData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkBenchCardListFragmentData)) {
            return false;
        }
        WorkBenchCardListFragmentData workBenchCardListFragmentData = (WorkBenchCardListFragmentData) obj;
        return this.tabId == workBenchCardListFragmentData.tabId && Intrinsics.LJFF(this.lastReadTime, workBenchCardListFragmentData.lastReadTime) && this.wallTime == workBenchCardListFragmentData.wallTime && this.isDefaultTab == workBenchCardListFragmentData.isDefaultTab;
    }

    public final int hashCode() {
        return (((((this.tabId * 31) + this.lastReadTime.hashCode()) * 31) + C786410Ut5.Y2(this.wallTime)) * 31) + C786410Ut5.Z2(this.isDefaultTab);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkBenchCardListFragmentData(tabId=");
        sbLIZ.append(this.tabId);
        sbLIZ.append(", lastReadTime=");
        sbLIZ.append(this.lastReadTime);
        sbLIZ.append(", wallTime=");
        sbLIZ.append(this.wallTime);
        sbLIZ.append(", isDefaultTab=");
        sbLIZ.append(this.isDefaultTab);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.tabId);
        parcel.writeString(this.lastReadTime);
        parcel.writeLong(this.wallTime);
        parcel.writeInt(this.isDefaultTab ? 1 : 0);
    }

    public WorkBenchCardListFragmentData(int i, String str, long j, boolean z) {
        this.tabId = i;
        this.lastReadTime = str;
        this.wallTime = j;
        this.isDefaultTab = z;
    }
}
