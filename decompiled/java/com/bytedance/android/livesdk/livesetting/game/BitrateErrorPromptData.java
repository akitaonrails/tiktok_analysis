package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class BitrateErrorPromptData {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("retry_stream")
    public final Integer retryStream;

    @C09CT("show_tips")
    public final Integer showTips;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BitrateErrorPromptData(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", showTips=");
        sbLIZ.append(this.showTips);
        sbLIZ.append(", retryStream=");
        sbLIZ.append(this.retryStream);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BitrateErrorPromptData() {
        this(Boolean.FALSE, 3, 20);
    }

    public BitrateErrorPromptData(Boolean bool, Integer num, Integer num2) {
        this.enable = bool;
        this.showTips = num;
        this.retryStream = num2;
    }
}
