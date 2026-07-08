package com.bytedance.effectcreatormobile.infrastructure.ve.effect.composer;

import X.C15376060g;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.infrastructure.ve.effect.composer.ComposerInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposerInfo implements Parcelable {
    public final String effectId;
    public final String extra;
    public final String key;
    public String nodePath;
    public static final C15376060g CREATOR = new Parcelable.Creator<ComposerInfo>() { // from class: X.060g
        @Override // android.os.Parcelable.Creator
        public final ComposerInfo createFromParcel(Parcel parcel) {
            return new ComposerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ComposerInfo[] newArray(int i) {
            return new ComposerInfo[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = ((((this.nodePath.hashCode() * 31) + this.extra.hashCode()) * 31) + this.effectId.hashCode()) * 31;
        String str = this.key;
        return iHashCode + (str == null ? 0 : str.hashCode());
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

    public ComposerInfo(Parcel parcel) {
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        this.nodePath = string;
        this.extra = string2;
        this.effectId = string3;
        this.key = "";
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
}
