package com.bytedance.android.livesdk.model.message;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleSettings {

    @C09CT("banner_url")
    public String bannerUrl;

    @C09CT("battle_id")
    public Long battleId;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("config")
    public String config;

    @C09CT("duration")
    public Long duration;

    @C09CT("match_type")
    public Long matchType;

    @C09CT("mode")
    public int mode;

    @C09CT("start_time_ms")
    public Long startTimeMs;

    @C09CT("sub_type")
    public Long subType;

    @C09CT("theme")
    public String theme;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.battleId != null) {
            sb.append(", battle_id=");
            sb.append(this.battleId);
        }
        if (this.startTimeMs != null) {
            sb.append(", start_time_ms=");
            sb.append(this.startTimeMs);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.theme != null) {
            sb.append(", theme=");
            sb.append(this.theme);
        }
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.matchType != null) {
            sb.append(", match_type=");
            sb.append(this.matchType);
        }
        if (this.bannerUrl != null) {
            sb.append(", banner_url=");
            sb.append(this.bannerUrl);
        }
        if (this.subType != null) {
            sb.append(", sub_type=");
            sb.append(this.subType);
        }
        sb.append(", mode=");
        sb.append(this.mode);
        if (this.config != null) {
            sb.append(", config=");
            sb.append(this.config);
        }
        sb.replace(0, 2, "BattleSettings{");
        sb.append('}');
        return sb.toString();
    }
}
