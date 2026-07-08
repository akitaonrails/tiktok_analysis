package com.ss.android.ugc.aweme.ecommerce.base.addon.dto;

import X.C09CT;
import com.google.gson.n;

/* JADX INFO: loaded from: classes2.dex */
public final class GetAddonPanelLayoutResponseData {

    @C09CT("layout_info")
    public final n layoutInfo;

    @C09CT("schema")
    public final String schema;

    @C09CT("show_panel")
    public final Boolean showPanel;

    public GetAddonPanelLayoutResponseData(Boolean bool, n nVar, String str) {
        this.showPanel = bool;
        this.layoutInfo = nVar;
        this.schema = str;
    }
}
