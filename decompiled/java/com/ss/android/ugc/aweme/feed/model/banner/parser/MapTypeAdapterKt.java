package com.ss.android.ugc.aweme.feed.model.banner.parser;

import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MapTypeAdapterKt {
    public static final Gson fcpTemplateGson;

    static {
        e eVar = new e();
        eVar.LIZJ(new MapTypeAdapter(), new TypeToken<Map<String, ? extends Object>>() { // from class: com.ss.android.ugc.aweme.feed.model.banner.parser.MapTypeAdapterKt$fcpTemplateGson$1
        }.getType());
        fcpTemplateGson = eVar.LIZ();
    }

    public static final Gson getFcpTemplateGson() {
        return fcpTemplateGson;
    }
}
