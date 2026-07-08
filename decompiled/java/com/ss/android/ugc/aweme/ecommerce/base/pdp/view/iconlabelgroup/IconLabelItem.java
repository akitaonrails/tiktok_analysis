package com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup;

import X.C09CT;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.view.iconlabelgroup.IconLabelItem;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class IconLabelItem implements Parcelable, InterfaceC746802vq {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("description")
    public final ECRichText description;

    @C09CT("icon")
    public final Icon icon;
    public Integer maxDisplayLines;
    public List<MaxWidthRule> maxWidthRules;
    public Function1<? super String, Unit> onButtonClick;
    public Function1<? super String, Unit> onButtonShow;
    public static final Parcelable.Creator<IconLabelItem> CREATOR = new Parcelable.Creator<IconLabelItem>() { // from class: X.0mhD
        @Override // android.os.Parcelable.Creator
        public final IconLabelItem createFromParcel(Parcel parcel) {
            return new IconLabelItem((Icon) parcel.readParcelable(IconLabelItem.class.getClassLoader()), (ECRichText) parcel.readParcelable(IconLabelItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IconLabelItem[] newArray(int i) {
            return new IconLabelItem[i];
        }
    };
    public static final int $stable = 8;

    public IconLabelItem() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconLabelItem)) {
            return false;
        }
        IconLabelItem iconLabelItem = (IconLabelItem) obj;
        return Intrinsics.LJFF(this.icon, iconLabelItem.icon) && Intrinsics.LJFF(this.description, iconLabelItem.description) && Intrinsics.LJFF(this.daInfo, iconLabelItem.daInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        ECRichText eCRichText = this.description;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconLabelItem(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeParcelable(this.description, i);
        parcel.writeString(this.daInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    public IconLabelItem(Icon icon, ECRichText eCRichText, String str) {
        this.icon = icon;
        this.description = eCRichText;
        this.daInfo = str;
    }
}
