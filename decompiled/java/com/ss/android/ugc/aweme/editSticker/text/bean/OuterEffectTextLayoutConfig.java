package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C126C;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OuterEffectTextLayoutConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextLayoutConfig> CREATOR = new Parcelable.Creator<OuterEffectTextLayoutConfig>() { // from class: X.126E
        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextLayoutConfig createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            float f = parcel.readFloat();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList.add(OuterEffectTextConfig.CREATOR.createFromParcel(parcel));
            }
            return new OuterEffectTextLayoutConfig(i, i2, f, i3, i4, i5, i6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextLayoutConfig[] newArray(int i) {
            return new OuterEffectTextLayoutConfig[i];
        }
    };

    @C09CT("layout_type")
    public final int layoutType;

    @C09CT("orientation")
    public final int orientation;

    @C09CT("padding_bottom")
    public final int paddingBottom;

    @C09CT("padding_end")
    public final int paddingEnd;

    @C09CT("padding_start")
    public final int paddingStart;

    @C09CT("padding_top")
    public final int paddingTop;

    @C09CT("rotation")
    public final float rotation;

    @C09CT("text_configs")
    public final List<OuterEffectTextConfig> textConfigs;

    public final OuterEffectTextLayoutConfig copy(int i, int i2, float f, int i3, int i4, int i5, int i6, List<OuterEffectTextConfig> list) {
        return new OuterEffectTextLayoutConfig(i, i2, f, i3, i4, i5, i6, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextLayoutConfig)) {
            return false;
        }
        OuterEffectTextLayoutConfig outerEffectTextLayoutConfig = (OuterEffectTextLayoutConfig) obj;
        return this.layoutType == outerEffectTextLayoutConfig.layoutType && this.orientation == outerEffectTextLayoutConfig.orientation && Float.compare(this.rotation, outerEffectTextLayoutConfig.rotation) == 0 && this.paddingStart == outerEffectTextLayoutConfig.paddingStart && this.paddingEnd == outerEffectTextLayoutConfig.paddingEnd && this.paddingTop == outerEffectTextLayoutConfig.paddingTop && this.paddingBottom == outerEffectTextLayoutConfig.paddingBottom && Intrinsics.LJFF(this.textConfigs, outerEffectTextLayoutConfig.textConfigs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OuterEffectTextLayoutConfig(layoutType=");
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
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.layoutType);
        parcel.writeInt(this.orientation);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.paddingStart);
        parcel.writeInt(this.paddingEnd);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
        List<OuterEffectTextConfig> list = this.textConfigs;
        parcel.writeInt(list.size());
        Iterator<OuterEffectTextConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public OuterEffectTextLayoutConfig() {
        this(C126C.LINEAR.getType(), 1, 0.0f, 0, 0, 0, 0, new ArrayList());
    }

    public int hashCode() {
        return (((((((((((((this.layoutType * 31) + this.orientation) * 31) + Float.floatToIntBits(this.rotation)) * 31) + this.paddingStart) * 31) + this.paddingEnd) * 31) + this.paddingTop) * 31) + this.paddingBottom) * 31) + this.textConfigs.hashCode();
    }

    public final int getLayoutType() {
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

    public final List<OuterEffectTextConfig> getTextConfigs() {
        return this.textConfigs;
    }

    public OuterEffectTextLayoutConfig(int i, int i2, float f, int i3, int i4, int i5, int i6, List<OuterEffectTextConfig> list) {
        this.layoutType = i;
        this.orientation = i2;
        this.rotation = f;
        this.paddingStart = i3;
        this.paddingEnd = i4;
        this.paddingTop = i5;
        this.paddingBottom = i6;
        this.textConfigs = list;
    }
}
