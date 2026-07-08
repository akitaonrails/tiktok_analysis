package com.ss.android.ugc.aweme.commerce.tools.tcm;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceToolsTcmModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CommerceToolsTcmModel> CREATOR = new Parcelable.Creator<CommerceToolsTcmModel>() { // from class: X.15Mu
        @Override // android.os.Parcelable.Creator
        public final CommerceToolsTcmModel createFromParcel(Parcel parcel) {
            boolean z;
            TCMPostPageSubmitTextModel tCMPostPageSubmitTextModelCreateFromParcel;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                tCMPostPageSubmitTextModelCreateFromParcel = null;
            } else {
                tCMPostPageSubmitTextModelCreateFromParcel = TCMPostPageSubmitTextModel.CREATOR.createFromParcel(parcel);
            }
            TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel = tCMPostPageSubmitTextModelCreateFromParcel;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string7 = parcel.readString();
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new CommerceToolsTcmModel(z, string, string2, string3, tCMPostPageSubmitTextModel, string4, string5, string6, i, z2, z3, z4, string7, i2, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final CommerceToolsTcmModel[] newArray(int i) {
            return new CommerceToolsTcmModel[i];
        }
    };

    @C09CT("account_ad_setting_open")
    public boolean accountAdSettingsBeOpen;

    @C09CT("ads_authorization_switch")
    public boolean adsAuthorizationSwitch;

    @C09CT("ads_Only_switch")
    public boolean adsOnlySwitch;

    @C09CT("bc_custom_alert_terminology")
    public int bcCustomAlertTerminology;

    @C09CT("brand_organic_type")
    public String brandOrganicType;

    @C09CT("branded_content_switch")
    public String brandedContentSwitch;

    @C09CT("deliverable_id")
    public String deliverableId;

    @C09CT("has_tagged_ba")
    public boolean hasTaggedBA;

    @C09CT("is_tcm_order")
    public boolean isTcmOrder;

    @C09CT("outer_tcm_order")
    public String outerTcmOrder;

    @C09CT("spark_ads_auth")
    public String sparkAdsAuth;

    @C09CT("submit_text")
    public TCMPostPageSubmitTextModel submitText;

    @C09CT("tcm_campaign_info")
    public String tcmCampaignInfo;

    @C09CT("tcm_params")
    public String tcmParams;

    @C09CT("tcm_prevent_self_see")
    public int tcmPreventSelfSee;

    public CommerceToolsTcmModel() {
        this(false, null, null, null, null, null, CardStruct.IStatusCode.DEFAULT, null, 0, false, false, false, null, 0, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isTcmOrder ? 1 : 0);
        parcel.writeString(this.outerTcmOrder);
        parcel.writeString(this.sparkAdsAuth);
        parcel.writeString(this.deliverableId);
        TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel = this.submitText;
        if (tCMPostPageSubmitTextModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tCMPostPageSubmitTextModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tcmCampaignInfo);
        parcel.writeString(this.brandedContentSwitch);
        parcel.writeString(this.brandOrganicType);
        parcel.writeInt(this.bcCustomAlertTerminology);
        parcel.writeInt(this.adsOnlySwitch ? 1 : 0);
        parcel.writeInt(this.adsAuthorizationSwitch ? 1 : 0);
        parcel.writeInt(this.hasTaggedBA ? 1 : 0);
        parcel.writeString(this.tcmParams);
        parcel.writeInt(this.tcmPreventSelfSee);
        parcel.writeInt(this.accountAdSettingsBeOpen ? 1 : 0);
    }

    public final boolean getAccountAdSettingsBeOpen() {
        return this.accountAdSettingsBeOpen;
    }

    public final boolean getAdsAuthorizationSwitch() {
        return this.adsAuthorizationSwitch;
    }

    public final boolean getAdsOnlySwitch() {
        return this.adsOnlySwitch;
    }

    public final int getBcCustomAlertTerminology() {
        return this.bcCustomAlertTerminology;
    }

    public final String getBrandOrganicType() {
        return this.brandOrganicType;
    }

    public final String getBrandedContentSwitch() {
        return this.brandedContentSwitch;
    }

    public final String getDeliverableId() {
        return this.deliverableId;
    }

    public final boolean getHasTaggedBA() {
        return this.hasTaggedBA;
    }

    public final String getOuterTcmOrder() {
        return this.outerTcmOrder;
    }

    public final String getSparkAdsAuth() {
        return this.sparkAdsAuth;
    }

    public final TCMPostPageSubmitTextModel getSubmitText() {
        return this.submitText;
    }

    public final String getTcmCampaignInfo() {
        return this.tcmCampaignInfo;
    }

    public final String getTcmParams() {
        return this.tcmParams;
    }

    public final int getTcmPreventSelfSee() {
        return this.tcmPreventSelfSee;
    }

    public final boolean isTcmOrder() {
        return this.isTcmOrder;
    }

    public CommerceToolsTcmModel(boolean z) {
        this(z, null, null, null, null, null, CardStruct.IStatusCode.DEFAULT, null, 0, false, false, false, null, 0, false);
    }

    public final void setAccountAdSettingsBeOpen(boolean z) {
        this.accountAdSettingsBeOpen = z;
    }

    public final void setAdsAuthorizationSwitch(boolean z) {
        this.adsAuthorizationSwitch = z;
    }

    public final void setAdsOnlySwitch(boolean z) {
        this.adsOnlySwitch = z;
    }

    public final void setBcCustomAlertTerminology(int i) {
        this.bcCustomAlertTerminology = i;
    }

    public final void setBrandOrganicType(String str) {
        this.brandOrganicType = str;
    }

    public final void setBrandedContentSwitch(String str) {
        this.brandedContentSwitch = str;
    }

    public final void setDeliverableId(String str) {
        this.deliverableId = str;
    }

    public final void setHasTaggedBA(boolean z) {
        this.hasTaggedBA = z;
    }

    public final void setOuterTcmOrder(String str) {
        this.outerTcmOrder = str;
    }

    public final void setSparkAdsAuth(String str) {
        this.sparkAdsAuth = str;
    }

    public final void setSubmitText(TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel) {
        this.submitText = tCMPostPageSubmitTextModel;
    }

    public final void setTcmCampaignInfo(String str) {
        this.tcmCampaignInfo = str;
    }

    public final void setTcmOrder(boolean z) {
        this.isTcmOrder = z;
    }

    public final void setTcmParams(String str) {
        this.tcmParams = str;
    }

    public final void setTcmPreventSelfSee(int i) {
        this.tcmPreventSelfSee = i;
    }

    public CommerceToolsTcmModel(boolean z, String str) {
        this(z, str, null, null, null, null, CardStruct.IStatusCode.DEFAULT, null, 0, false, false, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2) {
        this(z, str, str2, null, null, null, CardStruct.IStatusCode.DEFAULT, null, 0, false, false, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3) {
        this(z, str, str2, str3, null, null, CardStruct.IStatusCode.DEFAULT, null, 0, false, false, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, null, CardStruct.IStatusCode.DEFAULT, null, 0, false, false, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, CardStruct.IStatusCode.DEFAULT, null, 0, false, false, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, str5, null, 0, false, false, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5, String str6) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, str5, str6, 0, false, false, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5, String str6, int i) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, str5, str6, i, false, false, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5, String str6, int i, boolean z2) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, str5, str6, i, z2, false, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5, String str6, int i, boolean z2, boolean z3) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, str5, str6, i, z2, z3, false, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5, String str6, int i, boolean z2, boolean z3, boolean z4) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, str5, str6, i, z2, z3, z4, null, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5, String str6, int i, boolean z2, boolean z3, boolean z4, String str7) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, str5, str6, i, z2, z3, z4, str7, 0, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5, String str6, int i, boolean z2, boolean z3, boolean z4, String str7, int i2) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, str5, str6, i, z2, z3, z4, str7, i2, false);
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5, String str6, int i, boolean z2, boolean z3, boolean z4, String str7, int i2, boolean z5) {
        this.isTcmOrder = z;
        this.outerTcmOrder = str;
        this.sparkAdsAuth = str2;
        this.deliverableId = str3;
        this.submitText = tCMPostPageSubmitTextModel;
        this.tcmCampaignInfo = str4;
        this.brandedContentSwitch = str5;
        this.brandOrganicType = str6;
        this.bcCustomAlertTerminology = i;
        this.adsOnlySwitch = z2;
        this.adsAuthorizationSwitch = z3;
        this.hasTaggedBA = z4;
        this.tcmParams = str7;
        this.tcmPreventSelfSee = i2;
        this.accountAdSettingsBeOpen = z5;
    }
}
