package com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.AuthPopup;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.LinkRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthPopup implements Parcelable {
    public static final Parcelable.Creator<AuthPopup> CREATOR = new Parcelable.Creator<AuthPopup>() { // from class: X.0vG6
        @Override // android.os.Parcelable.Creator
        public final AuthPopup createFromParcel(Parcel parcel) {
            LinkRichText linkRichTextCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkRichTextCreateFromParcel = null;
            } else {
                linkRichTextCreateFromParcel = LinkRichText.CREATOR.createFromParcel(parcel);
            }
            return new AuthPopup(string, string2, string3, string4, linkRichTextCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthPopup[] newArray(int i) {
            return new AuthPopup[i];
        }
    };

    @C09CT("btn_agree")
    public final String btnAgree;

    @C09CT("btn_continue")
    public final String btnContinue;

    @C09CT("btn_disagree")
    public final String btnDisagree;

    @C09CT("content")
    public final LinkRichText content;

    @C09CT("title")
    public final String title;

    public AuthPopup() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthPopup)) {
            return false;
        }
        AuthPopup authPopup = (AuthPopup) obj;
        return Intrinsics.LJFF(this.title, authPopup.title) && Intrinsics.LJFF(this.btnAgree, authPopup.btnAgree) && Intrinsics.LJFF(this.btnDisagree, authPopup.btnDisagree) && Intrinsics.LJFF(this.btnContinue, authPopup.btnContinue) && Intrinsics.LJFF(this.content, authPopup.content);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.btnAgree;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.btnDisagree;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.btnContinue;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LinkRichText linkRichText = this.content;
        return iHashCode4 + (linkRichText != null ? linkRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthPopup(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", btnAgree=");
        sbLIZ.append(this.btnAgree);
        sbLIZ.append(", btnDisagree=");
        sbLIZ.append(this.btnDisagree);
        sbLIZ.append(", btnContinue=");
        sbLIZ.append(this.btnContinue);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.btnAgree);
        parcel.writeString(this.btnDisagree);
        parcel.writeString(this.btnContinue);
        LinkRichText linkRichText = this.content;
        if (linkRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkRichText.writeToParcel(parcel, i);
        }
    }

    public AuthPopup(String str, String str2, String str3, String str4, LinkRichText linkRichText) {
        this.title = str;
        this.btnAgree = str2;
        this.btnDisagree = str3;
        this.btnContinue = str4;
        this.content = linkRichText;
    }
}
