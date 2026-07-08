package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.utils;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class ABKeyModel {

    @C09CT("card_type")
    public final Map<String, List<String>> card;

    @C09CT("channel")
    public final List<String> channel;

    public ABKeyModel() {
        this(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ABKeyModel(Map<String, ? extends List<String>> map, List<String> list) {
        this.card = map;
        this.channel = list;
    }
}
