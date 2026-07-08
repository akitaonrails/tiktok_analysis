package com.ss.android.ugc.aweme.camera.core.api.effect;

import X.C1404300meC;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.camera.core.api.effect.IMComposerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class IMComposerInfo implements Parcelable {
    public static final C1404300meC CREATOR = new Parcelable.Creator<IMComposerInfo>() { // from class: X.0meC
        @Override // android.os.Parcelable.Creator
        public final IMComposerInfo createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            String string3 = parcel.readString();
            if (string3 != null) {
                str = string3;
            }
            return new IMComposerInfo(string, string2, str, 8);
        }

        @Override // android.os.Parcelable.Creator
        public final IMComposerInfo[] newArray(int i) {
            return new IMComposerInfo[i];
        }
    };
    public final String effectId;
    public final String extra;
    public final String key;
    public String nodePath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMComposerInfo(nodePath=");
        sbLIZ.append(this.nodePath);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", effectId=");
        sbLIZ.append(this.effectId);
        sbLIZ.append(", key=");
        sbLIZ.append(this.key);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.nodePath.hashCode() * 31) + this.extra.hashCode()) * 31) + this.effectId.hashCode()) * 31;
        String str = this.key;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IMComposerInfo) {
            IMComposerInfo iMComposerInfo = (IMComposerInfo) obj;
            if (Intrinsics.LJFF(this.nodePath, iMComposerInfo.nodePath)) {
                return true;
            }
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(this.nodePath, new String[]{":"}, 0, 6);
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(iMComposerInfo.nodePath, new String[]{":"}, 0, 6);
            if (listLJJLIIIJILLIZJL.size() >= 2 && listLJJLIIIJILLIZJL2.size() >= 2 && Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL2, 0)) && Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 1), ListProtector.get(listLJJLIIIJILLIZJL2, 1))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nodePath);
        parcel.writeString(this.extra);
        parcel.writeString(this.effectId);
    }

    public IMComposerInfo(String str, String str2, String str3, int i) {
        str3 = (i & 4) != 0 ? "" : str3;
        String str4 = (i & 8) == 0 ? null : "";
        this.nodePath = str;
        this.extra = str2;
        this.effectId = str3;
        this.key = str4;
    }
}
