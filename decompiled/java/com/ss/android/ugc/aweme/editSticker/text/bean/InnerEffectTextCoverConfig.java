package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C12KA;
import X.C12KE;
import X.C2188811AlT;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InnerEffectTextCoverConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextCoverConfig> CREATOR = new Parcelable.Creator<InnerEffectTextCoverConfig>() { // from class: X.12K6
        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextCoverConfig createFromParcel(Parcel parcel) {
            InnerEffectTextShadowConfig innerEffectTextShadowConfigCreateFromParcel;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            C12KA c12kaValueOf = C12KA.valueOf(parcel.readString());
            C12KE c12keValueOf = C12KE.valueOf(parcel.readString());
            Paint.Style styleValueOf = Paint.Style.valueOf(parcel.readString());
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(InnerEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                innerEffectTextShadowConfigCreateFromParcel = null;
            } else {
                innerEffectTextShadowConfigCreateFromParcel = InnerEffectTextShadowConfig.CREATOR.createFromParcel(parcel);
            }
            return new InnerEffectTextCoverConfig(i, i2, c12kaValueOf, c12keValueOf, styleValueOf, f, f2, arrayList, innerEffectTextShadowConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextCoverConfig[] newArray(int i) {
            return new InnerEffectTextCoverConfig[i];
        }
    };
    public final C12KE gradientOrientation;
    public final C12KA gradientType;
    public final float offsetX;
    public final float offsetY;
    public final Paint.Style paintStyle;
    public final InnerEffectTextShadowConfig shadowConfig;
    public final List<InnerEffectTextStrokeConfig> strokeConfigs;
    public final int textColorEnd;
    public final int textColorStart;

    public InnerEffectTextCoverConfig() {
        this(-65536, -16776961, C12KA.NONE, C12KE.VERTICAL, Paint.Style.STROKE, 0.0f, 0.0f, new ArrayList(), null);
    }

    public final InnerEffectTextCoverConfig copy(int i, int i2, C12KA c12ka, C12KE c12ke, Paint.Style style, float f, float f2, List<InnerEffectTextStrokeConfig> list, InnerEffectTextShadowConfig innerEffectTextShadowConfig) {
        return new InnerEffectTextCoverConfig(i, i2, c12ka, c12ke, style, f, f2, list, innerEffectTextShadowConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextCoverConfig)) {
            return false;
        }
        InnerEffectTextCoverConfig innerEffectTextCoverConfig = (InnerEffectTextCoverConfig) obj;
        return this.textColorStart == innerEffectTextCoverConfig.textColorStart && this.textColorEnd == innerEffectTextCoverConfig.textColorEnd && this.gradientType == innerEffectTextCoverConfig.gradientType && this.gradientOrientation == innerEffectTextCoverConfig.gradientOrientation && this.paintStyle == innerEffectTextCoverConfig.paintStyle && Float.compare(this.offsetX, innerEffectTextCoverConfig.offsetX) == 0 && Float.compare(this.offsetY, innerEffectTextCoverConfig.offsetY) == 0 && Intrinsics.LJFF(this.strokeConfigs, innerEffectTextCoverConfig.strokeConfigs) && Intrinsics.LJFF(this.shadowConfig, innerEffectTextCoverConfig.shadowConfig);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerEffectTextCoverConfig(textColorStart=");
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
        parcel.writeInt(this.textColorStart);
        parcel.writeInt(this.textColorEnd);
        parcel.writeString(this.gradientType.name());
        parcel.writeString(this.gradientOrientation.name());
        parcel.writeString(this.paintStyle.name());
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        List<InnerEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        Iterator<InnerEffectTextStrokeConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            innerEffectTextShadowConfig.writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.textColorStart * 31) + this.textColorEnd) * 31) + this.gradientType.hashCode()) * 31) + this.gradientOrientation.hashCode()) * 31) + this.paintStyle.hashCode()) * 31) + Float.floatToIntBits(this.offsetX)) * 31) + Float.floatToIntBits(this.offsetY)) * 31) + this.strokeConfigs.hashCode()) * 31;
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        return iHashCode + (innerEffectTextShadowConfig == null ? 0 : innerEffectTextShadowConfig.hashCode());
    }

    public final C12KE getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final C12KA getGradientType() {
        return this.gradientType;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final Paint.Style getPaintStyle() {
        return this.paintStyle;
    }

    public final InnerEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
    }

    public final List<InnerEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final int getTextColorEnd() {
        return this.textColorEnd;
    }

    public final int getTextColorStart() {
        return this.textColorStart;
    }

    public InnerEffectTextCoverConfig(int i, int i2, C12KA c12ka, C12KE c12ke, Paint.Style style, float f, float f2, List<InnerEffectTextStrokeConfig> list, InnerEffectTextShadowConfig innerEffectTextShadowConfig) {
        this.textColorStart = i;
        this.textColorEnd = i2;
        this.gradientType = c12ka;
        this.gradientOrientation = c12ke;
        this.paintStyle = style;
        this.offsetX = f;
        this.offsetY = f2;
        this.strokeConfigs = list;
        this.shadowConfig = innerEffectTextShadowConfig;
    }
}
