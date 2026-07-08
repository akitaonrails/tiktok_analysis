package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AlbumEffectInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<AlbumEffectInfo> CREATOR = new Creator();

    @C09CT("children")
    public final List<String> children;

    @C09CT("effect_type")
    public final Integer effect_type;

    @C09CT("parent")
    public final String parent;

    public static final class Creator implements Parcelable.Creator<AlbumEffectInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlbumEffectInfo createFromParcel(Parcel parcel) {
            return new AlbumEffectInfo(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlbumEffectInfo[] newArray(int i) {
            return new AlbumEffectInfo[i];
        }
    }

    public final AlbumEffectInfo copy(String str, List<String> list, Integer num) {
        return new AlbumEffectInfo(str, list, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumEffectInfo)) {
            return false;
        }
        AlbumEffectInfo albumEffectInfo = (AlbumEffectInfo) obj;
        return Intrinsics.LJFF(this.parent, albumEffectInfo.parent) && Intrinsics.LJFF(this.children, albumEffectInfo.children) && Intrinsics.LJFF(this.effect_type, albumEffectInfo.effect_type);
    }

    public int hashCode() {
        String str = this.parent;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.children;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.effect_type;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumEffectInfo(parent=");
        sbLIZ.append(this.parent);
        sbLIZ.append(", children=");
        sbLIZ.append(this.children);
        sbLIZ.append(", effect_type=");
        sbLIZ.append(this.effect_type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.parent);
        parcel.writeStringList(this.children);
        Integer num = this.effect_type;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public final List<String> getChildren() {
        return this.children;
    }

    public final Integer getEffect_type() {
        return this.effect_type;
    }

    public final String getParent() {
        return this.parent;
    }

    public AlbumEffectInfo(String str, List<String> list, Integer num) {
        this.parent = str;
        this.children = list;
        this.effect_type = num;
    }
}
