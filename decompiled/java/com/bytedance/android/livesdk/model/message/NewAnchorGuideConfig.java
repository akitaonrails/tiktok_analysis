package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class NewAnchorGuideConfig {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("button")
    public Text button;

    @C09CT("display_duration")
    public int displayDuration;

    @C09CT("display_type")
    public int displayType;

    @C09CT("effect_params")
    public NewAnchorEffectParams effectParams;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("icon_style")
    public int iconStyle;

    @C09CT("text")
    public Text text;

    @C09CT("title")
    public Text title;
}
