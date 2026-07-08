package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomTip;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserRight implements Parcelable {

    @C09CT("bottom_tip")
    public BottomTip bottomTip;

    @C09CT("contact_detail")
    public ContactDetail contactDetail;

    @C09CT("expose_panel")
    public ExposeUserRightPanel exposeUserRightPanel;

    @C09CT("icon")
    public Icon icon;

    @C09CT("name")
    public String name;

    @C09CT("prefix_name")
    public LinkText prefixName;

    @C09CT("price_right_details")
    public List<UserRightDetail> priceRightDetails;

    @C09CT("privacy_policy")
    public List<PrivacyPolicy> privacyPolicy;

    @C09CT("track_params")
    public String serverTrackParams;

    @C09CT("user_right_details")
    public List<UserRightDetail> userRightDetails;
    public static final Parcelable.Creator<UserRight> CREATOR = new Parcelable.Creator<UserRight>() { // from class: X.02ZQ
        @Override // android.os.Parcelable.Creator
        public final UserRight createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ContactDetail contactDetailCreateFromParcel;
            ExposeUserRightPanel exposeUserRightPanelCreateFromParcel;
            ArrayList arrayList2;
            BottomTip bottomTipCreateFromParcel;
            LinkText linkTextCreateFromParcel;
            String string = parcel.readString();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UserRightDetail.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                contactDetailCreateFromParcel = null;
            } else {
                contactDetailCreateFromParcel = ContactDetail.CREATOR.createFromParcel(parcel);
            }
            ContactDetail contactDetail = contactDetailCreateFromParcel;
            if (parcel.readInt() == 0) {
                exposeUserRightPanelCreateFromParcel = null;
            } else {
                exposeUserRightPanelCreateFromParcel = ExposeUserRightPanel.CREATOR.createFromParcel(parcel);
            }
            ExposeUserRightPanel exposeUserRightPanel = exposeUserRightPanelCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(PrivacyPolicy.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                bottomTipCreateFromParcel = null;
            } else {
                bottomTipCreateFromParcel = BottomTip.CREATOR.createFromParcel(parcel);
            }
            BottomTip bottomTip = bottomTipCreateFromParcel;
            Icon icon = (Icon) parcel.readParcelable(UserRight.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkTextCreateFromParcel = null;
            } else {
                linkTextCreateFromParcel = LinkText.CREATOR.createFromParcel(parcel);
            }
            LinkText linkText = linkTextCreateFromParcel;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(UserRightDetail.CREATOR.createFromParcel(parcel));
                }
            }
            return new UserRight(string, arrayList, contactDetail, exposeUserRightPanel, arrayList2, bottomTip, icon, linkText, string2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final UserRight[] newArray(int i) {
            return new UserRight[i];
        }
    };
    public static final int $stable = 8;

    public UserRight() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRight)) {
            return false;
        }
        UserRight userRight = (UserRight) obj;
        return Intrinsics.LJFF(this.name, userRight.name) && Intrinsics.LJFF(this.userRightDetails, userRight.userRightDetails) && Intrinsics.LJFF(this.contactDetail, userRight.contactDetail) && Intrinsics.LJFF(this.exposeUserRightPanel, userRight.exposeUserRightPanel) && Intrinsics.LJFF(this.privacyPolicy, userRight.privacyPolicy) && Intrinsics.LJFF(this.bottomTip, userRight.bottomTip) && Intrinsics.LJFF(this.icon, userRight.icon) && Intrinsics.LJFF(this.prefixName, userRight.prefixName) && Intrinsics.LJFF(this.serverTrackParams, userRight.serverTrackParams) && Intrinsics.LJFF(this.priceRightDetails, userRight.priceRightDetails);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UserRightDetail> list = this.userRightDetails;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ContactDetail contactDetail = this.contactDetail;
        int iHashCode3 = (iHashCode2 + (contactDetail == null ? 0 : contactDetail.hashCode())) * 31;
        ExposeUserRightPanel exposeUserRightPanel = this.exposeUserRightPanel;
        int iHashCode4 = (iHashCode3 + (exposeUserRightPanel == null ? 0 : exposeUserRightPanel.hashCode())) * 31;
        List<PrivacyPolicy> list2 = this.privacyPolicy;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BottomTip bottomTip = this.bottomTip;
        int iHashCode6 = (iHashCode5 + (bottomTip == null ? 0 : bottomTip.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode7 = (iHashCode6 + (icon == null ? 0 : icon.hashCode())) * 31;
        LinkText linkText = this.prefixName;
        int iHashCode8 = (iHashCode7 + (linkText == null ? 0 : linkText.hashCode())) * 31;
        String str2 = this.serverTrackParams;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UserRightDetail> list3 = this.priceRightDetails;
        return iHashCode9 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserRight(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", userRightDetails=");
        sbLIZ.append(this.userRightDetails);
        sbLIZ.append(", contactDetail=");
        sbLIZ.append(this.contactDetail);
        sbLIZ.append(", exposeUserRightPanel=");
        sbLIZ.append(this.exposeUserRightPanel);
        sbLIZ.append(", privacyPolicy=");
        sbLIZ.append(this.privacyPolicy);
        sbLIZ.append(", bottomTip=");
        sbLIZ.append(this.bottomTip);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", prefixName=");
        sbLIZ.append(this.prefixName);
        sbLIZ.append(", serverTrackParams=");
        sbLIZ.append(this.serverTrackParams);
        sbLIZ.append(", priceRightDetails=");
        sbLIZ.append(this.priceRightDetails);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        List<UserRightDetail> list = this.userRightDetails;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UserRightDetail> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ContactDetail contactDetail = this.contactDetail;
        if (contactDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contactDetail.writeToParcel(parcel, i);
        }
        ExposeUserRightPanel exposeUserRightPanel = this.exposeUserRightPanel;
        if (exposeUserRightPanel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exposeUserRightPanel.writeToParcel(parcel, i);
        }
        List<PrivacyPolicy> list2 = this.privacyPolicy;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PrivacyPolicy> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        BottomTip bottomTip = this.bottomTip;
        if (bottomTip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bottomTip.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.icon, i);
        LinkText linkText = this.prefixName;
        if (linkText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkText.writeToParcel(parcel, i);
        }
        parcel.writeString(this.serverTrackParams);
        List<UserRightDetail> list3 = this.priceRightDetails;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator<UserRightDetail> it4 = list3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
    }

    public UserRight(String str, List<UserRightDetail> list, ContactDetail contactDetail, ExposeUserRightPanel exposeUserRightPanel, List<PrivacyPolicy> list2, BottomTip bottomTip, Icon icon, LinkText linkText, String str2, List<UserRightDetail> list3) {
        this.name = str;
        this.userRightDetails = list;
        this.contactDetail = contactDetail;
        this.exposeUserRightPanel = exposeUserRightPanel;
        this.privacyPolicy = list2;
        this.bottomTip = bottomTip;
        this.icon = icon;
        this.prefixName = linkText;
        this.serverTrackParams = str2;
        this.priceRightDetails = list3;
    }
}
