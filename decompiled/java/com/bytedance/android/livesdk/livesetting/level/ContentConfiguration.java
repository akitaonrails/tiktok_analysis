package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class ContentConfiguration {
    public static final TypeAdapter ADAPTER = new ContentConfiguration_OptTypeAdapter(NormalGson.singleton());

    @C09CT("effect_configuration")
    public EffectConfig effectConfiguration;

    @C09CT("icon")
    public IconConfig icon;

    @C09CT("container_bottom_margin")
    public int marginBottom;

    @C09CT("container_left_margin")
    public int marginLeft;

    @C09CT("container_right_margin")
    public int marginRight;

    @C09CT("container_top_margin")
    public int marginTop;

    @C09CT("text")
    public TextConfig text;

    @C09CT("text_color_array")
    public List<String> textColorArray;

    public ContentConfiguration() {
        this(null, null, 0, 0, 0, 0, null, null);
    }

    public ContentConfiguration(TextConfig textConfig, IconConfig iconConfig, int i, int i2, int i3, int i4, EffectConfig effectConfig, List<String> list) {
        this.text = textConfig;
        this.icon = iconConfig;
        this.marginLeft = i;
        this.marginRight = i2;
        this.marginTop = i3;
        this.marginBottom = i4;
        this.effectConfiguration = effectConfig;
        this.textColorArray = list;
    }
}
