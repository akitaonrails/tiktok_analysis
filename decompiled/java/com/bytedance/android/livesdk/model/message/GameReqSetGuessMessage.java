package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class GameReqSetGuessMessage extends AbstractC1136060ffY {

    @C09CT("capsule_cnt_str")
    public String capsuleCntStr;

    @C09CT("limit_supremacy_str")
    public String limitSupremacyStr;

    @C09CT("request_cnt_str")
    public String requestCntStr;

    @C09CT("toast_context")
    public Text toastContext;

    public GameReqSetGuessMessage() {
        this.type = C001A.GAME_REQ_SET_GUESS_MESSAGE;
        this.requestCntStr = "";
        this.limitSupremacyStr = "";
        this.capsuleCntStr = "";
    }
}
