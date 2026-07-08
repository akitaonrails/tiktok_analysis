package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CollectMusicModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CollectMusicModel> CREATOR = new Parcelable.Creator<CollectMusicModel>() { // from class: X.0o4b
        @Override // android.os.Parcelable.Creator
        public final CollectMusicModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String string = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new CollectMusicModel(string, z, z2, z3, z4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CollectMusicModel[] newArray(int i) {
            return new CollectMusicModel[i];
        }
    };

    @C040H
    public boolean hasEnterCollectTab;

    @C040H
    public boolean hasLoadCollectCount;

    @C040H
    public boolean hasMarkedPanelFirstShowtime;

    @C040H
    public boolean hasShowedCollectBadge;

    @C040H
    public final String pinMusicId;

    @C040H
    public String selectedMusicFavoriteTabName;

    public CollectMusicModel() {
        this(null, false, false, false, false, null);
    }

    public final CollectMusicModel copy(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        return new CollectMusicModel(str, z, z2, z3, z4, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectMusicModel)) {
            return false;
        }
        CollectMusicModel collectMusicModel = (CollectMusicModel) obj;
        return Intrinsics.LJFF(this.pinMusicId, collectMusicModel.pinMusicId) && this.hasLoadCollectCount == collectMusicModel.hasLoadCollectCount && this.hasShowedCollectBadge == collectMusicModel.hasShowedCollectBadge && this.hasMarkedPanelFirstShowtime == collectMusicModel.hasMarkedPanelFirstShowtime && this.hasEnterCollectTab == collectMusicModel.hasEnterCollectTab && Intrinsics.LJFF(this.selectedMusicFavoriteTabName, collectMusicModel.selectedMusicFavoriteTabName);
    }

    public int hashCode() {
        String str = this.pinMusicId;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.hasLoadCollectCount)) * 31) + C786410Ut5.Z2(this.hasShowedCollectBadge)) * 31) + C786410Ut5.Z2(this.hasMarkedPanelFirstShowtime)) * 31) + C786410Ut5.Z2(this.hasEnterCollectTab)) * 31;
        String str2 = this.selectedMusicFavoriteTabName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectMusicModel(pinMusicId=");
        sbLIZ.append(this.pinMusicId);
        sbLIZ.append(", hasLoadCollectCount=");
        sbLIZ.append(this.hasLoadCollectCount);
        sbLIZ.append(", hasShowedCollectBadge=");
        sbLIZ.append(this.hasShowedCollectBadge);
        sbLIZ.append(", hasMarkedPanelFirstShowtime=");
        sbLIZ.append(this.hasMarkedPanelFirstShowtime);
        sbLIZ.append(", hasEnterCollectTab=");
        sbLIZ.append(this.hasEnterCollectTab);
        sbLIZ.append(", selectedMusicFavoriteTabName=");
        sbLIZ.append(this.selectedMusicFavoriteTabName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pinMusicId);
        parcel.writeInt(this.hasLoadCollectCount ? 1 : 0);
        parcel.writeInt(this.hasShowedCollectBadge ? 1 : 0);
        parcel.writeInt(this.hasMarkedPanelFirstShowtime ? 1 : 0);
        parcel.writeInt(this.hasEnterCollectTab ? 1 : 0);
        parcel.writeString(this.selectedMusicFavoriteTabName);
    }

    public final boolean getHasEnterCollectTab() {
        return this.hasEnterCollectTab;
    }

    public final boolean getHasLoadCollectCount() {
        return this.hasLoadCollectCount;
    }

    public final boolean getHasMarkedPanelFirstShowtime() {
        return this.hasMarkedPanelFirstShowtime;
    }

    public final boolean getHasShowedCollectBadge() {
        return this.hasShowedCollectBadge;
    }

    public final String getPinMusicId() {
        return this.pinMusicId;
    }

    public final String getSelectedMusicFavoriteTabName() {
        return this.selectedMusicFavoriteTabName;
    }

    public final void setHasEnterCollectTab(boolean z) {
        this.hasEnterCollectTab = z;
    }

    public final void setHasLoadCollectCount(boolean z) {
        this.hasLoadCollectCount = z;
    }

    public final void setHasMarkedPanelFirstShowtime(boolean z) {
        this.hasMarkedPanelFirstShowtime = z;
    }

    public final void setHasShowedCollectBadge(boolean z) {
        this.hasShowedCollectBadge = z;
    }

    public final void setSelectedMusicFavoriteTabName(String str) {
        this.selectedMusicFavoriteTabName = str;
    }

    public CollectMusicModel(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        this.pinMusicId = str;
        this.hasLoadCollectCount = z;
        this.hasShowedCollectBadge = z2;
        this.hasMarkedPanelFirstShowtime = z3;
        this.hasEnterCollectTab = z4;
        this.selectedMusicFavoriteTabName = str2;
    }
}
