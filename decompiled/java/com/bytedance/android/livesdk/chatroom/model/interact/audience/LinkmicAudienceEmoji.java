package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkmicAudienceEmoji {

    @C09CT("animation_duration_ms")
    public Long animationDurationMs;

    @C09CT("emoji_dynamic_image")
    public ImageModel emojiDynamicImage;

    @C09CT("emoji_id")
    public Long emojiId;

    @C09CT("emoji_image")
    public ImageModel emojiImage;

    @C09CT("emoji_name")
    public String emojiName;

    @C09CT("emoji_result_duration_ms")
    public Long emojiResultDurationMs;

    @C09CT("is_random")
    public Boolean isRandom;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.emojiId != null) {
            sb.append(", emoji_id=");
            sb.append(this.emojiId);
        }
        if (this.isRandom != null) {
            sb.append(", is_random=");
            sb.append(this.isRandom);
        }
        if (this.emojiImage != null) {
            sb.append(", emoji_image=");
            sb.append(this.emojiImage);
        }
        if (this.emojiDynamicImage != null) {
            sb.append(", emoji_dynamic_image=");
            sb.append(this.emojiDynamicImage);
        }
        if (this.emojiName != null) {
            sb.append(", emoji_name=");
            sb.append(this.emojiName);
        }
        if (this.animationDurationMs != null) {
            sb.append(", animation_duration_ms=");
            sb.append(this.animationDurationMs);
        }
        if (this.emojiResultDurationMs != null) {
            sb.append(", emoji_result_duration_ms=");
            sb.append(this.emojiResultDurationMs);
        }
        sb.replace(0, 2, "LinkmicAudienceEmoji{");
        sb.append('}');
        return sb.toString();
    }
}
