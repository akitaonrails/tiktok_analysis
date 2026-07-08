package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoCollectionStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RecipientIdentityInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityInfo implements Serializable, Parcelable {

    @C09CT("enable_address_identity")
    public Boolean enableAddressIdentity;

    @C09CT("hint_text")
    public String hintText;

    @C09CT("identity_info_collection_style")
    public IdentityInfoCollectionStyle identityInfoCollectionStyle;

    @C09CT("identity_info_option")
    public IdentityInfoOption identityInfoOption;

    @C09CT("identity_info_panel")
    public IdentityInfoPanel identityInfoPanel;

    @C09CT("identity_required")
    public Boolean identityRequired;

    @C09CT("recipient_identity_info")
    public RecipientIdentityInfo recipientIdentityInfo;

    @C09CT("title")
    public String title;
    public static final Parcelable.Creator<IdentityInfo> CREATOR = new Parcelable.Creator<IdentityInfo>() { // from class: X.02wN
        @Override // android.os.Parcelable.Creator
        public final IdentityInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            IdentityInfoOption identityInfoOptionCreateFromParcel;
            IdentityInfoPanel identityInfoPanelCreateFromParcel;
            IdentityInfoCollectionStyle identityInfoCollectionStyleValueOf;
            RecipientIdentityInfo recipientIdentityInfoCreateFromParcel;
            String string = parcel.readString();
            boolean z2 = true;
            Boolean boolValueOf2 = null;
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
            if (parcel.readInt() == 0) {
                identityInfoOptionCreateFromParcel = null;
            } else {
                identityInfoOptionCreateFromParcel = IdentityInfoOption.CREATOR.createFromParcel(parcel);
            }
            IdentityInfoOption identityInfoOption = identityInfoOptionCreateFromParcel;
            if (parcel.readInt() == 0) {
                identityInfoPanelCreateFromParcel = null;
            } else {
                identityInfoPanelCreateFromParcel = IdentityInfoPanel.CREATOR.createFromParcel(parcel);
            }
            IdentityInfoPanel identityInfoPanel = identityInfoPanelCreateFromParcel;
            if (parcel.readInt() == 0) {
                identityInfoCollectionStyleValueOf = null;
            } else {
                identityInfoCollectionStyleValueOf = IdentityInfoCollectionStyle.valueOf(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                recipientIdentityInfoCreateFromParcel = null;
            } else {
                recipientIdentityInfoCreateFromParcel = RecipientIdentityInfo.CREATOR.createFromParcel(parcel);
            }
            RecipientIdentityInfo recipientIdentityInfo = recipientIdentityInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new IdentityInfo(string, boolValueOf, identityInfoOption, identityInfoPanel, identityInfoCollectionStyleValueOf, recipientIdentityInfo, boolValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityInfo[] newArray(int i) {
            return new IdentityInfo[i];
        }
    };
    public static final int $stable = 8;

    public IdentityInfo() {
    }

    public final IdentityInfo copy(String str, Boolean bool, IdentityInfoOption identityInfoOption, IdentityInfoPanel identityInfoPanel, IdentityInfoCollectionStyle identityInfoCollectionStyle, RecipientIdentityInfo recipientIdentityInfo, Boolean bool2, String str2) {
        return new IdentityInfo(str, bool, identityInfoOption, identityInfoPanel, identityInfoCollectionStyle, recipientIdentityInfo, bool2, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityInfo)) {
            return false;
        }
        IdentityInfo identityInfo = (IdentityInfo) obj;
        return Intrinsics.LJFF(this.hintText, identityInfo.hintText) && Intrinsics.LJFF(this.identityRequired, identityInfo.identityRequired) && Intrinsics.LJFF(this.identityInfoOption, identityInfo.identityInfoOption) && Intrinsics.LJFF(this.identityInfoPanel, identityInfo.identityInfoPanel) && this.identityInfoCollectionStyle == identityInfo.identityInfoCollectionStyle && Intrinsics.LJFF(this.recipientIdentityInfo, identityInfo.recipientIdentityInfo) && Intrinsics.LJFF(this.enableAddressIdentity, identityInfo.enableAddressIdentity) && Intrinsics.LJFF(this.title, identityInfo.title);
    }

    public int hashCode() {
        String str = this.hintText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.identityRequired;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        IdentityInfoOption identityInfoOption = this.identityInfoOption;
        int iHashCode3 = (iHashCode2 + (identityInfoOption == null ? 0 : identityInfoOption.hashCode())) * 31;
        IdentityInfoPanel identityInfoPanel = this.identityInfoPanel;
        int iHashCode4 = (iHashCode3 + (identityInfoPanel == null ? 0 : identityInfoPanel.hashCode())) * 31;
        IdentityInfoCollectionStyle identityInfoCollectionStyle = this.identityInfoCollectionStyle;
        int iHashCode5 = (iHashCode4 + (identityInfoCollectionStyle == null ? 0 : identityInfoCollectionStyle.hashCode())) * 31;
        RecipientIdentityInfo recipientIdentityInfo = this.recipientIdentityInfo;
        int iHashCode6 = (iHashCode5 + (recipientIdentityInfo == null ? 0 : recipientIdentityInfo.hashCode())) * 31;
        Boolean bool2 = this.enableAddressIdentity;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IdentityInfo(hintText=");
        sbLIZ.append(this.hintText);
        sbLIZ.append(", identityRequired=");
        sbLIZ.append(this.identityRequired);
        sbLIZ.append(", identityInfoOption=");
        sbLIZ.append(this.identityInfoOption);
        sbLIZ.append(", identityInfoPanel=");
        sbLIZ.append(this.identityInfoPanel);
        sbLIZ.append(", identityInfoCollectionStyle=");
        sbLIZ.append(this.identityInfoCollectionStyle);
        sbLIZ.append(", recipientIdentityInfo=");
        sbLIZ.append(this.recipientIdentityInfo);
        sbLIZ.append(", enableAddressIdentity=");
        sbLIZ.append(this.enableAddressIdentity);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hintText);
        Boolean bool = this.identityRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        IdentityInfoOption identityInfoOption = this.identityInfoOption;
        if (identityInfoOption == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            identityInfoOption.writeToParcel(parcel, i);
        }
        IdentityInfoPanel identityInfoPanel = this.identityInfoPanel;
        if (identityInfoPanel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            identityInfoPanel.writeToParcel(parcel, i);
        }
        IdentityInfoCollectionStyle identityInfoCollectionStyle = this.identityInfoCollectionStyle;
        if (identityInfoCollectionStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(identityInfoCollectionStyle.name());
        }
        RecipientIdentityInfo recipientIdentityInfo = this.recipientIdentityInfo;
        if (recipientIdentityInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            recipientIdentityInfo.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.enableAddressIdentity;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.title);
    }

    public final Boolean getEnableAddressIdentity() {
        return this.enableAddressIdentity;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final IdentityInfoCollectionStyle getIdentityInfoCollectionStyle() {
        return this.identityInfoCollectionStyle;
    }

    public final IdentityInfoOption getIdentityInfoOption() {
        return this.identityInfoOption;
    }

    public final IdentityInfoPanel getIdentityInfoPanel() {
        return this.identityInfoPanel;
    }

    public final Boolean getIdentityRequired() {
        return this.identityRequired;
    }

    public final RecipientIdentityInfo getRecipientIdentityInfo() {
        return this.recipientIdentityInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public IdentityInfo(String str, Boolean bool, IdentityInfoOption identityInfoOption, IdentityInfoPanel identityInfoPanel, IdentityInfoCollectionStyle identityInfoCollectionStyle, RecipientIdentityInfo recipientIdentityInfo, Boolean bool2, String str2) {
        this.hintText = str;
        this.identityRequired = bool;
        this.identityInfoOption = identityInfoOption;
        this.identityInfoPanel = identityInfoPanel;
        this.identityInfoCollectionStyle = identityInfoCollectionStyle;
        this.recipientIdentityInfo = recipientIdentityInfo;
        this.enableAddressIdentity = bool2;
        this.title = str2;
    }
}
