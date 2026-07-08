package com.ss.android.ugc.aweme.urllink.model;

import X.C09CT;
import X.C19612311oH;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.urllink.model.LinkStickerStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class LinkStickerStruct implements Parcelable, Serializable {

    @C09CT("display_text")
    public String displayText;

    @C09CT("link_address")
    public String fullURL;

    @C09CT("link_enabled_status")
    public String linkEnableStatus;

    @C09CT("link_risk_score")
    public int linkRiskScore;

    @C09CT("safety_conclusion")
    public int safetyConclusion;
    public static final C19612311oH Companion = new Object() { // from class: X.11oH
    };
    public static final Parcelable.Creator<LinkStickerStruct> CREATOR = new Parcelable.Creator<LinkStickerStruct>() { // from class: X.11oG
        @Override // android.os.Parcelable.Creator
        public final LinkStickerStruct createFromParcel(Parcel parcel) {
            return new LinkStickerStruct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LinkStickerStruct[] newArray(int i) {
            return new LinkStickerStruct[i];
        }
    };

    public final LinkStickerStruct copy(String str, String str2, String str3, int i, int i2) {
        return new LinkStickerStruct(str, str2, str3, i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkStickerStruct)) {
            return false;
        }
        LinkStickerStruct linkStickerStruct = (LinkStickerStruct) obj;
        return Intrinsics.LJFF(this.fullURL, linkStickerStruct.fullURL) && Intrinsics.LJFF(this.displayText, linkStickerStruct.displayText) && Intrinsics.LJFF(this.linkEnableStatus, linkStickerStruct.linkEnableStatus) && this.linkRiskScore == linkStickerStruct.linkRiskScore && this.safetyConclusion == linkStickerStruct.safetyConclusion;
    }

    public int hashCode() {
        return (((((((this.fullURL.hashCode() * 31) + this.displayText.hashCode()) * 31) + this.linkEnableStatus.hashCode()) * 31) + this.linkRiskScore) * 31) + this.safetyConclusion;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkStickerStruct(fullURL=");
        sbLIZ.append(this.fullURL);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", linkEnableStatus=");
        sbLIZ.append(this.linkEnableStatus);
        sbLIZ.append(", linkRiskScore=");
        sbLIZ.append(this.linkRiskScore);
        sbLIZ.append(", safetyConclusion=");
        sbLIZ.append(this.safetyConclusion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fullURL);
        parcel.writeString(this.displayText);
        parcel.writeString(this.linkEnableStatus);
        parcel.writeInt(this.linkRiskScore);
        parcel.writeInt(this.safetyConclusion);
    }

    public LinkStickerStruct() {
        this("", "", "Enabled", 100, 0);
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getFullURL() {
        return this.fullURL;
    }

    public final String getLinkEnableStatus() {
        return this.linkEnableStatus;
    }

    public final int getLinkRiskScore() {
        return this.linkRiskScore;
    }

    public final int getSafetyConclusion() {
        return this.safetyConclusion;
    }

    public final void setLinkEnableStatus(String str) {
        this.linkEnableStatus = str;
    }

    public final void setLinkRiskScore(int i) {
        this.linkRiskScore = i;
    }

    public final void setSafetyConclusion(int i) {
        this.safetyConclusion = i;
    }

    public LinkStickerStruct(String str, String str2, String str3, int i, int i2) {
        this.fullURL = str;
        this.displayText = str2;
        this.linkEnableStatus = str3;
        this.linkRiskScore = i;
        this.safetyConclusion = i2;
    }
}
