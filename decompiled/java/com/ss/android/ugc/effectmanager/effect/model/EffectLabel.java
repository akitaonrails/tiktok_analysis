package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C13HG;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public final class EffectLabel implements Parcelable, Serializable {
    public static final C01GW<C13HG<Object>>[] $childSerializers;

    @C09CT("label_platform")
    public final List<String> platformTags;

    @C09CT("label_one")
    public final List<String> v1Tags;

    @C09CT("label_two")
    public final List<String> v2Tags;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<EffectLabel> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<EffectLabel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectLabel createFromParcel(Parcel parcel) {
            return new EffectLabel(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EffectLabel[] newArray(int i) {
            return new EffectLabel[i];
        }
    }

    public EffectLabel() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getPlatformTags$annotations() {
    }

    public static /* synthetic */ void getV1Tags$annotations() {
    }

    public static /* synthetic */ void getV2Tags$annotations() {
    }

    public final EffectLabel copy(List<String> list, List<String> list2, List<String> list3) {
        return new EffectLabel(list, list2, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectLabel)) {
            return false;
        }
        EffectLabel effectLabel = (EffectLabel) obj;
        return Intrinsics.LJFF(this.v1Tags, effectLabel.v1Tags) && Intrinsics.LJFF(this.v2Tags, effectLabel.v2Tags) && Intrinsics.LJFF(this.platformTags, effectLabel.platformTags);
    }

    public int hashCode() {
        return (((this.v1Tags.hashCode() * 31) + this.v2Tags.hashCode()) * 31) + this.platformTags.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectLabel(v1Tags=");
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

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        $childSerializers = new C01GW[]{C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(184)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(185)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(186))};
    }

    public static final class Companion {
        public final C13HG<EffectLabel> serializer() {
            return EffectLabel$$serializer.INSTANCE;
        }
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

    public EffectLabel(List<String> list, List<String> list2, List<String> list3) {
        this.v1Tags = list;
        this.v2Tags = list2;
        this.platformTags = list3;
    }

    public static final void write$Self$ckresource_model_release(EffectLabel effectLabel, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectLabel.v1Tags, C13BV.INSTANCE)) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 0, c01gwArr[0].getValue(), effectLabel.v1Tags);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectLabel.v2Tags, C13BV.INSTANCE)) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), effectLabel.v2Tags);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(effectLabel.platformTags, C13BV.INSTANCE)) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 2, c01gwArr[2].getValue(), effectLabel.platformTags);
        }
    }

    public EffectLabel(int i, List list, List list2, List list3, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            this.v1Tags = (i & 1) == 0 ? C13BV.INSTANCE : list;
            if ((i & 2) == 0) {
                this.v2Tags = C13BV.INSTANCE;
            } else {
                this.v2Tags = list2;
            }
            if ((i & 4) == 0) {
                this.platformTags = C13BV.INSTANCE;
                return;
            } else {
                this.platformTags = list3;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, EffectLabel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public EffectLabel(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}
