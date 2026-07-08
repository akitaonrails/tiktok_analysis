package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.ScreenContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ScreenContent implements Parcelable {
    public static final Parcelable.Creator<ScreenContent> CREATOR = new Parcelable.Creator<ScreenContent>() { // from class: X.02ka
        @Override // android.os.Parcelable.Creator
        public final ScreenContent createFromParcel(Parcel parcel) {
            DialogButton dialogButtonCreateFromParcel;
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                dialogButtonCreateFromParcel = null;
            } else {
                dialogButtonCreateFromParcel = DialogButton.CREATOR.createFromParcel(parcel);
            }
            DialogButton dialogButton = dialogButtonCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new ScreenContent(string, string2, dialogButton, numValueOf, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ScreenContent[] newArray(int i) {
            return new ScreenContent[i];
        }
    };

    @C09CT("da_info")
    public String daInfo;

    @C09CT("da_info_type")
    public Integer daInfoType;

    @C09CT("illustration_type")
    public Integer illustrationType;

    @C09CT("message")
    public String message;

    @C09CT("screen_button")
    public DialogButton screenButton;

    @C09CT("title")
    public String title;

    public ScreenContent() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenContent)) {
            return false;
        }
        ScreenContent screenContent = (ScreenContent) obj;
        return Intrinsics.LJFF(this.title, screenContent.title) && Intrinsics.LJFF(this.message, screenContent.message) && Intrinsics.LJFF(this.screenButton, screenContent.screenButton) && Intrinsics.LJFF(this.illustrationType, screenContent.illustrationType) && Intrinsics.LJFF(this.daInfoType, screenContent.daInfoType) && Intrinsics.LJFF(this.daInfo, screenContent.daInfo);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DialogButton dialogButton = this.screenButton;
        int iHashCode3 = (iHashCode2 + (dialogButton == null ? 0 : dialogButton.hashCode())) * 31;
        Integer num = this.illustrationType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.daInfoType;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.daInfo;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenContent(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", screenButton=");
        sbLIZ.append(this.screenButton);
        sbLIZ.append(", illustrationType=");
        sbLIZ.append(this.illustrationType);
        sbLIZ.append(", daInfoType=");
        sbLIZ.append(this.daInfoType);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        DialogButton dialogButton = this.screenButton;
        if (dialogButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dialogButton.writeToParcel(parcel, i);
        }
        Integer num = this.illustrationType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.daInfoType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.daInfo);
    }

    public ScreenContent(String str, String str2, DialogButton dialogButton, Integer num, Integer num2, String str3) {
        this.title = str;
        this.message = str2;
        this.screenButton = dialogButton;
        this.illustrationType = num;
        this.daInfoType = num2;
        this.daInfo = str3;
    }
}
