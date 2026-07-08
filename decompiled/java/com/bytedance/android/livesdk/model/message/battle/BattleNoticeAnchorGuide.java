package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class BattleNoticeAnchorGuide {

    @C09CT("button_content")
    public BattleNoticeText buttonContent;

    @C09CT("content")
    public BattleNoticeText content;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleNoticeAnchorGuide{content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", buttonContent=");
        sbLIZ.append(this.buttonContent);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
