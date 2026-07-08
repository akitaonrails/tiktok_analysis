package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class SubBenefit {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("benefit_description")
    public String benefitDescription;

    @C09CT("benefit_image")
    public ImageModel benefitImage;

    @C09CT("benefit_type")
    public int benefitType;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", benefit_type=");
        sb.append(this.benefitType);
        if (this.benefitImage != null) {
            sb.append(", benefit_image=");
            sb.append(this.benefitImage);
        }
        if (this.benefitDescription != null) {
            sb.append(", benefit_description=");
            sb.append(this.benefitDescription);
        }
        sb.replace(0, 2, "SubBenefit{");
        sb.append('}');
        return sb.toString();
    }
}
