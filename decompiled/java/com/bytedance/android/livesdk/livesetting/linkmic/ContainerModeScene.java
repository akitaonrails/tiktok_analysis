package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
public final class ContainerModeScene {
    public static final TypeAdapter ADAPTER = new ContainerModeScene_OptTypeAdapter(NormalGson.singleton());

    @C09CT("align_greater_h")
    public String alignGreaterHorizontal;

    @C09CT("align_greater_v")
    public String alignGreaterVertical;

    @C09CT("align_less_h")
    public String alignLessHorizontal;

    @C09CT("align_less_v")
    public String alignLessVertical;

    @C09CT("container_type")
    public String containerType;

    @C09CT("insets")
    public Insets insets;

    @C09CT("scale_type")
    public String scaleType;

    public ContainerModeScene() {
        this("fullscreen", "fit", "center", "center", "center", "center", null);
    }

    public ContainerModeScene(String str, String str2, String str3, String str4, String str5, String str6, Insets insets) {
        this.containerType = str;
        this.scaleType = str2;
        this.alignGreaterHorizontal = str3;
        this.alignGreaterVertical = str4;
        this.alignLessHorizontal = str5;
        this.alignLessVertical = str6;
        this.insets = insets;
    }
}
