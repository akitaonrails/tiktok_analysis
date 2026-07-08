package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class OecLiveSmartPinMessage extends AbstractC1136060ffY {

    @C09CT("message_type")
    public int messageType;

    @C09CT("no_pin_education_text")
    public String noPinEducationText;

    public OecLiveSmartPinMessage() {
        this.type = C001A.OEC_LIVE_SMART_PIN_MESSAGE;
        this.noPinEducationText = "";
    }
}
