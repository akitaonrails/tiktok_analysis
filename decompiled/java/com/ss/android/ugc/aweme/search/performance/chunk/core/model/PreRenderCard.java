package com.ss.android.ugc.aweme.search.performance.chunk.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.LynxSSRInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class PreRenderCard {
    public int LIZ;

    @C09CT("detail")
    public Map<Object, ? extends Object> detail;

    @C09CT("hotspot_card")
    public Map<Object, ? extends Object> hotspotCard;

    @C09CT("is_lynx")
    public int isLynx;

    @C09CT("lynx_ssr_info")
    public LynxSSRInfo lynxSSRInfo;

    @C09CT("lynx_schema")
    public String lynxSchema = "";

    @C09CT("type")
    public int type;
}
