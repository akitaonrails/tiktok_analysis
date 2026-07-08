package com.ss.android.ugc.aweme.effectcreator.models;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftExtraCampaignInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CKEDraftExtraCampaignInfo implements Parcelable {
    public static final Parcelable.Creator<CKEDraftExtraCampaignInfo> CREATOR = new Parcelable.Creator<CKEDraftExtraCampaignInfo>() { // from class: X.0vIU
        @Override // android.os.Parcelable.Creator
        public final CKEDraftExtraCampaignInfo createFromParcel(Parcel parcel) {
            return new CKEDraftExtraCampaignInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CKEDraftExtraCampaignInfo[] newArray(int i) {
            return new CKEDraftExtraCampaignInfo[i];
        }
    };
    public String campaignBindMethod;
    public String campaignId;

    public final CKEDraftExtraCampaignInfo copy(String str, String str2) {
        return new CKEDraftExtraCampaignInfo(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CKEDraftExtraCampaignInfo)) {
            return false;
        }
        CKEDraftExtraCampaignInfo cKEDraftExtraCampaignInfo = (CKEDraftExtraCampaignInfo) obj;
        return Intrinsics.LJFF(this.campaignId, cKEDraftExtraCampaignInfo.campaignId) && Intrinsics.LJFF(this.campaignBindMethod, cKEDraftExtraCampaignInfo.campaignBindMethod);
    }

    public int hashCode() {
        return (this.campaignId.hashCode() * 31) + this.campaignBindMethod.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CKEDraftExtraCampaignInfo(campaignId=");
        sbLIZ.append(this.campaignId);
        sbLIZ.append(", campaignBindMethod=");
        sbLIZ.append(this.campaignBindMethod);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.campaignId);
        parcel.writeString(this.campaignBindMethod);
    }

    public CKEDraftExtraCampaignInfo() {
        this("", "");
    }

    public final String getCampaignBindMethod() {
        return this.campaignBindMethod;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final void setCampaignBindMethod(String str) {
        this.campaignBindMethod = str;
    }

    public final void setCampaignId(String str) {
        this.campaignId = str;
    }

    public CKEDraftExtraCampaignInfo(String str, String str2) {
        this.campaignId = str;
        this.campaignBindMethod = str2;
    }
}
