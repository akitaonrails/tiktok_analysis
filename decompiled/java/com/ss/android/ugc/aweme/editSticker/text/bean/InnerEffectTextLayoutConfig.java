package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C126C;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectExtraConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InnerEffectTextLayoutConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextLayoutConfig> CREATOR = new Parcelable.Creator<InnerEffectTextLayoutConfig>() { // from class: X.126A
        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextLayoutConfig createFromParcel(Parcel parcel) {
            C126C c126cValueOf = C126C.valueOf(parcel.readString());
            int i = parcel.readInt();
            float f = parcel.readFloat();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList.add(InnerEffectTextConfig.CREATOR.createFromParcel(parcel));
            }
            return new InnerEffectTextLayoutConfig(c126cValueOf, i, f, i2, i3, i4, i5, arrayList, InnerEffectExtraConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextLayoutConfig[] newArray(int i) {
            return new InnerEffectTextLayoutConfig[i];
        }
    };
    public final InnerEffectExtraConfig extraConfig;
    public final C126C layoutType;
    public final int orientation;
    public final int paddingBottom;
    public final int paddingEnd;
    public final int paddingStart;
    public final int paddingTop;
    public final float rotation;
    public final List<InnerEffectTextConfig> textConfigs;

    public final InnerEffectTextLayoutConfig copy(C126C c126c, int i, float f, int i2, int i3, int i4, int i5, List<InnerEffectTextConfig> list, InnerEffectExtraConfig innerEffectExtraConfig) {
        return new InnerEffectTextLayoutConfig(c126c, i, f, i2, i3, i4, i5, list, innerEffectExtraConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextLayoutConfig)) {
            return false;
        }
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = (InnerEffectTextLayoutConfig) obj;
        return this.layoutType == innerEffectTextLayoutConfig.layoutType && this.orientation == innerEffectTextLayoutConfig.orientation && Float.compare(this.rotation, innerEffectTextLayoutConfig.rotation) == 0 && this.paddingStart == innerEffectTextLayoutConfig.paddingStart && this.paddingEnd == innerEffectTextLayoutConfig.paddingEnd && this.paddingTop == innerEffectTextLayoutConfig.paddingTop && this.paddingBottom == innerEffectTextLayoutConfig.paddingBottom && Intrinsics.LJFF(this.textConfigs, innerEffectTextLayoutConfig.textConfigs) && Intrinsics.LJFF(this.extraConfig, innerEffectTextLayoutConfig.extraConfig);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerEffectTextLayoutConfig(layoutType=");
        sbLIZ.append(this.layoutType);
        sbLIZ.append(", orientation=");
        sbLIZ.append(this.orientation);
        sbLIZ.append(", rotation=");
        sbLIZ.append(this.rotation);
        sbLIZ.append(", paddingStart=");
        sbLIZ.append(this.paddingStart);
        sbLIZ.append(", paddingEnd=");
        sbLIZ.append(this.paddingEnd);
        sbLIZ.append(", paddingTop=");
        sbLIZ.append(this.paddingTop);
        sbLIZ.append(", paddingBottom=");
        sbLIZ.append(this.paddingBottom);
        sbLIZ.append(", textConfigs=");
        sbLIZ.append(this.textConfigs);
        sbLIZ.append(", extraConfig=");
        sbLIZ.append(this.extraConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.layoutType.name());
        parcel.writeInt(this.orientation);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.paddingStart);
        parcel.writeInt(this.paddingEnd);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
        List<InnerEffectTextConfig> list = this.textConfigs;
        parcel.writeInt(list.size());
        Iterator<InnerEffectTextConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        this.extraConfig.writeToParcel(parcel, i);
    }

    public InnerEffectTextLayoutConfig() {
        this(C126C.LINEAR, 1, 0.0f, 0, 0, 0, 0, new ArrayList(), new InnerEffectExtraConfig(false));
    }

    public int hashCode() {
        return (((((((((((((((this.layoutType.hashCode() * 31) + this.orientation) * 31) + Float.floatToIntBits(this.rotation)) * 31) + this.paddingStart) * 31) + this.paddingEnd) * 31) + this.paddingTop) * 31) + this.paddingBottom) * 31) + this.textConfigs.hashCode()) * 31) + this.extraConfig.hashCode();
    }

    public final InnerEffectExtraConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final C126C getLayoutType() {
        return this.layoutType;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final List<InnerEffectTextConfig> getTextConfigs() {
        return this.textConfigs;
    }

    public InnerEffectTextLayoutConfig(C126C c126c, int i, float f, int i2, int i3, int i4, int i5, List<InnerEffectTextConfig> list, InnerEffectExtraConfig innerEffectExtraConfig) {
        this.layoutType = c126c;
        this.orientation = i;
        this.rotation = f;
        this.paddingStart = i2;
        this.paddingEnd = i3;
        this.paddingTop = i4;
        this.paddingBottom = i5;
        this.textConfigs = list;
        this.extraConfig = innerEffectExtraConfig;
    }
}
