package com.bytedance.android.livestrategy.config;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class FeatureAllCenter {
    public static final TypeAdapter ADAPTER = new FeatureAllCenter_OptTypeAdapter(NormalGson.singleton());

    @C09CT("pitayaNativeBusiness")
    public Map<String, ? extends Object> pitayaNativeBusiness;

    @C09CT("pitayaPythonBusiness")
    public Map<String, ? extends Object> pitayaPythonBusiness;

    @C09CT("portraitConfig")
    public Map<String, ? extends Object> portraitConfig;

    @C09CT("pspBusiness")
    public Map<String, ? extends Object> pspBusiness;

    public FeatureAllCenter() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public FeatureAllCenter(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        this.pitayaPythonBusiness = map;
        this.pitayaNativeBusiness = map2;
        this.pspBusiness = map3;
        this.portraitConfig = map4;
    }
}
