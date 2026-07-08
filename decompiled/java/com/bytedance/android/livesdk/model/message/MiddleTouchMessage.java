package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.UnifyBaseActionData;

/* JADX INFO: loaded from: classes.dex */
public final class MiddleTouchMessage extends AbstractC1136060ffY {

    @C09CT("action_data")
    public UnifyBaseActionData actionData;

    @C09CT("extra")
    public MiddleTouchExtra extra;

    public MiddleTouchMessage() {
        this.type = C001A.MIDDLE_TOUCH_MESSAGE;
    }
}
