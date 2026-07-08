package com.ss.android.ugc.aweme.creative.model.effect;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ApplyRecordEffectInfo implements Parcelable {
    public static final Parcelable.Creator<ApplyRecordEffectInfo> CREATOR = new Parcelable.Creator<ApplyRecordEffectInfo>() { // from class: X.0Kuo
        @Override // android.os.Parcelable.Creator
        public final ApplyRecordEffectInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Effect effect = (Effect) parcel.readParcelable(ApplyRecordEffectInfo.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            int i2 = parcel.readInt();
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
            return new ApplyRecordEffectInfo(effect, z, i, i2, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final ApplyRecordEffectInfo[] newArray(int i) {
            return new ApplyRecordEffectInfo[i];
        }
    };

    @C040H
    public final Effect curEffect;

    @C040H
    public final boolean isAppliedSuccess;

    @C040H
    public final boolean isSupportApplyInUploadMedia;

    @C040H
    public boolean needShowFailedToastInEditPage;

    @C040H
    public final int photoSelectMaxCount;

    @C040H
    public final int photoSelectMinCount;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplyRecordEffectInfo() {
        this(null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyRecordEffectInfo)) {
            return false;
        }
        ApplyRecordEffectInfo applyRecordEffectInfo = (ApplyRecordEffectInfo) obj;
        return Intrinsics.LJFF(this.curEffect, applyRecordEffectInfo.curEffect) && this.isSupportApplyInUploadMedia == applyRecordEffectInfo.isSupportApplyInUploadMedia && this.photoSelectMinCount == applyRecordEffectInfo.photoSelectMinCount && this.photoSelectMaxCount == applyRecordEffectInfo.photoSelectMaxCount && this.isAppliedSuccess == applyRecordEffectInfo.isAppliedSuccess && this.needShowFailedToastInEditPage == applyRecordEffectInfo.needShowFailedToastInEditPage;
    }

    public final int hashCode() {
        Effect effect = this.curEffect;
        return ((((((((((effect == null ? 0 : effect.hashCode()) * 31) + C786410Ut5.Z2(this.isSupportApplyInUploadMedia)) * 31) + this.photoSelectMinCount) * 31) + this.photoSelectMaxCount) * 31) + C786410Ut5.Z2(this.isAppliedSuccess)) * 31) + C786410Ut5.Z2(this.needShowFailedToastInEditPage);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyRecordEffectInfo(curEffect=");
        sbLIZ.append(this.curEffect);
        sbLIZ.append(", isSupportApplyInUploadMedia=");
        sbLIZ.append(this.isSupportApplyInUploadMedia);
        sbLIZ.append(", photoSelectMinCount=");
        sbLIZ.append(this.photoSelectMinCount);
        sbLIZ.append(", photoSelectMaxCount=");
        sbLIZ.append(this.photoSelectMaxCount);
        sbLIZ.append(", isAppliedSuccess=");
        sbLIZ.append(this.isAppliedSuccess);
        sbLIZ.append(", needShowFailedToastInEditPage=");
        sbLIZ.append(this.needShowFailedToastInEditPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.curEffect, i);
        parcel.writeInt(this.isSupportApplyInUploadMedia ? 1 : 0);
        parcel.writeInt(this.photoSelectMinCount);
        parcel.writeInt(this.photoSelectMaxCount);
        parcel.writeInt(this.isAppliedSuccess ? 1 : 0);
        parcel.writeInt(this.needShowFailedToastInEditPage ? 1 : 0);
    }

    public static ApplyRecordEffectInfo LIZ(ApplyRecordEffectInfo applyRecordEffectInfo, boolean z) {
        return new ApplyRecordEffectInfo(applyRecordEffectInfo.curEffect, applyRecordEffectInfo.isSupportApplyInUploadMedia, applyRecordEffectInfo.photoSelectMinCount, applyRecordEffectInfo.photoSelectMaxCount, z, applyRecordEffectInfo.needShowFailedToastInEditPage);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ApplyRecordEffectInfo(Effect effect, boolean z, int i, int i2, int i3) {
        boolean z2;
        int i4 = i2;
        int i5 = i;
        boolean z3 = z;
        Effect effect2 = (i3 & 1) != 0 ? null : effect;
        z3 = (i3 & 2) != 0 ? true : z3;
        i5 = (i3 & 4) != 0 ? 1 : i5;
        i4 = (i3 & 8) != 0 ? 1 : i4;
        if ((i3 & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(effect2, z3, i5, i4, z2, false);
    }

    public ApplyRecordEffectInfo(Effect effect, boolean z, int i, int i2, boolean z2, boolean z3) {
        this.curEffect = effect;
        this.isSupportApplyInUploadMedia = z;
        this.photoSelectMinCount = i;
        this.photoSelectMaxCount = i2;
        this.isAppliedSuccess = z2;
        this.needShowFailedToastInEditPage = z3;
    }
}
