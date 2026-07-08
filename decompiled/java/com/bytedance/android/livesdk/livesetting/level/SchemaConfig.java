package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class SchemaConfig {
    public static final TypeAdapter ADAPTER = new SchemaConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("config")
    public List<ParamConfig> configs;

    @C09CT("join_page_url")
    public String joinDialogSchema;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public boolean f32switch;

    public SchemaConfig() {
        this(null, "aweme://roma_redirect/?spark_page=fan_club_user_join&roma_group_key=spark_page_fan_club_user_join&roma_page_key=p", true);
    }

    public SchemaConfig(List<ParamConfig> list, String str, boolean z) {
        this.configs = list;
        this.joinDialogSchema = str;
        this.f32switch = z;
    }
}
