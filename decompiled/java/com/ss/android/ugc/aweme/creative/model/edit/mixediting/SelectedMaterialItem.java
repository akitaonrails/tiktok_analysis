package com.ss.android.ugc.aweme.creative.model.edit.mixediting;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class SelectedMaterialItem implements Parcelable {
    public static final Parcelable.Creator<SelectedMaterialItem> CREATOR = new Parcelable.Creator<SelectedMaterialItem>() { // from class: X.0mrJ
        @Override // android.os.Parcelable.Creator
        public final SelectedMaterialItem createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            MixEditingMaterialType mixEditingMaterialTypeCreateFromParcel = MixEditingMaterialType.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            long j = parcel.readLong();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new SelectedMaterialItem(string, string2, string3, i, mixEditingMaterialTypeCreateFromParcel, z, j, z2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedMaterialItem[] newArray(int i) {
            return new SelectedMaterialItem[i];
        }
    };

    @C040H
    public long applyTimestamp;

    @C09CT("bind_manual_music_id")
    public String bindManualMusicId;

    @C09CT("bind_music_id")
    public String bindMusicId;

    @C09CT("from_mix_editing_recommend")
    public boolean fromMixEditingRecommend;

    @C09CT("is_auto_apply")
    public final boolean isAutoApply;

    @C09CT("material_id")
    public final String materialId;

    @C09CT("material_position")
    public final int materialPosition;

    @C09CT("material_type")
    public final MixEditingMaterialType materialType;

    @C09CT("selectMethod")
    public String selectMethod;

    public SelectedMaterialItem() {
        this("", null, null, 0, MixEditingMaterialType.UNKNOWN_TYPE, false, -1L, false, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedMaterialItem)) {
            return false;
        }
        SelectedMaterialItem selectedMaterialItem = (SelectedMaterialItem) obj;
        return Intrinsics.LJFF(this.materialId, selectedMaterialItem.materialId) && Intrinsics.LJFF(this.bindMusicId, selectedMaterialItem.bindMusicId) && Intrinsics.LJFF(this.bindManualMusicId, selectedMaterialItem.bindManualMusicId) && this.materialPosition == selectedMaterialItem.materialPosition && this.materialType == selectedMaterialItem.materialType && this.isAutoApply == selectedMaterialItem.isAutoApply && this.applyTimestamp == selectedMaterialItem.applyTimestamp && this.fromMixEditingRecommend == selectedMaterialItem.fromMixEditingRecommend && Intrinsics.LJFF(this.selectMethod, selectedMaterialItem.selectMethod);
    }

    public final int hashCode() {
        int iHashCode = this.materialId.hashCode() * 31;
        String str = this.bindMusicId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bindManualMusicId;
        return ((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.materialPosition) * 31) + this.materialType.hashCode()) * 31) + C786410Ut5.Z2(this.isAutoApply)) * 31) + C786410Ut5.Y2(this.applyTimestamp)) * 31) + C786410Ut5.Z2(this.fromMixEditingRecommend)) * 31) + this.selectMethod.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectedMaterialItem(materialId=");
        sbLIZ.append(this.materialId);
        sbLIZ.append(", bindMusicId=");
        sbLIZ.append(this.bindMusicId);
        sbLIZ.append(", bindManualMusicId=");
        sbLIZ.append(this.bindManualMusicId);
        sbLIZ.append(", materialPosition=");
        sbLIZ.append(this.materialPosition);
        sbLIZ.append(", materialType=");
        sbLIZ.append(this.materialType);
        sbLIZ.append(", isAutoApply=");
        sbLIZ.append(this.isAutoApply);
        sbLIZ.append(", applyTimestamp=");
        sbLIZ.append(this.applyTimestamp);
        sbLIZ.append(", fromMixEditingRecommend=");
        sbLIZ.append(this.fromMixEditingRecommend);
        sbLIZ.append(", selectMethod=");
        sbLIZ.append(this.selectMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.materialId);
        parcel.writeString(this.bindMusicId);
        parcel.writeString(this.bindManualMusicId);
        parcel.writeInt(this.materialPosition);
        this.materialType.writeToParcel(parcel, i);
        parcel.writeInt(this.isAutoApply ? 1 : 0);
        parcel.writeLong(this.applyTimestamp);
        parcel.writeInt(this.fromMixEditingRecommend ? 1 : 0);
        parcel.writeString(this.selectMethod);
    }

    public SelectedMaterialItem(String str, String str2, String str3, int i, MixEditingMaterialType mixEditingMaterialType, boolean z, long j, boolean z2, String str4) {
        this.materialId = str;
        this.bindMusicId = str2;
        this.bindManualMusicId = str3;
        this.materialPosition = i;
        this.materialType = mixEditingMaterialType;
        this.isAutoApply = z;
        this.applyTimestamp = j;
        this.fromMixEditingRecommend = z2;
        this.selectMethod = str4;
    }
}
