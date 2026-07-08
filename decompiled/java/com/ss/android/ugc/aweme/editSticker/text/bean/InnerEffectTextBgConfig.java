package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C12KB;
import X.C12KF;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InnerEffectTextBgConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextBgConfig> CREATOR = new Parcelable.Creator<InnerEffectTextBgConfig>() { // from class: X.12KG
        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextBgConfig createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new InnerEffectTextBgConfig(string, z, EffectTextBgNinePatch.CREATOR.createFromParcel(parcel), parcel.readInt(), C12KF.valueOf(parcel.readString()), C12KF.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextBgConfig[] newArray(int i) {
            return new InnerEffectTextBgConfig[i];
        }
    };
    public final String bgName;
    public final C12KF dimensionModeHeight;
    public final C12KF dimensionModeWidth;
    public final int gravity;
    public final int height;
    public final boolean isNinePatch;
    public final int marginBottom;
    public final int marginEnd;
    public final int marginStart;
    public final int marginTop;
    public final EffectTextBgNinePatch ninePatchInfo;
    public final int width;

    public final InnerEffectTextBgConfig copy(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, C12KF c12kf, C12KF c12kf2, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new InnerEffectTextBgConfig(str, z, effectTextBgNinePatch, i, c12kf, c12kf2, i2, i3, i4, i5, i6, i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextBgConfig)) {
            return false;
        }
        InnerEffectTextBgConfig innerEffectTextBgConfig = (InnerEffectTextBgConfig) obj;
        return Intrinsics.LJFF(this.bgName, innerEffectTextBgConfig.bgName) && this.isNinePatch == innerEffectTextBgConfig.isNinePatch && Intrinsics.LJFF(this.ninePatchInfo, innerEffectTextBgConfig.ninePatchInfo) && this.gravity == innerEffectTextBgConfig.gravity && this.dimensionModeWidth == innerEffectTextBgConfig.dimensionModeWidth && this.dimensionModeHeight == innerEffectTextBgConfig.dimensionModeHeight && this.width == innerEffectTextBgConfig.width && this.height == innerEffectTextBgConfig.height && this.marginStart == innerEffectTextBgConfig.marginStart && this.marginEnd == innerEffectTextBgConfig.marginEnd && this.marginTop == innerEffectTextBgConfig.marginTop && this.marginBottom == innerEffectTextBgConfig.marginBottom;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.bgName.hashCode() * 31) + C786410Ut5.Z2(this.isNinePatch)) * 31) + this.ninePatchInfo.hashCode()) * 31) + this.gravity) * 31) + this.dimensionModeWidth.hashCode()) * 31) + this.dimensionModeHeight.hashCode()) * 31) + this.width) * 31) + this.height) * 31) + this.marginStart) * 31) + this.marginEnd) * 31) + this.marginTop) * 31) + this.marginBottom;
    }

    public String toString() {
        return "InnerEffectTextBgConfig(bgName=" + this.bgName + ", isNinePatch=" + this.isNinePatch + ", ninePatchInfo=" + this.ninePatchInfo + ", gravity=" + this.gravity + ", dimensionModeWidth=" + this.dimensionModeWidth + ", dimensionModeHeight=" + this.dimensionModeHeight + ", width=" + this.width + ", height=" + this.height + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bgName);
        parcel.writeInt(this.isNinePatch ? 1 : 0);
        this.ninePatchInfo.writeToParcel(parcel, i);
        parcel.writeInt(this.gravity);
        parcel.writeString(this.dimensionModeWidth.name());
        parcel.writeString(this.dimensionModeHeight.name());
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.marginStart);
        parcel.writeInt(this.marginEnd);
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.marginBottom);
    }

    public InnerEffectTextBgConfig() {
        this("", false, new EffectTextBgNinePatch(new ArrayList(), new ArrayList(), 0, 0, 0, 0), C12KB.LEFT.getGravity() | C12KB.TOP.getGravity(), C12KF.MATCH_PARENT, C12KF.MATCH_PARENT, 0, 0, 0, 0, 0, 0);
    }

    public final String getBgName() {
        return this.bgName;
    }

    public final C12KF getDimensionModeHeight() {
        return this.dimensionModeHeight;
    }

    public final C12KF getDimensionModeWidth() {
        return this.dimensionModeWidth;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMarginBottom() {
        return this.marginBottom;
    }

    public final int getMarginEnd() {
        return this.marginEnd;
    }

    public final int getMarginStart() {
        return this.marginStart;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final EffectTextBgNinePatch getNinePatchInfo() {
        return this.ninePatchInfo;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isNinePatch() {
        return this.isNinePatch;
    }

    public InnerEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, C12KF c12kf, C12KF c12kf2, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.bgName = str;
        this.isNinePatch = z;
        this.ninePatchInfo = effectTextBgNinePatch;
        this.gravity = i;
        this.dimensionModeWidth = c12kf;
        this.dimensionModeHeight = c12kf2;
        this.width = i2;
        this.height = i3;
        this.marginStart = i4;
        this.marginEnd = i5;
        this.marginTop = i6;
        this.marginBottom = i7;
    }
}
