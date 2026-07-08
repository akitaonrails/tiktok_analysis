package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPlaybookDefaultValueSetting;

/* JADX INFO: loaded from: classes19.dex */
public final class MatchSettings {

    @C09CT("gameplay_option")
    public int gameplayOption;

    public MatchSettings() {
        this(LiveMatchPlaybookDefaultValueSetting.INSTANCE.getConfig().matchGameplayOption);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchSettings(gameplayOption=");
        sbLIZ.append(this.gameplayOption);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MatchSettings(int i) {
        this.gameplayOption = i;
    }
}
