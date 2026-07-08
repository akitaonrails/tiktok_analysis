package com.ss.android.ugc.aweme.component.supplementalinfocomponent.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleSupplementalInfoData {

    @C09CT("clickable")
    public final Boolean clickable;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("log_info")
    public final AnoleLogInfo logInfo;

    @C09CT("max_lines")
    public final Integer maxLines;

    @C09CT("panel_data")
    public final SupplementalInfoPanelData panelData;

    @C09CT("promo_code_data")
    public final SupplementalPromoCodeData promoCodeData;

    @C09CT("should_popup_panel")
    public final Boolean shouldPopupPanel;

    @C09CT("title")
    public final String title;

    public AnoleSupplementalInfoData(UrlModel urlModel, String str, Boolean bool, Integer num, AnoleLogInfo anoleLogInfo, Boolean bool2, SupplementalInfoPanelData supplementalInfoPanelData, SupplementalPromoCodeData supplementalPromoCodeData) {
        this.icon = urlModel;
        this.title = str;
        this.clickable = bool;
        this.maxLines = num;
        this.logInfo = anoleLogInfo;
        this.shouldPopupPanel = bool2;
        this.panelData = supplementalInfoPanelData;
        this.promoCodeData = supplementalPromoCodeData;
    }
}
