package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectLabelInReq implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectLabelInReq> CREATOR = new Creator();

    @C09CT("PlatformTag")
    public final List<String> platformTags;

    @C09CT("TagOne")
    public final List<String> v1Tags;

    @C09CT("TagTwo")
    public final List<String> v2Tags;

    public static final class Creator implements Parcelable.Creator<EffectLabelInReq> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectLabelInReq createFromParcel(Parcel parcel) {
            return new EffectLabelInReq(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectLabelInReq[] newArray(int i) {
            return new EffectLabelInReq[i];
        }
    }

    public EffectLabelInReq() {
        this(null, null, null, 7, null);
    }

    public final EffectLabelInReq copy(List<String> list, List<String> list2, List<String> list3) {
        return new EffectLabelInReq(list, list2, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectLabelInReq)) {
            return false;
        }
        EffectLabelInReq effectLabelInReq = (EffectLabelInReq) obj;
        return Intrinsics.LJFF(this.v1Tags, effectLabelInReq.v1Tags) && Intrinsics.LJFF(this.v2Tags, effectLabelInReq.v2Tags) && Intrinsics.LJFF(this.platformTags, effectLabelInReq.platformTags);
    }

    public int hashCode() {
        return (((this.v1Tags.hashCode() * 31) + this.v2Tags.hashCode()) * 31) + this.platformTags.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectLabelInReq(v1Tags=");
        sbLIZ.append(this.v1Tags);
        sbLIZ.append(", v2Tags=");
        sbLIZ.append(this.v2Tags);
        sbLIZ.append(", platformTags=");
        sbLIZ.append(this.platformTags);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.v1Tags);
        parcel.writeStringList(this.v2Tags);
        parcel.writeStringList(this.platformTags);
    }

    public final List<String> getPlatformTags() {
        return this.platformTags;
    }

    public final List<String> getV1Tags() {
        return this.v1Tags;
    }

    public final List<String> getV2Tags() {
        return this.v2Tags;
    }

    public EffectLabelInReq(List<String> list, List<String> list2, List<String> list3) {
        this.v1Tags = list;
        this.v2Tags = list2;
        this.platformTags = list3;
    }

    public EffectLabelInReq(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}
