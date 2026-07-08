package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class BattleNoticeText {

    @C09CT("text")
    public String text;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleNoticeText{text='");
        sbLIZ.append(this.text);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
