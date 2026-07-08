package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIMarketingTool;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CBIMarketingTool implements Parcelable {
    public static final Parcelable.Creator<CBIMarketingTool> CREATOR = new Parcelable.Creator<CBIMarketingTool>() { // from class: X.0ulc
        @Override // android.os.Parcelable.Creator
        public final CBIMarketingTool createFromParcel(Parcel parcel) {
            return new CBIMarketingTool(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CBIMarketingTool[] newArray(int i) {
            return new CBIMarketingTool[i];
        }
    };

    @C09CT("selected_text")
    public final String selectedText;

    @C09CT("un_selected_text")
    public final String text;

    @C09CT("marketing_detail_url")
    public final String url;

    public CBIMarketingTool() {
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
        if (!(obj instanceof CBIMarketingTool)) {
            return false;
        }
        CBIMarketingTool cBIMarketingTool = (CBIMarketingTool) obj;
        return Intrinsics.LJFF(this.text, cBIMarketingTool.text) && Intrinsics.LJFF(this.selectedText, cBIMarketingTool.selectedText) && Intrinsics.LJFF(this.url, cBIMarketingTool.url);
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selectedText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CBIMarketingTool(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", selectedText=");
        sbLIZ.append(this.selectedText);
        sbLIZ.append(", url=");
        sbLIZ.append(this.url);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.selectedText);
        parcel.writeString(this.url);
    }

    public CBIMarketingTool(String str, String str2, String str3) {
        this.text = str;
        this.selectedText = str2;
        this.url = str3;
    }
}
