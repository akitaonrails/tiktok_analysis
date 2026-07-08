package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SeiTextHeaderExtra {

    @C09CT("c")
    public final Integer color;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String font;

    @C09CT("opt")
    public final Integer recommendOpt;

    @C09CT("s")
    public final Integer stroke;

    @C09CT("t")
    public final String text;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiTextHeaderExtra(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", stroke=");
        sbLIZ.append(this.stroke);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(", color=");
        sbLIZ.append(this.color);
        sbLIZ.append(", recommendOpt=");
        sbLIZ.append(this.recommendOpt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeiTextHeaderExtra(String str, Integer num, String str2, Integer num2, Integer num3) {
        this.text = str;
        this.stroke = num;
        this.font = str2;
        this.color = num2;
        this.recommendOpt = num3;
    }
}
