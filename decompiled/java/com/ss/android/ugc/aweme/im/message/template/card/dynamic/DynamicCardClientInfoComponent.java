package com.ss.android.ugc.aweme.im.message.template.card.dynamic;

import X.C2188811AlT;
import X.C2242091CpD;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class DynamicCardClientInfoComponent implements BaseComponent<C2242091CpD> {
    public static final Parcelable.Creator<DynamicCardClientInfoComponent> CREATOR = new Parcelable.Creator<DynamicCardClientInfoComponent>() { // from class: X.0wQV
        @Override // android.os.Parcelable.Creator
        public final DynamicCardClientInfoComponent createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            String string = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new DynamicCardClientInfoComponent(string, numValueOf, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicCardClientInfoComponent[] newArray(int i) {
            return new DynamicCardClientInfoComponent[i];
        }
    };
    public final Boolean hideCard;
    public final String resourceCoverUrl;
    public final String resourceId;
    public final Integer resourceType;

    public DynamicCardClientInfoComponent() {
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
        if (!(obj instanceof DynamicCardClientInfoComponent)) {
            return false;
        }
        DynamicCardClientInfoComponent dynamicCardClientInfoComponent = (DynamicCardClientInfoComponent) obj;
        return Intrinsics.LJFF(this.resourceId, dynamicCardClientInfoComponent.resourceId) && Intrinsics.LJFF(this.resourceType, dynamicCardClientInfoComponent.resourceType) && Intrinsics.LJFF(this.resourceCoverUrl, dynamicCardClientInfoComponent.resourceCoverUrl) && Intrinsics.LJFF(this.hideCard, dynamicCardClientInfoComponent.hideCard);
    }

    public final int hashCode() {
        String str = this.resourceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.resourceType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.resourceCoverUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hideCard;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicCardClientInfoComponent(resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", resourceType=");
        sbLIZ.append(this.resourceType);
        sbLIZ.append(", resourceCoverUrl=");
        sbLIZ.append(this.resourceCoverUrl);
        sbLIZ.append(", hideCard=");
        sbLIZ.append(this.hideCard);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.resourceId);
        Integer num = this.resourceType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.resourceCoverUrl);
        Boolean bool = this.hideCard;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public DynamicCardClientInfoComponent(String str, Integer num, String str2, Boolean bool) {
        this.resourceId = str;
        this.resourceType = num;
        this.resourceCoverUrl = str2;
        this.hideCard = bool;
    }
}
