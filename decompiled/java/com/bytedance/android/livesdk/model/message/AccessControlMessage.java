package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AccessControlMessage extends AbstractC1136060ffY {

    @C09CT("captcha")
    public AccessControlCaptcha captcha;

    public AccessControlMessage() {
        this.type = C001A.ACCESS_CONTROL_MESSAGE;
    }
}
