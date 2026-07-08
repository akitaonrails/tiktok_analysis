package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider;

import X.C033W;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC718502rH;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider.UsPdpDividerDataModel;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UsPdpDividerDataModel implements Parcelable, InterfaceC718502rH {

    @C09CT("background_color")
    public final String color;

    @C09CT("height")
    public final float height;
    public static final Parcelable.Creator<UsPdpDividerDataModel> CREATOR = new Parcelable.Creator<UsPdpDividerDataModel>() { // from class: X.02vs
        @Override // android.os.Parcelable.Creator
        public final UsPdpDividerDataModel createFromParcel(Parcel parcel) {
            return new UsPdpDividerDataModel(parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsPdpDividerDataModel[] newArray(int i) {
            return new UsPdpDividerDataModel[i];
        }
    };
    public static final int $stable = 8;

    public UsPdpDividerDataModel() {
        this(0.0f, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsPdpDividerDataModel)) {
            return false;
        }
        UsPdpDividerDataModel usPdpDividerDataModel = (UsPdpDividerDataModel) obj;
        return Float.compare(this.height, usPdpDividerDataModel.height) == 0 && Intrinsics.LJFF(this.color, usPdpDividerDataModel.color);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsPdpDividerDataModel(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.height);
        parcel.writeString(this.color);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.height) * 31;
        String str = this.color;
        return iFloatToIntBits + (str == null ? 0 : str.hashCode());
    }

    @Override // X.InterfaceC718502rH
    public final List<InterfaceC746802vq> LIZ(C033W c033w) {
        return Collections.singletonList(new UsPdpDividerModuleVO(this.height, this.color));
    }

    public UsPdpDividerDataModel(float f, String str) {
        this.height = f;
        this.color = str;
    }
}
