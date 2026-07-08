package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleRival {

    @C09CT("extra_info")
    public RivalExtraInfo extraInfo;

    @C09CT("tags")
    public List<BattleRivalTag> tags;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.extraInfo != null) {
            sb.append(", extra_info=");
            sb.append(this.extraInfo);
        }
        List<BattleRivalTag> list = this.tags;
        if (list != null && !list.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.replace(0, 2, "BattleRival{");
        sb.append('}');
        return sb.toString();
    }
}
