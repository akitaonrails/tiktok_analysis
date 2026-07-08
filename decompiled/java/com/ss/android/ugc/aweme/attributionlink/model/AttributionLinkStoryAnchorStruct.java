package com.ss.android.ugc.aweme.attributionlink.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStoryAnchorStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AttributionLinkStoryAnchorStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<AttributionLinkStoryAnchorStruct> CREATOR = new Parcelable.Creator<AttributionLinkStoryAnchorStruct>() { // from class: X.0oGH
        @Override // android.os.Parcelable.Creator
        public final AttributionLinkStoryAnchorStruct createFromParcel(Parcel parcel) {
            return new AttributionLinkStoryAnchorStruct(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AttributionLinkStoryAnchorStruct[] newArray(int i) {
            return new AttributionLinkStoryAnchorStruct[i];
        }
    };

    @C09CT("display_text")
    public final String displayText;

    @C09CT("link_address")
    public final String fullURL;

    @C09CT("external_title")
    public final String title;

    public AttributionLinkStoryAnchorStruct() {
        this(null, null, null);
    }

    public final AttributionLinkStoryAnchorStruct copy(String str, String str2, String str3) {
        return new AttributionLinkStoryAnchorStruct(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributionLinkStoryAnchorStruct)) {
            return false;
        }
        AttributionLinkStoryAnchorStruct attributionLinkStoryAnchorStruct = (AttributionLinkStoryAnchorStruct) obj;
        return Intrinsics.LJFF(this.title, attributionLinkStoryAnchorStruct.title) && Intrinsics.LJFF(this.fullURL, attributionLinkStoryAnchorStruct.fullURL) && Intrinsics.LJFF(this.displayText, attributionLinkStoryAnchorStruct.displayText);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullURL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AttributionLinkStoryAnchorStruct(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", fullURL=");
        sbLIZ.append(this.fullURL);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.fullURL);
        parcel.writeString(this.displayText);
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getFullURL() {
        return this.fullURL;
    }

    public final String getTitle() {
        return this.title;
    }

    public AttributionLinkStoryAnchorStruct(String str, String str2, String str3) {
        this.title = str;
        this.fullURL = str2;
        this.displayText = str3;
    }
}
