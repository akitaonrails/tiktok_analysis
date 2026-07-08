package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchInviterPanelLynxConfig {
    public static final TypeAdapter ADAPTER = new MatchInviterPanelLynxConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("four_person_default_match_type")
    public int fourPersonDefaultMatchType;

    @C09CT("is_guide_enabled")
    public boolean isGuideEnabled;

    @C09CT("is_team_pair_support_enabled")
    public boolean isTeamPairSupportEnabled;

    @C09CT("lynx_url")
    public String lynxUrl;

    @C09CT("resource_fetch_trigger_key")
    public String resourceFetchTriggerKey;

    @C09CT("skip_match_mode_panel")
    public boolean skipMatchModePanel;

    @C09CT("three_person_default_match_type")
    public int threePersonDefaultMatchType;

    @C09CT("two_person_default_match_type")
    public int twoPersonDefaultMatchType;

    public MatchInviterPanelLynxConfig() {
        this(false, 1, 3, 3, true, "aweme://roma_redirect/?spark_page=live_match_panel_inner_part", false, "tiktok_live_tt_live_lynx_match_panel", false);
    }

    public MatchInviterPanelLynxConfig(boolean z, int i, int i2, int i3, boolean z2, String str, boolean z3, String str2, boolean z4) {
        this.enabled = z;
        this.twoPersonDefaultMatchType = i;
        this.threePersonDefaultMatchType = i2;
        this.fourPersonDefaultMatchType = i3;
        this.skipMatchModePanel = z2;
        this.lynxUrl = str;
        this.isTeamPairSupportEnabled = z3;
        this.resourceFetchTriggerKey = str2;
        this.isGuideEnabled = z4;
    }
}
