package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C12KA;
import X.C12KE;
import X.C2188811AlT;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OuterEffectTextCoverConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextCoverConfig> CREATOR = new Parcelable.Creator<OuterEffectTextCoverConfig>() { // from class: X.12KC
        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextCoverConfig createFromParcel(Parcel parcel) {
            OuterEffectTextShadowConfig outerEffectTextShadowConfigCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList.add(OuterEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                outerEffectTextShadowConfigCreateFromParcel = null;
            } else {
                outerEffectTextShadowConfigCreateFromParcel = OuterEffectTextShadowConfig.CREATOR.createFromParcel(parcel);
            }
            return new OuterEffectTextCoverConfig(string, string2, i, i2, i3, f, f2, arrayList, outerEffectTextShadowConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextCoverConfig[] newArray(int i) {
            return new OuterEffectTextCoverConfig[i];
        }
    };

    @C09CT("gradient_orientation")
    public final int gradientOrientation;

    @C09CT("gradient_type")
    public final int gradientType;

    @C09CT("offsetX")
    public final float offsetX;

    @C09CT("offsetY")
    public final float offsetY;

    @C09CT("paint_style")
    public final int paintStyle;

    @C09CT("shadow_config")
    public final OuterEffectTextShadowConfig shadowConfig;

    @C09CT("stroke_configs")
    public final List<OuterEffectTextStrokeConfig> strokeConfigs;

    @C09CT("text_color_end")
    public final String textColorEnd;

    @C09CT("text_color_start")
    public final String textColorStart;

    public OuterEffectTextCoverConfig() {
        this("#ffff0000", "#ff0000ff", C12KA.NONE.getType(), C12KE.VERTICAL.getOrientation(), Paint.Style.STROKE.ordinal(), 0.0f, 0.0f, new ArrayList(), null);
    }

    public final OuterEffectTextCoverConfig copy(String str, String str2, int i, int i2, int i3, float f, float f2, List<OuterEffectTextStrokeConfig> list, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        return new OuterEffectTextCoverConfig(str, str2, i, i2, i3, f, f2, list, outerEffectTextShadowConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextCoverConfig)) {
            return false;
        }
        OuterEffectTextCoverConfig outerEffectTextCoverConfig = (OuterEffectTextCoverConfig) obj;
        return Intrinsics.LJFF(this.textColorStart, outerEffectTextCoverConfig.textColorStart) && Intrinsics.LJFF(this.textColorEnd, outerEffectTextCoverConfig.textColorEnd) && this.gradientType == outerEffectTextCoverConfig.gradientType && this.gradientOrientation == outerEffectTextCoverConfig.gradientOrientation && this.paintStyle == outerEffectTextCoverConfig.paintStyle && Float.compare(this.offsetX, outerEffectTextCoverConfig.offsetX) == 0 && Float.compare(this.offsetY, outerEffectTextCoverConfig.offsetY) == 0 && Intrinsics.LJFF(this.strokeConfigs, outerEffectTextCoverConfig.strokeConfigs) && Intrinsics.LJFF(this.shadowConfig, outerEffectTextCoverConfig.shadowConfig);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OuterEffectTextCoverConfig(textColorStart=");
        sbLIZ.append(this.textColorStart);
        sbLIZ.append(", textColorEnd=");
        sbLIZ.append(this.textColorEnd);
        sbLIZ.append(", gradientType=");
        sbLIZ.append(this.gradientType);
        sbLIZ.append(", gradientOrientation=");
        sbLIZ.append(this.gradientOrientation);
        sbLIZ.append(", paintStyle=");
        sbLIZ.append(this.paintStyle);
        sbLIZ.append(", offsetX=");
        sbLIZ.append(this.offsetX);
        sbLIZ.append(", offsetY=");
        sbLIZ.append(this.offsetY);
        sbLIZ.append(", strokeConfigs=");
        sbLIZ.append(this.strokeConfigs);
        sbLIZ.append(", shadowConfig=");
        sbLIZ.append(this.shadowConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.textColorStart);
        parcel.writeString(this.textColorEnd);
        parcel.writeInt(this.gradientType);
        parcel.writeInt(this.gradientOrientation);
        parcel.writeInt(this.paintStyle);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        Iterator<OuterEffectTextStrokeConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            outerEffectTextShadowConfig.writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.textColorStart.hashCode() * 31) + this.textColorEnd.hashCode()) * 31) + this.gradientType) * 31) + this.gradientOrientation) * 31) + this.paintStyle) * 31) + Float.floatToIntBits(this.offsetX)) * 31) + Float.floatToIntBits(this.offsetY)) * 31) + this.strokeConfigs.hashCode()) * 31;
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        return iHashCode + (outerEffectTextShadowConfig == null ? 0 : outerEffectTextShadowConfig.hashCode());
    }

    public final int getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final int getGradientType() {
        return this.gradientType;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final int getPaintStyle() {
        return this.paintStyle;
    }

    public final OuterEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
    }

    public final List<OuterEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final String getTextColorEnd() {
        return this.textColorEnd;
    }

    public final String getTextColorStart() {
        return this.textColorStart;
    }

    public OuterEffectTextCoverConfig(String str, String str2, int i, int i2, int i3, float f, float f2, List<OuterEffectTextStrokeConfig> list, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        this.textColorStart = str;
        this.textColorEnd = str2;
        this.gradientType = i;
        this.gradientOrientation = i2;
        this.paintStyle = i3;
        this.offsetX = f;
        this.offsetY = f2;
        this.strokeConfigs = list;
        this.shadowConfig = outerEffectTextShadowConfig;
    }
}
