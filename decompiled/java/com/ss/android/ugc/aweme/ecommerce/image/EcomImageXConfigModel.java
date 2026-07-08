package com.ss.android.ugc.aweme.ecommerce.image;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomImageXConfigModel {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @C09CT("default")
    public final String f56default;

    @C09CT("format")
    public final String format;

    @C09CT("high_width")
    public final Integer highWidth;

    @C09CT("key")
    public final List<String> key;

    @C09CT("low_width")
    public final Integer lowWidth;

    @C09CT("operation_type")
    public final String operationType;

    @C09CT("origin")
    public final List<String> origin;

    @C09CT("page")
    public final String page;

    @C09CT("quality")
    public final String quality;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("template")
    public final String template;

    @C09CT("width")
    public final String width;

    public EcomImageXConfigModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public EcomImageXConfigModel(List<String> list, String str, String str2, String str3, List<String> list2, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2) {
        this.key = list;
        this.scene = str;
        this.page = str2;
        this.f56default = str3;
        this.origin = list2;
        this.template = str4;
        this.quality = str5;
        this.format = str6;
        this.operationType = str7;
        this.width = str8;
        this.lowWidth = num;
        this.highWidth = num2;
    }
}
