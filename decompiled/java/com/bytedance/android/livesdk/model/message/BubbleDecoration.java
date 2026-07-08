package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import webcast.data.TPText;

/* JADX INFO: loaded from: classes.dex */
public final class BubbleDecoration {

    @C09CT("decoration_type")
    public int decorationType;

    @C09CT("image")
    public ImageModel image;

    @C09CT("text")
    public Text text;

    @C09CT("tp_text")
    public TPText tpText;
}
