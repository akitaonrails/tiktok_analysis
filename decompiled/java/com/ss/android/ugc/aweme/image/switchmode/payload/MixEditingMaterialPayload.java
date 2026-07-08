package com.ss.android.ugc.aweme.image.switchmode.payload;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.switchmode.payload.MixEditingMaterialItemPayload;
import com.ss.android.ugc.aweme.image.switchmode.payload.MixEditingMaterialPayload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MixEditingMaterialPayload extends SwitchModePayload {
    public static final Parcelable.Creator<MixEditingMaterialPayload> CREATOR = new Parcelable.Creator<MixEditingMaterialPayload>() { // from class: X.0mhc
        @Override // android.os.Parcelable.Creator
        public final MixEditingMaterialPayload createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MixEditingMaterialItemPayload.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MixEditingMaterialPayload(i3, parcel.readInt(), arrayList, parcel.readInt(), z);
        }

        @Override // android.os.Parcelable.Creator
        public final MixEditingMaterialPayload[] newArray(int i) {
            return new MixEditingMaterialPayload[i];
        }
    };
    public final boolean autoApply;
    public final int bottomMargin;
    public int livePicCut;
    public final List<MixEditingMaterialItemPayload> mixEditingDataList;
    public final int selectedIndex;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixEditingMaterialPayload)) {
            return false;
        }
        MixEditingMaterialPayload mixEditingMaterialPayload = (MixEditingMaterialPayload) obj;
        return Intrinsics.LJFF(this.mixEditingDataList, mixEditingMaterialPayload.mixEditingDataList) && this.selectedIndex == mixEditingMaterialPayload.selectedIndex && this.autoApply == mixEditingMaterialPayload.autoApply && this.bottomMargin == mixEditingMaterialPayload.bottomMargin && this.livePicCut == mixEditingMaterialPayload.livePicCut;
    }

    public final int hashCode() {
        return (((((((this.mixEditingDataList.hashCode() * 31) + this.selectedIndex) * 31) + C786410Ut5.Z2(this.autoApply)) * 31) + this.bottomMargin) * 31) + this.livePicCut;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingMaterialPayload(mixEditingDataList=");
        sbLIZ.append(this.mixEditingDataList);
        sbLIZ.append(", selectedIndex=");
        sbLIZ.append(this.selectedIndex);
        sbLIZ.append(", autoApply=");
        sbLIZ.append(this.autoApply);
        sbLIZ.append(", bottomMargin=");
        sbLIZ.append(this.bottomMargin);
        sbLIZ.append(", livePicCut=");
        sbLIZ.append(this.livePicCut);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MixEditingMaterialItemPayload> list = this.mixEditingDataList;
        parcel.writeInt(list.size());
        Iterator<MixEditingMaterialItemPayload> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.selectedIndex);
        parcel.writeInt(this.autoApply ? 1 : 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.livePicCut);
    }

    @Override // com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload
    public final int LIZIZ() {
        return this.livePicCut;
    }

    @Override // com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload
    public final void LIZJ(int i) {
        this.livePicCut = i;
    }

    public MixEditingMaterialPayload(int i, int i2, List list, int i3, boolean z) {
        super(SwitchModePayloadType.MIX_MATERIAL_SELECTED, false, i3);
        this.mixEditingDataList = list;
        this.selectedIndex = i;
        this.autoApply = z;
        this.bottomMargin = i2;
        this.livePicCut = i3;
    }
}
