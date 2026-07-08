package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class CueMessageRichParam {

    @C09CT("badge")
    public BadgeStruct badge;

    @C09CT("image")
    public ImageModel image;

    @C09CT("interval_day")
    public long intervalDay;

    @C09CT("interval_time")
    public long intervalTime;

    @C09CT("param_text")
    public Text paramText;

    @C09CT("type")
    public int type;

    @C09CT("user")
    public User user;
}
