package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class CommonPopupMessage extends AbstractC1136060ffY {

    @C09CT("anchor_pop_up")
    public boolean anchorPopup;

    @C09CT("schema_url")
    public String schemaUrl;

    public CommonPopupMessage() {
        this.type = C001A.COMMON_POPUP_MESSAGE;
    }
}
