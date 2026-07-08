package com.ss.android.ugc.aweme.ecommerce.ug.popup.libra;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgRemoveShopTabOverlayExpendConfig {

    @C09CT("enable_check_btm")
    public final boolean checkBtm;

    @C09CT("saf_overlay_child_schema_host")
    public final List<String> childSchemaHost;

    @C09CT("disable_scenes")
    public final List<String> disableScenes;

    @C09CT("enable_saf")
    public final boolean enableSaf;

    @C09CT("enable_scenes")
    public final List<String> enableScenes;

    @C09CT("fix_btm")
    public final boolean fixBtm;

    public EcUgRemoveShopTabOverlayExpendConfig() {
        this(null, null, false, false, false, C1697810uHb.LJIIJJI("webcast_webview_popup", "webcast_lynxview_popup", "webview_popup", "lynxview_popup"));
    }

    public EcUgRemoveShopTabOverlayExpendConfig(List<String> list, List<String> list2, boolean z, boolean z2, boolean z3, List<String> list3) {
        this.disableScenes = list;
        this.enableScenes = list2;
        this.fixBtm = z;
        this.checkBtm = z2;
        this.enableSaf = z3;
        this.childSchemaHost = list3;
    }
}
