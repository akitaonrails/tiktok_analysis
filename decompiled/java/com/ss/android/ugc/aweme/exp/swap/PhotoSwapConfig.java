package com.ss.android.ugc.aweme.exp.swap;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PhotoSwapConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("disable_camera_on_control_group")
    public final boolean disableCameraOnControlGroup;

    @C09CT("inline_message_config")
    public final PhotoSwapInlineMessageConfig inlineMessageConfig;

    public PhotoSwapConfig() {
        this(new PhotoSwapInlineMessageConfig(3, 259200000, 3, 432000000, 3), false);
    }

    public PhotoSwapConfig(PhotoSwapInlineMessageConfig photoSwapInlineMessageConfig, boolean z) {
        this.inlineMessageConfig = photoSwapInlineMessageConfig;
        this.disableCameraOnControlGroup = z;
    }
}
