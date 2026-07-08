package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* JADX INFO: loaded from: classes.dex */
public final class SubLevel {

    @C09CT("badge")
    public LevelBadge badge;

    @C09CT("badge_struct")
    public BadgeStruct badgeStruct;

    @C09CT("desc")
    public String desc;

    @C09CT("level")
    public Integer level;

    @C09CT("month_limit")
    public Integer monthLimit;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.level != null) {
            sb.append(", level=");
            sb.append(this.level);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.monthLimit != null) {
            sb.append(", month_limit=");
            sb.append(this.monthLimit);
        }
        if (this.badge != null) {
            sb.append(", badge=");
            sb.append(this.badge);
        }
        sb.replace(0, 2, "SubLevel{");
        sb.append('}');
        return sb.toString();
    }
}
