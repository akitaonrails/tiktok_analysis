package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallentry.manager;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class StickyDiversionConfigData {
    public Boolean LIZ;

    @C09CT("data")
    public Map<String, Object> config;

    @C09CT("is_sticky")
    public Integer isSticky;

    @C09CT("merge_action")
    public String mergeAction;

    public StickyDiversionConfigData(Map<String, Object> map, Integer num, String str, Boolean bool) {
        this.config = map;
        this.isSticky = num;
        this.mergeAction = str;
        this.LIZ = bool;
    }
}
