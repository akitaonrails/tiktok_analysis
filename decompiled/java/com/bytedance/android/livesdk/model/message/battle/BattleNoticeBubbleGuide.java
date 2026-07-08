package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class BattleNoticeBubbleGuide {

    @C09CT("content")
    public BattleNoticeText content;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleNoticeBubbleGuide{content=");
        sbLIZ.append(this.content);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
