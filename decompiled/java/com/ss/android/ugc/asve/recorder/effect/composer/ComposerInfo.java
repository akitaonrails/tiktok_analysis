package com.ss.android.ugc.asve.recorder.effect.composer;

import X.C1404310meD;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class ComposerInfo implements Parcelable {
    public static final C1404310meD CREATOR = new Parcelable.Creator<ComposerInfo>() { // from class: X.0meD
        @Override // android.os.Parcelable.Creator
        public final ComposerInfo createFromParcel(Parcel parcel) {
            return new ComposerInfo(parcel.readString(), parcel.readString(), parcel.readString(), 8);
        }

        @Override // android.os.Parcelable.Creator
        public final ComposerInfo[] newArray(int i) {
            return new ComposerInfo[i];
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

    public final int hashCode() {
        int iHashCode = this.nodePath.hashCode() * 31;
        String str = this.extra;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.effectId.hashCode()) * 31;
        String str2 = this.key;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComposerInfo(nodePath=");
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComposerInfo) {
            ComposerInfo composerInfo = (ComposerInfo) obj;
            if (Intrinsics.LJFF(this.nodePath, composerInfo.nodePath)) {
                return true;
            }
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(this.nodePath, new String[]{":"}, 0, 6);
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(composerInfo.nodePath, new String[]{":"}, 0, 6);
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

    public /* synthetic */ ComposerInfo(String str, String str2, String str3, int i) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? null : "");
    }

    public ComposerInfo(String str, String str2, String str3, String str4) {
        this.nodePath = str;
        this.extra = str2;
        this.effectId = str3;
        this.key = str4;
    }
}
