package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class CoHostInviteListPreloadConfigs {
    public static final TypeAdapter ADAPTER = new CoHostInviteListPreloadConfigs_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("experience_opt_enable")
    public boolean experienceOptEnable;

    @C09CT("fetch_when_capsule_show")
    public boolean fetchWhenCapsuleShow;

    @C09CT("rival_section_configs")
    public List<RivalSectionConfig> rivalSectionConfigs = C13BV.INSTANCE;

    @C09CT("fetch_valid_time")
    public long fetchValidTime = 120000;
}
