package com.ss.android.ugc.aweme.ecommerce.ug.backbutton;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class BackButtonConfig {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("pay_to_mall_type", "live_shopping_bag_to_mall");

    @C09CT("adapter_full_screen")
    public final Integer adapterFullScreen;

    @C09CT("disable_sticky_on_top")
    public final Integer disableStickyOnTop;

    @C09CT("schema_extra_params")
    public final Map<String, Object> extraParams;

    @C09CT("logic_type")
    public final String logicType;

    @C09CT("schema")
    public final String schema;

    @C09CT("style")
    public final String style;

    @C09CT("text")
    public final String text;

    public BackButtonConfig(String str, String str2, String str3, String str4, Integer num, Integer num2, Map<String, ? extends Object> map) {
        this.schema = str;
        this.text = str2;
        this.style = str3;
        this.logicType = str4;
        this.adapterFullScreen = num;
        this.disableStickyOnTop = num2;
        this.extraParams = map;
    }
}
