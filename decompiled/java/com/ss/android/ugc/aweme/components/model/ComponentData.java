package com.ss.android.ugc.aweme.components.model;

import X.C09CT;
import com.ss.android.ugc.aweme.components.briefinfo.BriefInfoParams;
import com.ss.android.ugc.aweme.components.infosection.InfoSectionParams;
import com.ss.android.ugc.aweme.components.purchasebutton.PurchaseButtonParams;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionParams;
import com.ss.android.ugc.aweme.components.tabs.TabParams;

/* JADX INFO: loaded from: classes26.dex */
public final class ComponentData {

    @C09CT("brief_info_component")
    public final BriefInfoParams briefInfoComponent;

    @C09CT("info_section")
    public final InfoSectionParams infoSectionComponent;

    @C09CT("purchase_button_component")
    public final PurchaseButtonParams purchaseButtonComponent;

    @C09CT("purchase_options_component")
    public final PurchaseOptionParams purchaseOptionComponent;

    @C09CT("tabs_component")
    public final TabParams tabsComponent;

    public ComponentData() {
        this(null, null, null, null, null);
    }

    public ComponentData(InfoSectionParams infoSectionParams, PurchaseOptionParams purchaseOptionParams, BriefInfoParams briefInfoParams, PurchaseButtonParams purchaseButtonParams, TabParams tabParams) {
        this.infoSectionComponent = infoSectionParams;
        this.purchaseOptionComponent = purchaseOptionParams;
        this.briefInfoComponent = briefInfoParams;
        this.purchaseButtonComponent = purchaseButtonParams;
        this.tabsComponent = tabParams;
    }
}
