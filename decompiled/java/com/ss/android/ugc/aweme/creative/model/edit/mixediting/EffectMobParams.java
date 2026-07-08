package com.ss.android.ugc.aweme.creative.model.edit.mixediting;

import X.C040H;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.EffectMobParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class EffectMobParams implements Parcelable {
    public static final Parcelable.Creator<EffectMobParams> CREATOR = new Parcelable.Creator<EffectMobParams>() { // from class: X.0FPa
        @Override // android.os.Parcelable.Creator
        public final EffectMobParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
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
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            long j = parcel.readLong();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new EffectMobParams(i, j, string, string2, string3, string4, string5, string6, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final EffectMobParams[] newArray(int i) {
            return new EffectMobParams[i];
        }
    };

    @C040H
    public long applyTime;

    @C040H
    public final String effectEntrancePosition;

    @C040H
    public final String effectId;

    @C040H
    public final String effectResourceId;

    @C040H
    public final int index;

    @C040H
    public final boolean isEditProp;

    @C040H
    public final boolean isEditorPro;

    @C040H
    public boolean isMixEditRecommend;

    @C040H
    public String musicId;

    @C040H
    public String propId;

    @C040H
    public final String tabName;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public EffectMobParams() {
        String str = null;
        this(0, 2047, 0L, str, str, str, str, str, str, (boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectMobParams)) {
            return false;
        }
        EffectMobParams effectMobParams = (EffectMobParams) obj;
        return Intrinsics.LJFF(this.effectEntrancePosition, effectMobParams.effectEntrancePosition) && Intrinsics.LJFF(this.effectId, effectMobParams.effectId) && Intrinsics.LJFF(this.effectResourceId, effectMobParams.effectResourceId) && this.index == effectMobParams.index && this.isEditorPro == effectMobParams.isEditorPro && this.isEditProp == effectMobParams.isEditProp && Intrinsics.LJFF(this.musicId, effectMobParams.musicId) && Intrinsics.LJFF(this.tabName, effectMobParams.tabName) && this.applyTime == effectMobParams.applyTime && Intrinsics.LJFF(this.propId, effectMobParams.propId) && this.isMixEditRecommend == effectMobParams.isMixEditRecommend;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.effectEntrancePosition.hashCode() * 31) + this.effectId.hashCode()) * 31) + this.effectResourceId.hashCode()) * 31) + this.index) * 31) + C786410Ut5.Z2(this.isEditorPro)) * 31) + C786410Ut5.Z2(this.isEditProp)) * 31) + this.musicId.hashCode()) * 31) + this.tabName.hashCode()) * 31) + C786410Ut5.Y2(this.applyTime)) * 31) + this.propId.hashCode()) * 31) + C786410Ut5.Z2(this.isMixEditRecommend);
    }

    public final String toString() {
        return "EffectMobParams(effectEntrancePosition=" + this.effectEntrancePosition + ", effectId=" + this.effectId + ", effectResourceId=" + this.effectResourceId + ", index=" + this.index + ", isEditorPro=" + this.isEditorPro + ", isEditProp=" + this.isEditProp + ", musicId=" + this.musicId + ", tabName=" + this.tabName + ", applyTime=" + this.applyTime + ", propId=" + this.propId + ", isMixEditRecommend=" + this.isMixEditRecommend + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.effectEntrancePosition);
        parcel.writeString(this.effectId);
        parcel.writeString(this.effectResourceId);
        parcel.writeInt(this.index);
        parcel.writeInt(this.isEditorPro ? 1 : 0);
        parcel.writeInt(this.isEditProp ? 1 : 0);
        parcel.writeString(this.musicId);
        parcel.writeString(this.tabName);
        parcel.writeLong(this.applyTime);
        parcel.writeString(this.propId);
        parcel.writeInt(this.isMixEditRecommend ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EffectMobParams(int i, int i2, long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        long j2 = j;
        String str7 = str5;
        String str8 = str4;
        String str9 = str3;
        boolean z3 = z;
        boolean z4 = z2;
        int i3 = i;
        String str10 = str2;
        String str11 = (i2 & 1) != 0 ? "" : str;
        str10 = (i2 & 2) != 0 ? "" : str10;
        str9 = (i2 & 4) != 0 ? "" : str9;
        i3 = (i2 & 8) != 0 ? -1 : i3;
        z3 = (i2 & 16) != 0 ? false : z3;
        z4 = (i2 & 32) != 0 ? false : z4;
        this(i3, (i2 & 256) != 0 ? 0L : j2, str11, str10, str9, (i2 & 64) != 0 ? "" : str8, (i2 & 128) != 0 ? "" : str7, (i2 & 512) == 0 ? str6 : "", z3, z4, false);
    }

    public EffectMobParams(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        this.effectEntrancePosition = str;
        this.effectId = str2;
        this.effectResourceId = str3;
        this.index = i;
        this.isEditorPro = z;
        this.isEditProp = z2;
        this.musicId = str4;
        this.tabName = str5;
        this.applyTime = j;
        this.propId = str6;
        this.isMixEditRecommend = z3;
    }
}
