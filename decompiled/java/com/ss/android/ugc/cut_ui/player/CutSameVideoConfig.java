package com.ss.android.ugc.cut_ui.player;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.player.CutSameVideoConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CutSameVideoConfig implements Parcelable {
    public static final Parcelable.Creator<CutSameVideoConfig> CREATOR = new Parcelable.Creator<CutSameVideoConfig>() { // from class: X.02vK
        @Override // android.os.Parcelable.Creator
        public final CutSameVideoConfig createFromParcel(Parcel parcel) {
            boolean z;
            int i = parcel.readInt();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new CutSameVideoConfig(i, string, z);
        }

        @Override // android.os.Parcelable.Creator
        public final CutSameVideoConfig[] newArray(int i) {
            return new CutSameVideoConfig[i];
        }
    };
    public final String bitRateJsonStr;
    public final int minInWidthAndHeight;
    public final boolean supportHwEncoder;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutSameVideoConfig)) {
            return false;
        }
        CutSameVideoConfig cutSameVideoConfig = (CutSameVideoConfig) obj;
        return this.minInWidthAndHeight == cutSameVideoConfig.minInWidthAndHeight && Intrinsics.LJFF(this.bitRateJsonStr, cutSameVideoConfig.bitRateJsonStr) && this.supportHwEncoder == cutSameVideoConfig.supportHwEncoder;
    }

    public final int hashCode() {
        return (((this.minInWidthAndHeight * 31) + this.bitRateJsonStr.hashCode()) * 31) + C786410Ut5.Z2(this.supportHwEncoder);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutSameVideoConfig(minInWidthAndHeight=");
        sbLIZ.append(this.minInWidthAndHeight);
        sbLIZ.append(", bitRateJsonStr=");
        sbLIZ.append(this.bitRateJsonStr);
        sbLIZ.append(", supportHwEncoder=");
        sbLIZ.append(this.supportHwEncoder);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.minInWidthAndHeight);
        parcel.writeString(this.bitRateJsonStr);
        parcel.writeInt(this.supportHwEncoder ? 1 : 0);
    }

    public CutSameVideoConfig(int i, String str, boolean z) {
        this.minInWidthAndHeight = i;
        this.bitRateJsonStr = str;
        this.supportHwEncoder = z;
    }
}
