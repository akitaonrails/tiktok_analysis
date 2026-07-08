package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C09CT;
import java.util.HashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class EcomGylSchemaModel {

    @C09CT("channel")
    public final String channel;

    @C09CT("default_track_params")
    public final HashMap<String, String> defaultTrackParams;

    @C09CT("schema")
    public final String schema;

    public EcomGylSchemaModel() {
        this(null, null, null);
    }

    public EcomGylSchemaModel(String str, HashMap<String, String> map, String str2) {
        this.schema = str;
        this.defaultTrackParams = map;
        this.channel = str2;
    }
}
