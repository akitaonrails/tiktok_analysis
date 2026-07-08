package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class GiftMode {

    @C09CT("custom_description")
    public Text customDescription;

    @C09CT("event_icon_image")
    public ImageModel eventIconImage;

    @C09CT("gift_background_image")
    public ImageModel giftBackgroundImage;

    @C09CT("gift_display_state")
    public int giftDisplayState;

    @C09CT("gift_icon_image")
    public ImageModel giftIconImage;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_price")
    public long giftPrice;

    @C09CT("has_flash_effect")
    public boolean hasFlashEffect;

    @C09CT("release_version")
    public long releaseVersion;

    @C09CT("label_text")
    public String labelText = "";

    @C09CT("gift_name")
    public String giftName = "";
}
