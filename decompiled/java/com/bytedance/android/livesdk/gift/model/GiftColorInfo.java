package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftColorInfo {

    @C09CT("color_effect_id")
    public Long colorEffectId;

    @C09CT("color_id")
    public Long colorId;

    @C09CT("color_image")
    public ImageModel colorImage;

    @C09CT("color_image_size")
    public long colorImageSize;

    @C09CT("color_name")
    public String colorName;

    @C09CT("color_reason")
    public List<String> colorReason;

    @C09CT("color_values")
    public List<String> colorValues;

    @C09CT("gift_image")
    public ImageModel giftImage;

    @C09CT("is_default")
    public boolean isDefault;

    @C09CT("gift_describe")
    public String giftDescribe = "";

    @C09CT("color_name_english")
    public String colorNameEnglish = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.colorId != null) {
            sb.append(", color_id=");
            sb.append(this.colorId);
        }
        if (this.colorName != null) {
            sb.append(", color_name=");
            sb.append(this.colorName);
        }
        List<String> list = this.colorValues;
        if (list != null && !list.isEmpty()) {
            sb.append(", color_values=");
            sb.append(this.colorValues);
        }
        if (this.colorImage != null) {
            sb.append(", color_image=");
            sb.append(this.colorImage);
        }
        if (this.giftImage != null) {
            sb.append(", gift_image=");
            sb.append(this.giftImage);
        }
        if (this.colorEffectId != null) {
            sb.append(", color_effect_id=");
            sb.append(this.colorEffectId);
        }
        sb.append(", is_default=");
        sb.append(this.isDefault);
        sb.replace(0, 2, "GiftColorInfo{");
        sb.append('}');
        return sb.toString();
    }
}
