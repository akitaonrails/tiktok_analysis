package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoSwitchFromImageModel;
import com.ss.android.ugc.aweme.creative.model.ailive.EditSwitchStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoSwitchFromImageModel implements Parcelable {
    public static final Parcelable.Creator<AILivePhotoSwitchFromImageModel> CREATOR = new Parcelable.Creator<AILivePhotoSwitchFromImageModel>() { // from class: X.0MEq
        @Override // android.os.Parcelable.Creator
        public final AILivePhotoSwitchFromImageModel createFromParcel(Parcel parcel) {
            Long lValueOf;
            boolean z;
            EditSwitchStyle editSwitchStyleCreateFromParcel = EditSwitchStyle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AILivePhotoSwitchFromImageModel(editSwitchStyleCreateFromParcel, lValueOf, z);
        }

        @Override // android.os.Parcelable.Creator
        public final AILivePhotoSwitchFromImageModel[] newArray(int i) {
            return new AILivePhotoSwitchFromImageModel[i];
        }
    };

    @C040H
    public boolean hasProcessAutoShow;

    @C040H
    public Long switchStartTime;

    @C040H
    public EditSwitchStyle switchStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public AILivePhotoSwitchFromImageModel() {
        this((EditSwitchStyle) null, (Long) (0 == true ? 1 : 0), 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AILivePhotoSwitchFromImageModel)) {
            return false;
        }
        AILivePhotoSwitchFromImageModel aILivePhotoSwitchFromImageModel = (AILivePhotoSwitchFromImageModel) obj;
        return this.switchStyle == aILivePhotoSwitchFromImageModel.switchStyle && Intrinsics.LJFF(this.switchStartTime, aILivePhotoSwitchFromImageModel.switchStartTime) && this.hasProcessAutoShow == aILivePhotoSwitchFromImageModel.hasProcessAutoShow;
    }

    public final int hashCode() {
        int iHashCode = this.switchStyle.hashCode() * 31;
        Long l = this.switchStartTime;
        return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.hasProcessAutoShow);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AILivePhotoSwitchFromImageModel(switchStyle=");
        sbLIZ.append(this.switchStyle);
        sbLIZ.append(", switchStartTime=");
        sbLIZ.append(this.switchStartTime);
        sbLIZ.append(", hasProcessAutoShow=");
        sbLIZ.append(this.hasProcessAutoShow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.switchStyle.writeToParcel(parcel, i);
        Long l = this.switchStartTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.hasProcessAutoShow ? 1 : 0);
    }

    public /* synthetic */ AILivePhotoSwitchFromImageModel(EditSwitchStyle editSwitchStyle, Long l, int i) {
        this((i & 1) != 0 ? EditSwitchStyle.NONE : editSwitchStyle, (i & 2) != 0 ? null : l, false);
    }

    public AILivePhotoSwitchFromImageModel(EditSwitchStyle editSwitchStyle, Long l, boolean z) {
        this.switchStyle = editSwitchStyle;
        this.switchStartTime = l;
        this.hasProcessAutoShow = z;
    }
}
