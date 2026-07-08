package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.TabType;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class UploadConfig implements Parcelable {
    public static final Parcelable.Creator<UploadConfig> CREATOR = new Parcelable.Creator<UploadConfig>() { // from class: X.0KsJ
        @Override // android.os.Parcelable.Creator
        public final UploadConfig createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            boolean z;
            Long lValueOf;
            TabType tabTypeCreateFromParcel = TabType.CREATOR.createFromParcel(parcel);
            Long lValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            return new UploadConfig(tabTypeCreateFromParcel, numValueOf, numValueOf2, z, lValueOf, lValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final UploadConfig[] newArray(int i) {
            return new UploadConfig[i];
        }
    };

    @C040H
    public final Long maxVideoDuration;

    @C040H
    public final Long minVideoDuration;

    @C040H
    public final boolean multiSelect;

    @C040H
    public final Integer selectUpPhotos;

    @C040H
    public final Integer selectUpVideos;

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
        if (!(obj instanceof UploadConfig)) {
            return false;
        }
        UploadConfig uploadConfig = (UploadConfig) obj;
        return this.tabType == uploadConfig.tabType && Intrinsics.LJFF(this.selectUpVideos, uploadConfig.selectUpVideos) && Intrinsics.LJFF(this.selectUpPhotos, uploadConfig.selectUpPhotos) && this.multiSelect == uploadConfig.multiSelect && Intrinsics.LJFF(this.minVideoDuration, uploadConfig.minVideoDuration) && Intrinsics.LJFF(this.maxVideoDuration, uploadConfig.maxVideoDuration);
    }

    public final int hashCode() {
        int iHashCode = this.tabType.hashCode() * 31;
        Integer num = this.selectUpVideos;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectUpPhotos;
        int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.multiSelect)) * 31;
        Long l = this.minVideoDuration;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.maxVideoDuration;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadConfig(tabType=");
        sbLIZ.append(this.tabType);
        sbLIZ.append(", selectUpVideos=");
        sbLIZ.append(this.selectUpVideos);
        sbLIZ.append(", selectUpPhotos=");
        sbLIZ.append(this.selectUpPhotos);
        sbLIZ.append(", multiSelect=");
        sbLIZ.append(this.multiSelect);
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
        Integer num = this.selectUpVideos;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.selectUpPhotos;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.multiSelect ? 1 : 0);
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

    public UploadConfig(TabType tabType, Integer num, Integer num2, boolean z, Long l, Long l2) {
        this.tabType = tabType;
        this.selectUpVideos = num;
        this.selectUpPhotos = num2;
        this.multiSelect = z;
        this.minVideoDuration = l;
        this.maxVideoDuration = l2;
    }
}
