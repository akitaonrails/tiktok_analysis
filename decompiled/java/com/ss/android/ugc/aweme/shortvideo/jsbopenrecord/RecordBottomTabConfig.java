package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C040H;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordBottomTabConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.TabType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class RecordBottomTabConfig implements Parcelable {
    public static final Parcelable.Creator<RecordBottomTabConfig> CREATOR = new Parcelable.Creator<RecordBottomTabConfig>() { // from class: X.0LE2
        @Override // android.os.Parcelable.Creator
        public final RecordBottomTabConfig createFromParcel(Parcel parcel) {
            Long lValueOf;
            TabType tabTypeCreateFromParcel = TabType.CREATOR.createFromParcel(parcel);
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new RecordBottomTabConfig(tabTypeCreateFromParcel, lValueOf, lValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordBottomTabConfig[] newArray(int i) {
            return new RecordBottomTabConfig[i];
        }
    };

    @C040H
    public final Long maxVideoDuration;

    @C040H
    public final Long minVideoDuration;

    @C040H
    public final TabType tabType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordBottomTabConfig)) {
            return false;
        }
        RecordBottomTabConfig recordBottomTabConfig = (RecordBottomTabConfig) obj;
        return this.tabType == recordBottomTabConfig.tabType && Intrinsics.LJFF(this.minVideoDuration, recordBottomTabConfig.minVideoDuration) && Intrinsics.LJFF(this.maxVideoDuration, recordBottomTabConfig.maxVideoDuration);
    }

    public final int hashCode() {
        int iHashCode = this.tabType.hashCode() * 31;
        Long l = this.minVideoDuration;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.maxVideoDuration;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordBottomTabConfig(tabType=");
        sbLIZ.append(this.tabType);
        sbLIZ.append(", minVideoDuration=");
        sbLIZ.append(this.minVideoDuration);
        sbLIZ.append(", maxVideoDuration=");
        sbLIZ.append(this.maxVideoDuration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.tabType.writeToParcel(parcel, i);
        Long l = this.minVideoDuration;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.maxVideoDuration;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public RecordBottomTabConfig(TabType tabType, Long l, Long l2) {
        this.tabType = tabType;
        this.minVideoDuration = l;
        this.maxVideoDuration = l2;
    }
}
