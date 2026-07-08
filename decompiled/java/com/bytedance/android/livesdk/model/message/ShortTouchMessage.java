package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.ShortTouchTemplateData;
import com.bytedance.android.livesdk.model.UnifyBaseActionData;

/* JADX INFO: loaded from: classes.dex */
public final class ShortTouchMessage extends AbstractC1136060ffY {

    @C09CT("action_data")
    public UnifyBaseActionData actionData;

    @C09CT("business_type")
    public String businessType;

    @C09CT("custom_payload")
    public CustomPayload customPayload;

    @C09CT("extra")
    public ShortTouchExtra extra;

    @C09CT("sub_business_type")
    public String subBusinessType;

    @C09CT("template_data")
    public ShortTouchTemplateData templateData;

    public ShortTouchMessage() {
        this.type = C001A.SHORT_TOUCH_MESSAGE;
        this.businessType = "";
        this.subBusinessType = "";
    }
}
