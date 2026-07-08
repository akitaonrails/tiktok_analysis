package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class CohostTranslatePopUpMessage extends AbstractC1136060ffY {

    @C09CT("content")
    public Text content;

    @C09CT("title")
    public Text title;

    public CohostTranslatePopUpMessage() {
        this.type = C001A.COHOST_TRANSLATE_POP_UP_MESSAGE;
    }
}
