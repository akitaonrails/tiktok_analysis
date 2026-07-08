package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model.SeaPdpDaInfoMetaItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpDaInfoMetaItem implements Parcelable {

    @C09CT("is_core_biz")
    public final Boolean isCoreBiz;

    @C09CT("template")
    public final String template;

    @C09CT("type")
    public final Integer type;

    @C09CT("value")
    public final String value;
    public static final Parcelable.Creator<SeaPdpDaInfoMetaItem> CREATOR = new Parcelable.Creator<SeaPdpDaInfoMetaItem>() { // from class: X.03x6
        @Override // android.os.Parcelable.Creator
        public final SeaPdpDaInfoMetaItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new SeaPdpDaInfoMetaItem(numValueOf, string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SeaPdpDaInfoMetaItem[] newArray(int i) {
            return new SeaPdpDaInfoMetaItem[i];
        }
    };
    public static final int $stable = 8;

    public SeaPdpDaInfoMetaItem() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpDaInfoMetaItem)) {
            return false;
        }
        SeaPdpDaInfoMetaItem seaPdpDaInfoMetaItem = (SeaPdpDaInfoMetaItem) obj;
        return Intrinsics.LJFF(this.type, seaPdpDaInfoMetaItem.type) && Intrinsics.LJFF(this.template, seaPdpDaInfoMetaItem.template) && Intrinsics.LJFF(this.value, seaPdpDaInfoMetaItem.value) && Intrinsics.LJFF(this.isCoreBiz, seaPdpDaInfoMetaItem.isCoreBiz);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.template;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isCoreBiz;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpDaInfoMetaItem(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", isCoreBiz=");
        sbLIZ.append(this.isCoreBiz);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.template);
        parcel.writeString(this.value);
        Boolean bool = this.isCoreBiz;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public SeaPdpDaInfoMetaItem(Integer num, String str, String str2, Boolean bool) {
        this.type = num;
        this.template = str;
        this.value = str2;
        this.isCoreBiz = bool;
    }
}
