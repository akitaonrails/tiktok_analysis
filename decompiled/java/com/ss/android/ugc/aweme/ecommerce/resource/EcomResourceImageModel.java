package com.ss.android.ugc.aweme.ecommerce.resource;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes31.dex */
public final class EcomResourceImageModel {

    @C09CT("delay")
    public final Long delayMs;

    @C09CT("disk_cache_name")
    public final String diskCacheName;

    @C09CT("height")
    public final String height;

    @C09CT("high_height")
    public final Double highHeight;

    @C09CT("high_width")
    public final Double highWidth;

    @C09CT("limit")
    public final Integer limit;

    @C09CT("low_height")
    public final Double lowHeight;

    @C09CT("low_width")
    public final Double lowWidth;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    @C09CT("native")
    public final boolean f61native;

    @C09CT("path")
    public final String path;

    @C09CT("priority")
    public final String priority;

    @C09CT("rgb565")
    public final Boolean rgb565;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("width")
    public final String width;

    public EcomResourceImageModel(String str, Integer num, Boolean bool, String str2, boolean z, String str3, Long l, String str4, String str5, Double d, Double d2, Double d3, Double d4, String str6) {
        this.path = str;
        this.limit = num;
        this.rgb565 = bool;
        this.scene = str2;
        this.f61native = z;
        this.priority = str3;
        this.delayMs = l;
        this.width = str4;
        this.height = str5;
        this.lowWidth = d;
        this.lowHeight = d2;
        this.highWidth = d3;
        this.highHeight = d4;
        this.diskCacheName = str6;
    }
}
