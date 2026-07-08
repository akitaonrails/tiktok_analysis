package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleTruthOrDareTips {

    @C09CT("gift_guide_key")
    public String giftGuideKey;

    @C09CT("tips")
    public List<TruthOrDareTip> truthOrDareTips;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleTruthOrDareTips(giftGuideKey=");
        sbLIZ.append(this.giftGuideKey);
        sbLIZ.append(", truthOrDareTips=");
        sbLIZ.append(this.truthOrDareTips);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
