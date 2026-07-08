package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SoftInterceptItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SoftInterceptItem implements Parcelable {

    @C09CT("unqualified_activity_amount_to_threshold")
    public String freeDistance;

    @C09CT("strategy")
    public Integer interceptStrategy;

    @C09CT("close_panel_button_text")
    public String itemCancel;

    @C09CT("add_items_button_text")
    public String itemConfirm;

    @C09CT("block_notice_text")
    public String itemTitle;

    @C09CT("block_description_text")
    public String itemTitleDes;

    @C09CT("schema")
    public String jumpSchema;

    @C09CT("block_title_text")
    public String navTitle;
    public static final Parcelable.Creator<SoftInterceptItem> CREATOR = new Parcelable.Creator<SoftInterceptItem>() { // from class: X.02Hr
        @Override // android.os.Parcelable.Creator
        public final SoftInterceptItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SoftInterceptItem(numValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SoftInterceptItem[] newArray(int i) {
            return new SoftInterceptItem[i];
        }
    };
    public static final int $stable = 8;

    public SoftInterceptItem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftInterceptItem)) {
            return false;
        }
        SoftInterceptItem softInterceptItem = (SoftInterceptItem) obj;
        return Intrinsics.LJFF(this.interceptStrategy, softInterceptItem.interceptStrategy) && Intrinsics.LJFF(this.navTitle, softInterceptItem.navTitle) && Intrinsics.LJFF(this.itemTitle, softInterceptItem.itemTitle) && Intrinsics.LJFF(this.itemTitleDes, softInterceptItem.itemTitleDes) && Intrinsics.LJFF(this.jumpSchema, softInterceptItem.jumpSchema) && Intrinsics.LJFF(this.itemConfirm, softInterceptItem.itemConfirm) && Intrinsics.LJFF(this.itemCancel, softInterceptItem.itemCancel) && Intrinsics.LJFF(this.freeDistance, softInterceptItem.freeDistance);
    }

    public final int hashCode() {
        Integer num = this.interceptStrategy;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.navTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemTitleDes;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jumpSchema;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.itemConfirm;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.itemCancel;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.freeDistance;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoftInterceptItem(interceptStrategy=");
        sbLIZ.append(this.interceptStrategy);
        sbLIZ.append(", navTitle=");
        sbLIZ.append(this.navTitle);
        sbLIZ.append(", itemTitle=");
        sbLIZ.append(this.itemTitle);
        sbLIZ.append(", itemTitleDes=");
        sbLIZ.append(this.itemTitleDes);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(", itemConfirm=");
        sbLIZ.append(this.itemConfirm);
        sbLIZ.append(", itemCancel=");
        sbLIZ.append(this.itemCancel);
        sbLIZ.append(", freeDistance=");
        sbLIZ.append(this.freeDistance);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Integer num = this.interceptStrategy;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.navTitle);
        parcel.writeString(this.itemTitle);
        parcel.writeString(this.itemTitleDes);
        parcel.writeString(this.jumpSchema);
        parcel.writeString(this.itemConfirm);
        parcel.writeString(this.itemCancel);
        parcel.writeString(this.freeDistance);
    }

    public SoftInterceptItem(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.interceptStrategy = num;
        this.navTitle = str;
        this.itemTitle = str2;
        this.itemTitleDes = str3;
        this.jumpSchema = str4;
        this.itemConfirm = str5;
        this.itemCancel = str6;
        this.freeDistance = str7;
    }
}
