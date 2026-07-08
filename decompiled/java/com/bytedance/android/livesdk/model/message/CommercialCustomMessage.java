package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class CommercialCustomMessage extends AbstractC1136060ffY {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("border_color")
    public String borderColor;

    @C09CT("brand_logo")
    public ImageModel brandLogo;

    @C09CT("brand_name")
    public Text brandName;

    @C09CT("content")
    public Text content;

    @C09CT("custom_message_id")
    public long customMessageId;

    @C09CT("duration")
    public long duration;

    @C09CT("right_label")
    public RightLabel rightLabel;

    public static final class RightLabel {

        @C09CT("background_color")
        public String backgroundColor = "";

        @C09CT("content")
        public Text content;

        @C09CT("height")
        public long height;
    }

    public CommercialCustomMessage() {
        this.type = C001A.COMMERCIAL_CUSTOM_MESSAGE;
        this.backgroundColor = "";
        this.borderColor = "";
    }
}
