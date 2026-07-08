package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpButton implements Parcelable {

    @C09CT("action")
    public final Integer buttonAction;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer buttonStatus;

    @C09CT("style")
    public final Integer buttonStyle;

    @C09CT("click_hint")
    public final String clickHint;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("desc")
    public final String desc;
    public final Integer descId;

    @C09CT("desc_v2")
    public final ECRichText descV2;

    @C09CT("link")
    public final String link;

    @C09CT("single_desc")
    public final String singleDesc;
    public static final Parcelable.Creator<PdpButton> CREATOR = new Parcelable.Creator<PdpButton>() { // from class: X.043L
        @Override // android.os.Parcelable.Creator
        public final PdpButton createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            String string = parcel.readString();
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(PdpButton.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf4 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            return new PdpButton(string, eCRichText, string2, string3, string4, numValueOf, numValueOf2, numValueOf3, numValueOf4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PdpButton[] newArray(int i) {
            return new PdpButton[i];
        }
    };
    public static final int $stable = 8;

    public PdpButton() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpButton)) {
            return false;
        }
        PdpButton pdpButton = (PdpButton) obj;
        return Intrinsics.LJFF(this.desc, pdpButton.desc) && Intrinsics.LJFF(this.descV2, pdpButton.descV2) && Intrinsics.LJFF(this.singleDesc, pdpButton.singleDesc) && Intrinsics.LJFF(this.clickHint, pdpButton.clickHint) && Intrinsics.LJFF(this.link, pdpButton.link) && Intrinsics.LJFF(this.buttonAction, pdpButton.buttonAction) && Intrinsics.LJFF(this.buttonStatus, pdpButton.buttonStatus) && Intrinsics.LJFF(this.buttonStyle, pdpButton.buttonStyle) && Intrinsics.LJFF(this.descId, pdpButton.descId) && Intrinsics.LJFF(this.daInfo, pdpButton.daInfo);
    }

    public final int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ECRichText eCRichText = this.descV2;
        int iHashCode2 = (iHashCode + (eCRichText == null ? 0 : eCRichText.hashCode())) * 31;
        String str2 = this.singleDesc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clickHint;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.buttonAction;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.buttonStatus;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.buttonStyle;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.descId;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.daInfo;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpButton(desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", descV2=");
        sbLIZ.append(this.descV2);
        sbLIZ.append(", singleDesc=");
        sbLIZ.append(this.singleDesc);
        sbLIZ.append(", clickHint=");
        sbLIZ.append(this.clickHint);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", buttonAction=");
        sbLIZ.append(this.buttonAction);
        sbLIZ.append(", buttonStatus=");
        sbLIZ.append(this.buttonStatus);
        sbLIZ.append(", buttonStyle=");
        sbLIZ.append(this.buttonStyle);
        sbLIZ.append(", descId=");
        sbLIZ.append(this.descId);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.desc);
        parcel.writeParcelable(this.descV2, i);
        parcel.writeString(this.singleDesc);
        parcel.writeString(this.clickHint);
        parcel.writeString(this.link);
        Integer num = this.buttonAction;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.buttonStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.buttonStyle;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.descId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.daInfo);
    }

    public static PdpButton LIZ(PdpButton pdpButton, String str, Integer num, Integer num2, int i) {
        String str2;
        ECRichText eCRichText;
        String str3;
        String str4;
        Integer num3;
        Integer num4;
        Integer num5 = num2;
        Integer num6 = num;
        String str5 = str;
        String str6 = null;
        if ((i & 1) != 0) {
            str2 = pdpButton.desc;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            eCRichText = pdpButton.descV2;
        } else {
            eCRichText = null;
        }
        if ((i & 4) != 0) {
            str3 = pdpButton.singleDesc;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str5 = pdpButton.clickHint;
        }
        if ((i & 16) != 0) {
            str4 = pdpButton.link;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            num3 = pdpButton.buttonAction;
        } else {
            num3 = null;
        }
        if ((i & 64) != 0) {
            num6 = pdpButton.buttonStatus;
        }
        if ((i & 128) != 0) {
            num5 = pdpButton.buttonStyle;
        }
        if ((i & 256) != 0) {
            num4 = pdpButton.descId;
        } else {
            num4 = null;
        }
        if ((i & 512) != 0) {
            str6 = pdpButton.daInfo;
        }
        pdpButton.getClass();
        return new PdpButton(str2, eCRichText, str3, str5, str4, num3, num6, num5, num4, str6);
    }

    public PdpButton(String str, ECRichText eCRichText, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, String str5) {
        this.desc = str;
        this.descV2 = eCRichText;
        this.singleDesc = str2;
        this.clickHint = str3;
        this.link = str4;
        this.buttonAction = num;
        this.buttonStatus = num2;
        this.buttonStyle = num3;
        this.descId = num4;
        this.daInfo = str5;
    }
}
