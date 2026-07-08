package com.ss.android.ugc.profile.business.profile.menu.business.content.business.base;

import X.C09CT;
import X.EnumC995430c0j;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellBizBaseData extends AdvancedFeatureBaseData {
    public static final int $stable = 8;

    @C09CT("hide_menu_on_back")
    public Boolean hideMenuOnBack = Boolean.FALSE;

    @C09CT("rich_card_lynx")
    public ContentCellRichCardData richCard = new ContentCellRichCardData(EnumC995430c0j.CONTAINER_LOCATION_UNKNOWN.ordinal(), null, 44, "", new ContentCellMinisRichCardParams(null, null, null, 7, null));

    public final Boolean getHideMenuOnBack() {
        return this.hideMenuOnBack;
    }

    public final ContentCellRichCardData getRichCard() {
        return this.richCard;
    }

    public final void setHideMenuOnBack(Boolean bool) {
        this.hideMenuOnBack = bool;
    }

    public final void setRichCard(ContentCellRichCardData contentCellRichCardData) {
        this.richCard = contentCellRichCardData;
    }
}
