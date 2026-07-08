package com.ss.android.ugc.aweme.edit;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Cut2EditTransferModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<Cut2EditTransferModel> CREATOR = new Parcelable.Creator<Cut2EditTransferModel>() { // from class: X.0Kx0
        @Override // android.os.Parcelable.Creator
        public final Cut2EditTransferModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new Cut2EditTransferModel(z, z2, arrayList, j, j2, j3, j4, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Cut2EditTransferModel[] newArray(int i) {
            return new Cut2EditTransferModel[i];
        }
    };

    @C09CT(alternate = {"g"}, value = "albumNextTime")
    public final long albumNextTime;

    @C09CT(alternate = {"f"}, value = "compressVideoTime")
    public final long compressVideoTime;

    @C09CT(alternate = {"e"}, value = "downloadResTime")
    public final long downloadResTime;

    @C09CT(alternate = {"a"}, value = "isVideoCompressed")
    public final boolean isVideoCompressed;

    @C09CT(alternate = {"h"}, value = "lazyLoadStickerPoint")
    public final boolean lazyLoadStickerPoint;

    @C09CT(alternate = {"c"}, value = "musicList")
    public final List<AVMusic> musicList;

    @C09CT(alternate = {"b"}, value = "musicSyncMode")
    public final boolean musicSyncMode;

    @C09CT(alternate = {"d"}, value = "resizeImageTime")
    public final long resizeImageTime;

    public final Cut2EditTransferModel copy(boolean z, boolean z2, List<AVMusic> list, long j, long j2, long j3, long j4, boolean z3) {
        return new Cut2EditTransferModel(z, z2, list, j, j2, j3, j4, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cut2EditTransferModel)) {
            return false;
        }
        Cut2EditTransferModel cut2EditTransferModel = (Cut2EditTransferModel) obj;
        return this.isVideoCompressed == cut2EditTransferModel.isVideoCompressed && this.musicSyncMode == cut2EditTransferModel.musicSyncMode && Intrinsics.LJFF(this.musicList, cut2EditTransferModel.musicList) && this.resizeImageTime == cut2EditTransferModel.resizeImageTime && this.downloadResTime == cut2EditTransferModel.downloadResTime && this.compressVideoTime == cut2EditTransferModel.compressVideoTime && this.albumNextTime == cut2EditTransferModel.albumNextTime && this.lazyLoadStickerPoint == cut2EditTransferModel.lazyLoadStickerPoint;
    }

    public int hashCode() {
        return (((((((((((((C786410Ut5.Z2(this.isVideoCompressed) * 31) + C786410Ut5.Z2(this.musicSyncMode)) * 31) + this.musicList.hashCode()) * 31) + C786410Ut5.Y2(this.resizeImageTime)) * 31) + C786410Ut5.Y2(this.downloadResTime)) * 31) + C786410Ut5.Y2(this.compressVideoTime)) * 31) + C786410Ut5.Y2(this.albumNextTime)) * 31) + C786410Ut5.Z2(this.lazyLoadStickerPoint);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cut2EditTransferModel(isVideoCompressed=");
        sbLIZ.append(this.isVideoCompressed);
        sbLIZ.append(", musicSyncMode=");
        sbLIZ.append(this.musicSyncMode);
        sbLIZ.append(", musicList=");
        sbLIZ.append(this.musicList);
        sbLIZ.append(", resizeImageTime=");
        sbLIZ.append(this.resizeImageTime);
        sbLIZ.append(", downloadResTime=");
        sbLIZ.append(this.downloadResTime);
        sbLIZ.append(", compressVideoTime=");
        sbLIZ.append(this.compressVideoTime);
        sbLIZ.append(", albumNextTime=");
        sbLIZ.append(this.albumNextTime);
        sbLIZ.append(", lazyLoadStickerPoint=");
        sbLIZ.append(this.lazyLoadStickerPoint);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isVideoCompressed ? 1 : 0);
        parcel.writeInt(this.musicSyncMode ? 1 : 0);
        List<AVMusic> list = this.musicList;
        parcel.writeInt(list.size());
        Iterator<AVMusic> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        parcel.writeLong(this.resizeImageTime);
        parcel.writeLong(this.downloadResTime);
        parcel.writeLong(this.compressVideoTime);
        parcel.writeLong(this.albumNextTime);
        parcel.writeInt(this.lazyLoadStickerPoint ? 1 : 0);
    }

    public Cut2EditTransferModel() {
        this(false, false, new ArrayList(), 0L, 0L, 0L, 0L, false);
    }

    public final long getAlbumNextTime() {
        return this.albumNextTime;
    }

    public final long getCompressVideoTime() {
        return this.compressVideoTime;
    }

    public final long getDownloadResTime() {
        return this.downloadResTime;
    }

    public final boolean getLazyLoadStickerPoint() {
        return this.lazyLoadStickerPoint;
    }

    public final List<AVMusic> getMusicList() {
        return this.musicList;
    }

    public final boolean getMusicSyncMode() {
        return this.musicSyncMode;
    }

    public final long getResizeImageTime() {
        return this.resizeImageTime;
    }

    public final boolean isVideoCompressed() {
        return this.isVideoCompressed;
    }

    public Cut2EditTransferModel(boolean z, boolean z2, List<AVMusic> list, long j, long j2, long j3, long j4, boolean z3) {
        this.isVideoCompressed = z;
        this.musicSyncMode = z2;
        this.musicList = list;
        this.resizeImageTime = j;
        this.downloadResTime = j2;
        this.compressVideoTime = j3;
        this.albumNextTime = j4;
        this.lazyLoadStickerPoint = z3;
    }
}
