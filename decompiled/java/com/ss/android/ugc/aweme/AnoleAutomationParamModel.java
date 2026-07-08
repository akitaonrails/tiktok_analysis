package com.ss.android.ugc.aweme;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleAutomationParamModel {
    public final Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;
    public final Map<String, String> LIZJ;
    public final Map<String, String> LIZLLL;

    @C09CT("image_load_strategy")
    public String imageLoadStrategy;

    @C09CT("is_fallback_rendering")
    public String isFallBackRendering;

    @C09CT("preload_image_status")
    public String preloadImageStatus;

    @C09CT("render_stage")
    public String renderStage;

    @C09CT("show_with_resource_ready")
    public String showWithResourceReady;

    public AnoleAutomationParamModel() {
        this(null, null, "now_load", null, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), null);
    }

    public AnoleAutomationParamModel(String str, String str2, String str3, String str4, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, String str5) {
        this.renderStage = str;
        this.showWithResourceReady = str2;
        this.imageLoadStrategy = str3;
        this.preloadImageStatus = str4;
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
        this.LIZLLL = map4;
        this.isFallBackRendering = str5;
    }
}
