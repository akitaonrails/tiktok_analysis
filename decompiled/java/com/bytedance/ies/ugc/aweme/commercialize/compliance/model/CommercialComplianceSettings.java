package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class CommercialComplianceSettings extends BaseResponse implements Serializable {

    @C09CT("show_ads_inference")
    public Boolean showAdsInference;

    @C09CT("data_control_3p_data")
    public TherePartyDataControlModel therePartyData;

    public CommercialComplianceSettings() {
        this(null, Boolean.FALSE);
    }

    public final Boolean getShowAdsInference() {
        return this.showAdsInference;
    }

    public final TherePartyDataControlModel getTherePartyData() {
        return this.therePartyData;
    }

    public final void setShowAdsInference(Boolean bool) {
        this.showAdsInference = bool;
    }

    public final void setTherePartyData(TherePartyDataControlModel therePartyDataControlModel) {
        this.therePartyData = therePartyDataControlModel;
    }

    public CommercialComplianceSettings(TherePartyDataControlModel therePartyDataControlModel, Boolean bool) {
        this.therePartyData = therePartyDataControlModel;
        this.showAdsInference = bool;
    }
}
