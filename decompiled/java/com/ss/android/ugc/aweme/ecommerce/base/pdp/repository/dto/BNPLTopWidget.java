package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import X.C752602wm;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BNPLTopWidget;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BNPLTopWidget implements Parcelable {

    @C09CT("action_type")
    public final Integer actionType;

    @C09CT("is_auth")
    public final Boolean isAuth;

    @C09CT("promo_text")
    public final List<String> promoText;

    @C09CT("schema")
    public final String schema;

    @C09CT("icon")
    public final Icon startIcon;

    @C09CT("text")
    public final ECRichText text;
    public static final C752602wm ActionType = new Object() { // from class: X.02wm
    };
    public static final Parcelable.Creator<BNPLTopWidget> CREATOR = new Parcelable.Creator<BNPLTopWidget>() { // from class: X.02wl
        @Override // android.os.Parcelable.Creator
        public final BNPLTopWidget createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(BNPLTopWidget.class.getClassLoader());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            Icon icon = (Icon) parcel.readParcelable(BNPLTopWidget.class.getClassLoader());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new BNPLTopWidget(boolValueOf, eCRichText, arrayListCreateStringArrayList, string, icon, numValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BNPLTopWidget[] newArray(int i) {
            return new BNPLTopWidget[i];
        }
    };
    public static final int $stable = 8;

    public BNPLTopWidget() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BNPLTopWidget)) {
            return false;
        }
        BNPLTopWidget bNPLTopWidget = (BNPLTopWidget) obj;
        return Intrinsics.LJFF(this.isAuth, bNPLTopWidget.isAuth) && Intrinsics.LJFF(this.text, bNPLTopWidget.text) && Intrinsics.LJFF(this.promoText, bNPLTopWidget.promoText) && Intrinsics.LJFF(this.schema, bNPLTopWidget.schema) && Intrinsics.LJFF(this.startIcon, bNPLTopWidget.startIcon) && Intrinsics.LJFF(this.actionType, bNPLTopWidget.actionType);
    }

    public final int hashCode() {
        Boolean bool = this.isAuth;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ECRichText eCRichText = this.text;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        List<String> list = this.promoText;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.schema;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.startIcon;
        int iHashCode5 = (iHashCode4 + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.actionType;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BNPLTopWidget(isAuth=");
        sbLIZ.append(this.isAuth);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", promoText=");
        sbLIZ.append(this.promoText);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", startIcon=");
        sbLIZ.append(this.startIcon);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isAuth;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.text, i);
        parcel.writeStringList(this.promoText);
        parcel.writeString(this.schema);
        parcel.writeParcelable(this.startIcon, i);
        Integer num = this.actionType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public BNPLTopWidget(Boolean bool, ECRichText eCRichText, List<String> list, String str, Icon icon, Integer num) {
        this.isAuth = bool;
        this.text = eCRichText;
        this.promoText = list;
        this.schema = str;
        this.startIcon = icon;
        this.actionType = num;
    }
}
