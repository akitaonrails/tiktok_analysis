package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.HintInvalidDynamicMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class HintInvalidDynamicMessage implements Parcelable {

    @C09CT("background_color")
    public CommonColor backgroundColor;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("icon")
    public Icon icon;

    @C09CT("link")
    public String link;

    @C09CT("text")
    public String text;

    @C09CT("text_color")
    public CommonColor textColor;
    public static final Parcelable.Creator<HintInvalidDynamicMessage> CREATOR = new Parcelable.Creator<HintInvalidDynamicMessage>() { // from class: X.02XZ
        @Override // android.os.Parcelable.Creator
        public final HintInvalidDynamicMessage createFromParcel(Parcel parcel) {
            CommonColor commonColorCreateFromParcel;
            Icon icon = (Icon) parcel.readParcelable(HintInvalidDynamicMessage.class.getClassLoader());
            String string = parcel.readString();
            CommonColor commonColorCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                commonColorCreateFromParcel = null;
            } else {
                commonColorCreateFromParcel = CommonColor.CREATOR.createFromParcel(parcel);
            }
            CommonColor commonColor = commonColorCreateFromParcel;
            if (parcel.readInt() != 0) {
                commonColorCreateFromParcel2 = CommonColor.CREATOR.createFromParcel(parcel);
            }
            return new HintInvalidDynamicMessage(icon, string, commonColor, commonColorCreateFromParcel2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HintInvalidDynamicMessage[] newArray(int i) {
            return new HintInvalidDynamicMessage[i];
        }
    };
    public static final int $stable = 8;

    public HintInvalidDynamicMessage() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HintInvalidDynamicMessage)) {
            return false;
        }
        HintInvalidDynamicMessage hintInvalidDynamicMessage = (HintInvalidDynamicMessage) obj;
        return Intrinsics.LJFF(this.icon, hintInvalidDynamicMessage.icon) && Intrinsics.LJFF(this.text, hintInvalidDynamicMessage.text) && Intrinsics.LJFF(this.textColor, hintInvalidDynamicMessage.textColor) && Intrinsics.LJFF(this.backgroundColor, hintInvalidDynamicMessage.backgroundColor) && Intrinsics.LJFF(this.link, hintInvalidDynamicMessage.link) && Intrinsics.LJFF(this.daInfo, hintInvalidDynamicMessage.daInfo);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int iHashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CommonColor commonColor = this.textColor;
        int iHashCode3 = (iHashCode2 + (commonColor == null ? 0 : commonColor.hashCode())) * 31;
        CommonColor commonColor2 = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (commonColor2 == null ? 0 : commonColor2.hashCode())) * 31;
        String str2 = this.link;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.daInfo;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HintInvalidDynamicMessage(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", link=");
        sbLIZ.append(this.link);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.text);
        CommonColor commonColor = this.textColor;
        if (commonColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor.writeToParcel(parcel, i);
        }
        CommonColor commonColor2 = this.backgroundColor;
        if (commonColor2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonColor2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.link);
        parcel.writeString(this.daInfo);
    }

    public HintInvalidDynamicMessage(Icon icon, String str, CommonColor commonColor, CommonColor commonColor2, String str2, String str3) {
        this.icon = icon;
        this.text = str;
        this.textColor = commonColor;
        this.backgroundColor = commonColor2;
        this.link = str2;
        this.daInfo = str3;
    }
}
