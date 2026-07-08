package com.ss.android.ugc.aweme.effectcreator.models;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftExtraCampaignInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CKEDraftExtraInfo implements Parcelable {
    public static final Parcelable.Creator<CKEDraftExtraInfo> CREATOR = new Parcelable.Creator<CKEDraftExtraInfo>() { // from class: X.0vIT
        @Override // android.os.Parcelable.Creator
        public final CKEDraftExtraInfo createFromParcel(Parcel parcel) {
            CKEDraftExtraCampaignInfo cKEDraftExtraCampaignInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                cKEDraftExtraCampaignInfoCreateFromParcel = null;
            } else {
                cKEDraftExtraCampaignInfoCreateFromParcel = CKEDraftExtraCampaignInfo.CREATOR.createFromParcel(parcel);
            }
            return new CKEDraftExtraInfo(cKEDraftExtraCampaignInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CKEDraftExtraInfo[] newArray(int i) {
            return new CKEDraftExtraInfo[i];
        }
    };
    public CKEDraftExtraCampaignInfo campaignInfo;

    public CKEDraftExtraInfo() {
        this(null);
    }

    public final CKEDraftExtraInfo copy(CKEDraftExtraCampaignInfo cKEDraftExtraCampaignInfo) {
        return new CKEDraftExtraInfo(cKEDraftExtraCampaignInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CKEDraftExtraInfo) && Intrinsics.LJFF(this.campaignInfo, ((CKEDraftExtraInfo) obj).campaignInfo);
    }

    public int hashCode() {
        CKEDraftExtraCampaignInfo cKEDraftExtraCampaignInfo = this.campaignInfo;
        if (cKEDraftExtraCampaignInfo == null) {
            return 0;
        }
        return cKEDraftExtraCampaignInfo.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CKEDraftExtraInfo(campaignInfo=");
        sbLIZ.append(this.campaignInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CKEDraftExtraCampaignInfo cKEDraftExtraCampaignInfo = this.campaignInfo;
        if (cKEDraftExtraCampaignInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cKEDraftExtraCampaignInfo.writeToParcel(parcel, i);
        }
    }

    public final CKEDraftExtraCampaignInfo getCampaignInfo() {
        return this.campaignInfo;
    }

    public CKEDraftExtraInfo(CKEDraftExtraCampaignInfo cKEDraftExtraCampaignInfo) {
        this.campaignInfo = cKEDraftExtraCampaignInfo;
    }

    public final void setCampaignInfo(CKEDraftExtraCampaignInfo cKEDraftExtraCampaignInfo) {
        this.campaignInfo = cKEDraftExtraCampaignInfo;
    }
}
