package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class FeedRoomLabel implements Serializable {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("bg_image")
    public ImageModel bgImage;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("position")
    public long location;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("text")
    public Text text;
}
