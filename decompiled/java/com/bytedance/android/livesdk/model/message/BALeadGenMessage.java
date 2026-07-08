package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public class BALeadGenMessage extends AbstractC1136060ffY {

    @C09CT("cta_text")
    public String ctaText;

    @C09CT("op")
    public int op;

    @C09CT("op_time")
    public long opTime;

    @C09CT("page_id")
    public long pageId;

    @C09CT("pin_period")
    public int pinPeriod;

    @C09CT("schema")
    public String schema;

    @C09CT("card_button_text")
    public String cardButtonText = "";

    @C09CT("card_title")
    public String cardTitle = "";

    @C09CT("card_intro")
    public String cardIntro = "";

    public BALeadGenMessage() {
        this.type = C001A.BA_LEAD_GEN;
    }
}
