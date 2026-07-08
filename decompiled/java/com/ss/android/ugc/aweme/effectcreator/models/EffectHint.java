package com.ss.android.ugc.aweme.effectcreator.models;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectHint implements Parcelable {
    public static final Parcelable.Creator<EffectHint> CREATOR = new Parcelable.Creator<EffectHint>() { // from class: X.0srz
        @Override // android.os.Parcelable.Creator
        public final EffectHint createFromParcel(Parcel parcel) {
            return new EffectHint(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EffectHint[] newArray(int i) {
            return new EffectHint[i];
        }
    };
    public final String effectKey;
    public final String hint;
    public final String hintFile;
    public final int hintFileFormat;
    public final String hintIcon;
    public final String hintKey;

    public final EffectHint copy(String str, String str2, String str3, String str4, String str5, int i) {
        return new EffectHint(str, str2, str3, str4, str5, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectHint)) {
            return false;
        }
        EffectHint effectHint = (EffectHint) obj;
        return Intrinsics.LJFF(this.hintKey, effectHint.hintKey) && Intrinsics.LJFF(this.effectKey, effectHint.effectKey) && Intrinsics.LJFF(this.hint, effectHint.hint) && Intrinsics.LJFF(this.hintIcon, effectHint.hintIcon) && Intrinsics.LJFF(this.hintFile, effectHint.hintFile) && this.hintFileFormat == effectHint.hintFileFormat;
    }

    public int hashCode() {
        return (((((((((this.hintKey.hashCode() * 31) + this.effectKey.hashCode()) * 31) + this.hint.hashCode()) * 31) + this.hintIcon.hashCode()) * 31) + this.hintFile.hashCode()) * 31) + this.hintFileFormat;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectHint(hintKey=");
        sbLIZ.append(this.hintKey);
        sbLIZ.append(", effectKey=");
        sbLIZ.append(this.effectKey);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.hint);
        sbLIZ.append(", hintIcon=");
        sbLIZ.append(this.hintIcon);
        sbLIZ.append(", hintFile=");
        sbLIZ.append(this.hintFile);
        sbLIZ.append(", hintFileFormat=");
        sbLIZ.append(this.hintFileFormat);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hintKey);
        parcel.writeString(this.effectKey);
        parcel.writeString(this.hint);
        parcel.writeString(this.hintIcon);
        parcel.writeString(this.hintFile);
        parcel.writeInt(this.hintFileFormat);
    }

    public EffectHint() {
        this("", "", "", "", "", 0);
    }

    public final String getEffectKey() {
        return this.effectKey;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getHintFile() {
        return this.hintFile;
    }

    public final int getHintFileFormat() {
        return this.hintFileFormat;
    }

    public final String getHintIcon() {
        return this.hintIcon;
    }

    public final String getHintKey() {
        return this.hintKey;
    }

    public EffectHint(String str, String str2, String str3, String str4, String str5, int i) {
        this.hintKey = str;
        this.effectKey = str2;
        this.hint = str3;
        this.hintIcon = str4;
        this.hintFile = str5;
        this.hintFileFormat = i;
    }
}
