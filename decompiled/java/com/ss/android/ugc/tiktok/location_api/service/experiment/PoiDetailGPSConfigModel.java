package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailGPSConfigModel {

    @C09CT("frequency")
    public PoiDetailGPSFrequency frequency;

    @C09CT("open_settings_cert_token")
    public List<String> openSettingsCertTokenList;

    @C09CT("open_settings_style")
    public String openSettingsStyle;

    @C09CT("pre_popup_cert_token")
    public List<String> prePopupCertTokenList;

    @C09CT("show_float_notice")
    public boolean showFloatNotice;

    @C09CT("starling_key")
    public PoiStarlingModel starlingKey;

    @C09CT("use_exp_config")
    public boolean useExpConfig;

    public PoiDetailGPSConfigModel() {
        this(false, new ArrayList(), new ArrayList(), new PoiStarlingModel("", "", "", "", "", ""), new PoiDetailGPSFrequency(false, 0, 0, null, null, null), false, "");
    }

    public PoiDetailGPSConfigModel(boolean z, List<String> list, List<String> list2, PoiStarlingModel poiStarlingModel, PoiDetailGPSFrequency poiDetailGPSFrequency, boolean z2, String str) {
        this.useExpConfig = z;
        this.openSettingsCertTokenList = list;
        this.prePopupCertTokenList = list2;
        this.starlingKey = poiStarlingModel;
        this.frequency = poiDetailGPSFrequency;
        this.showFloatNotice = z2;
        this.openSettingsStyle = str;
    }
}
