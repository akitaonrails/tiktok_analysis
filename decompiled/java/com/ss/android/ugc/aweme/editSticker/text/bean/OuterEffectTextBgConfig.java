package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C12KB;
import X.C12KF;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextBgConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OuterEffectTextBgConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextBgConfig> CREATOR = new Parcelable.Creator<OuterEffectTextBgConfig>() { // from class: X.12KI
        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextBgConfig createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new OuterEffectTextBgConfig(string, z, EffectTextBgNinePatch.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextBgConfig[] newArray(int i) {
            return new OuterEffectTextBgConfig[i];
        }
    };

    @C09CT("bg_name")
    public final String bgName;

    @C09CT("dimen_mode_height")
    public final int dimenModeHeight;

    @C09CT("dimen_mode_width")
    public final int dimenModeWidth;

    @C09CT("gravity")
    public final int gravity;

    @C09CT("height")
    public final int height;

    @C09CT("is_nine_patch")
    public final boolean isNinePatch;

    @C09CT("margin_bottom")
    public final int marginBottom;

    @C09CT("margin_end")
    public final int marginEnd;

    @C09CT("margin_start")
    public final int marginStart;

    @C09CT("margin_top")
    public final int marginTop;

    @C09CT("nine_patch_info")
    public final EffectTextBgNinePatch ninePatchInfo;

    @C09CT("width")
    public final int width;

    public final OuterEffectTextBgConfig copy(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        return new OuterEffectTextBgConfig(str, z, effectTextBgNinePatch, i, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextBgConfig)) {
            return false;
        }
        OuterEffectTextBgConfig outerEffectTextBgConfig = (OuterEffectTextBgConfig) obj;
        return Intrinsics.LJFF(this.bgName, outerEffectTextBgConfig.bgName) && this.isNinePatch == outerEffectTextBgConfig.isNinePatch && Intrinsics.LJFF(this.ninePatchInfo, outerEffectTextBgConfig.ninePatchInfo) && this.gravity == outerEffectTextBgConfig.gravity && this.dimenModeWidth == outerEffectTextBgConfig.dimenModeWidth && this.dimenModeHeight == outerEffectTextBgConfig.dimenModeHeight && this.width == outerEffectTextBgConfig.width && this.height == outerEffectTextBgConfig.height && this.marginStart == outerEffectTextBgConfig.marginStart && this.marginEnd == outerEffectTextBgConfig.marginEnd && this.marginTop == outerEffectTextBgConfig.marginTop && this.marginBottom == outerEffectTextBgConfig.marginBottom;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.bgName.hashCode() * 31) + C786410Ut5.Z2(this.isNinePatch)) * 31) + this.ninePatchInfo.hashCode()) * 31) + this.gravity) * 31) + this.dimenModeWidth) * 31) + this.dimenModeHeight) * 31) + this.width) * 31) + this.height) * 31) + this.marginStart) * 31) + this.marginEnd) * 31) + this.marginTop) * 31) + this.marginBottom;
    }

    public String toString() {
        return "OuterEffectTextBgConfig(bgName=" + this.bgName + ", isNinePatch=" + this.isNinePatch + ", ninePatchInfo=" + this.ninePatchInfo + ", gravity=" + this.gravity + ", dimenModeWidth=" + this.dimenModeWidth + ", dimenModeHeight=" + this.dimenModeHeight + ", width=" + this.width + ", height=" + this.height + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.bgName);
        parcel.writeInt(this.isNinePatch ? 1 : 0);
        this.ninePatchInfo.writeToParcel(parcel, i);
        parcel.writeInt(this.gravity);
        parcel.writeInt(this.dimenModeWidth);
        parcel.writeInt(this.dimenModeHeight);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.marginStart);
        parcel.writeInt(this.marginEnd);
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.marginBottom);
    }

    public OuterEffectTextBgConfig() {
        this("", false, new EffectTextBgNinePatch(new ArrayList(), new ArrayList(), 0, 0, 0, 0), C12KB.LEFT.getGravity() | C12KB.TOP.getGravity(), C12KF.MATCH_PARENT.getMode(), C12KF.MATCH_PARENT.getMode(), 0, 0, 0, 0, 0, 0);
    }

    public final String getBgName() {
        return this.bgName;
    }

    public final int getDimenModeHeight() {
        return this.dimenModeHeight;
    }

    public final int getDimenModeWidth() {
        return this.dimenModeWidth;
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

    public OuterEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.bgName = str;
        this.isNinePatch = z;
        this.ninePatchInfo = effectTextBgNinePatch;
        this.gravity = i;
        this.dimenModeWidth = i2;
        this.dimenModeHeight = i3;
        this.width = i4;
        this.height = i5;
        this.marginStart = i6;
        this.marginEnd = i7;
        this.marginTop = i8;
        this.marginBottom = i9;
    }
}
