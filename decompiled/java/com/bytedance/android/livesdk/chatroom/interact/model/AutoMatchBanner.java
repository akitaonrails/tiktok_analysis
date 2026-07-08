package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class AutoMatchBanner {

    @C09CT("button_text")
    public Text buttonText;

    @C09CT("main_guide_text")
    public Text mainGuideText;

    @C09CT("sub_guide_text")
    public Text subGuideText;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mainGuideText != null) {
            sb.append(", main_guide_text=");
            sb.append(this.mainGuideText);
        }
        if (this.subGuideText != null) {
            sb.append(", sub_guide_text=");
            sb.append(this.subGuideText);
        }
        if (this.buttonText != null) {
            sb.append(", button_text=");
            sb.append(this.buttonText);
        }
        sb.replace(0, 2, "AutoMatchBanner{");
        sb.append('}');
        return sb.toString();
    }
}
