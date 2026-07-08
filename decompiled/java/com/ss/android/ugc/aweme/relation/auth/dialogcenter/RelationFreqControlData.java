package com.ss.android.ugc.aweme.relation.auth.dialogcenter;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;

/* JADX INFO: loaded from: classes17.dex */
public final class RelationFreqControlData implements Parcelable {
    public static final Parcelable.Creator<RelationFreqControlData> CREATOR = new Parcelable.Creator<RelationFreqControlData>() { // from class: X.0dzr
        @Override // android.os.Parcelable.Creator
        public final RelationFreqControlData createFromParcel(Parcel parcel) {
            return new RelationFreqControlData(parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final RelationFreqControlData[] newArray(int i) {
            return new RelationFreqControlData[i];
        }
    };
    public final int firstPhaseCount;
    public final long lastShowTime;
    public final int secondPhaseCount;
    public final int showIndex;
    public final int totalPopupCount;

    public RelationFreqControlData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationFreqControlData)) {
            return false;
        }
        RelationFreqControlData relationFreqControlData = (RelationFreqControlData) obj;
        return this.showIndex == relationFreqControlData.showIndex && this.lastShowTime == relationFreqControlData.lastShowTime && this.firstPhaseCount == relationFreqControlData.firstPhaseCount && this.secondPhaseCount == relationFreqControlData.secondPhaseCount && this.totalPopupCount == relationFreqControlData.totalPopupCount;
    }

    public final int hashCode() {
        return (((((((this.showIndex * 31) + C786410Ut5.Y2(this.lastShowTime)) * 31) + this.firstPhaseCount) * 31) + this.secondPhaseCount) * 31) + this.totalPopupCount;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationFreqControlData(showIndex=");
        sbLIZ.append(this.showIndex);
        sbLIZ.append(", lastShowTime=");
        sbLIZ.append(this.lastShowTime);
        sbLIZ.append(", firstPhaseCount=");
        sbLIZ.append(this.firstPhaseCount);
        sbLIZ.append(", secondPhaseCount=");
        sbLIZ.append(this.secondPhaseCount);
        sbLIZ.append(", totalPopupCount=");
        sbLIZ.append(this.totalPopupCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.showIndex);
        parcel.writeLong(this.lastShowTime);
        parcel.writeInt(this.firstPhaseCount);
        parcel.writeInt(this.secondPhaseCount);
        parcel.writeInt(this.totalPopupCount);
    }

    public /* synthetic */ RelationFreqControlData(int i) {
        this(0, 0L, 0, 0, 0);
    }

    public RelationFreqControlData(int i, long j, int i2, int i3, int i4) {
        this.showIndex = i;
        this.lastShowTime = j;
        this.firstPhaseCount = i2;
        this.secondPhaseCount = i3;
        this.totalPopupCount = i4;
    }
}
