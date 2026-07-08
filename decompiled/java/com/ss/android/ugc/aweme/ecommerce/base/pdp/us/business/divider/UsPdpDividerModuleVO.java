package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider;

import X.C04DV;
import X.C04DW;
import X.C04FN;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider.UsPdpDividerModuleVO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UsPdpDividerModuleVO implements Parcelable, InterfaceC746802vq, C04DW, C04DV {
    public final String color;
    public C04FN goda2Node;
    public String godaGroupId;
    public String godaNodeId;
    public final float height;
    public static final Parcelable.Creator<UsPdpDividerModuleVO> CREATOR = new Parcelable.Creator<UsPdpDividerModuleVO>() { // from class: X.02vt
        @Override // android.os.Parcelable.Creator
        public final UsPdpDividerModuleVO createFromParcel(Parcel parcel) {
            return new UsPdpDividerModuleVO(parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsPdpDividerModuleVO[] newArray(int i) {
            return new UsPdpDividerModuleVO[i];
        }
    };
    public static final int $stable = 8;

    public UsPdpDividerModuleVO() {
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
        if (!(obj instanceof UsPdpDividerModuleVO)) {
            return false;
        }
        UsPdpDividerModuleVO usPdpDividerModuleVO = (UsPdpDividerModuleVO) obj;
        return Float.compare(this.height, usPdpDividerModuleVO.height) == 0 && Intrinsics.LJFF(this.color, usPdpDividerModuleVO.color);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsPdpDividerModuleVO(height=");
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

    @Override // X.C04DV
    public final C04FN LJIIIIZZ() {
        return this.goda2Node;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.godaNodeId;
    }

    @Override // X.C04DV
    public final void LIZIZ(C04FN c04fn) {
        this.goda2Node = c04fn;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
        this.godaGroupId = str;
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.godaNodeId = str;
    }

    public UsPdpDividerModuleVO(float f, String str) {
        this.height = f;
        this.color = str;
        this.godaGroupId = "undefined";
        this.godaNodeId = "undefined";
    }
}
