package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class TitleBarDisplayResource {

    @C09CT("content_text")
    public Text contentText;

    @C09CT("duration_ms")
    public long durationMs;

    @C09CT("left_icon")
    public ImageModel leftIcon;

    @C09CT("right_icon")
    public ImageModel rightIcon;

    @C09CT("right_icon_schema_url")
    public String rightIconSchemaUrl = "";
}
