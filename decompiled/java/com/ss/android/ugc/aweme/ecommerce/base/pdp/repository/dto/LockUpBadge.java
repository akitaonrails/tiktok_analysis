package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LockUpBadge;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LockUpBadgeUI;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LockUpBadge implements Parcelable {

    @C09CT("badge_icon")
    public final Icon badgeIcon;

    @C09CT("badge_title")
    public final ECRichText badgeTitle;

    @C09CT("chevron_icon")
    public final Icon chevronIcon;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("type")
    public final Integer type;

    @C09CT("ui")
    public final LockUpBadgeUI ui;
    public static final Parcelable.Creator<LockUpBadge> CREATOR = new Parcelable.Creator<LockUpBadge>() { // from class: X.02wB
        @Override // android.os.Parcelable.Creator
        public final LockUpBadge createFromParcel(Parcel parcel) {
            Integer numValueOf;
            LockUpBadgeUI lockUpBadgeUICreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            Icon icon = (Icon) parcel.readParcelable(LockUpBadge.class.getClassLoader());
            Icon icon2 = (Icon) parcel.readParcelable(LockUpBadge.class.getClassLoader());
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(LockUpBadge.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                lockUpBadgeUICreateFromParcel = LockUpBadgeUI.CREATOR.createFromParcel(parcel);
            }
            return new LockUpBadge(numValueOf, icon, icon2, eCRichText, string, lockUpBadgeUICreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LockUpBadge[] newArray(int i) {
            return new LockUpBadge[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LockUpBadge)) {
            return false;
        }
        LockUpBadge lockUpBadge = (LockUpBadge) obj;
        return Intrinsics.LJFF(this.type, lockUpBadge.type) && Intrinsics.LJFF(this.badgeIcon, lockUpBadge.badgeIcon) && Intrinsics.LJFF(this.chevronIcon, lockUpBadge.chevronIcon) && Intrinsics.LJFF(this.badgeTitle, lockUpBadge.badgeTitle) && Intrinsics.LJFF(this.daInfo, lockUpBadge.daInfo) && Intrinsics.LJFF(this.ui, lockUpBadge.ui);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Icon icon = this.badgeIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.chevronIcon;
        int iHashCode3 = (iHashCode2 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        ECRichText eCRichText = this.badgeTitle;
        int iHashCode4 = (iHashCode3 + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str = this.daInfo;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        LockUpBadgeUI lockUpBadgeUI = this.ui;
        return iHashCode5 + (lockUpBadgeUI != null ? lockUpBadgeUI.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LockUpBadge(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", badgeIcon=");
        sbLIZ.append(this.badgeIcon);
        sbLIZ.append(", chevronIcon=");
        sbLIZ.append(this.chevronIcon);
        sbLIZ.append(", badgeTitle=");
        sbLIZ.append(this.badgeTitle);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", ui=");
        sbLIZ.append(this.ui);
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
        parcel.writeParcelable(this.badgeIcon, i);
        parcel.writeParcelable(this.chevronIcon, i);
        parcel.writeParcelable(this.badgeTitle, i);
        parcel.writeString(this.daInfo);
        LockUpBadgeUI lockUpBadgeUI = this.ui;
        if (lockUpBadgeUI == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lockUpBadgeUI.writeToParcel(parcel, i);
        }
    }

    public LockUpBadge(Integer num, Icon icon, Icon icon2, ECRichText eCRichText, String str, LockUpBadgeUI lockUpBadgeUI) {
        this.type = num;
        this.badgeIcon = icon;
        this.chevronIcon = icon2;
        this.badgeTitle = eCRichText;
        this.daInfo = str;
        this.ui = lockUpBadgeUI;
    }
}
