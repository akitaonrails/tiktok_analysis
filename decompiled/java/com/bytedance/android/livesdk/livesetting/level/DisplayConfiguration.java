package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DisplayConfiguration {
    public static final TypeAdapter ADAPTER = new DisplayConfiguration_OptTypeAdapter(NormalGson.singleton());

    @C09CT("content_configuration")
    public ContentConfiguration contentConfiguration;

    @C09CT("duration")
    public int duration;

    @C09CT("interaction_configuration")
    public InteractionConfiguration interactionConfiguration;

    @C09CT("template_type")
    public int templateType;

    public DisplayConfiguration() {
        this(0, 0, null, null);
    }

    public DisplayConfiguration(int i, int i2, ContentConfiguration contentConfiguration, InteractionConfiguration interactionConfiguration) {
        this.templateType = i;
        this.duration = i2;
        this.contentConfiguration = contentConfiguration;
        this.interactionConfiguration = interactionConfiguration;
    }
}
