package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiStarlingModel {

    @C09CT("float_notice_starling_key")
    public String floatNoticeStarlingKey;

    @C09CT("open_settings_content_bold_starling_key")
    public String openSettingsContentBoldStarlingKey;

    @C09CT("open_settings_content_starling_key")
    public String openSettingsContentStarlingKey;

    @C09CT("open_settings_title_starling_key")
    public String openSettingsTitleStarlingKey;

    @C09CT("pre_popup_content_starling_key")
    public String prePopupContentStarlingKey;

    @C09CT("pre_popup_title_starling_key")
    public String prePopupTitleStarlingKey;

    public PoiStarlingModel() {
        this("", "", "", "", "", "");
    }

    public PoiStarlingModel(String str, String str2, String str3, String str4, String str5, String str6) {
        this.openSettingsTitleStarlingKey = str;
        this.openSettingsContentStarlingKey = str2;
        this.openSettingsContentBoldStarlingKey = str3;
        this.prePopupTitleStarlingKey = str4;
        this.prePopupContentStarlingKey = str5;
        this.floatNoticeStarlingKey = str6;
    }
}
