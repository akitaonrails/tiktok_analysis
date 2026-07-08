package com.ss.android.ugc.aweme.data;

import X.C1737570vJj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1737230vJB;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.IEffectConfig;
import com.ss.android.ugc.aweme.data.EffectImgPageConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectImgPageConfig implements Parcelable {
    public final int applyEffectDelayFrameCount;
    public final boolean canApplyEffectInCrop;
    public final int customPagerOption;
    public final IEffectConfig effectConfig;
    public final boolean hidTabWhenOnlyOne;
    public final EnumC1737230vJB scene;
    public final boolean showBottomTab;
    public static final C1737570vJj Companion = new Object() { // from class: X.0vJj
    };
    public static final Parcelable.Creator<EffectImgPageConfig> CREATOR = new Parcelable.Creator<EffectImgPageConfig>() { // from class: X.0vJA
        @Override // android.os.Parcelable.Creator
        public final EffectImgPageConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            EnumC1737230vJB enumC1737230vJBValueOf = EnumC1737230vJB.valueOf(parcel.readString());
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
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new EffectImgPageConfig(enumC1737230vJBValueOf, i, z, z2, i2, z3, (IEffectConfig) parcel.readParcelable(EffectImgPageConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EffectImgPageConfig[] newArray(int i) {
            return new EffectImgPageConfig[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectImgPageConfig)) {
            return false;
        }
        EffectImgPageConfig effectImgPageConfig = (EffectImgPageConfig) obj;
        return this.scene == effectImgPageConfig.scene && this.applyEffectDelayFrameCount == effectImgPageConfig.applyEffectDelayFrameCount && this.showBottomTab == effectImgPageConfig.showBottomTab && this.canApplyEffectInCrop == effectImgPageConfig.canApplyEffectInCrop && this.customPagerOption == effectImgPageConfig.customPagerOption && this.hidTabWhenOnlyOne == effectImgPageConfig.hidTabWhenOnlyOne && Intrinsics.LJFF(this.effectConfig, effectImgPageConfig.effectConfig);
    }

    public final int hashCode() {
        return (((((((((((this.scene.hashCode() * 31) + this.applyEffectDelayFrameCount) * 31) + C786410Ut5.Z2(this.showBottomTab)) * 31) + C786410Ut5.Z2(this.canApplyEffectInCrop)) * 31) + this.customPagerOption) * 31) + C786410Ut5.Z2(this.hidTabWhenOnlyOne)) * 31) + this.effectConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectImgPageConfig(scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", applyEffectDelayFrameCount=");
        sbLIZ.append(this.applyEffectDelayFrameCount);
        sbLIZ.append(", showBottomTab=");
        sbLIZ.append(this.showBottomTab);
        sbLIZ.append(", canApplyEffectInCrop=");
        sbLIZ.append(this.canApplyEffectInCrop);
        sbLIZ.append(", customPagerOption=");
        sbLIZ.append(this.customPagerOption);
        sbLIZ.append(", hidTabWhenOnlyOne=");
        sbLIZ.append(this.hidTabWhenOnlyOne);
        sbLIZ.append(", effectConfig=");
        sbLIZ.append(this.effectConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.scene.name());
        parcel.writeInt(this.applyEffectDelayFrameCount);
        parcel.writeInt(this.showBottomTab ? 1 : 0);
        parcel.writeInt(this.canApplyEffectInCrop ? 1 : 0);
        parcel.writeInt(this.customPagerOption);
        parcel.writeInt(this.hidTabWhenOnlyOne ? 1 : 0);
        parcel.writeParcelable(this.effectConfig, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EffectImgPageConfig(EnumC1737230vJB enumC1737230vJB, boolean z, int i, boolean z2, IEffectConfig.RemoteEffect remoteEffect, int i2) {
        int i3;
        boolean z3;
        IEffectConfig iEffectConfig = remoteEffect;
        boolean z4 = z2;
        int i4 = i;
        boolean z5 = z;
        if ((i2 & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z5 = (i2 & 8) != 0 ? true : z5;
        if ((i2 & 16) != 0) {
            Companion.getClass();
            i4 = 7;
        }
        this(enumC1737230vJB, i3, z3, z5, i4, (i2 & 32) != 0 ? false : z4, (i2 & 64) != 0 ? new IEffectConfig.Draft() : iEffectConfig);
    }

    public EffectImgPageConfig(EnumC1737230vJB enumC1737230vJB, int i, boolean z, boolean z2, int i2, boolean z3, IEffectConfig iEffectConfig) {
        this.scene = enumC1737230vJB;
        this.applyEffectDelayFrameCount = i;
        this.showBottomTab = z;
        this.canApplyEffectInCrop = z2;
        this.customPagerOption = i2;
        this.hidTabWhenOnlyOne = z3;
        this.effectConfig = iEffectConfig;
    }
}
